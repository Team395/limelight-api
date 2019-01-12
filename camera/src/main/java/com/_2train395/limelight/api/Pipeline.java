package com._2train395.limelight.api;

public enum Pipeline {
    FIRST(0),
    SECOND(1),
    THIRD(2),
    FOURTH(3),
    FIFTH(4),
    SIXTH(5),
    SEVENTH(6),
    EIGHTH(7),
    NINTH(8),
    TENTH(9);

    static final String KEY = "pipeline";

    private final int index;

    Pipeline(final int index) {
        this.index = index;
    }

    static Pipeline fetch() {
        return values()[(int) Limelight.getTable().getEntry(KEY).getDouble(0.0)];
    }

    int getIndex() {
        return index;
    }
}
