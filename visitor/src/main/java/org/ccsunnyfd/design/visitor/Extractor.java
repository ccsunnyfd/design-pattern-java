package org.ccsunnyfd.design.visitor;

import org.ccsunnyfd.design.resourceFile.PdfFile;
import org.ccsunnyfd.design.resourceFile.PptFile;
import org.ccsunnyfd.design.resourceFile.WordFile;

/**
 * Extractor
 *
 * @version 1.0
 */
public class Extractor implements IVisitor {
    @Override
    public void visit(PdfFile pdfFile) {
        System.out.println("Extract PDF.");
    }

    @Override
    public void visit(PptFile pptFile) {
        System.out.println("Extract PPT.");
    }

    @Override
    public void visit(WordFile wordFile) {
        System.out.println("Extract WORD.");
    }
}
