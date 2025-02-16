package org.example;

public interface FinancialProductVisitor {
    void visit(Stock stock);
    void visit(InvestmentFund fund);
}
