package com.cmc.wrappers;

public class C_Constructores {
    public static void main(String[] args) {
        Short sh = new Short((short)0);
        Short sh1 = new Short("10");

        Long lg = new Long("20");

        Float ft = new Float(10.10D);

        Boolean bl0 = new Boolean(false);
        Boolean bl1 = new Boolean("true");
        Boolean bl2 = new Boolean("True");
        Boolean bl3 = new Boolean("Python");

        System.out.println(bl0+" "+bl1+" "+ bl2+" "+bl3);
    }
}
