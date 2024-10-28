public class Drawing {

    private static Drawing instance;
    public String value;

    private Drawing(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static void drawShape(Shape shape){

        System.out.println(shape.getClass());

        System.out.println(shape.getColor());

        System.out.println(shape.calculateArea());

    }

    public static Drawing getInstance(String value) {
        if (instance == null) {
            instance = new Drawing(value);
        }
        return instance;
    }
}
