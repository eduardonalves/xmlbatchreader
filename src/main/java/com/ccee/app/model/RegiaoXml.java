package com.ccee.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;




import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

public class RegiaoXml {


	

	public RegiaoXml(String sigla, List<GeracaoXml> geracao, List<CompraXml> compra, List<PrecoMedioXml> precoMedio) {
		super();
		this.sigla = sigla;
		this.geracao = geracao;
		this.compra = compra;
		this.precoMedio = precoMedio;
	}

	public RegiaoXml() {

	}

	
	private String sigla;

	
	private List<GeracaoXml> geracao = new ArrayList<>();


	
	private List<CompraXml> compra = new ArrayList<>();


	
	private List<PrecoMedioXml> precoMedio = new ArrayList<>();
	
	

	
	@XmlAttribute(name="sigla")  
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	@XmlElement(name = "geracao")
	public List<GeracaoXml> getGeracao() {
		return geracao;
	}

	public void setGeracao(List<GeracaoXml> geracao) {
		this.geracao = geracao;
	}
	@XmlElement(name = "compra")
	public List<CompraXml> getCompra() {
		return compra;
	}

	public void setCompra(List<CompraXml> compra) {
		this.compra = compra;
	}
	@XmlElement(name = "precoMedio")
	public List<PrecoMedioXml> getPrecoMedio() {
		return precoMedio;
	}

	public void setPrecoMedio(List<PrecoMedioXml> precoMedio) {
		this.precoMedio = precoMedio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(compra, geracao, precoMedio, sigla);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegiaoXml other = (RegiaoXml) obj;
		return Objects.equals(compra, other.compra) && Objects.equals(geracao, other.geracao)
				&& Objects.equals(precoMedio, other.precoMedio) && Objects.equals(sigla, other.sigla);
	}

	@Override
	public String toString() {
		return "Regiao [sigla=" + sigla + ", geracao=" + geracao + ", compra=" + compra + ", precoMedio=" + precoMedio
				+ "]";
	}

	

	


}
