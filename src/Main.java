
import DataStrucutre.LinkedListFolder.CustomLinkedList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
            CustomLinkedList<Integer> list = new CustomLinkedList<>();
            list.add(40);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(20);

            Iterator<Integer> iterator = list.iterator();
        System.out.printf("[\t");
            while (iterator.hasNext()) {
                System.out.print(iterator.next() +  "\t --> \t");

            }
        System.out.println("\t]");

    }
}
