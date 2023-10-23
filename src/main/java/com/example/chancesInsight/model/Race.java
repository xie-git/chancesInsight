package com.example.chancesInsight.model;

public enum Race {
    ANY("Any"),
    WHITE("White"),
    BLACK("Black"),
    HISPANIC("Hispanic"),
    ASIAN("Asian");

    private final String displayName;

    Race(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
