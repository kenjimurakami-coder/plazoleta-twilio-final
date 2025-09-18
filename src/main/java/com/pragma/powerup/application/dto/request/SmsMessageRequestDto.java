package com.pragma.powerup.application.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter

public class SmsMessageRequestDto {

    @NotBlank(message = "El numero celular es requerido")
    @Pattern(regexp = "^(\\+57\\d{10}|\\+51\\d{9})$", message = "El numero debe ser +57 con 10 dígitos o +51 con 9 dígitos")
    private String numero;

    @NotBlank(message = "El mensaje es requerido")
    private String mensaje;

}
