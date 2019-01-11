package com._2train395.limelight.api;

public class RawCrosshair {
    private final RawCrosshairType rawCrosshairType;
    private final double x;
    private final double y;

    RawCrosshair(final RawCrosshairType rawCrosshairType) {
        this.rawCrosshairType = rawCrosshairType;
        x = fetchX();
        y = fetchY();
    }

    private double fetchX() {
        return Limelight.getTable().getEntry(rawCrosshairType.getXKey()).getDouble(0.0);
    }

    private double fetchY() {
        return Limelight.getTable().getEntry(rawCrosshairType.getYKey()).getDouble(0.0);
    }

    public RawCrosshairType getRawCrosshairType() {
        return rawCrosshairType;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
