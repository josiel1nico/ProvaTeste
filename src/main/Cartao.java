package main;

public class Cartao {
	String tipo; //inteira, estudante, livre
	int saldo = 0;
	
	public Cartao(String t, int saldo){
		this.tipo = t;
		this.saldo = saldo;
	}
	
	public boolean addCredito(Cartao card, int s){
		boolean saida = false;
		if(card.tipo == "livre") {
			saida = true;
		}
		else{
			if((100 - card.saldo) >= s){
				card.saldo += s;
				saida = true;
			}
		}
		return saida;
	}
	public boolean debCartao(Cartao card, int s){
		boolean saida = false;
		if(card.tipo == "livre") {
			saida = true;
		}
		else if(card.tipo == "estudante"){
			if((card.saldo - s) >= 0){
				card.saldo -= s;
				saida = true;
			}
		}
		else{
			if((card.saldo - 2*s) >= 0){
				card.saldo -= 2*s;
				saida = true;
			}
		}
		return saida;
	}
	
	public int salCartao(Cartao card){
		return card.saldo;
	}
}
