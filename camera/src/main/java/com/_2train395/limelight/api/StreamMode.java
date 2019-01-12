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

    int getIndex() {
        return index;
    }
}
