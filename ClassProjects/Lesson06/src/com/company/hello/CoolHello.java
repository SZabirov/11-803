package com.company.hello;

public abstract class CoolHello implements Hello {
    private String district;

    public CoolHello(String district) {
        this.district = district;
    }

    @Override
    public void sayHello() {
        System.out.println("whasssssuuuuup!!! " +
                "i'm from " + district);
    }

    public abstract void showFingerSign();
}
