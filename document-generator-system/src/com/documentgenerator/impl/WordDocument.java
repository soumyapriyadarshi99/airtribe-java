package com.documentgenerator.impl;

import com.documentgenerator.model.Document;

public class WordDocument implements Document {

    @Override
    public void generate() {
        System.out.println("Generating Word document...");
    }

    @Override
    public void export() {
        System.out.println("Exporting Word document...");
    }
}