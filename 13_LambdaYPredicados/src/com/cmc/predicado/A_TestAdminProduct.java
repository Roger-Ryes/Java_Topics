package com.cmc.predicado;

public class A_TestAdminProduct {
    public static void main(String[] args) {
        A_AdminProduct adminProduct = new A_AdminProduct();
        adminProduct.ejecute((String a) -> a.length() > 5);
    }
}
