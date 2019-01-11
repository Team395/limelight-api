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

    private static void setLedMode(final LedMode ledMode) {
        getTable().getEntry(LedMode.KEY).setNumber(ledMode.ordinal());
    }

    private static void setCameraMode(final CameraMode cameraMode) {
        getTable().getEntry(CameraMode.KEY).setNumber(cameraMode.ordinal());
    }

    private static void setPipeline(final Pipeline pipeline) {
        getTable().getEntry(Pipeline.KEY).setNumber(pipeline.ordinal());
    }

    private static void setStreamMode(final StreamMode streamMode) {
        getTable().getEntry(StreamMode.KEY).setNumber(streamMode.ordinal());
    }

    private static void setSnapshotMode(final SnapshotMode snapshotMode) {
        getTable().getEntry(SnapshotMode.KEY).setNumber(snapshotMode.ordinal());
    }

    public static CameraSettings getCameraSettings() {
        return new CameraSettings();
    }

    public static void setCameraSettings(final CameraSettings cameraSettings) {
        setLedMode(cameraSettings.getLedMode());
        setCameraMode(cameraSettings.getCameraMode());
        setPipeline(cameraSettings.getPipeline());
        setStreamMode(cameraSettings.getStreamMode());
        setSnapshotMode(cameraSettings.getSnapshotMode());
    }

    public static boolean hasTarget() {
        return getTable().getEntry(HAS_TARGETS_KEY).getDouble(0.0) == 1.0;
    }

    public static double getLatency() {
        return getTable().getEntry(LATENCY_KEY).getDouble(0.0);
    }
}
