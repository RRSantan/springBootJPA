package com.example.springBoot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductRecordDto(@NotBlank String Nome,@NotNull BigDecimal Valor, @NotNull int quantidade, String descricao) {
}