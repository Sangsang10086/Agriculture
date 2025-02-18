package com.example.controller;

import com.example.pojo.*;
import com.example.pojo.buyer.*;
import com.example.pojo.cart.ReqSumCart;
import com.example.pojo.cart.ReqSumCartW;
import com.example.pojo.cart.Reqaddcart;
import com.example.pojo.product.Products;
import com.example.pojo.product.ResCartCard;
import com.example.pojo.seller.*;
import com.example.service.DataService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class DateController {

    @Autowired
    private DataService dataService;

    //------------------------------------------------------------------------后端管理员页面中的buyer管理
    @GetMapping("/buyer/getDate")                                      //分页查询
    public Result page(BuyerQureyParam buyerQureyParam){
        PageResult pageResult = dataService.page(buyerQureyParam);
        return Result.success(pageResult);
    }
    @PostMapping("/buyer/addUser")
    public Result addUser(@RequestBody Buyers buyers){
        dataService.addUser(buyers);
        return Result.success();
    }
    @GetMapping("/buyer/getUserByUsername")
    public Result getUserByUsername(@RequestParam String username){
        ResultBuyers resultBuyers = dataService.getUserByUsername(username);
        return Result.success(resultBuyers);
    }
    @PostMapping("/buyer/updateUser")
    public Result updateUser(@RequestBody Buyers buyers){
        dataService.updateUser(buyers);
        return Result.success();
    }
    @DeleteMapping("/buyer/deleteByUsername")
    public Result deleteByUsername(@RequestParam String username){
        dataService.deleteByUsername(username);
        return Result.success();
    }



//------------------------------------------------------------------------后端管理员页面中的seller管理

    @GetMapping("/seller/getDate")
    public Result pageSeller(SellerQureyParam sellerQureyParam){
        PageResult pageResult = dataService.pageSeller(sellerQureyParam);
        return Result.success(pageResult);
    }
    @PostMapping("/seller/addUser")
    public Result addSellerUser(@RequestBody Sellers sellers){
        dataService.addSellerUser(sellers);
        return Result.success();
    }
    @GetMapping("/seller/getUserByUsername")
    public Result getSellerUserByUsername(@RequestParam String username){
        ResultSellers resultSellers = dataService.getSellerUserByUsername(username);
        return Result.success(resultSellers);
    }
    @PostMapping("/seller/updateUser")
    public Result updateSellerUser(@RequestBody Sellers sellers){
        dataService.updateSellerUser(sellers);
        return Result.success();
    }
    @DeleteMapping("/seller/deleteByUsername")
    public Result deleteSellerByUsername(@RequestParam String username){
        dataService.deleteSellerByUsername(username);
        return Result.success();
    }

    //-------------------------------------------------------------------------fontBuyerPerson回显
    @GetMapping("/fontBuyerPerson/getDate")
    public Result getBuyPer(@PathParam("id") String id){
        BuyPerResponse buyPerResponse = dataService.getBuyPer(id);
        return Result.success(buyPerResponse);
    }
    //-------------------------------------------------------------------------fontBuyerPerson修改
    @PostMapping("/postBuyerPerson")
    public Result postBuyerPerson(@RequestBody PostBuyer postBuyer){
        dataService.postBuyerPerson(postBuyer);
        return Result.success();
    }
    //-------------------------------------------------------------------------前端分类组件的回显值
    @GetMapping("/getCategory")
    public Result getCategory(){
        List<String> list =dataService.getCategory();
        return Result.success(list);
    }
    //-------------------------------------------------------------------------前端搜索页面的回显值
    @GetMapping("/getProducts")
    public Result getProducts(@RequestParam("category") String category,@RequestParam("text") String input){
        List<Products> productsList = dataService.getProducts(category,input);
        return Result.success(productsList);
    }
    //-------------------------------------------------------------------------获取购物车card的值
    @GetMapping("/getCartData")
    public Result getCartData(@RequestParam("id") String id){
        List<ResCartCard> listresCartCard = dataService.getCartData(id);

        for (ResCartCard resCartCard : listresCartCard) {
            resCartCard.setSelected(false);
        }
        return Result.success(listresCartCard);
    }
    //-------------------------------------------------------------------------购物车中的数量变化
    @PostMapping("/updateCartNum")
    public Result handleNumChange (@RequestBody ResCartCard resCartCard){
        Integer id = resCartCard.getId();
        Integer num = resCartCard.getNum();
        dataService.handleNumChange(id,num);
        return Result.success();
    }
    //-------------------------------------------------------------------------将商品加入购物车
    @PostMapping("/addShopCart")
    public Result addShopCart(@RequestBody ReqAddShopCart reqAddShopCart){
        dataService.addShopCart(reqAddShopCart);
        return Result.success();
    }
    //-------------------------------------------------------------------------后端获取购物车数据
    @GetMapping("/cart/getDate")                                      //分页查询
    public Result cartPage(BuyerQureyParam buyerQureyParam){
        PageResult pageResult = dataService.cartPage(buyerQureyParam);
        return Result.success(pageResult);
    }
    //-------------------------------------------------------------------------后端添加购物车数据
    @PostMapping("/cart/addUser")
    public Result addcartData(@RequestBody Reqaddcart reqaddcart){
        dataService.addcartData(reqaddcart);
        return Result.success();
    }
    //---------------------------------------------------------------------------后端卖家店铺管理页面
    @GetMapping("/store/getDate")                                      //分页查询
    public Result storePage(BuyerQureyParam buyerQureyParam){
        PageResult pageResult = dataService.storePage(buyerQureyParam);
        return Result.success(pageResult);
    }
    //---------------------------------------------------------------------------后端卖家sellerPro管理
    @GetMapping("/sellerPro/getDate")                                      //分页查询
    public Result sellerProPage(BuyerQureyParam buyerQureyParam){
        PageResult pageResult = dataService.sellerProPage(buyerQureyParam);
        return Result.success(pageResult);
    }
    //---------------------------------------------------------------------------后端卖家viewSelled
    @GetMapping("/getviewSelled")
    public Result getviewSelled(@RequestParam String id){
        List<ResviewSelled> list = dataService.getviewSelled(id);
        return Result.success(list);
    }
    //---------------------------------------------------------------------------后端卖家person
    @GetMapping("/getSellerPerson")
    public Result getSellerPerson(@PathParam("id") String id){
        ResPerson resPerson = dataService.getSellerPerson(id);
        return Result.success(resPerson);
    }
    //---------------------------------------------------------------------------后端卖家sellerPro图片上传功能的实现
    @PostMapping("/addSellerPro")
    public Result addSellerPro(@RequestBody ReqFile reqFile){
        dataService.addSellerPro(reqFile);
        return Result.success();
    }
    @GetMapping("/backSellerFetchStore")
    public Result backSellerFetchStore(@RequestParam("sellerId") String id){
        List<String> list = dataService.backSellerFetchStore(id);
        return Result.success(list);
    }
    //---------------------------------------------------------------------------获取order订单数据
    @GetMapping("/orderGetData")
    public Result orderGetData(BuyerQureyParam buyerQureyParam){
        PageResult pageResult = dataService.orderGetData(buyerQureyParam);
        return Result.success(pageResult);
    }
    //---------------------------------------------------------------------------接受shopstore中的数据，并加入到订单管理中
    @PostMapping("/SumMain")
    public Result SumMain(@RequestBody ReqSumCartW reqSumCartW){
        List<ReqSumCart> cartItems = reqSumCartW.getReqSumCart();
        Integer buyerId = reqSumCartW.getBuyerId();
        // 处理 cartItems 列表
        for (ReqSumCart item : cartItems) {
            dataService.AddOrder(item,buyerId);
        }
        return Result.success();
    }
    // ---------------------------------------------------------------------------后端manager管理信息的实现
    @GetMapping("/manager/getDate")
    public Result managerPage(BuyerQureyParam buyerQureyParam){
        PageResult pageResult = dataService.managerPage(buyerQureyParam);
        return Result.success(pageResult);
    }
    // ---------------------------------------------------------------------------后端selleraddstore
    @PostMapping("/SellerAddStore")
    public Result SellerAddStore(@RequestBody ReqSellerAddStore reqSellerAddStore){

        dataService.SellerAddStore(reqSellerAddStore);
        return Result.success();
    }

}
