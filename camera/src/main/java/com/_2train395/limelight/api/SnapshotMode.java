package com._2train395.limelight.api;

public enum SnapshotMode {
    DISABLED(0),
    TWO_PER_SECOND(1);

    static final String KEY = "snapshot";

    private final int index;

    SnapshotMode(final int index) {
        this.index = index;
    }

    int getIndex() {
        return index;
    }
}
