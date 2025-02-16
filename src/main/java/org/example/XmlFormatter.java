package org.example;

public class XmlFormatter implements FinancialProductVisitor {
    @Override
    public void visit(Stock stock) {
        System.out.println("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<Ação><Símbolo>" + stock.getSymbol() + "</Símbolo><Preço>" + stock.getPrice() + "</Preço></Ação>");

    }

    @Override
    public void visit(InvestmentFund fund) {
        System.out.println("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<FundoInvestimento><Nome>" + fund.getName() + "</Nome><valorLíquido>" + fund.getNetValue() + "</valorLíquido></FundoInvestimento>");
    }
}