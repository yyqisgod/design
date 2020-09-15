package com.yyq.facade;

/**
 * @author: 布里巴
 * @date: 2020/9/10
 */
public class ShopFacadeService {
    private OrderService orderService = new OrderService();
    private PayService payService = new PayService();

    public void shop(){
        orderService.order();
        payService.pay();
    }
}
