package DataHora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;




public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		
		System.out.println("d01: "+d01);
		System.out.println("d02: "+d02);
	}

}
