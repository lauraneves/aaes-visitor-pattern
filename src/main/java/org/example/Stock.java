package org.example;

public class Stock implements FinancialProduct {
    private String symbol;
    private double price;

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    public String getSymbol() { return symbol; }
    public double getPrice() { return price; }

    @Override
    public void accept(FinancialProductVisitor visitor) {
        visitor.visit(this);
    }
}
