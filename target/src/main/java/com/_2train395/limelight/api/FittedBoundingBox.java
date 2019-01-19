package com._2train395.limelight.api;

/**
 * Represents the bounding box that Limelight fits around a target.
 */
public class FittedBoundingBox implements BoundingBox {
    private static final String SHORTEST_SIDE_LENGTH_KEY = "tshort";
    private static final String LONGEST_SIDE_LENGTH_KEY = "tlong";

    private final double shortestSideLength;
    private final double longestSideLength;

    FittedBoundingBox() {
        shortestSideLength = fetchShortestSideLength();
        longestSideLength = fetchLongestSideLength();
    }

    private double fetchShortestSideLength() {
        return Limelight.getTable().getEntry(SHORTEST_SIDE_LENGTH_KEY).getDouble(0.0);
    }

    private double fetchLongestSideLength() {
        return Limelight.getTable().getEntry(LONGEST_SIDE_LENGTH_KEY).getDouble(0.0);
    }

    /**
     * @return the length of the shortest side of this fitted bounding box, in pixels
     */
    public double getShortestSideLength() {
        return shortestSideLength;
    }

    /**
     * @return the length of the longest side of this fitted bounding box, in pixels
     */
    public double getLongestSideLength() {
        return longestSideLength;
    }
}
