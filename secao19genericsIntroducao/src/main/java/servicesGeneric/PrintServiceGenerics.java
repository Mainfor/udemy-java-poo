package servicesGeneric;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceGenerics <T> {

    List <T> list = new ArrayList<>();

    public void addValue (T value) {
        list.add(value);
    }
    public T first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);

    }
    public void print() {
        System.out.print("Generic - [");
        if (!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for  (int i = 1; i < list.size(); i++) {
            System.out.print(" , " + list.get(i));
//          System.out.println(list);
        }
        System.out.println("]");
    }

//    @Override
//    public String toString() {
//        return "PrintService{" +
//                "list=" + list +
//                '}';
//    }
}
