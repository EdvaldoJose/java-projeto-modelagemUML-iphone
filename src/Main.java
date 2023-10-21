import Service.Iphone;

public class Main {

  public static void main(String[] args) {
    Iphone iphone = new Iphone();

    iphone.ligar("25574531");
    iphone.atender();
    iphone.iniciarCorreioVoz();

    iphone.tocar();
    iphone.pausar();
    iphone.selecionarMusica("With Or Without You");

    iphone.exibirPagina("");
    iphone.adicionarNovaAba("");
    iphone.atualizarPagina();
  }
}