package com._2train395.limelight.api;

/**
 * Represents a vision target detected by Limelight through the current pipeline. Unlike a {@link Target}, a {@link RawTarget} is not identified in context of the current pipeline's grouping preferences.
 */
public class RawTarget {
    private final RawTargetType rawTargetType;
    private final double xOffset;
    private final double yOffset;
    private final double area;
    private final double skew;

    RawTarget(final RawTargetType rawTargetType) {
        this.rawTargetType = rawTargetType;
        xOffset = fetchXOffset();
        yOffset = fetchYOffset();
        area = fetchArea();
        skew = fetchSkew();
    }

    private double fetchXOffset() {
        return Limelight.getTable().getEntry(rawTargetType.getXOffsetKey()).getDouble(0.0);
    }

    private double fetchYOffset() {
        return Limelight.getTable().getEntry(rawTargetType.getYOffsetKey()).getDouble(0.0);
    }

    private double fetchArea() {
        return Limelight.getTable().getEntry(rawTargetType.getAreaKey()).getDouble(0.0);
    }

    private double fetchSkew() {
        return Limelight.getTable().getEntry(rawTargetType.getSkewKey()).getDouble(0.0);
    }

    /**
     * @return the type of this raw target
     */
    public RawTargetType getRawTargetType() {
        return rawTargetType;
    }

    /**
     * @return the horizontal offset of the center of this raw target from the crosshair, in normalized screen space (i.e., ranging from -1 to 1)
     */
    public double getXOffset() {
        return xOffset;
    }

    /**
     * @return the vertical offset of the center of this raw target from the crosshair, in normalized screen space (i.e., ranging from -1 to 1)
     */
    public double getYOffset() {
        return yOffset;
    }

    /**
     * @return the percentage of the image that this raw target occupies, ranging from 0% to 100%
     */
    public double getArea() {
        return area;
    }

    /**
     * @return the skew of this raw target, ranging from -90 to 0 degrees
     */
    public double getSkew() {
        return skew;
    }
}
