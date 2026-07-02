package com.posttrade.cliente.service;

import com.posttrade.cliente.dto.*;
import com.posttrade.cliente.entity.Cliente;
import com.posttrade.cliente.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteResponseDTO criar(ClienteRequestDTO dto) {

        Cliente cliente = Cliente.builder()
                .nome(dto.nome())
                .documento(dto.documento())
                .tipo(dto.tipo())
                .status("ATIVO")
                .dataCadastro(LocalDateTime.now())
                .build();

        Cliente salvo = repository.save(cliente);

        return new ClienteResponseDTO(
                salvo.getId(),
                salvo.getNome(),
                salvo.getDocumento(),
                salvo.getTipo(),
                salvo.getStatus(),
                salvo.getDataCadastro()
        );
    }
}
