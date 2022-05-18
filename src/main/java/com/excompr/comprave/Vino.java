package com.excompr.comprave;

public class Vino {
    private String marca;
    private String luogo_produzione;
    private String gradazione;
    Vino(String marca, String luogo_produzione, String gradazione)
    {
        this.marca = marca;
        this.luogo_produzione = luogo_produzione;
        this.gradazione = gradazione;
    }

    public String getMarca()
    {
        return marca;
    }
    public String getLuogo_produzione()
    {
        return luogo_produzione;
    }
    public String getGradazione()
    {
        return gradazione;
    }
}
