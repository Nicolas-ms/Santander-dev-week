package me.dio.domain.model.dto;

import java.math.BigDecimal;

public class CardDTO {
    private String number;
    private BigDecimal limit;

    // Getters e setters
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }
    public BigDecimal getLimit() { return limit; }
    public void setLimit(BigDecimal limit) { this.limit = limit; }
} 