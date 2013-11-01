package main;

public class Competicao {
	int folhas;
	int competidor;
	int flcompetidor;
	public boolean resultado(int fl, int comp, int flcomp){
		boolean saida = false;
		if(fl >= 1 && fl <=1000)
			if(comp >= 1 && comp <= 1000)
				if(flcomp >= 1 && flcomp <= 1000)
					if((comp * flcomp) < fl)
						saida = true;
		return saida;
	}
}
