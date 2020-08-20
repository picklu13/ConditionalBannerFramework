package com.conditionals;

public class TenantDataContext extends InputContext {

    private String tenantName;
    private String tenantLocation;

    public TenantDataContext(String tenantName, String tenantLocation) {
        this.tenantName = tenantName;
        this.tenantLocation = tenantLocation;
    }

    @Override
    String getTenantname() {
        return this.getTenantname();
    }
}
