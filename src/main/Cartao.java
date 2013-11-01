package main;

public class Cartao {
	String tipo; //inteira, estudante, livre
	int saldo = 0;
	
	public Cartao(String t, int saldo){
		this.tipo = t;
		this.saldo = saldo;
	}
	
	public int addCredito(Cartao card, int s){
		int saida = 0;
		if(card.tipo == "livre") {
			saida = card.saldo;
		}
		else{
			if((100 - card.saldo) >= s){
				card.saldo += s;
			}
			saida = card.saldo;
		}
		return saida;
	}
	public int debCartao(Cartao card, int s){
		int saida = 0;
		if(card.tipo == "livre") {
			saida = card.saldo;
		}
		else if(card.tipo == "estudante"){
			if((card.saldo - s) >= 0){
				card.saldo -= s;
			}
			saida = card.saldo;
		}
		else{
			if((card.saldo - 2*s) >= 0){
				card.saldo -= 2*s;
			}
		}
		return saida;
	}
	
	public int salCartao(Cartao card){
		return card.saldo;
	}
}
