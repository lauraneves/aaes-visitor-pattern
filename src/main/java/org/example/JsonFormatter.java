package org.example;

public class JsonFormatter implements FinancialProductVisitor {
    @Override
    public void visit(Stock stock) {
        System.out.print("{" + "\"tipo\": \"Ação\", \"símbolo\": \"" + stock.getSymbol() + "\", \"preço\": " + stock.getPrice() + "}");
    }

    @Override
    public void visit(InvestmentFund fund) {
        System.out.print("{" + "\"tipo\": \"FundoInvestimento\", \"nome\": \"" + fund.getName() + "\", \"valorLíquido\": " + fund.getNetValue() + "}");
    }
}
