package com.currencyconversion.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="currency")
public class CurrencyEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	@Column
	private String base;
	@Column
	private Date time_last_updated;
	
	@OneToMany(mappedBy="currencyId", cascade = CascadeType.ALL)
	private List<Rates> rates;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public Date getTime_last_updated() {
		return time_last_updated;
	}
	public void setTime_last_updated(Date time_last_updated) {
		this.time_last_updated = time_last_updated;
	}
	public List<Rates> getRates() {
		return rates;
	}
	public void setRates(List<Rates> rates) {
		this.rates = rates;
	}
	

	
	
    

}
