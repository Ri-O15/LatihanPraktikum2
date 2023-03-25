import java.util.LinkedList;

public class Latihan2 {
    public static void main(String[] args) throws Exception {
        LinkedList<String> list = new LinkedList<>();
        list.add("Sapi");
        list.add("Kelinci");
        list.add("Kambing");
        list.add("Kambing");
        list.add("Unta");
        list.add("Domba");

        System.out.println("Hewan : " + list);

        LinkedList<String> delete = new LinkedList<>();
        delete.add("Kelinci");
        delete.add("Kambing");
        delete.add("Unta");

        System.out.println("Hewan yang dihapus : " + delete);

        list.removeAll(delete);
        System.out.println("Output Hewan : " + list);

    }
}
