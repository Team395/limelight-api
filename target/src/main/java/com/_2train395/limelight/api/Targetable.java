package com._2train395.limelight.api;

/**
 * Represents a target.
 */
public interface Targetable {
    /**
     * @return the horizontal offset of the center of this target from the crosshair, with implementation-defined units
     */
    double getXOffset();

    /**
     * @return the vertical offset of the center of this target from the crosshair, with implementation-defined units
     */
    double getYOffset();

    /**
     * @return the percentage of the image that this target occupies, ranging from 0% to 100%
     */
    double getArea();

    /**
     * @return the skew of this target, ranging from -90 to 0 degrees
     */
    double getSkew();
}
