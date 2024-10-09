public class GenericSquare <T extends Number> {
    private T number;

    public GenericSquare(T number) {
        this.number = number;
    }

    public double square() {
        return Math.pow(number.doubleValue(), 2);
    }

    public static void main(String[] args) {
        GenericSquare<Integer> intSquare = new GenericSquare<>(5);
        System.out.println("Square of Integer: " + intSquare.square());

        GenericSquare<Double> doubleSquare = new GenericSquare<>(3.5);
        System.out.println("Square of Double: " + doubleSquare.square());
    }
}

