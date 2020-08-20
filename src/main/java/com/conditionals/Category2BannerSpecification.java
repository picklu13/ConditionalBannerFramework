package com.conditionals;

public class Category2BannerSpecification extends BannerSpecification{

    public Category2BannerSpecification(InputContext inputContext) {
        super(inputContext);
    }

    @Override
    public String getBannerResponse() {
        return "Cat 2 banner";
    }

    @Override
    public Boolean isSatisfiedBy() {
        return false;
    }
}
