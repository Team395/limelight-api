package com._2train395.limelight.api;

public enum RawCrosshairType {
    ZERO(0),
    ONE(1);

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
