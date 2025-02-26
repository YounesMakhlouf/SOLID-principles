package com.directi.training.ocp.exercise_refactored;

import java.util.Map;

public class ResourceAllocator {
    private final Map<ResourceType, ResourceAllocationStrategy> strategies;

    public ResourceAllocator(Map<ResourceType, ResourceAllocationStrategy> strategies) {
        this.strategies = strategies;
    }

    public int allocate(ResourceType resourceType) {
        ResourceAllocationStrategy strategy = strategies.get(resourceType);
        if (strategy != null) {
            return strategy.allocate();
        }
        System.out.println("ERROR: Attempted to allocate invalid resource");
        return -1;
    }

    public void free(ResourceType resourceType, int resourceId) {
        ResourceAllocationStrategy strategy = strategies.get(resourceType);
        if (strategy != null) {
            strategy.free(resourceId);
        } else {
            System.out.println("ERROR: Attempted to free invalid resource");
        }
    }
}