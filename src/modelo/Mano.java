package modelo;

import java.util.ArrayList;

public class Mano extends Mazo {

	public Mano() {
		//creamos una list de cartas vacías
		this.cartas = new ArrayList<Carta>();
		
	}
	
	public int valorMano() {
		int valor=0;
		int numAses=0;
		for(Carta c : this.cartas) {
			if(c.getNumero()==1) {
				numAses++;
		}
			
			valor = valor + c.getValor();
			
}		
		// comprobamos si me he pasado de 21
		
	if	(numAses>0 && valor>21) {
		valor=valor-10;
		numAses--;
	}
	
	
	return valor;
	
	}
	public boolean finDeJuego () {
		if (valorMano()>=21) {
			return true;
		}
		
		//version del metodo que lanza la excepcion Masde21Excception
		public boolean FindeJuego() {
				if (valorMano()>=21) {
					return true;
				}
		
		return false;
	
	}
			
		@Override
		public String toString() {
			return "Mano [cartas=" + cartas + "]";
		}
	}