package com.receitas.receita.DTOS;

import com.receitas.receita.models.Revenue;

public record DTORevenue(String nome, String text) {
    public DTORevenue(Revenue revenue) {
        this(revenue.getNome(), revenue.getText());
    }
}
