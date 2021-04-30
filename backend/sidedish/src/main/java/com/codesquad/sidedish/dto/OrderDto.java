package com.codesquad.sidedish.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderDto {
    @JsonProperty()
    private Integer count;

    public OrderDto() {
    }

    public OrderDto(Integer count) {
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }
}
