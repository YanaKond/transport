class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * length;
    }
}