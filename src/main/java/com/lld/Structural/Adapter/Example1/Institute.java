package com.lld.Structural.Adapter.Example1;

import java.util.List;

public class Institute {

    List<PaymentGatewayInterface> paymentGateways = List.of(
            new RazorpayPGAdapter()
    );

    void Scaler(List<PaymentGatewayInterface> paymentGateways) {
        this.paymentGateways = paymentGateways;
    }

    void admitStudent() {
        paymentGateways.get(0).initiate("12345678");
    }

}
