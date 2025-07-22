package com.lld.Structural.Adapter.Example1;

import com.lld.Structural.Adapter.Example1.ThirdParty.CCAvenuePG;

public class CCAvenuePGAdapter implements PaymentGatewayInterface {

    private final CCAvenuePG ccAvenuePG = new CCAvenuePG();

    @Override
    public boolean checkStatus(String orderNumber) {
        return false;
    }

    @Override
    public void initiate(String orderNumber) {
        ccAvenuePG.startPayment(orderNumber);
    }
}
