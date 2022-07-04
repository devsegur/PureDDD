package com.example.batata.domain.pojo;

public class Batata {

  private Long id;
  private String nome;
  private String sabor;

  public Batata(Long id, String nome, String sabor) {
    this.id = id;
    this.nome = nome;
    this.sabor = sabor;
  }

  public Batata(String nome, String sabor) {
    this.nome = nome;
    this.sabor = sabor;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSabor() {
    return sabor;
  }

  public void setSabor(String sabor) {
    this.sabor = sabor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Batata batata = (Batata) o;

    if (!nome.equals(batata.nome)) return false;
    return sabor.equals(batata.sabor);
  }

  @Override
  public int hashCode() {
    int result = nome.hashCode();
    result = 31 * result + sabor.hashCode();
    return result;
  }
}
