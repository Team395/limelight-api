package com._2train395.limelight.api;

public class Target {
    private static final String X_OFFSET_KEY = "tx";
    private static final String Y_OFFSET_KEY = "ty";
    private static final String AREA_KEY = "ta";
    private static final String SKEW_KEY = "ts";

    private final double xOffset;
    private final double yOffset;
    private final double area;
    private final double skew;
    private final BoundingBox boundingBox;

    Target() {
        xOffset = fetchXOffset();
        yOffset = fetchYOffset();
        area = fetchArea();
        skew = fetchSkew();
        boundingBox = new BoundingBox();
    }

    private double fetchXOffset() {
        return Limelight.getTable().getEntry(X_OFFSET_KEY).getDouble(0.0);
    }

    private double fetchYOffset() {
        return Limelight.getTable().getEntry(Y_OFFSET_KEY).getDouble(0.0);
    }

    private double fetchArea() {
        return Limelight.getTable().getEntry(AREA_KEY).getDouble(0.0);
    }

    private double fetchSkew() {
        return Limelight.getTable().getEntry(SKEW_KEY).getDouble(0.0);
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

    public BoundingBox getBoundingBox() {
        return boundingBox;
    }
}
