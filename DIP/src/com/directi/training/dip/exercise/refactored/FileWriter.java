package com.directi.training.dip.exercise.refactored;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter implements IWriter {
    private String destinationPath;

    private  BufferedWriter writer;

    public FileWriter(String destinationPath) {
        this.destinationPath = destinationPath;
    }

    @Override
    public void write(String data) throws IOException {
        try {
            var writer = new BufferedWriter(
                    new java.io.FileWriter(destinationPath));
            writer.append(data);
        }
        finally {
            if (this.writer != null) {
                this.writer.close();
            }
        }

    }
}
