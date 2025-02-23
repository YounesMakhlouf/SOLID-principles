package com.directi.training.dip.exercise.refactored;

import java.io.IOException;

public interface IDataEncoder {
    public String readEncodeData() throws IOException;
    public void writeData(String data) throws IOException;
}
