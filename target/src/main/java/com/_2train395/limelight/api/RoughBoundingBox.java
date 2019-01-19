package com._2train395.limelight.api;

/**
 * Represents the rough bounding box that Limelight places around a target. Unlike the {@link FittedBoundingBox}, this box is not rotated; its sides are parallel to the corresponding sides of the image.
 */
public class RoughBoundingBox {
    private static final String HORIZONTAL_SIDE_LENGTH_KEY = "thoriz";
    private static final String VERTICAL_SIDE_LENGTH_KEY = "tvert";

    private final double horizontalSideLength;
    private final double verticalSideLength;

    RoughBoundingBox() {
        horizontalSideLength = fetchHorizontalSideLength();
        verticalSideLength = fetchVerticalSideLength();
    }

    private double fetchHorizontalSideLength() {
        return Limelight.getTable().getEntry(HORIZONTAL_SIDE_LENGTH_KEY).getDouble(0.0);
    }

    private double fetchVerticalSideLength() {
        return Limelight.getTable().getEntry(VERTICAL_SIDE_LENGTH_KEY).getDouble(0.0);
    }

    /**
     * @return the length of the horizontal side of this rough bounding box, ranging from 0 to 320 pixels
     */
    public double getHorizontalSideLength() {
        return horizontalSideLength;
    }

    /**
     * @return the length of the vertical side of this rough bounding box, ranging from 0 to 320 pixels
     */
    public double getVerticalSideLength() {
        return verticalSideLength;
    }
}
