/* Factory Pattern provides a way to create objects without exposing instantiation logic.
Instead of using new everywhere, we delegate object creation to a factory class */

package com.documentgenerator;

import com.documentgenerator.factory.DocumentFactory;
import com.documentgenerator.model.Document;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Document generator started!!!");
        System.out.print("Please enter the doc type: ");

        Scanner sc = new Scanner(System.in);
        String pdfType = sc.nextLine();


        Document doc = DocumentFactory.getDocument(pdfType);
        doc.generate();
        doc.export();

    }
}