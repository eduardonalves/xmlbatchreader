package com.ccee.app.dao;

import java.util.Date;
import java.util.Objects;




public class AgenteDAO {

	public AgenteDAO() {

	}
	private int codigo;
	private Date data;

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo, data);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		AgenteDAO other = (AgenteDAO) obj;
		return codigo == other.codigo && Objects.equals(data, other.data);
	}

}
