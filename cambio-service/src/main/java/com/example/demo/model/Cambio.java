package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

public class Cambio implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String from;
	private String to;
	private String environment;
	private Double conversionFactor;
	private Double convertedValue;
	
	public Cambio() {
		
	}
	
	public Cambio(Long id, String from, String to, String environment, Double conversionFactor, Double convertedValue) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.environment = environment;
		this.conversionFactor = conversionFactor;
		this.convertedValue = convertedValue;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public Double getConversionFactor() {
		return conversionFactor;
	}

	public void setConversionFactor(Double conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	public Double getConvertedValue() {
		return convertedValue;
	}

	public void setConvertedValue(Double convertedValue) {
		this.convertedValue = convertedValue;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cambio other = (Cambio) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	

}
