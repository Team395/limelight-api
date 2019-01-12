package com._2train395.limelight.api;

public enum CameraMode {
    VISION_PROCESSING(0),
    DRIVER_CAMERA(1);

    static final String KEY = "camMode";

    private final int index;

    CameraMode(final int index) {
        this.index = index;
    }

    static CameraMode fetch() {
        return values()[(int) Limelight.getTable().getEntry(KEY).getDouble(0.0)];
    }

    void push() {
        Limelight.getTable().getEntry(KEY).setDouble(index);
    }
}
