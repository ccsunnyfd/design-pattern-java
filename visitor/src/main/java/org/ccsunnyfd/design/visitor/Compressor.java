package org.ccsunnyfd.design.visitor;

import org.ccsunnyfd.design.resourceFile.PdfFile;
import org.ccsunnyfd.design.resourceFile.PptFile;
import org.ccsunnyfd.design.resourceFile.WordFile;

/**
 * Compressor
 *
 * @version 1.0
 */
public class Compressor implements IVisitor {
    @Override
    public void visit(PdfFile pdfFile) {
        System.out.println("Compress PDF.");
    }

    @Override
    public void visit(PptFile pptFile) {
        System.out.println("Compress PPT.");
    }

    @Override
    public void visit(WordFile wordFile) {
        System.out.println("Compress WORD.");
    }
}
