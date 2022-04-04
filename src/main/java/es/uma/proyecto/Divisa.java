package es.uma.proyecto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
public class Divisa/* implements Serializable*/{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String abreviatura;
	@Column(name="nombre", nullable =false)
	private String nombre;
	private char simbolo;
	@Column(name="CambioEuro", nullable=false)
	private float cambioEuro;
	@OneToMany(mappedBy="emisor")
	private List<Transaccion> transaccion_emisor;
	@OneToMany(mappedBy="receptor")
	private List<Transaccion> transaccion_receptor;
	@OneToMany(mappedBy="divisas")
	private List<Referencia> referencia_divisas;
	
	
	public Divisa(String abreviatura, String nombre, char simbolo, float cambioEuro) {
		
		this.abreviatura = abreviatura;
		this.nombre = nombre;
		this.simbolo = simbolo;
		this.cambioEuro = cambioEuro;
	}
	
	public Divisa() {
		super();
	}
	
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getSimbolo() {
		return simbolo;
	}
	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;
	}
	public float getCambioEuro() {
		return cambioEuro;
	}
	public void setCambioEuro(float cambioEuro) {
		this.cambioEuro = cambioEuro;
	}
	
	@Override
	public String toString() {
		return "abreviatura: "+this.abreviatura+" nombre: "+this.nombre+" simbolo: "+this.simbolo+" cambio_a_euro: "+cambioEuro;
		
	}
	
}