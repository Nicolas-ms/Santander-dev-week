package me.dio.domain.model.dto;

import java.math.BigDecimal;

public class AccountDTO {
    private String number;
    private String agency;
    private BigDecimal balance;
    private BigDecimal limit;

    // Getters e setters
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }
    public String getAgency() { return agency; }
    public void setAgency(String agency) { this.agency = agency; }
    public BigDecimal getBalance() { return balance; }
    public void setBalance(BigDecimal balance) { this.balance = balance; }
    public BigDecimal getLimit() { return limit; }
    public void setLimit(BigDecimal limit) { this.limit = limit; }
} 