package ExercicioNumerado;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalho {

	private String name;
	private NivelDetrabalho nivel;
	private double SalarioBase;
	private Departamento departament;
	
	private List<HoraContrato> contracts = new ArrayList<>();
	
	private Trabalho(){
	}
	
	public Trabalho(String name, NivelDetrabalho nivel, double salarioBase, Departamento departament) {
		
		this.name = name;
		this.nivel = nivel;
		SalarioBase = salarioBase;
		this.departament = departament;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NivelDetrabalho getNivel() {
		return nivel;
	}

	public void setNivel(NivelDetrabalho nivel) {
		this.nivel = nivel;
	}

	public double getSalarioBase() {
		return SalarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		SalarioBase = salarioBase;
	}

	public Departamento getDepartament() {
		return departament;
	}

	public void setDepartament(Departamento departament) {
		this.departament = departament;
	}

	public List<HoraContrato> getContracts() {
		return contracts;
	}

	public void addContract(HoraContrato contrato) {
		
		contracts.add(contrato);
		
	}
	public void RemoveContract(HoraContrato contrato) {
		contracts.remove(contrato);
		
	}
	
	public double income(int year, int month ) {
		double sum = SalarioBase;
		
		Calendar cal = Calendar.getInstance();
		for (HoraContrato c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month =cal.get(Calendar.MONTH);
			
			if(year == c_year && month == c_month) {
				
				sum += c.totalValue();
			}
		}
		return sum;
	}
}
