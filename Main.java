package Ex7;

import java.util.*;

import static Ex7.Deal_Rectangles.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Rectangle> list = new ArrayList<Rectangle>();
        fillRectangles(list);
        writeToFile(list);
        ArrayList<Rectangle> list1 = readFromFile();
        System.out.println(readFromFile());
        printArea(list1);
    }
}
