package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck implements DuckInterface {
    private boolean _on = false;

    public void turnOn() {
        _on = true;
    }

    public void turnOff() {
        _on = false;
    }

    @Override
    public void quack() {
        if (!_on) {
            System.out.println("Electronic duck is off. Cannot quack.");
            return;
        }
        System.out.println("Electronic duck quack...");
    }

    @Override
    public void swim() {
        if (!_on) {
            System.out.println("Electronic duck is off. Cannot swim.");
            return;
        }
        System.out.println("Electronic duck swim...");
    }
}
