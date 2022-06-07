package com.positivoempreendimentos.backoffice.models;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String cpf;
  private String rg;
  private String cnh;
  private String birthdate;

  @OneToOne(cascade = {
      CascadeType.MERGE
  })
  private Address address;

  @OneToOne(cascade = {
      CascadeType.MERGE
  })
  private Sponsor sponsor;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    Person person = (Person) o;
    return id != null && Objects.equals(id, person.id);
  }

  @Override
  public int hashCode() {
    return getClass().hashCode();
  }
}
