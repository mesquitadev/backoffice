package com.positivoempreendimentos.backoffice.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class Address extends Auditable implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String line1;
  private String city;
  private String zipCode;
  private String province;
  private String country;

  @OneToOne(cascade = {
      CascadeType.MERGE
  })
  private Person person;
  @OneToOne(cascade = {
      CascadeType.MERGE
  })
  private Sponsor sponsor;
}
