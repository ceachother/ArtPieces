package DataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cecillee on 23/5/2017.
 */

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == headB)
        {
            return headA;

        }
        if(headA.next == null && headB.next == null)
        {
            return null;
        }
        ListNode result = getIntersectionNode(headA.next,headB);
        return result != null ?  result :  getIntersectionNode(headA,headB.next);
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
