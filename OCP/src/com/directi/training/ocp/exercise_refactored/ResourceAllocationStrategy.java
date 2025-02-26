package com.directi.training.ocp.exercise_refactored;


public interface ResourceAllocationStrategy {
    int allocate();

    void free(int resourceId);
}