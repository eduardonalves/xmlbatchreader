package com.ccee.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import jakarta.xml.bind.annotation.XmlElement;

public class CompraXml  {
	
	public CompraXml(List<Double> valor) {
		super();
		this.valor = valor;
	}

	public CompraXml() {

	}	
	
	private List<Double> valor =  new ArrayList<>();
	
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
		CompraXml other = (CompraXml) obj;
		return Objects.equals(valor, other.valor);
	}

	@Override
	public String toString() {
		return "Compra [valor=" + valor + "]";
	}


}
