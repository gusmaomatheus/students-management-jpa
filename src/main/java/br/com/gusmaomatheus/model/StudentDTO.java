package br.com.gusmaomatheus.model;

import java.math.BigDecimal;

public record StudentDTO(Long id, String name, String ra, String email, BigDecimal grade1, BigDecimal grade2, BigDecimal grade3) {}
