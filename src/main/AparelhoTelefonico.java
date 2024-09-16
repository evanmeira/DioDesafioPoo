package main;

public abstract class AparelhoTelefonico {
	
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero);
	}
	
	public void atender() {
		System.out.println("Atendendo...");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");
	}

}
