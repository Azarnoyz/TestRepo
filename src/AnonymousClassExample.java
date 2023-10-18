interface Shape {
    void draw();
}

class Drawing {
    void drawShape(Shape shape) {
        shape.draw();
    }
}

public class AnonymousClassExample {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();

        drawing.drawShape(new Shape() {
            @Override
            public void draw() {
                System.out.println("Drawing a shape");
            }
        });
    }
}
