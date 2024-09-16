package main;

public class Iphone extends AparelhoTelefonico implements ReprodutorMusical, NavegadorInternet {

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba...");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página...");
	}

	@Override
	public void tocar() {
		System.out.println("Tocando...");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando...");

	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionano música " + musica);
	}

}
