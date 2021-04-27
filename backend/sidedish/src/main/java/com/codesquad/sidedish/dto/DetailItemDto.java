package com.codesquad.sidedish.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DetailItemDto {

    @JsonProperty
    private String detailHash;

    @JsonProperty
    private String title;

    @JsonProperty
    private String topImage;

    @JsonProperty
    private List<String> thumbImages;

    @JsonProperty
    private String productDescription;

    @JsonProperty
    private Integer point;

    @JsonProperty
    private String deliveryInfo;

    @JsonProperty
    private String deliveryFee;

    @JsonProperty
    private List<String> prices;

    @JsonProperty
    private List<String> badge;

    @JsonProperty
    private List<String> detailSection;

    @JsonProperty
    private int stock;

    public DetailItemDto(String detailHash, String title, String topImage, List<String> thumbImages, String productDescription, Integer point, String deliveryInfo, String deliveryFee, List<String> prices, List<String> badge, List<String> detailSection, int stock) {
        this.detailHash = detailHash;
        this.title = title;
        this.topImage = topImage;
        this.thumbImages = thumbImages;
        this.productDescription = productDescription;
        this.point = point;
        this.deliveryInfo = deliveryInfo;
        this.deliveryFee = deliveryFee;
        this.prices = prices;
        this.badge = badge;
        this.detailSection = detailSection;
        this.stock = stock;
    }
}
