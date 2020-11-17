package org.ccsunnyfd.design.visitor;

import org.ccsunnyfd.design.resourceFile.PdfFile;
import org.ccsunnyfd.design.resourceFile.PptFile;
import org.ccsunnyfd.design.resourceFile.WordFile;

/**
 * IVisitor
 *
 * @version 1.0
 */
public interface IVisitor {
    void visit(PdfFile pdfFile);
    void visit(PptFile pptFile);
    void visit(WordFile wordFile);
}
