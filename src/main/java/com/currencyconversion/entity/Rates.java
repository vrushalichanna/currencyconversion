package com.currencyconversion.entity;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="rates")
public class Rates {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer currencyId;
	private Integer name;
	private String  rate;
	
//	@ManyToOne
//	 @JoinColumn(name="currency_id")
//	CurrencyEntity currencyEntity;
//	
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	private CurrencyEntity currencyEntity;
//	
//	    @JoinColumn(name="rate")
//	    @ManyToOne(cascade=CascadeType.ALL)
//	    private CurrencyEntity currencyEntity;
	
//	 @ManyToOne(fetch = FetchType.EAGER)
//	  @JoinColumn (name="customer_id",referencedColumnName="id",nullable=false,unique=true)
//	  private CurrencyEntity currencyEntity;
	 
	public Integer getName() {
		return name;
	}
	public void setName(Integer name) {
		this.name = name;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
//	public CurrencyEntity getCurrencyEntity() {
//		return currencyEntity;
//	}
//	public void setCurrencyEntity(CurrencyEntity currencyEntity) {
//		this.currencyEntity = currencyEntity;
//	}
	
	
}
