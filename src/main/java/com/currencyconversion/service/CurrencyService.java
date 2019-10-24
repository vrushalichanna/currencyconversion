package com.currencyconversion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.currencyconversion.entity.CurrencyEntity;
import com.currencyconversion.repo.CurrencyRepo;

@Service
public class CurrencyService {

	@Autowired
	CurrencyRepo currencyRepo;
	
	public CurrencyEntity saveCurrency(CurrencyEntity currency) {
		currencyRepo.save(currency);
		return null;
	}



}
