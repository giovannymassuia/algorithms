package io.giovannymassuia.models;

public record NodeKey(String value) {
    public static NodeKey of(String value) {
        return new NodeKey(value);
    }
}