public class Main {
    public static void main(String[] args) {
        LinkList ll = getSortedLinkedList();
        ll.insert(7);
        System.out.println("Done");
    }

    private static LinkList getSortedLinkedList() {
        Node fakeHead = new Node(0);
        int[] sortedList = {1, 2, 5, 8, 10, 20};
        Node p = fakeHead;
        for (int i = 0; i < sortedList.length; i++) {
            p.next = new Node(sortedList[i]);
            p = p.next;
        }
        LinkList ret = new LinkList();
        ret.head = fakeHead.next;
        ret.length = sortedList.length;
        return ret;
    }

}