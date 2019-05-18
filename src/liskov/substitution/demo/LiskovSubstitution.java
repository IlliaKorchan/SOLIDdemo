package liskov.substitution.demo;

public class LiskovSubstitution {
    Rectangle rectangle;

    static Rectangle getRectangle() {
        return new Rectangle();
    }
    public static void main(String[] args) {
        Rectangle rectangle = getRectangle();

        rectangle.setHeight(15);
        rectangle.setWidth(10);
        System.out.println(rectangle.getSquare());
    }
}

interface Shape {
    int getSquare();
}

class Rectangle implements Shape{
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getSquare() {
        return width * height;
    }
}

class Square implements Shape{
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getSquare() {
        return height * height;
    }
}
