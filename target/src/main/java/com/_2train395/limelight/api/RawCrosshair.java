package com._2train395.limelight.api;

/**
 * Represents a calibrated crosshair from the current pipeline.
 */
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

    /**
     * @return the type of this raw crosshair
     */
    public RawCrosshairType getRawCrosshairType() {
        return rawCrosshairType;
    }

    /**
     * @return the x-coordinate of this raw crosshair in normalized screen space (i.e., ranging from -1 to 1)
     */
    public double getX() {
        return x;
    }

    /**
     * @return the y-coordinate of this raw crosshair in normalized screen space (i.e., ranging from -1 to 1)
     */
    public double getY() {
        return y;
    }
}
