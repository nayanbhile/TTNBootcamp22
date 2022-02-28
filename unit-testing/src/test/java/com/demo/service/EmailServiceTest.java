package com.demo.service;

import com.demo.domain.Order;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {

    EmailService emailService;
    Order order;

    @Before
    public void testGetInstance()
    {
        this.order= Mockito.mock(Order.class);
        EmailService.getInstance();
        this.emailService=Mockito.mock(EmailService.class);
    }

    @Test
    public void testSendEmail() {
        this.emailService.sendEmail(this.order);
        Assert.assertEquals(order.isCustomerNotified(),false);
    }

    @Test
    public void testTestSendEmail() {
        this.emailService.sendEmail(this.order, "Order 1");
        Assert.assertEquals(this.order.isCustomerNotified(),false);
    }
}