package hw20221207;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList cll = new CustomLinkedList();

        cll.pushToHead(1);
        cll.pushToTail(99);
        cll.pushToHead(0);
        cll.pushToIndex(2,22);
        cll.print();
    }
}
