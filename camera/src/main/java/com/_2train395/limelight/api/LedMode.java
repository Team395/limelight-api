package com._2train395.limelight.api;

/**
 * Represents the Limelight's LED state.
 */
public enum LedMode {
    /**
     * Uses the LED mode set in the current pipeline.
     */
    USE_CURRENT_PIPELINE(0),
    /**
     * Forces the LEDs to be off.
     */
    FORCE_OFF(1),
    /**
     * Forces the LEDs to blink.
     */
    FORCE_BLINK(2),
    /**
     * Forces the LEDs to be on.
     */
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
