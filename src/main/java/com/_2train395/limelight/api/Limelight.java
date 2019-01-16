package com._2train395.limelight.api;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;

/**
 * Utility class for getting and setting data of the Limelight through NetworkTables.
 */
public class Limelight {
    private static final String KEY = "limelight";
    private static final String HAS_TARGETS_KEY = "tv";
    private static final String LATENCY_KEY = "tl";

    private Limelight() {
    }

    static NetworkTable getTable() {
        return NetworkTableInstance.getDefault().getTable(KEY);
    }

    /**
     * @return the current {@link LedMode}
     */
    public static LedMode getLedMode() {
        return LedMode.fetch();
    }

    /**
     * Updates the current {@link LedMode} in the Limelight.
     *
     * @param ledMode the {@link LedMode} to set
     */
    public static void setLedMode(final LedMode ledMode) {
        ledMode.push();
    }

    /**
     * @return the current {@link CameraMode}
     */
    public static CameraMode getCameraMode() {
        return CameraMode.fetch();
    }

    /**
     * Updates the current {@link CameraMode} in the Limelight.
     *
     * @param cameraMode the {@link CameraMode} to set
     */
    public static void setCameraMode(final CameraMode cameraMode) {
        cameraMode.push();
    }

    /**
     * @return the current {@link Pipeline}
     */
    public static Pipeline getPipeline() {
        return Pipeline.fetch();
    }

    /**
     * Updates the current {@link Pipeline} in the Limelight.
     *
     * @param pipeline the {@link Pipeline} to set
     */
    public static void setPipeline(final Pipeline pipeline) {
        pipeline.push();
    }

    /**
     * @return the current {@link StreamMode}
     */
    public static StreamMode getStreamMode() {
        return StreamMode.fetch();
    }

    /**
     * Updates the current {@link StreamMode} in the Limelight.
     *
     * @param streamMode the {@link StreamMode} to set
     */
    public static void setStreamMode(final StreamMode streamMode) {
        streamMode.push();
    }

    /**
     * @return the current {@link SnapshotMode}
     */
    public static SnapshotMode getSnapshotMode() {
        return SnapshotMode.fetch();
    }

    /**
     * Updates the current {@link SnapshotMode} in the Limelight.
     *
     * @param snapshotMode the {@link SnapshotMode} to set
     */
    public static void setSnapshotMode(final SnapshotMode snapshotMode) {
        snapshotMode.push();
    }

    /**
     * @return the {@link Target} found by Limelight according to the current pipeline's settings, <em>including</em> grouping preferences
     */
    public static Target getTarget() {
        return new Target();
    }

    /**
     * @param rawTargetType which {@link RawTarget} to get
     * @return the specified {@link RawTarget} found by Limelight according to the current pipeline's settings, <em>excluding</em> grouping preferences
     */
    public static RawTarget getRawTarget(final RawTargetType rawTargetType) {
        return new RawTarget(rawTargetType);
    }

    /**
     * @param rawCrosshairType which {@link RawCrosshair} to get
     * @return the specified {@link RawCrosshair} according to the current pipeline's settings
     */
    public static RawCrosshair getRawCrosshair(final RawCrosshairType rawCrosshairType) {
        return new RawCrosshair(rawCrosshairType);
    }

    /**
     * @return {@code true} if the Limelight has detected a target according to the current pipeline's settings; otherwise {@code false}
     */
    public static boolean hasTarget() {
        return getTable().getEntry(HAS_TARGETS_KEY).getDouble(0.0) == 1.0;
    }

    /**
     * @return the latency in milliseconds contributed by the current pipeline. This does not include the latency from capturing the image prior to its processing.
     */
    public static double getLatency() {
        return getTable().getEntry(LATENCY_KEY).getDouble(0.0);
    }
}
