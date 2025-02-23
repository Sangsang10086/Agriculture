package com.example.service.impl;

import com.example.mapper.DataMapper;
import com.example.pojo.buyer.*;
import com.example.pojo.PageResult;
import com.example.pojo.cart.ReqSumCart;
import com.example.pojo.cart.Reqaddcart;
import com.example.pojo.cart.Resshopcart;
import com.example.pojo.manager.ResManagerGetData;
import com.example.pojo.order.OrderDTO;
import com.example.pojo.product.Products;
import com.example.pojo.product.ResCartCard;
import com.example.pojo.seller.*;
import com.example.pojo.store.Resstore;
import com.example.service.DataService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.autoconfigure.PageHelperStandardProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class DataServiceImpl implements DataService {


    @Autowired
    private DataMapper dataMapper;



    @Autowired
    private PageHelperStandardProperties pageHelperStandardProperties;
    //--------------------------------------------------------------------------------------buyer
    @Override
    public PageResult page(BuyerQureyParam buyerQureyParam) {
        //1. 设置分页参数
        PageHelper.startPage(buyerQureyParam.getPageNum(),buyerQureyParam.getPageSize());

        //2. 执行查询
        List<BuyersDTO> buyersList = dataMapper.list(buyerQureyParam);
        Page<BuyersDTO> p = (Page<BuyersDTO>) buyersList;

        //3. 封装结果
        return new PageResult(p.getTotal(), p.getResult());
    }

    @Override
    public void addUser(Buyers buyers) {
        buyers.setBuyer_createTime(LocalDate.now());
        dataMapper.addUser(buyers);
    }

    @Override
    public ResultBuyers getUserByUsername(String username) {
        ResultBuyers resultBuyers = dataMapper.getUserByUsername(username);
        // 确保Buyers类的字段与数据库列名匹配
        if (resultBuyers != null) {
            return resultBuyers;
        }
        return resultBuyers;
    }

    @Override
    public void updateUser(Buyers buyers) {
        buyers.setBuyer_updateTime(LocalDate.now());
        dataMapper.updateUser(buyers);
    }

    @Override
    public void deleteByUsername(String username) {
        dataMapper.deleteByUsername(username);
    }

    //--------------------------------------------------------------------------------------seller
    @Override
    public PageResult pageSeller(SellerQureyParam sellerQureyParam) {
        //1. 设置分页参数
        PageHelper.startPage(sellerQureyParam.getPageNum(), sellerQureyParam.getPageSize());

        //2. 执行查询
        List<SellersDTO> sellerlist = dataMapper.Sellerlist(sellerQureyParam);
        Page<SellersDTO> p = (Page<SellersDTO>) sellerlist;

        //3. 封装结果
        return new PageResult(p.getTotal(), p.getResult());
    }

    @Override
    public void addSellerUser(Sellers sellers) {
        sellers.setSeller_createTime(LocalDateTime.now());
        dataMapper.addSellerUser(sellers);
    }
    @Override
    public ResultSellers getSellerUserByUsername(String username) {
        ResultSellers resultSellers = dataMapper.getSellerUserByUsername(username);
        // 确保Buyers类的字段与数据库列名匹配
        if (resultSellers != null) {
            return resultSellers;
        }
        return resultSellers;
    }
    @Override
    public void updateSellerUser(Sellers sellers) {
        sellers.setSeller_updateTime(LocalDateTime.now());
        dataMapper.updateSellerUser(sellers);
    }
    @Override
    public void deleteSellerByUsername(String username) {
        dataMapper.deleteSellerByUsername(username);
    }


    //--------------------------------------------------------------------------------------buyPer
    @Override
    public BuyPerResponse getBuyPer(String id) {//回显
        return dataMapper.getBuyPer(id);
    }

    @Override
    public void postBuyerPerson(PostBuyer postBuyer) {//修改
        postBuyer.setUpdateTime(LocalDateTime.now());
        dataMapper.postBuyerPerson(postBuyer);
    }

    //--------------------------------------------------------------------------------------获取前端页面的分类回显
    @Override
    public List<String> getCategory() {
        List<String> list = dataMapper.getCategory();
        return list;
    }

    //--------------------------------------------------------------------------------------获取前端页面的搜索
    @Override
    public List<Products> getProducts(String category, String input) {
        List<Products> productsList = dataMapper.getProducts(category,input);
        for (Products products : productsList){
            if (products.getText() != null && products.getText().length() > 25) {
                products.setText(products.getText().substring(0, 25) + "...");
            }
        }
        return productsList;
    }

    //--------------------------------------------------------------------------------------获取前端页面的购物车
    @Override
    public List<ResCartCard> getCartData(String id) {
        //检查每个列中detail字段的长度是否超过20个字符，如果超过则截取并添加省略号
        List<ResCartCard> cartData = dataMapper.getCartData(id);
        for (ResCartCard card : cartData) {
            if (card.getDetail() != null && card.getDetail().length() > 50) {
                card.setDetail(card.getDetail().substring(0,50) + "...");
            }
        }
        return cartData;
    }

    //--------------------------------------------------------------------------------------购物车商品数量加减
    @Override
    public void handleNumChange(Integer id, Integer num) {
        dataMapper.handleNumChange(id,num);
    }

    //--------------------------------------------------------------------------------------购物车商品添加

    @Transactional
    @Override
    public void addShopCart(ReqAddShopCart reqAddShopCart) {
        dataMapper.addShopCart(reqAddShopCart);
    }
    //--------------------------------------------------------------------------------------后端购物车数据获取
    @Override
    public PageResult cartPage(BuyerQureyParam buyerQureyParam) {
        //1. 设置分页参数
        PageHelper.startPage(buyerQureyParam.getPageNum(),buyerQureyParam.getPageSize());

        //2. 执行查询
        List<Resshopcart> resshopcart = dataMapper.cartList(buyerQureyParam);
        Page<Resshopcart> p = (Page<Resshopcart>) resshopcart;

        //3. 封装结果
        return new PageResult(p.getTotal(), p.getResult());
    }

    //--------------------------------------------------------------------------------------后端购物车数据添加
    @Transactional
    @Override
    public void addcartData(Reqaddcart reqaddcart) {
        dataMapper.addressaddTimenum(reqaddcart);
        Integer storeId = dataMapper.getStoreId(reqaddcart);
        Integer cartId = dataMapper.getCartId();
        Integer sellerId = dataMapper.getSellerId(reqaddcart);
        Integer buyerId = dataMapper.getBuyerId(reqaddcart);
        Integer proId = dataMapper.getProId(reqaddcart);
        dataMapper.addcartData(cartId,sellerId,buyerId,proId,storeId);
    }
    //--------------------------------------------------------------------------------------后端卖家store数据获取
    @Override
    public PageResult storePage(BuyerQureyParam buyerQureyParam) {
        //1. 设置分页参数
        PageHelper.startPage(buyerQureyParam.getPageNum(),buyerQureyParam.getPageSize());

        //2. 执行查询
        List<Resstore> resstores = dataMapper.storeList(buyerQureyParam);
        Page<Resstore> p = (Page<Resstore>) resstores;

        //3. 封装结果
        return new PageResult(p.getTotal(), p.getResult());
    }
    //--------------------------------------------------------------------------------------后端卖家store商品数据获取
    @Override
    public PageResult sellerProPage(BuyerQureyParam buyerQureyParam) {
        // 1. 设置分页参数
        PageHelper.startPage(buyerQureyParam.getPageNum(), buyerQureyParam.getPageSize());



        // 4. 如果缓存中没有数据，则从数据库中查询
        List<ResSellerPro> resSellerPros = dataMapper.selleProList(buyerQureyParam);
        Page<ResSellerPro> page = (Page<ResSellerPro>) resSellerPros;

        // 7. 返回分页结果
        return new PageResult(page.getTotal(), page.getResult());
    }


    @Override
    public List<ResviewSelled> getviewSelled(String id) {
        return dataMapper.getviewSelled(id);
    }

    @Override
    public ResPerson getSellerPerson(String id) {
        return dataMapper.getSellerPerson(id);
    }

    @Override
    public void addSellerPro(ReqFile reqFile) {
        reqFile.setProIndate(LocalDateTime.now());
        String storeId = null;
        if (reqFile.getProStore().isEmpty()){

            storeId = dataMapper.selectstoreId(reqFile);
        }
        dataMapper.addSellerPro(reqFile,storeId);
    }

    @Override
    public List<String> backSellerFetchStore(String id) {
        List<String> list = dataMapper.backSellerFetchStore(id);
        return list;
    }

    @Override
    public PageResult orderGetData(BuyerQureyParam buyerQureyParam) {
        //1. 设置分页参数
        PageHelper.startPage(buyerQureyParam.getPageNum(),buyerQureyParam.getPageSize());

        //2. 执行查询
        List<OrderDTO> orderDTOS = dataMapper.orderGetData(buyerQureyParam);
        Page<OrderDTO> p = (Page<OrderDTO>) orderDTOS;

        //3. 封装结果
        return new PageResult(p.getTotal(), p.getResult());
    }

    @Transactional
    @Override
    public void AddOrder(ReqSumCart item, Integer buyerId) {
        //查找proid
        Integer proId = dataMapper.getSumCartProId(buyerId);
        //根据ProID获取商品名，单价
        String proName = dataMapper.getProName(proId);
        String price = dataMapper.getPrice(proId);
        //获取商店id
        Integer storeId = dataMapper.getStoreIdBystoreId(item.getStoreName());
        String totalPrice = item.getNum()*Double.parseDouble(price)+"";
        item.setCreatedDate(LocalDateTime.now());
        String orderStatus = "待付款";
        dataMapper.AddOrder(item,proName,proId,price,buyerId,storeId,totalPrice,orderStatus);
    }
    @Override
    public PageResult managerPage(BuyerQureyParam buyerQureyParam) {
        //1. 设置分页参数
        PageHelper.startPage(buyerQureyParam.getPageNum(),buyerQureyParam.getPageSize());

        //2. 执行查询
        List<ResManagerGetData> resManagerGetData = dataMapper.managerPage(buyerQureyParam);
        Page<ResManagerGetData> p = (Page<ResManagerGetData>) resManagerGetData;

        //3. 封装结果
        return new PageResult(p.getTotal(), p.getResult());
    }

    @Override
    public void SellerAddStore(ReqSellerAddStore reqSellerAddStore) {
        reqSellerAddStore.setStoreCreateTime(LocalDateTime.now());
        dataMapper.SellerAddStore(reqSellerAddStore);
    }


}
