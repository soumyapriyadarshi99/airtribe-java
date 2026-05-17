package com.airtribe.ridewise.model;

import java.time.LocalDateTime;

public class FareReceipt {
    String riderId;
    double amount;
    LocalDateTime generatedAt;

    public FareReceipt(String riderId, double amount ) {
        this.riderId = riderId;
        this.amount = amount;
        this.generatedAt = LocalDateTime.now();
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(LocalDateTime generatedAt) {
        this.generatedAt = generatedAt;
    }

    @Override
    public String toString() {
        return "{" +
                "riderId='" + riderId + '\'' +
                ", amount=" + amount +
                ", generatedAt=" + generatedAt +
                '}';
    }
}
