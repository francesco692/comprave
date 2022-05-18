package com.excompr.comprave;

public class Vino {
    private String nome;
    private String azienda_produttrice;
    private String tipologia;
    private int annata;
    Vino(String nome, String azienda_produttrice, String tipologia, int annata)
    {
        this.nome = nome;
        this.azienda_produttrice = azienda_produttrice;
        this.tipologia = tipologia;
        this.annata = annata;
    }

    public String getNome()
    {
        return nome;
    }
    public String getAzienda_produttrice()
    {
        return azienda_produttrice;
    }
    public String getTipologia()
    {
        return tipologia;
    }
    public int getAnnata()
    {
        return annata;
    }
}
