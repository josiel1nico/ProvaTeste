package main;

public class DNA {

	public int BMmatch(String text, String pattern) {

		int[] last = buildLastFuncction(pattern);
		int n = text.length();
		int m = pattern.length();
		int i = m - 1;

		if (i > n - 1) {
			return -1; // nao ha ocorrencias se o padrao for mais longo que o
						// texto
		}
		int j = m - 1;

		do {
			if (pattern.charAt(j) == text.charAt(i)) {
				if (j == 0) {
					return i; // achado
				} else { // heuristica do espelho: do fim para o inicio do
							// padrão
					i--;
					j--;
				}
			} else {
				i = i + m - Math.min(j, 1 + last[text.charAt(i)]); // heuristica
																	// do salto
																	// de
																	// caracteres
				j = m - 1;
			}
		} while (i <= n - 1);

		return -1;// nao foi achado
	}


	
	public static int[] buildLastFuncction(String pattern) {

		int[] last = new int[128]; // assume-se o conjunto de caracteres ASCII

		for (int i = 0; i < 128; i++) {

			last[i] = -1; // inicializa-se o arranjo
		}

		for (int i = 0; i < pattern.length(); i++) {
			last[pattern.charAt(i)] = i; // conversao para um código ASCII
											// inteiro
		}
		return last;
	}
	
	
	
	public static void main(String[] args) {
		
		String text = "TCATATGCAAATAGCTGCATACCGA";
		String pattern = "CATA";

		System.out.print("Cadeia maior: " + text + "\n");
		System.out.print("Cadeia menor: " + pattern + "\n");

		DNA dna = new DNA();

		System.out.println("Posicão do inicio do padrão no texto: " + dna.BMmatch(text, pattern));

	}
	
}
