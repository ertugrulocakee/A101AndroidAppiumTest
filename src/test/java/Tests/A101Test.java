package Tests;


import Models.*;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;



public class A101Test extends  BaseTest{

    HomeModel homeModel;

    SocksListModel socksListModel;

    SockDetailModel sockDetailModel;

    BasketModel basketModel;

    LoginModel loginModel;

    OrderModel orderModel;

    @Test
    @Order(1)
    public  void homeActivityOperations(){

        homeModel = new HomeModel();

        homeModel.denyNewUpdate();

        homeModel.isOnHomeActivity();

        homeModel.goToSocksPage();


    }

    @Test
    @Order(2)
    public void socksListActivityOperations(){

        socksListModel = new SocksListModel();

        socksListModel.goToSock();

    }

    @Test
    @Order(3)
    public  void  sockDetailActivityOperations(){

        sockDetailModel = new SockDetailModel();

        sockDetailModel.isSockBlack();

        sockDetailModel.addToBasket();

        sockDetailModel.goToBasket();

    }

    @Test
    @Order(4)
    public  void  basketActivityOperations(){

        basketModel = new BasketModel();

        basketModel.confirmBasket();

    }

    @Test
    @Order(5)
    public  void  loginActivityOperations(){

        loginModel = new LoginModel();

        loginModel.moveWithoutIdentity();

    }


    @Test
    @Order(6)
    public void orderActivityOperations(){

        orderModel = new OrderModel();

        orderModel.acceptAllCookies();

        orderModel.createNewAdress();

        orderModel.payOperations();

        orderModel.isOnGarantiPay();


    }


}
