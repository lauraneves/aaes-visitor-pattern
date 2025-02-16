package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<FinancialProduct> products = new ArrayList<>();
        products.add(new Stock("ROXO34", 14.0));
        products.add(new InvestmentFund("XYZ123", 10.0));

        System.out.println("-> JSON:");
        FinancialProductVisitor jsonFormatter = new JsonFormatter();
        products.forEach(p -> p.accept(jsonFormatter));

        System.out.println("\n-> XML:");
        FinancialProductVisitor xmlFormatter = new XmlFormatter();
        products.forEach(p -> p.accept(xmlFormatter));

        System.out.println("\n-> CSV:");
        FinancialProductVisitor csvFormatter = new CsvFormatter();
        products.forEach(p -> p.accept(csvFormatter));
    }
}

