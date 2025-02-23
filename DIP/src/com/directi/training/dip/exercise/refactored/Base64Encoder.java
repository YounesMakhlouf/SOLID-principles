package com.directi.training.dip.exercise.refactored;


import java.util.Base64;

public class Base64Encoder implements IEncoder{
    @Override
    public String encode(String s) {

        return Base64.getEncoder().encodeToString(s.getBytes());
    }
}
