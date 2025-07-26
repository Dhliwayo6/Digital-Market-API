package com.market.digital_market.model.market;

import com.market.digital_market.model.business.Business;

import java.util.List;

public class MarketDTO {

    private Long id;
    private List<Business> businesses;

    public MarketDTO(Market market) {
        this.id = market.getId();
        this.businesses = market.getBusinesses();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Business> getBusinesses() {
        return businesses;
    }

    public void setBusinesses(List<Business> businesses) {
        this.businesses = businesses;
    }
}
