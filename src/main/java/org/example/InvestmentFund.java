package org.example;

public class InvestmentFund implements FinancialProduct {
    private String name;
    private double netValue;

    public InvestmentFund(String name, double netValue) {
        this.name = name;
        this.netValue = netValue;
    }

    public String getName() { return name; }
    public double getNetValue() { return netValue; }

    @Override
    public void accept(FinancialProductVisitor visitor) {
        visitor.visit(this);
    }
}

