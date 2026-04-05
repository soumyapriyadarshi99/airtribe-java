package com.soumya.observerpattern.service;

import com.soumya.observerpattern.subject.Stock;

import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class StockService {

    private Map<String, Stock> stocks;

    public StockService() {
        this.stocks = new HashMap<>();
    }

    public void addStock(Stock stock) {
        stocks.put(stock.getName(), stock);
    }

    public void updatePrice(String stockName, double price) {
        Stock stock = stocks.get(stockName);

        if (stock != null) {
            stock.setPrice(price);
        } else {
            System.out.println("Stock not found: " + stockName);
        }
    }
}