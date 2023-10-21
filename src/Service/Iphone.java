package Service;

import Interface.AparelhoTelefonico;
import Interface.NavegadorInternet;
import Interface.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

  private boolean isPlaying;
  private String currentSong;
  private boolean isCallInProgress;
  private String phoneNumber;
  private boolean isInternetBrowserOpen;
  private String currentURL;

  public Iphone(){
    isPlaying = false;
    currentSong = "";
    isCallInProgress = false;
    phoneNumber = "";
    isInternetBrowserOpen = false;
    currentURL = "";
  }

  @Override
  public void ligar(String numero) {
    isCallInProgress = true;
    phoneNumber = numero;
    System.out.println("Ligando para " + numero);
  }

  @Override
  public void atender() {
    isCallInProgress = false;
    System.out.println("Atendendo chamada de " + phoneNumber);
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz.");
  }

  @Override
  public void exibirPagina(String url) {
    isInternetBrowserOpen = false;
    currentURL = url;
    System.out.println("Exibir página " + url);
  }

  @Override
  public void adicionarNovaAba(String url) {
    System.out.println("Abrindo nova aba com página " + url);
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando a página " + currentURL);
  }

  @Override
  public void tocar() {
    isPlaying = true;
    System.out.println("Tocando música.");
  }

  @Override
  public void pausar() {
    isPlaying = false;
    System.out.println("Pausando música");
  }

  @Override
  public void selecionarMusica(String musica) {
    currentSong = musica;
    System.out.println("Selecionando a música.");
  }
}
