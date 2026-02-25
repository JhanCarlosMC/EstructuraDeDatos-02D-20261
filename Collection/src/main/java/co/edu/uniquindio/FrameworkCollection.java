package co.edu.uniquindio;

import javax.swing.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class FrameworkCollection {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        ListIterator<String> iteratorList = list.listIterator(list.size());
//        while (iteratorList.hasNext()) {
//            if(iteratorList.next().equals("2")) iteratorList.remove();
//        }
//        JOptionPane.showMessageDialog(null, list);

//        while (iteratorList.hasNext()) {
//            System.out.println(iteratorList.next());
//        }

        while (iteratorList.hasPrevious()) {
            System.out.println(iteratorList.previous());
        }

    }
}
