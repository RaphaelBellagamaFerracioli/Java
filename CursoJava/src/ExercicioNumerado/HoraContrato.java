package ExercicioNumerado;

import java.util.Date;

public class HoraContrato {

	private Date date;
	private Double  SalarioHora;
	private Integer horas;


	public HoraContrato(){
	}

	public HoraContrato(Date date, Double salarioHora, Integer horas) {
		super();
		this.date = date;
		SalarioHora = salarioHora;
		this.horas = horas;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getSalarioHora() {
		return SalarioHora;
	}

	public void setSalarioHora(Double salarioHora) {
		SalarioHora = salarioHora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public double totalValue() {
		return SalarioHora* horas;
	}
	
	
}
