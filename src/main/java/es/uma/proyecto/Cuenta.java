package es.uma.proyecto;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Cuenta {

	@Id @GeneratedValue
	private Long IBAN;
	private Long SWIFT;

	public Cuenta() {
		super();
	}

	public Cuenta(Long iBAN, Long sWIFT) {
		IBAN = iBAN;
		SWIFT = sWIFT;
	}

	public Long getIBAN() {
		return this.IBAN;
	}

	public void setIBAN(Long id) {
		this.IBAN = id;
	}

	public Long getSWIFT() {
		return SWIFT;
	}

	public void setSWIFT(Long sWIFT) {
		SWIFT = sWIFT;
	}

	@Override
	public String toString() {
		return "Cuenta [IBAN=" + IBAN + ", SWIFT=" + SWIFT + "]";
	}
	
	

}