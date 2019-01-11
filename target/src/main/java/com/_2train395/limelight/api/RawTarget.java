package com._2train395.limelight.api;

public enum RawTarget {
    FIRST, SECOND, THIRD;

    private final String X_OFFSET_KEY;
    private final String Y_OFFSET_KEY;
    private final String AREA_KEY;
    private final String SKEW_KEY;

    RawTarget() {
        final char index = Character.forDigit(this.ordinal(), 10);
        X_OFFSET_KEY = Target.X_OFFSET_KEY + index;
        Y_OFFSET_KEY = Target.Y_OFFSET_KEY + index;
        AREA_KEY = Target.AREA_KEY + index;
        SKEW_KEY = Target.SKEW_KEY + index;
    }

    public double getXOffset() {
        return Limelight.getTable().getEntry(X_OFFSET_KEY).getNumber(0.0).doubleValue();
    }

    public double getYOffset() {
        return Limelight.getTable().getEntry(Y_OFFSET_KEY).getNumber(0.0).doubleValue();
    }

    public double getArea() {
        return Limelight.getTable().getEntry(AREA_KEY).getNumber(0.0).doubleValue();
    }

    public double getSkew() {
        return Limelight.getTable().getEntry(SKEW_KEY).getNumber(0.0).doubleValue();
    }
}
