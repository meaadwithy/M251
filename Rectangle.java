package Ex7;

public class Rectangle {
    private int width;
    private int height;
    private String color;

    // Constructor
    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // Getters
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    // حساب المساحة
    public int getArea() {
        return width * height;
    }

    // تحويل لمحتوى نصي (عشان الملف)
    @Override
    public String toString() {
        return width + "," + height + "," + color;
    }
}
