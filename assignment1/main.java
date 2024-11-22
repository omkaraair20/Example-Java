public class main {
    public static void main(String[] args) {
        ShapeFactory factory=new ShapeFactory();
        Factory fact_1=factory.computeFactory("squares");
        fact_1.getFactory();
    }
}