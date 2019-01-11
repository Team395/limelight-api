package com._2train395.limelight.api;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;

public class Limelight {
    private static final String KEY = "limelight";
    private static final String HAS_TARGETS_KEY = "tv";
    private static final String LATENCY_KEY = "tl";

    static NetworkTable getTable() {
        return NetworkTableInstance.getDefault().getTable(KEY);
    }

    public static boolean hasTargets() {
        return getTable().getEntry(HAS_TARGETS_KEY).getNumber(0).intValue() > 0;
    }

    public static double getLatency() {
        return getTable().getEntry(LATENCY_KEY).getNumber(0.0).doubleValue();
    }
}
