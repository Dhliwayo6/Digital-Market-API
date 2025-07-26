package com.market.digital_market.model.business;

public class BusinessDTO {

    private Long id;
    private String name;
    private String department;

    public BusinessDTO(Business business) {
        this.id = business.getId();
        this.name = business.getName();
        this.department = business.getDepartment();
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
