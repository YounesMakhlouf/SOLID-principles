package com.directi.training.dip.exercise.refactored;

import com.directi.training.dip.exercise.MyDatabase;

import java.io.IOException;

public class DatabaseWriter implements IWriter{
    @Override
    public void write(String data) throws IOException {
        MyDatabase database = new MyDatabase();
        database.write(data);
    }
}
