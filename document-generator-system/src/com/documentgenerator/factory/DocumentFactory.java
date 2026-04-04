package com.documentgenerator.factory;

import com.documentgenerator.impl.PDFDocument;
import com.documentgenerator.impl.PPTDocument;
import com.documentgenerator.impl.WordDocument;
import com.documentgenerator.model.Document;

public class DocumentFactory {
    public static Document getDocument(String type){
        if(type == null || type.isEmpty()){
            throw new IllegalArgumentException("Type can not be null or empty");
        }
        return switch (type.toLowerCase()) {
            case "pdf" -> new PDFDocument();
            case "word" -> new WordDocument();
            case "ppt" -> new PPTDocument();
            default -> throw new IllegalArgumentException("Unknown document type " + type);
        };

    }
}
