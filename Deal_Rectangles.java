package Ex7;
import java.util.*;
import java.io.*;

public class Deal_Rectangles {
    public static void fillRectangles(ArrayList<Rectangle>list){
        list.add(new Rectangle (5,3,"pink"));
        list.add(new Rectangle(2, 7, "Blue"));
        list.add(new Rectangle(4, 6, "Green"));
    }
    public static void writeToFile(ArrayList<Rectangle>list) {
        try {
            File f = new File("rectangles.txt");
            PrintWriter w = new PrintWriter(f);
            for (Rectangle x : list) {
                w.println(x.toString());
            }
            w.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static ArrayList<Rectangle> readFromFile() {
        ArrayList<Rectangle> list = new ArrayList<>();
        try{
            File f = new File("rectangles.txt");
            Scanner r = new Scanner(f);
            r.useDelimiter(",|\n");
            while (r.hasNextLine()) {
                int w = r.nextInt();
                int h = r.nextInt();
                String c = r.nextLine();
                list.add(new Rectangle(w, h, c));
            }
            r.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return list;
    }
    public static void printArea(ArrayList<Rectangle> list) {
        for (Rectangle x : list) {
            System.out.println(x.getArea());
        }
    }
}
