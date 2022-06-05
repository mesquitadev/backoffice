package com.positivoempreendimentos.backoffice.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/person")
public class PessoaController {

  @ApiOperation(value = "Return an example HelloWorld")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "success method return")
  })
  @GetMapping
  public String hello() {
    return "Persoa";
  }
}
