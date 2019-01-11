package com._2train395.limelight.api;

public enum RawTargetType {
    FIRST(0),
    SECOND(1),
    THIRD(2);

    private String xOffsetKey = "tx";
    private String yOffsetKey = "ty";
    private String areaKey = "ta";
    private String skewKey = "ts";

    RawTargetType(final int index) {
        xOffsetKey += index;
        yOffsetKey += index;
        areaKey += index;
        skewKey += index;
    }

    String getXOffsetKey() {
        return xOffsetKey;
    }

    String getYOffsetKey() {
        return yOffsetKey;
    }

    String getAreaKey() {
        return areaKey;
    }

    String getSkewKey() {
        return skewKey;
    }
}
