package app;

import modelo.Carta;
import modelo.Mazo;
import modelo.NoHayMasCartasException;

public class prueba {
	
	public static void main (String[] args) {
		
		System.out.println ("creando la baraja de cartas...");
		//creando una baraja
		Mazo baraja =new Mazo();
		
		baraja.barajar();
		
		System.out.println("la baraja es"+ baraja);
		
		
		Carta c1;
		try {
			c1 = baraja.solicitarCarta();
			System.out.println("La carta es "+c1);
			System.out.println("La baraja queda "+baraja);
		} catch (NoHayMasCartasException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
