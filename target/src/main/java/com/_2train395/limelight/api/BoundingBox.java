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

    private BoundingBox(final double shortestSideLength, final double longestSideLength, final double horizontalSideLength, final double verticalSideLength) {
        this.shortestSideLength = shortestSideLength;
        this.longestSideLength = longestSideLength;
        this.horizontalSideLength = horizontalSideLength;
        this.verticalSideLength = verticalSideLength;
    }

    protected static BoundingBox get() {
        return new BoundingBox(Limelight.getTable().getEntry(SHORTEST_SIDE_LENGTH_KEY).getNumber(0.0).doubleValue(), Limelight.getTable().getEntry(LONGEST_SIDE_LENGTH_KEY).getNumber(0.0).doubleValue(), Limelight.getTable().getEntry(HORIZONTAL_SIDE_LENGTH_KEY).getNumber(0.0).doubleValue(), Limelight.getTable().getEntry(VERTICAL_SIDE_LENGTH_KEY).getNumber(0.0).doubleValue());
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
