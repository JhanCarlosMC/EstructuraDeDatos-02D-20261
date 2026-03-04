package co.edu.uniquindio.generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(5,5);
        Box box2 = new Box(5,"%");


        ArrayList<Box> boxes = new ArrayList<Box>();
        boxes.add(box1);
        boxes.add(box2);

        for (Box box : boxes) {

            System.out.println(box.getValue());
            System.out.println(box.getValue2());
        }
    }
}
