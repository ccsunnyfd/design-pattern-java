package org.ccsunnyfd.design;

import org.ccsunnyfd.design.resourceFile.AbstractResourceFile;
import org.ccsunnyfd.design.resourceFile.PdfFile;
import org.ccsunnyfd.design.resourceFile.PptFile;
import org.ccsunnyfd.design.resourceFile.WordFile;
import org.ccsunnyfd.design.visitor.Compressor;
import org.ccsunnyfd.design.visitor.Extractor;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo
 *
 * @version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Extractor extractor = new Extractor();
        List<AbstractResourceFile> resourceFiles = listAllResourceFiles("test");
        for (AbstractResourceFile resourceFile: resourceFiles) {
            resourceFile.accept(extractor);
        }

        Compressor compressor = new Compressor();
        for(AbstractResourceFile resourceFile: resourceFiles) {
            resourceFile.accept(compressor);
        }
    }

    private static List<AbstractResourceFile> listAllResourceFiles(String resourceDirectory) {
        List<AbstractResourceFile> resourceFiles = new ArrayList<>();
        resourceFiles.add(new PdfFile("a.pdf"));
        resourceFiles.add(new WordFile("b.word"));
        resourceFiles.add(new PptFile("c.ppt"));
        return resourceFiles;
    }


}
