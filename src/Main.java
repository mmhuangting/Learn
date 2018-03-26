public class Main {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);


        ListNode l2 = new ListNode(5);


        ListNode l = addTwoNumbers(l1, l2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode data = addTwoNumbersMethod(l1, l2, false);
        return data;
    }

    private static ListNode addTwoNumbersMethod(ListNode l1, ListNode l2, boolean carry) {
        ListNode data = null;
        int v1 = l1==null?0:l1.val,
                v2 = l2==null?0:l2.val;
        int x1 = v1 + v2;
        if(carry) {
            x1 += 1;
        }
        if(x1 >= 10) {
            int z = x1-10;

            data = new ListNode(z);

            carry = true;
        } else {
            data = new ListNode(x1);

            carry = false;
        }
        if((l1 == null || l1.next == null) &&
                (l2 == null || l2.next == null))  {
            if(carry) {
                data.next = new ListNode(1);
            }
            return data;
        }
        data.next = addTwoNumbersMethod(l1==null?null:l1.next, l2==null?null:l2.next, carry);
        return data;
    }
}
