package com.positivoempreendimentos.backoffice.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "users")
@Getter
@Setter
public class User extends Auditable implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String email;

  private String password;

  private Long investment;

  private String bank;

  private String account;

  private String operation;

  private String agency;

  private String pix;

  @OneToOne(cascade = {
      CascadeType.MERGE
  })
  private Person person;
}
