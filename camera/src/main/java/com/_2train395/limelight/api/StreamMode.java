package com._2train395.limelight.api;

public enum StreamMode {
    STANDARD(0),
    PIP_MAIN(1),
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
