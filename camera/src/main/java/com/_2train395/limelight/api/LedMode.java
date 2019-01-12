package com._2train395.limelight.api;

public enum LedMode {
    OF_CURRENT_PIPELINE(0),
    FORCE_OFF(1),
    FORCE_BLINK(2),
    FORCE_ON(3);

    static final String KEY = "ledMode";

    private final int index;

    LedMode(final int index) {
        this.index = index;
    }

    static LedMode fetch() {
        return values()[(int) Limelight.getTable().getEntry(KEY).getDouble(0.0)];
    }

    void push() {
        Limelight.getTable().getEntry(KEY).setDouble(index);
    }
}
