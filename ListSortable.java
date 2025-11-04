package btqlkl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortable<E extends Comparable<E>> {
    private List<E> list;

    public ListSortable() {
        this.list = new ArrayList<>();
    }

    public void add(E element) {
        this.list.add(element);
    }

    public void print() {
        // Sắp xếp danh sách bằng Collections.sort()
        Collections.sort(this.list);

        System.out.println("--- DANH SÁCH KHOÁ LUẬN (Đã sắp xếp theo Tên KLTN) ---");
        for (E element : this.list) {
            System.out.println(element);
        }
    }
}