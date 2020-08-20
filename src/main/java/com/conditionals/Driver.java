package com.conditionals;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        BannerSpecification cat1Banner = new Category1BannerSpecification(new TenantDataContext("Tenant1", "LA"));
        BannerSpecification cat2Banner = new Category2BannerSpecification(new TenantDataContext("Tenant2", "SC"));

        List<String> bannerStrings = new ArrayList<>();
        if (cat1Banner.isSatisfiedBy()) {
            bannerStrings.add(cat1Banner.getBannerResponse());
        }
        if (cat2Banner.isSatisfiedBy()) {
            bannerStrings.add(cat2Banner.getBannerResponse());
        }
    }
}
