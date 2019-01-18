package com._2train395.limelight.api;

/**
 * Represents the Limelight's snapshot mode.
 */
public enum SnapshotMode {
    /**
     * Disables the capturing of snapshots.
     */
    DISABLED(0),
    /**
     * Takes two snapshots per second.
     */
    TWO_PER_SECOND(1);

    static final String KEY = "snapshot";

    private final int index;

    SnapshotMode(final int index) {
        this.index = index;
    }

    static SnapshotMode fetch() {
        return values()[(int) Limelight.getTable().getEntry(KEY).getDouble(0.0)];
    }

    void push() {
        Limelight.getTable().getEntry(KEY).setDouble(index);
    }
}
