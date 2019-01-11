package com._2train395.limelight.api;

public class BoundingBox {
    private static final String SHORTEST_SIDE_LENGTH_KEY = "tshort";
    private static final String LONGEST_SIDE_LENGTH_KEY = "tlong";
    private static final String HORIZONTAL_SIDE_LENGTH_KEY = "thoriz";
    private static final String VERTICAL_SIDE_LENGTH_KEY = "tvert";

    private final double shortestSideLength;
    private final double longestSideLength;
    private final double horizontalSideLength;
    private final double verticalSideLength;

    BoundingBox() {
        shortestSideLength = fetchShortestSideLength();
        longestSideLength = fetchLongestSideLength();
        horizontalSideLength = fetchHorizontalSideLength();
        verticalSideLength = fetchVerticalSideLength();
    }

    private double fetchShortestSideLength() {
        return Limelight.getTable().getEntry(SHORTEST_SIDE_LENGTH_KEY).getDouble(0.0);
    }

    private double fetchLongestSideLength() {
        return Limelight.getTable().getEntry(LONGEST_SIDE_LENGTH_KEY).getDouble(0.0);
    }

    private double fetchHorizontalSideLength() {
        return Limelight.getTable().getEntry(HORIZONTAL_SIDE_LENGTH_KEY).getDouble(0.0);
    }

    private double fetchVerticalSideLength() {
        return Limelight.getTable().getEntry(VERTICAL_SIDE_LENGTH_KEY).getDouble(0.0);
    }

    public double getShortestSideLength() {
        return shortestSideLength;
    }

    public double getLongestSideLength() {
        return longestSideLength;
    }

    public double getHorizontalSideLength() {
        return horizontalSideLength;
    }

    public double getVerticalSideLength() {
        return verticalSideLength;
    }
}
