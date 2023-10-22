package edu.model;

import edu.intefaces.*;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorWeb {
  @Override
  public void tocar() {
    System.out.println("Tocando música");
  }

  @Override
  public void pausar() {
    System.out.println("Pausando música");
  }

  @Override
  public void parar() {
    System.out.println("Parando música");
  }

  @Override
  public void discar(String número) {
    System.out.println("Discando para " + número);
  }

  @Override
  public void atender() {
    System.out.println("Atendendo a chamada");
  }

  @Override
  public void desligar() {
    System.out.println("Desligando a chamada");
  }

  @Override
  public void carregarPagina(String URL) {
    System.out.println("Carregando página " + URL);
  }

  @Override
  public void navegarParaTras() {
    System.out.println("Navegando para trás");
  }

  @Override
  public void navegarParaFrente() {
    System.out.println("Navegando para frente");
  }
}
