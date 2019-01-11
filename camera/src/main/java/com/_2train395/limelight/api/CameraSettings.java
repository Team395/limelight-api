package com._2train395.limelight.api;

public class CameraSettings {
    private LedMode ledMode;
    private CameraMode cameraMode;
    private Pipeline pipeline;
    private StreamMode streamMode;
    private SnapshotMode snapshotMode;

    CameraSettings() {
        ledMode = fetchLedMode();
        cameraMode = fetchCameraMode();
        pipeline = fetchPipeline();
        streamMode = fetchStreamMode();
        snapshotMode = fetchSnapshotMode();
    }

    public CameraSettings(final LedMode ledMode, final CameraMode cameraMode, final Pipeline pipeline, final StreamMode streamMode, final SnapshotMode snapshotMode) {
        this.ledMode = ledMode;
        this.cameraMode = cameraMode;
        this.pipeline = pipeline;
        this.streamMode = streamMode;
        this.snapshotMode = snapshotMode;
    }

    private static LedMode fetchLedMode() {
        return LedMode.values()[(int) Limelight.getTable().getEntry(LedMode.KEY).getDouble(0.0)];
    }

    private static CameraMode fetchCameraMode() {
        return CameraMode.values()[(int) Limelight.getTable().getEntry(CameraMode.KEY).getDouble(0.0)];
    }

    private static Pipeline fetchPipeline() {
        return Pipeline.values()[(int) Limelight.getTable().getEntry(Pipeline.KEY).getDouble(0.0)];
    }

    private static StreamMode fetchStreamMode() {
        return StreamMode.values()[(int) Limelight.getTable().getEntry(StreamMode.KEY).getDouble(0.0)];
    }

    private static SnapshotMode fetchSnapshotMode() {
        return SnapshotMode.values()[(int) Limelight.getTable().getEntry(SnapshotMode.KEY).getDouble(0.0)];
    }

    public LedMode getLedMode() {
        return ledMode;
    }

    public void setLedMode(final LedMode ledMode) {
        this.ledMode = ledMode;
    }

    public CameraMode getCameraMode() {
        return cameraMode;
    }

    public void setCameraMode(final CameraMode cameraMode) {
        this.cameraMode = cameraMode;
    }

    public Pipeline getPipeline() {
        return pipeline;
    }

    public void setPipeline(final Pipeline pipeline) {
        this.pipeline = pipeline;
    }

    public StreamMode getStreamMode() {
        return streamMode;
    }

    public void setStreamMode(final StreamMode streamMode) {
        this.streamMode = streamMode;
    }

    public SnapshotMode getSnapshotMode() {
        return snapshotMode;
    }

    public void setSnapshotMode(final SnapshotMode snapshotMode) {
        this.snapshotMode = snapshotMode;
    }
}
