package com._2train395.limelight.api;

/**
 * Represents the Limelight's streaming mode, which takes effect if a second camera (e.g., a webcam) is connected to the Limelight.
 */
public enum StreamMode implements CameraSetting {
    /**
     * The primary and secondary camera streams are placed side by side.
     */
    STANDARD(0),
    /**
     * The secondary camera stream is placed in the lower right corner of the primary camera stream.
     */
    PIP_MAIN(1),
    /**
     * The primary camera stream is placed in the lower right corner of the secondary camera stream.
     */
    PIP_SECONDARY(2);

    static final String KEY = "stream";

    private final int index;

    StreamMode(final int index) {
        this.index = index;
    }

    static StreamMode fetch() {
        return values()[(int) Limelight.getTable().getEntry(KEY).getDouble(0.0)];
    }

    void push() {
        Limelight.getTable().getEntry(KEY).setDouble(index);
    }
}
