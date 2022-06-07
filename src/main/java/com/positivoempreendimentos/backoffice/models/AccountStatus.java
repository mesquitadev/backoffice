package com.positivoempreendimentos.backoffice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AccountStatus {
  VALIDATION_PENDING("VALIDATION_PENDING"),
  DOCUMENT_PENDING("DOCUMENT_PENDING"),
  SUCCESS("SUCCESS");

  private String description;
}
