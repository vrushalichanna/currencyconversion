package com.currencyconversion.controller;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.currencyconversion.entity.CurrencyEntity;
import com.currencyconversion.service.CurrencyService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class CurrencyController {
	
	@Autowired 
	CurrencyService currencyService;
	

	@PostMapping("/addCurrency")
	public ResponseEntity<CurrencyEntity> saveCurrency(@RequestBody CurrencyEntity currency){
		CurrencyEntity newCurrency = (CurrencyEntity) this.currencyService.saveCurrency(currency);
		return new ResponseEntity<>(newCurrency,HttpStatus.ACCEPTED);
	}
	
	@PostConstruct
    public void init()
    {
        RestTemplate rest= new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity <String> entity = new HttpEntity<String>(headers);
        CurrencyEntity model=rest.getForEntity("https://api.exchangerate-api.com/v4/latest/USD", CurrencyEntity.class).getBody();
        this.currencyService.saveCurrency(model);
      
        
    }
	
}
