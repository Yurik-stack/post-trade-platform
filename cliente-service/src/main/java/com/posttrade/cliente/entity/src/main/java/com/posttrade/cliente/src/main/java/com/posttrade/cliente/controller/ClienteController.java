package com.posttrade.cliente.controller;

import com.posttrade.cliente.dto.ClienteRequestDTO;
import com.posttrade.cliente.dto.ClienteResponseDTO;
import com.posttrade.cliente.service.ClienteService;

import jakarta.validation.Valid;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteResponseDTO criar(
            @RequestBody @Valid ClienteRequestDTO dto) {

        return service.criar(dto);
    }
}
