package com.excompr.comprave;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;

@RestController
public class Controller {
    ArrayList<Utente> persone = new ArrayList<>();
    ArrayList<Vino> vino = new ArrayList<>();
    ArrayList<Acquisto> acquisto = new ArrayList<>();
    @GetMapping("/insertutente")
    String insert(@RequestParam String nome, @RequestParam String cognome, @RequestParam String cf, @RequestParam int eta)
    {
        persone.add(new Utente(nome,cognome,cf,eta));
        return "utente inserito con successo";
    }
    @GetMapping("/insertvino")
    String insertv(@RequestParam String nome, @RequestParam String azienda_produttrice, @RequestParam String tipologia, @RequestParam int annata)
    {
        vino.add(new Vino(nome,azienda_produttrice,tipologia,annata));
        return "vino inserito con successo";
    }
    @GetMapping("/acquisto")
    boolean acqui(@RequestParam String cfu, @RequestParam String nomev)
    {
        boolean result = true;
        boolean result1 = true;
        boolean result2 = true;
        for(Utente item: persone)
        {
            if (item.getCf().equals(cfu))
            {
                result1 = true;
                break;
            }
            else
                result1 = false;
        }
        for(Vino item1: vino)
        {
            if (item1.getNome().equals(nomev))
            {
                result2 = true;
                break;
            }
            else
                result2 = false;
        }
        if(result1 && result2)
        {
            acquisto.add(new Acquisto(cfu,nomev));
        }
        return result;
    }
    @GetMapping("/listavini")
    public void listavini()
    {
        for (Vino item: vino)
        {
            System.out.println(item.getNome() + " " + item.getAzienda_produttrice() + " " + item.getTipologia() + " " + item.getAnnata());
        }
    }
    @GetMapping("/stampaacquisti")
    public void stampaacquisti()
    {
        for (Acquisto item: acquisto)
        {
            System.out.println(item.getCfu() + " " + item.getNomev());
        }
    }
    @GetMapping("/stampavinonome")
    public void stampavinonome(@RequestParam String nome)
    {
        for (Vino item: vino)
        {
            if(item.getNome().equals(nome))
            {
                System.out.println(item.getNome() + " " + item.getAzienda_produttrice() + " " + item.getTipologia() + " " + item.getAnnata());
                break;
            }
            else
            {
                System.out.println("vino non trovato");
            }
        }
    }
    @GetMapping("/stampavinoaz")
    public void stampavinoaz(@RequestParam String azienda)
    {
        for (Vino item: vino)
        {
            if(item.getAzienda_produttrice().equals(azienda))
            {
                System.out.println(item.getNome() + " " + item.getAzienda_produttrice() + " " + item.getTipologia() + " " + item.getAnnata());
                break;
            }
            else
            {
                System.out.println("vino non trovato");
            }
        }
    }
    @GetMapping("/stampavinotipologia")
    public void stampavinotipologia(@RequestParam String tipologia)
    {
        for (Vino item: vino)
        {
            if(item.getTipologia().equals(tipologia))
            {
                System.out.println(item.getNome() + " " + item.getAzienda_produttrice() + " " + item.getTipologia() + " " + item.getAnnata());
                break;
            }
            else
            {
                System.out.println("vino non trovato");
            }
        }
    }
    @GetMapping("/stampavinoannata")
    public void stampavinoannata(@RequestParam int annata)
    {
        for (Vino item: vino)
        {
            if(item.getAnnata() == annata)
            {
                System.out.println(item.getNome() + " " + item.getAzienda_produttrice() + " " + item.getTipologia() + " " + item.getAnnata());
                break;
            }
            else
            {
                System.out.println("vino non trovato");
            }
        }
    }

}
