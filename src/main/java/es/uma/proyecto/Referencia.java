package es.uma.proyecto;
import java.util.Date;

import javax.persistence.*;

@Entity
public class Referencia extends Cuenta {
	private String nombreBanco;
	private String sucursal;
	private String pais;
	private double saldo;
	@Temporal(TemporalType.DATE)
	private Date fechaApertura;
	private String estado;
	public String getNombreBanco() {
		return nombreBanco;
	}
	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Date getFechaApertura() {
		return fechaApertura;
	}
	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Referencia [nombreBanco=" + nombreBanco + ", sucursal=" + sucursal + ", pais=" + pais + ", saldo="
				+ saldo + ", fechaApertura=" + fechaApertura + ", estado=" + estado + "]";
	}
	
}
