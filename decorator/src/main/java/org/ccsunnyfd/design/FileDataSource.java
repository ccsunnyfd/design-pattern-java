package org.ccsunnyfd.design;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.*;

/**
 * FileDataSource
 *
 * @version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
public class FileDataSource implements DataSource {
    private String name;

    @Override
    public void writeData(String data) {
        File file = new File(name);
        try {
            OutputStream fos = new FileOutputStream(file);
            fos.write(data.getBytes(), 0, data.length());
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try(FileReader reader = new FileReader(file)){
            buffer = new char[(int)file.length()];
            reader.read(buffer);
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }
}
