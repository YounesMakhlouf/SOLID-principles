package com.directi.training.dip.exercise.refactored;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReader  implements IReader {
    private String sourcePath;
    private BufferedReader reader;

    public FileReader(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    @Override
    public String read() throws IOException {
        try {
            StringBuilder content=new StringBuilder();
            this.reader = new BufferedReader(new java.io.FileReader(sourcePath));
            String aLine;
            while ((aLine = this.reader.readLine()) != null) {
                content.append(aLine).append("\n");;
            }
            return content.toString();

        } finally {
            if (this.reader != null) {
                this.reader.close();
            }
        }

    }
}
