package org.example;

public interface FinancialProduct {
    void accept(FinancialProductVisitor visitor);
}
