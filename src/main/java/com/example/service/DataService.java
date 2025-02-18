package com.example.service;

import com.example.pojo.buyer.*;
import com.example.pojo.PageResult;
import com.example.pojo.cart.ReqSumCart;
import com.example.pojo.cart.Reqaddcart;
import com.example.pojo.product.Products;
import com.example.pojo.product.ResCartCard;
import com.example.pojo.seller.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DataService {
    // --------------------------------------------  buyer
    PageResult page(BuyerQureyParam buyerQureyParam);

    void addUser(Buyers buyers);

    ResultBuyers getUserByUsername(String username);

    void updateUser(Buyers buyers);

    void deleteByUsername(String username);

// --------------------------------------------   seller

    PageResult pageSeller(SellerQureyParam sellerQureyParam);

    void addSellerUser(Sellers sellers);

    ResultSellers getSellerUserByUsername(String username);

    void updateSellerUser(Sellers sellers);

    void deleteSellerByUsername(String username);

    BuyPerResponse getBuyPer(String id);

    void postBuyerPerson(PostBuyer postBuyer);

    List<String> getCategory();//获取分类

    List<Products> getProducts(String category, String input);

    List<ResCartCard> getCartData(String id);

    void handleNumChange(Integer id, Integer num);

    void addShopCart(ReqAddShopCart reqAddShopCart);

    PageResult cartPage(BuyerQureyParam buyerQureyParam);

    void addcartData(Reqaddcart reqaddcart);

    PageResult storePage(BuyerQureyParam buyerQureyParam);

    PageResult sellerProPage(BuyerQureyParam buyerQureyParam);

    List<ResviewSelled> getviewSelled(String id);

    ResPerson getSellerPerson(String id);

    void addSellerPro(ReqFile reqFile);

    List<String> backSellerFetchStore(String id);

    PageResult orderGetData(BuyerQureyParam buyerQureyParam);

    void AddOrder(ReqSumCart item, Integer buyerId);

    PageResult managerPage(BuyerQureyParam buyerQureyParam);

    void SellerAddStore(ReqSellerAddStore reqSellerAddStore);
}
