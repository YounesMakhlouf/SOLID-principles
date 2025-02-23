package com.directi.training.dip.exercise.refactored;

import java.io.IOException;

public class EncodingModule {
    private IEncoder encoder;
    private IReader reader;
    private IWriter writer;

    public EncodingModule(IEncoder encoder, IReader reader, IWriter writer) {
        this.encoder = encoder;
        this.reader = reader;
        this.writer = writer;
    }

    public void process() throws IOException {
        String data=this.reader.read();
        String encodedData=this.encoder.encode(data);
        this.writer.write(encodedData);

    }
}
