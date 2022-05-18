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
}
