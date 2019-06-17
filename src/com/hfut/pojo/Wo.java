package com.hfut.pojo;

import java.lang.reflect.Proxy;

public class Wo {
    public static void main(String[] args) {
        Mishu mishu=new Mishu();
        Gongneng gongneng=(Gongneng) Proxy.newProxyInstance(Wo.class.getClassLoader(),new Class[]{Gongneng.class},mishu);
        gongneng.chifan();
    }
}
