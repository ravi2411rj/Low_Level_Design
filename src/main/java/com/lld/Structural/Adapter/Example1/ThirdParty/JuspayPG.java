package com.lld.Structural.Adapter.Example1.ThirdParty;

import java.util.UUID;

public class JuspayPG {
    public Boolean beginPayment(UUID orderNumber) {
        System.out.println("Payment started using Juspay");
        return true;
    }
}
