package org.example;

public class CsvFormatter implements FinancialProductVisitor {
    @Override
    public void visit(Stock stock) {
        System.out.println("Ação," + stock.getSymbol() + "," + stock.getPrice());
    }

    @Override
    public void visit(InvestmentFund fund) {
        System.out.println("Fundo de investimento," + fund.getName() + "," + fund.getNetValue());
    }
}
