package com.directi.training.isp.exercise_refactored;

import java.util.Random;

public class Sensor {
    public void register(ProximitySensorClient client) {
        while (true) {
            if (isPersonClose()) {
                client.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose() {
        return new Random().nextBoolean();
    }
}
