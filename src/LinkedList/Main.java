package LinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();

        sll.createSingleLinkedList(3);

        System.out.println(sll.head.value);
        System.out.println(sll.size);

    }
}
