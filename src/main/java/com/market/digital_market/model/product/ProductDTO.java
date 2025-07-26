package com.market.digital_market.model.product;

import com.market.digital_market.model.business.Business;

import java.util.List;

public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private List<Business> business;

    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
        this.price = product.getPrice();
        this.business = product.getBusinesses();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Business> getBusiness() {
        return business;
    }

    public void setBusiness(List<Business> business) {
        this.business = business;
    }
}
