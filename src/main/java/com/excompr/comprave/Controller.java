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
    @GetMapping("/insertutente")
    String insert(@RequestParam String nome, @RequestParam String cognome, @RequestParam String cf, @RequestParam int eta)
    {
        persone.add(new Utente(nome,cognome,cf,eta));
        return "utente inserito con successo";
    }
    @GetMapping("/insertvino")
    String insertv(@RequestParam String marca, @RequestParam String luogo_produzione, @RequestParam String gradazione)
    {
        vino.add(new Vino(marca,luogo_produzione,gradazione));
        return "vino inserito con successo";
    }
}
