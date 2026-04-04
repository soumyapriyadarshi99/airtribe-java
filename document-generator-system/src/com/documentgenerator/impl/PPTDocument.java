package com.documentgenerator.impl;

import com.documentgenerator.model.Document;

public class PPTDocument implements Document {

    @Override
    public void generate() {
        System.out.println("Generating PPT document...");
    }

    @Override
    public void export() {
        System.out.println("Exporting PPT document...");
    }
}