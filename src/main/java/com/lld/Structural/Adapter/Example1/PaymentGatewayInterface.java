package com.lld.Structural.Adapter.Example1;

public interface PaymentGatewayInterface {

    void initiate(String orderNumber);

    boolean checkStatus(String orderNumber);

}
