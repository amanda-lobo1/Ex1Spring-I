package com.example.numerosromanos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/romans")
public class RomanosController {

    public int [] numeros = {1000, 500, 100, 50, 13, 10, 7, 5, 4, 3, 2, 1};
    public String [] letras = {"M", "D", "C", "L", "XIII", "X", "VII", "V", "IV", "III", "II", "I"};
    String roman="";

    @GetMapping("/conversao/{numConvertido}")
    public String numRomano (@PathVariable int numConvertido){
        for(int i = 0; i < numeros.length; i++){
        while(numConvertido >= numeros[i]){
            numConvertido -= numeros[i];
            roman += letras[i];
        }
    }
        return roman;
}
}
