package DSA_Assignments;

class FNode {
    int data;
    FNode next;

    FNode(int data) {
        this.data = data;
    }
}

class FastSlowList {
    FNode head;
    // Add node at end
    public void add(int data) {
        FNode newNode = new FNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        FNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // Display List
    public void display() {
        FNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ⭐ Find middle using FAST – SLOW POINTER ⭐
    public int findMiddle() {
        if (head == null)
            throw new RuntimeException("List is empty!");

        FNode slow = head;
        FNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // slow moves 1 step
            fast = fast.next.next;    // fast moves 2 steps
        }

        return slow.data; // slow stops at middle
    }
}

public class FastSlowPointer {
    public static void main(String[] args) {
        FastSlowList list = new FastSlowList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Linked list:");
        list.display();
        System.out.println("Middle element = " + list.findMiddle());
    }
}
