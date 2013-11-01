package main;

public class CompeticaoCorrigida {

public boolean resultado(int folhas, int competidor, int flcompetidor){
		
		boolean saida = false;
		
		if((folhas >= 1 && folhas <=1000) && 
				(competidor >= 1 && competidor <= 1000)
				&& (flcompetidor >= 1 && flcompetidor <= 1000) && 
					(competidor * flcompetidor) <= folhas)
						saida = true;
		return saida;
	}

}
