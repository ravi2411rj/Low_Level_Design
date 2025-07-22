package com.lld.Structural.Adapter.Example1;

import com.lld.Structural.Adapter.Example1.ThirdParty.JuspayPG;

public class JuspayPGAdapter implements PaymentGatewayInterface {

    private final JuspayPG juspayPG = new JuspayPG();

    @Override
    public boolean checkStatus(String orderNumber) {
        return false;
    }

    @Override
    public void initiate(String orderNumber) {

    }
}