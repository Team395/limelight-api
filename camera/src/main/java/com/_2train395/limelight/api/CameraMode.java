package com._2train395.limelight.api;

/**
 * Represents the Limelight's operation mode.
 */
public enum CameraMode {
    /**
     * Acts as a vision processor by decreasing exposure and enabling vision processing.
     */
    VISION_PROCESSOR(0),
    /**
     * Acts as a driver camera by increasing exposure and disabling vision processing.
     */
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
