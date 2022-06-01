package ge.ufc.beans;

import com.Tadamia.Rectangle;

public final class Square extends Rectangle {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea(double w, double h) {
        return super.getArea(w, h);
    }

    @Override
    public double getPerimeter(double w, double h) {
        return super.getPerimeter(w, h);
    }
}
