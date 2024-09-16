package main;

public class Usuario {

	public static void main(String[] args) {
		Iphone aparelho = new Iphone();
		
		aparelho.atender();
		aparelho.iniciarCorreioVoz();
		aparelho.ligar("96998076553");
		
		aparelho.adicionarNovaAba();
		aparelho.exibirPagina("https://www.dio.me");
		aparelho.atualizarPagina();
		
		aparelho.selecionarMusica("Feel Good Inc");
		aparelho.tocar();
		aparelho.pausar();

	}

}
