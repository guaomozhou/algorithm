package leetcode.jianzhiOffer;

import java.util.Stack;

/**
 * @Author: mozhou
 * @Description: 从尾到头打印链表
 * @Date: 2021/7/15 21:11
 */
public class jianzhi006 {
    public int[] reversePrint(ListNode head) {
        //栈的思路
        Stack<ListNode> stack = new Stack<>();
        //设置一个链表
        ListNode temp = head;
        //当临时链表不为空的时候，将当前链表压入栈，用当前栈指向的下一个栈取代
        while(temp != null){
            stack.push(temp);
            temp = temp.next;
        }
        //获取栈的长度
        int size = stack.size();
        int[] a = new int[size];
        //将栈压出，将其值赋予数组
        for(int i = 0;i<size;i++){
            a[i] = stack.pop().val;
        }
        return a;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

}