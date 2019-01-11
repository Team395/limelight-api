package com._2train395.limelight.api;

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

    public RawTargetType getRawTargetType() {
        return rawTargetType;
    }

    public double getXOffset() {
        return xOffset;
    }

    public double getYOffset() {
        return yOffset;
    }

    public double getArea() {
        return area;
    }

    public double getSkew() {
        return skew;
    }
}
