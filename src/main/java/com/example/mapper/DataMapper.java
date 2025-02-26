package com.example.mapper;

import com.example.pojo.buyer.*;
import com.example.pojo.cart.ReqSumCart;
import com.example.pojo.cart.Reqaddcart;
import com.example.pojo.cart.Resshopcart;
import com.example.pojo.manager.ResManagerGetData;
import com.example.pojo.order.OrderDTO;
import com.example.pojo.product.Products;
import com.example.pojo.product.ResCartCard;
import com.example.pojo.seller.*;
import com.example.pojo.store.Resstore;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DataMapper {

    //--------------------------------------------------------buyer
    List<BuyersDTO> list(BuyerQureyParam buyerQureyParam);

    String getTotal();

    void addUser(Buyers buyers);

    ResultBuyers getUserByUsername(String username);

    void updateUser(Buyers buyers);

    void deleteByUsername(String username);
    //--------------------------------------------------------seller
    List<SellersDTO> Sellerlist(SellerQureyParam sellerQureyParam);

    void addSellerUser(Sellers sellers);

    ResultSellers getSellerUserByUsername(String username);

    void updateSellerUser(Sellers sellers);

    void deleteSellerByUsername(String username);
    //--------------------------------------------------------buyPer

    BuyPerResponse getBuyPer(String id);

    void postBuyerPerson(PostBuyer postBuyer);

    List<String> getCategory();

    List<Products> getProducts(String category, String input);

    List<ResCartCard> getCartData(String id);

    void handleNumChange(Integer id, Integer num);

    void addShopCart(ReqAddShopCart reqAddShopCart);

    Integer getCartId();



    List<Resshopcart> cartList(BuyerQureyParam buyerQureyParam);

    void addressaddTimenum(Reqaddcart reqaddcart);

    Integer getStoreId(Reqaddcart reqaddcart);

    Integer getSellerId(Reqaddcart reqaddcart);

    Integer getBuyerId(Reqaddcart reqaddcart);

    Integer getProId(Reqaddcart reqaddcart);

    void addcartData(Integer cartId, Integer sellerId, Integer buyerId, Integer proId, Integer storeId);

    List<Resstore> storeList(BuyerQureyParam buyerQureyParam);

    List<ResSellerPro> selleProList(BuyerQureyParam buyerQureyParam);

    List<ResviewSelled> getviewSelled(String id);

    ResPerson getSellerPerson(String id);

    void addSellerPro(ReqFile reqFile, String storeId);

    String selectstoreId(ReqFile reqFile);

    List<String> backSellerFetchStore(String id);

    List<OrderDTO> orderGetData(BuyerQureyParam buyerQureyParam);

    Integer getSumCartProId(Integer buyerId);

    String getProName(Integer proId);

    String getPrice(Integer proId);

    void AddOrder(ReqSumCart item, String proName,Integer proId, String price, Integer buyerId,Integer storeId,String totalPrice,String orderStatus);

    Integer getStoreIdBystoreId(String storeName);

    List<ResManagerGetData> managerPage(BuyerQureyParam buyerQureyParam);

    void SellerAddStore(ReqSellerAddStore reqSellerAddStore);

    void updateOrderStatus(String outTradeNo, String orderStatus);

    String getOrderById(long orderId);
}
