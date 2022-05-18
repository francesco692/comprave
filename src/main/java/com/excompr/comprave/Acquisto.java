package com.excompr.comprave;

public class Acquisto {
    private String cfu;
    private String nomev;
    Acquisto(String cfu, String nomev)
    {
        this.cfu = cfu;
        this.nomev = nomev;
    }

    public String getCfu()
    {
        return cfu;
    }
    public String getNomev()
    {
        return nomev;
    }
}
