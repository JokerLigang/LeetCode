/**
 * Created by joker on 2016/12/15.
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

//        ListNode result = null;
//        ListNode temp;
//        ListNode l1Next =l1;
//        ListNode l2Next =l2;
//        ListNode current = null;
//
//        int forward = 0 ;
//        do {
//
//            int sum = l1Next.val + l2Next.val;
//
//
//            temp = new ListNode(sum % 10+forward);
//
//            forward = sum / 10;
//
//            if(forward>0)
//            temp.next = new ListNode(forward);
//
//            if(result==null){
//               result = temp;
//                current = result;
//            }else{
//                current.next=temp;
//                current = current.next;
//            }
//
//            l1Next = l1Next.next;
//            l2Next = l2Next.next;
//        }
//
//        while (l1Next != null || l2Next != null);
//
//
//        return result;

        ListNode r = new ListNode(0);
        ListNode h = r;
        ListNode beforeend = r;

        while(l1 !=null && l2 != null){
            r.val += l1.val + l2.val;

            r.next = new ListNode(r.val / 10);
            r.val %= 10;

            beforeend = r;
            r = r.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        ListNode rest;
        if (l1 == null) rest = l2; else rest = l1;

        while(rest != null){
            r.val += rest.val;

            r.next = new ListNode(r.val / 10);
            r.val %= 10;

            beforeend = r;
            r = r.next;
            rest = rest.next;
        }

        if(beforeend.next != null && beforeend.next.val == 0) beforeend.next = null;

        return h;
    }







    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next =new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next =new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode listNode = new AddTwoNumbers().addTwoNumbers(l1, l2);

        System.out.println(listNode);
    }


}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

