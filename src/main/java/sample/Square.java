package sample;

public class Square {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    public double computeArea(double side){
        return side*side;
    }
}
