package com.example.controller;


import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.response.AlipayTradePagePayResponse;
import com.example.pojo.AlipayTemplate;
import com.example.pojo.Order;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


/**
 * 支付宝接口
 */
@RestController
@RequestMapping("/alipay")
class AliPayController {

    @Resource
    AlipayTemplate alipayTemplate;

    @GetMapping(value = "/pay", produces = "text/html")
    @ResponseBody
    public String pay(@RequestParam long id, @RequestParam double money) throws AlipayApiException {
        Order order = new Order();
        order.setId(id);
        order.setUserId(129904058947L);
        order.setInterfaceInfoId(294389472934L);
        order.setMoney(money);
        order.setPaymentMethod("支付宝");

        // 使用alipay-sdk-java进行支付
        AlipayClient alipayClient = new DefaultAlipayClient(
                alipayTemplate.getGatewayUrl(),
                alipayTemplate.getAppId(),
                alipayTemplate.getPrivateKey(),
                "json",
                alipayTemplate.getCharset(),
                alipayTemplate.getAlipayPublicKey(),
                alipayTemplate.getSignType());

        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
        request.setReturnUrl(alipayTemplate.getReturnUrl());
        request.setNotifyUrl(alipayTemplate.getNotifyUrl());

        Map<String, Object> bizContent = new HashMap<>();
        bizContent.put("out_trade_no", order.getId().toString());
        bizContent.put("product_code", "FAST_INSTANT_TRADE_PAY");
        bizContent.put("total_amount", order.getMoney().toString());
        bizContent.put("subject", "订单支付");
        bizContent.put("body", "订单支付描述");

        request.setBizContent(new JSONObject(bizContent).toString());

        AlipayTradePagePayResponse response = alipayClient.pageExecute(request);
        if (response.isSuccess()) {
            return response.getBody();
        } else {
            throw new AlipayApiException("支付请求失败");
        }
    }

    @PostMapping("/notify")  // 注意这里必须是POST接口
    public String payNotify(HttpServletRequest request) throws Exception {
        Map<String, String> params = new HashMap<>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (String name : requestParams.keySet()) {
            params.put(name, request.getParameter(name));
        }

        // 使用alipay-sdk-java进行验签
        boolean signVerified = AlipaySignature.rsaCheckV1(
                params,
                alipayTemplate.getAlipayPublicKey(),
                alipayTemplate.getCharset(),
                alipayTemplate.getSignType());

        if (signVerified) {
            System.out.println("=========支付宝异步回调========");

            String tradeNo = params.get("out_trade_no");
            String gmtPayment = params.get("gmt_payment");
            String alipayTradeNo = params.get("trade_no");

            System.out.println("交易名称: " + params.get("subject"));
            System.out.println("交易状态: " + params.get("trade_status"));
            System.out.println("支付宝交易凭证号: " + params.get("trade_no"));
            System.out.println("商户订单号: " + params.get("out_trade_no"));
            System.out.println("交易金额: " + params.get("total_amount"));
            System.out.println("买家在支付宝唯一id: " + params.get("buyer_id"));
            System.out.println("买家付款时间: " + params.get("gmt_payment"));
            System.out.println("买家付款金额: " + params.get("buyer_pay_amount"));
            // 更新订单状态
        } else {
            System.out.println("验签失败");
        }
        return "success";
    }
}
