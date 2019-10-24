package com.currencyconversion.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.currencyconversion.entity.CurrencyEntity;

@Repository
public interface CurrencyRepo extends CrudRepository<CurrencyEntity, Long>{

}
