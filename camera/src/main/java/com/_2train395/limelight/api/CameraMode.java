package com._2train395.limelight.api;

public enum CameraMode {
    VISION_PROCESSING(0),
    DRIVER_CAMERA(1);

    static final String KEY = "camMode";

    private final int index;

    CameraMode(final int index) {
        this.index = index;
    }

    int getIndex() {
        return index;
    }
}
