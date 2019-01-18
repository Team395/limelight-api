package com._2train395.limelight.api;

/**
 * Represents a vision target detected by Limelight through the current pipeline.
 */
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

    /**
     * @return the horizontal offset from the crosshair to this target, ranging from -27 to 27 degrees
     */
    public double getXOffset() {
        return xOffset;
    }

    /**
     * @return the vertical offset from the crosshair to this target, ranging from -20.5 to 20.5 degrees
     */
    public double getYOffset() {
        return yOffset;
    }

    /**
     * @return the percentage of the image that this target (enclosed by its {@link BoundingBox}) occupies, ranging from 0% to 100%
     */
    public double getArea() {
        return area;
    }

    /**
     * @return the skew of this target, ranging from -90 to 0 degrees
     */
    public double getSkew() {
        return skew;
    }

    /**
     * @return this target's {@link BoundingBox}
     */
    public BoundingBox getBoundingBox() {
        return boundingBox;
    }
}
