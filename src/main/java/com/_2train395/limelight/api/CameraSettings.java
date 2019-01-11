package com._2train395.limelight.api;

public class CameraSettings {
    public static LedMode getLedMode() {
        return LedMode.values()[Limelight.getTable().getEntry(LedMode.KEY).getNumber(0).intValue()];
    }

    public static void setLedMode(final LedMode ledMode) {
        Limelight.getTable().getEntry(LedMode.KEY).setNumber(ledMode.ordinal());
    }

    public static CameraMode getCameraMode() {
        return CameraMode.values()[Limelight.getTable().getEntry(CameraMode.KEY).getNumber(0).intValue()];
    }

    public static void setCameraMode(final CameraMode cameraMode) {
        Limelight.getTable().getEntry(CameraMode.KEY).setNumber(cameraMode.ordinal());
    }

    public static Pipeline getCurrentPipeline() {
        return Pipeline.values()[Limelight.getTable().getEntry(Pipeline.KEY).getNumber(0).intValue()];
    }

    public static void setCurrentPipeline(final Pipeline pipeline) {
        Limelight.getTable().getEntry(Pipeline.KEY).setNumber(pipeline.ordinal());
    }

    public static StreamMode getStreamMode() {
        return StreamMode.values()[Limelight.getTable().getEntry(StreamMode.KEY).getNumber(0).intValue()];
    }

    public static void setStreamMode(final StreamMode streamMode) {
        Limelight.getTable().getEntry(StreamMode.KEY).setNumber(streamMode.ordinal());
    }

    public static SnapshotMode getSnapshotMode() {
        return SnapshotMode.values()[Limelight.getTable().getEntry(SnapshotMode.KEY).getNumber(0).intValue()];
    }

    public static void setSnapshotMode(final SnapshotMode snapshotMode) {
        Limelight.getTable().getEntry(SnapshotMode.KEY).setNumber(snapshotMode.ordinal());
    }
}
