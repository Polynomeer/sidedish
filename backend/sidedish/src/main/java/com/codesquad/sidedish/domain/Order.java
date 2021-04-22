package com.codesquad.sidedish.domain;

import org.springframework.data.annotation.Id;

public class Order {

    @Id
    private Long orderId;

    private String email;
    private String detailHash;
    private int count;

    public Order(Long orderId, String email, String detailHash, int count) {
        this.orderId = orderId;
        this.email = email;
        this.detailHash = detailHash;
        this.count = count;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getEmail() {
        return email;
    }

    public String getDetailHash() {
        return detailHash;
    }

    public int getCount() {
        return count;
    }

}
