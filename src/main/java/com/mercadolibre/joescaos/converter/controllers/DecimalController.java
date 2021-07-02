package com.mercadolibre.joescaos.converter.controllers;

import com.mercadolibre.joescaos.converter.models.Converter;
import com.mercadolibre.joescaos.converter.response.ResponseRomanNumber;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/converter")
public class DecimalController {

    @GetMapping("/decimal-to-roman")
    public ResponseRomanNumber decimalToRoman(@RequestParam int decimal){
        return new ResponseRomanNumber(new Converter().decimalToRoman(decimal), decimal);
    }

    @GetMapping("roman-to-decimal")
    public ResponseRomanNumber  romanToDecimal(@RequestParam String roman){

        return new ResponseRomanNumber(roman, new Converter().romanToDecimal(roman));
    }
}
