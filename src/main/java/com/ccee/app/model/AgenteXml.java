package com.ccee.app.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;


import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "agente")
public class AgenteXml {




	
	public AgenteXml(int codigo, Date data, List<RegiaoXml> regiao) {
		super();
		this.codigo = codigo;
		this.data = data;
		this.regiao = regiao;
	}

	public AgenteXml() {

	}
	
	
	private int codigo;
	
	private Date data;
	
	private List<RegiaoXml> regiao = new ArrayList<>();
	
	
	@XmlElement(name = "codigo")
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	@XmlElement(name = "data")
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	@XmlElement(name = "regiao")
	public List<RegiaoXml> getRegiao() {
		return regiao;
	}
	
	public void setRegiao(List<RegiaoXml> regiao) {
		this.regiao = regiao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, data, regiao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AgenteXml other = (AgenteXml) obj;
		return codigo == other.codigo && Objects.equals(data, other.data) && Objects.equals(regiao, other.regiao);
	}

	@Override
	public String toString() {
		return "Agente [codigo=" + codigo + ", data=" + data + ", regiao=" + regiao + "]";
	}
	




}
