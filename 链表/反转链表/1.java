/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode current = head;
        ListNode next = null;
        ListNode previous = null;
        ListNode newHead = null;
        while(current != null ){
            next =      current.next; // next 先抓住
            
            current.next = previous; // 业务逻辑，反转指正
                
            previous = current;//移动指针
            current = next;    
                
        }
        
        newHead = previous;
        
        return newHead;
    }
}

// case 1: 输入null
// case 2: 一个节点
// case 3: 2个节点