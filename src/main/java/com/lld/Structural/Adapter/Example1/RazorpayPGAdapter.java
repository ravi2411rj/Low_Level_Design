package com.lld.Structural.Adapter.Example1;

import com.lld.Structural.Adapter.Example1.ThirdParty.RazorpayPG;

public class RazorpayPGAdapter implements PaymentGatewayInterface {

    private final RazorpayPG razorpayPG = new RazorpayPG();

    @Override
    public boolean checkStatus(String orderNumber) {
        return false;
    }

    @Override
    public void initiate(String orderNumber) {

    }
}
