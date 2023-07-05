package Enumerado;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pedido ped = new Pedido(1080, new Date(), OrdemStatus.Aguardando_Pagamento);
		
		OrdemStatus or = OrdemStatus.Entregue;
		
		OrdemStatus e = OrdemStatus.valueOf("Entregue");
		//faz a conversão do tipo string digitado pelo usuario para um tipo enum como variavel de retorno
		
		System.out.println("Pedido: "+ped);
		
	}

}
