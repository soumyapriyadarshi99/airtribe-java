package com.documentgenerator.impl;

import com.documentgenerator.model.Document;

public class PDFDocument implements Document {

    @Override
    public void generate(){
        System.out.println("Generating PDF document...");
    }

    @Override
    public void export(){
        System.out.println("Exporting PDF document...");
    }
}
