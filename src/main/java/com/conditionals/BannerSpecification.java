package com.conditionals;

public abstract class BannerSpecification {

    public InputContext getInputContext() {
        return inputContext;
    }

    public void setInputContext(InputContext inputContext) {
        this.inputContext = inputContext;
    }

    protected InputContext inputContext;

    public BannerSpecification(InputContext inputContext) {
        this.inputContext = inputContext;
    }

    public abstract String getBannerResponse();
    public abstract Boolean isSatisfiedBy();
}
