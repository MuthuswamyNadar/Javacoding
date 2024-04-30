import java.util.ArrayList;

public class Arraymist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(665410);
        list.add(1088);
        list.add(1099);
        list.add(10);
        list.add(10);
        list.add(8810);
        list.add(10);
        System.out.println(list.contains(10));
        list.set(0,1022);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
