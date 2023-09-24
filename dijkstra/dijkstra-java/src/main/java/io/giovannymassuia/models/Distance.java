package io.giovannymassuia.models;

public record Distance(int value, NodeKey key, NodeKey previous) {
    public static Distance of(int value, NodeKey key, NodeKey previous) {
        return new Distance(value, key, previous);
    }
}