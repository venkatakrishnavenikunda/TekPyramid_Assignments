package DSA_Assignments;


class PNode {
    int data;
    PNode next;

    PNode(int data) {
        this.data = data;
    }
}

class PalindromeListImp {
    PNode head;

    // Add element at end
    public void add(int data) {
        PNode newNode = new PNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        PNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // Display list
    public void display() {
        PNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Reverse a linked list (helper)
    private PNode reverse(PNode head) {
        PNode prev = null, curr = head, next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Check if the list is palindrome
    public boolean isPalindrome() {
        if (head == null || head.next == null)
            return true;

        // 1️⃣ Find middle using fast-slow pointer
        PNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;        // slow moves 1 step
            fast = fast.next.next;   // fast moves 2 steps
        }

        // 2 Reverse second half
        PNode secondHalf = reverse(slow.next);

        // 3️ Compare two halves
        PNode p1 = head;
        PNode p2 = secondHalf;
        boolean result = true;

        while (p2 != null) {
            if (p1.data != p2.data) {
                result = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // 4️⃣ Restore original list (optional)
        slow.next = reverse(secondHalf);

        return result;
    }
}

public class PalindromeList {
    public static void main(String[] args) {

        PalindromeListImp list = new PalindromeListImp();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println("Linked List:");
        list.display();

        if (list.isPalindrome())
            System.out.println("The list is a PALINDROME.");
        else
            System.out.println("The list is NOT a palindrome.");
    }
}
