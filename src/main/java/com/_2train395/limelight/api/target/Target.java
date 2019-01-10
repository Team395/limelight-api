package com._2train395.limelight.api.target;

import com._2train395.limelight.api.Limelight;

public class Target {
    protected static final String X_OFFSET_KEY = "tx";
    protected static final String Y_OFFSET_KEY = "ty";
    protected static final String AREA_KEY = "ta";
    protected static final String SKEW_KEY = "ts";

    public static double getXOffset() {
        return Limelight.getTable().getEntry(X_OFFSET_KEY).getNumber(0.0).doubleValue();
    }

    public static double getYOffset() {
        return Limelight.getTable().getEntry(Y_OFFSET_KEY).getNumber(0.0).doubleValue();
    }

    public static double getArea() {
        return Limelight.getTable().getEntry(AREA_KEY).getNumber(0.0).doubleValue();
    }

    public static double getSkew() {
        return Limelight.getTable().getEntry(SKEW_KEY).getNumber(0.0).doubleValue();
    }

    public static BoundingBox getBoundingBox() {
        return BoundingBox.get();
    }
}
