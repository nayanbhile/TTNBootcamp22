package com.demo.service;

import junit.framework.TestCase;

import com.demo.domain.Order;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class OrderServiceTest extends TestCase {

    OrderService orderService;
    EmailService emailService;
    Order order;

    @Test(expected = NullPointerException.class)
    public void testPlaceOrder()
    {
        this.order=Mockito.mock(Order.class);
        OrderService.getInstance();
        this.orderService=Mockito.mock(OrderService.class);
        this.order.setPrice(5000);
        this.orderService.placeOrder(order);

        verify(this.orderService,times(1)).placeOrder(this.order);

    }

}