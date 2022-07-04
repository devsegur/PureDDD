package com.example.batata.application.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BatataEntity {

  @Id
  @Column(name = "id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column private String nome;
  @Column private String sabor;

  public BatataEntity(String nome, String sabor) {
    this.nome = nome;
    this.sabor = sabor;
  }

  public BatataEntity() {}

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    BatataEntity that = (BatataEntity) o;

    if (!id.equals(that.id)) return false;
    if (!nome.equals(that.nome)) return false;
    return sabor.equals(that.sabor);
  }

  @Override
  public int hashCode() {
    int result = id.hashCode();
    result = 31 * result + nome.hashCode();
    result = 31 * result + sabor.hashCode();
    return result;
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
}
