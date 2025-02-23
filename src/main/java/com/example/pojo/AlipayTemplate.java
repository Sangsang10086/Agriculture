package com.example.pojo;

import com.alipay.api.internal.util.AlipaySignature;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class AlipayTemplate {

    @Value("${alipay.gatewayUrl}")
    private String gatewayUrl;

    @Value("${alipay.appId}")
    private String appId;

    @Value("${alipay.privateKey}")
    private String privateKey;

    @Value("${alipay.charset}")
    private String charset;

    @Value("${alipay.alipayPublicKey}")
    private String alipayPublicKey;

    @Value("${alipay.signType}")
    private String signType;

    @Value("${alipay.returnUrl}")
    private String returnUrl;

    @Value("${alipay.notifyUrl}")
    private String notifyUrl;

    public String getGatewayUrl() {
        return gatewayUrl;
    }

    public String getAppId() {
        return appId;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public String getCharset() {
        return charset;
    }

    public String getAlipayPublicKey() {
        return alipayPublicKey;
    }

    public String getSignType() {
        return signType;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public boolean verifyNotify(Map<String, String> params) throws Exception {
        return AlipaySignature.rsaCheckV1(
                params,
                alipayPublicKey,
                charset,
                signType);
    }
}
