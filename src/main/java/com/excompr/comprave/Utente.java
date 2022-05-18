package com.excompr.comprave;

public class Utente {
    private String nome;
    private String cognome;
    private String cf;
    private int eta;
    Utente(String nome, String cognome, String cf, int eta)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
        this.eta = eta;
    }

    public String getNome()
    {
        return nome;
    }
    public String getCognome()
    {
        return cognome;
    }
    public String getCf()
    {
        return cf;
    }
    public int getEta()
    {
        return eta;
    }
}
