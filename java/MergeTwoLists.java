// You are given the heads of two sorted linked lists list1 and list2.

// Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

// Return the head of the merged linked list.
//function :
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		ListNode result = l1.val < l2.val ? l1 : l2;
		result.next = mergeTwoLists(result.next, l1.val < l2.val ? l2 : l1);
		return result;
}
