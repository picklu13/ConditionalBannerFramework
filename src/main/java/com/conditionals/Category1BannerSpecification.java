package com.conditionals;

public class Category1BannerSpecification extends BannerSpecification{

    public Category1BannerSpecification(InputContext inputContext) {
        super(inputContext);
    }

    @Override
    public String getBannerResponse() {
        String bannerString = "A category1 Banner for tenant" + getInputContext().getTenantname();
        return bannerString;
    }

    @Override
    public Boolean isSatisfiedBy() {
        return true;
    }
}
