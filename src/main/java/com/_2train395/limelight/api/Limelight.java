package com._2train395.limelight.api;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;

public class Limelight {
    private static final String KEY = "limelight";
    private static final String HAS_TARGETS_KEY = "tv";
    private static final String LATENCY_KEY = "tl";

    private Limelight() {
    }

    static NetworkTable getTable() {
        return NetworkTableInstance.getDefault().getTable(KEY);
    }

    public static LedMode getLedMode() {
        return LedMode.fetch();
    }

    public static void setLedMode(final LedMode ledMode) {
        getTable().getEntry(LedMode.KEY).setNumber(ledMode.ordinal());
    }

    public static CameraMode getCameraMode() {
        return CameraMode.fetch();
    }

    public static void setCameraMode(final CameraMode cameraMode) {
        getTable().getEntry(CameraMode.KEY).setNumber(cameraMode.ordinal());
    }

    public static Pipeline getPipeline() {
        return Pipeline.fetch();
    }

    public static void setPipeline(final Pipeline pipeline) {
        getTable().getEntry(Pipeline.KEY).setNumber(pipeline.ordinal());
    }

    public static StreamMode getStreamMode() {
        return StreamMode.fetch();
    }

    public static void setStreamMode(final StreamMode streamMode) {
        getTable().getEntry(StreamMode.KEY).setNumber(streamMode.ordinal());
    }

    public static SnapshotMode getSnapshotMode() {
        return SnapshotMode.fetch();
    }

    public static void setSnapshotMode(final SnapshotMode snapshotMode) {
        getTable().getEntry(SnapshotMode.KEY).setNumber(snapshotMode.ordinal());
    }

    public static Target getTarget() {
        return new Target();
    }

    public static RawTarget getRawTarget(final RawTargetType rawTargetType) {
        return new RawTarget(rawTargetType);
    }

    public static RawCrosshair getRawCrosshair(final RawCrosshairType rawCrosshairType) {
        return new RawCrosshair(rawCrosshairType);
    }

    public static boolean hasTarget() {
        return getTable().getEntry(HAS_TARGETS_KEY).getDouble(0.0) == 1.0;
    }

    public static double getLatency() {
        return getTable().getEntry(LATENCY_KEY).getDouble(0.0);
    }
}
