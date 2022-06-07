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
public class Sponsor extends Auditable implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToOne(cascade = {
      CascadeType.MERGE
  })
  private Address address;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    Sponsor sponsor = (Sponsor) o;
    return id != null && Objects.equals(id, sponsor.id);
  }

  @Override
  public int hashCode() {
    return getClass().hashCode();
  }
}
