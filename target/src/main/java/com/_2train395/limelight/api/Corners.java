package main.java.com._2train395.limelight.api;

import java.awt.geom.Point2D;

/**
 * Represents the corners of a target contour
 */
public class Corners {

    private final static String X_COORDINATES_KEY = "tcornx";
    private final static String Y_COORDINATES_KEY = "tcorny";

    Point2D[] corners;

    /**
     * @return corners counterclockwise from the top left
     */
    private Point2D[] fetchCorners() {
        double[] xCorners = Limelight.getTable().getEntry(X_COORDINATES_KEY).getDoubleArray(null);
        double[] yCorners = Limelight.getTable().getEntry(Y_COORDINATES_KEY).getDoubleArray(null);

        if(xCorners == null || yCorners == null) {
            return null;
        }

        ArrayList<Point2D> temp = new ArrayList<>();

        for(int i = 0; i < 4; i++) {
            temp.put(i, new Point2D(xCorners[i], yCorners[i]));
        }

        corners[0] = Collections.max(temp, (Point2D pt)-> -pt.getX() - pt.getY());
        corners[1] = Collections.max(temp, (Point2D pt)-> -pt.getX() + pt.getY());
        corners[2] = Collections.max(temp, (Point2D pt)->  pt.getX() + pt.getY());
        corners[3] = Collections.max(temp, (Point2D pt)->  pt.getX() - pt.getY());

        return corners;
    }

    public Corners() {
        corners = fetchCorners();
    }

    /**
     * @return an array containing corners counterclockwise from the top left
     */
    public Point2D[] getCorners() {
        return corners;
    }

}