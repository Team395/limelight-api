package com._2train395.limelight.api;

/**
 * Enumerates each {@link RawCrosshair}.
 */
public enum RawCrosshairType {
    FIRST(0),
    SECOND(1);

    private String xKey = "cx";
    private String yKey = "cy";

    RawCrosshairType(final int index) {
        xKey += index;
        yKey += index;
    }

    String getXKey() {
        return xKey;
    }

    String getYKey() {
        return yKey;
    }
}
