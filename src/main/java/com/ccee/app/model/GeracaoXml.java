package com.ccee.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import jakarta.xml.bind.annotation.XmlElement;

public class GeracaoXml {
	
	public GeracaoXml(List<Double> valor) {
		super();
		this.valor = valor;
	}

	public GeracaoXml() {

	}

	private List<Double> valor =  new ArrayList<>();
	
	
	@Override
	public String toString() {
		return "Geracao [valor=" + valor + "]";
	}
	
	@XmlElement(name = "valor")
	public List<Double> getValor() {
		return valor;
	}

	public void setValor(List<Double> valor) {
		this.valor = valor;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeracaoXml other = (GeracaoXml) obj;
		return Objects.equals(valor, other.valor);
	}

}
