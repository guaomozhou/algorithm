package niuke;

/**
 * @Author: mozhou
 * @Description: 判断链表中是否有环
 * @Date: 2021/7/15 21:33
 */
public class niuke004 {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast !=null &&fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)return true;
        }
        return false;
    }
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }
}
