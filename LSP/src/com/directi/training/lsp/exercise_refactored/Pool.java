package com.directi.training.lsp.exercise_refactored;

public class Pool {
    public void run() {
        DuckInterface donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();

        electricDuck.turnOn(); 

        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);

        electricDuck.turnOff();
    }

    private void quack(DuckInterface... ducks) {
        for (DuckInterface duck : ducks) {
            duck.quack();
        }
    }

    private void swim(DuckInterface... ducks) {
        for (DuckInterface duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}
