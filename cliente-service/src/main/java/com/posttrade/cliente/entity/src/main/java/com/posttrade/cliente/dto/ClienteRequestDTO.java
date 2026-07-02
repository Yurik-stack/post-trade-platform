package com.posttrade.cliente.dto;

import jakarta.validation.constraints.NotBlank;

public record ClienteRequestDTO(

        @NotBlank
        String nome,

        @NotBlank
        String documento,

        String tipo

) {}
