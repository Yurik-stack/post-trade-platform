package com.posttrade.cliente.dto;

import java.time.LocalDateTime;

public record ClienteResponseDTO(

        Long id,
        String nome,
        String documento,
        String tipo,
        String status,
        LocalDateTime dataCadastro

) {}
