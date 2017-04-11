
/* DList.java */

package homework4;

/**
 *  A DList is a mutable doubly-linked list ADT.  Its implementation is
 *  circularly-linked and employs a head (dummy) node at the head
 *  of the list.
 *
 *  DO NOT CHANGE ANY METHOD PROTOTYPES IN THIS FILE.
 */

public class DList {

	/**
	 *  head references the head node.
	 *  size is the number of items in the list.  (The head node does not
	 *       store an item.)
	 *
	 *  DO NOT CHANGE THE FOLLOWING FIELD DECLARATIONS.
	 */

	protected DListNode head;
	protected int size;

	/* DList invariants:
	 *  1)  head != null.
	 *  2)  For any DListNode x in a DList, x.next != null.
	 *  3)  For any DListNode x in a DList, x.prev != null.
	 *  4)  For any DListNode x in a DList, if x.next == y, then y.prev == x.
	 *  5)  For any DListNode x in a DList, if x.prev == y, then y.next == x.
	 *  6)  size is the number of DListNodes, NOT COUNTING the head,
	 *      that can be accessed from the head (head) by a sequence of
	 *      "next" references.
	 */

	/**
	 *  newNode() calls the DListNode constructor.  Use this class to allocate
	 *  new DListNodes rather than calling the DListNode constructor directly.
	 *  That way, only this method needs to be overridden if a subclass of DList
	 *  wants to use a different kind of node.
	 *  @param item the item to store in the node.
	 *  @param prev the node previous to this node.
	 *  @param next the node following this node.
	 */
	protected DListNode newNode(Object item, DListNode prev, DListNode next) {
		return new DListNode(item, prev, next);
	}

	/**
	 *  DList() constructor for an empty DList.
	 */
	public DList() {
		size = 0;
		head = newNode(null, head, head);
	}

	/**
	 *  isEmpty() returns true if this DList is empty, false otherwise.
	 *  @return true if this DList is empty, false otherwise. 
	 *  Performance:  runs in O(1) time.
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/** 
	 *  length() returns the length of this DList. 
	 *  @return the length of this DList.
	 *  Performance:  runs in O(1) time.
	 */
	public int length() {
		return size;
	}

	/**
	 *  insertFront() inserts an item at the front of this DList.
	 *  @param item is the item to be inserted.
	 *  Performance:  runs in O(1) time.
	 */
	public void insertFront(Object item) {
		DListNode newHead = newNode(item, head, front());
		front().next = newHead;
		size++;
	}

	/**
	 *  insertBack() inserts an item at the back of this DList.
	 *  @param item is the item to be inserted.
	 *  Performance:  runs in O(1) time.
	 */
	public void insertBack(Object item) {
		DListNode newHead = newNode(item, back(), head);
		back().next = newHead;
		size++;
	}

	/**
	 *  front() returns the node at the front of this DList.  If the DList is
	 *  empty, return null.
	 *
	 *  Do NOT return the head under any circumstances!
	 *
	 *  @return the node at the front of this DList.
	 *  Performance:  runs in O(1) time.
	 */
	public DListNode front() {
		return next(head);
	}

	/**
	 *  back() returns the node at the back of this DList.  If the DList is
	 *  empty, return null.
	 *
	 *  Do NOT return the head under any circumstances!
	 *
	 *  @return the node at the back of this DList.
	 *  Performance:  runs in O(1) time.
	 */
	public DListNode back() {
		DListNode node = head;
		for(int i = 0; i<size; i++){
			node = next(node);
		}
		return node;
	}

	/**
	 *  next() returns the node following "node" in this DList.  If "node" is
	 *  null, or "node" is the last node in this DList, return null.
	 *
	 *  Do NOT return the head under any circumstances!
	 *
	 *  @param node the node whose successor is sought.
	 *  @return the node following "node".
	 *  Performance:  runs in O(1) time.
	 */
	public DListNode next(DListNode node) {
		if(node.next.equals(head)){
			return null;
		}
		return node.next;
	}

	/**
	 *  prev() returns the node prior to "node" in this DList.  If "node" is
	 *  null, or "node" is the first node in this DList, return null.
	 *
	 *  Do NOT return the head under any circumstances!
	 *
	 *  @param node the node whose predecessor is sought.
	 *  @return the node prior to "node".
	 *  Performance:  runs in O(1) time.
	 */
	public DListNode prev(DListNode node) {
		if(node.prev.equals(head)){
			return null;
		}
		return node.prev;
	}

	public boolean contains(DListNode node){
		DListNode node2 = head;
		for(int i = 0; i<size; i++){
			if(node != null && node != null){
				if(node.equals(node2)){
					return true;
				}
			}
			node = next(node);
		}
		return false;
	}

	/**
	 *  insertAfter() inserts an item in this DList immediately following "node".
	 *  If "node" is null, do nothing.
	 *  @param item the item to be inserted.
	 *  @param node the node to insert the item after.
	 *  Performance:  runs in O(1) time.
	 */
	public void insertAfter(Object item, DListNode node) throws NullPointerException{
		if(contains(node)){
			DListNode nodex = node.next;
			node.next = newNode(item, node,nodex);
		}
	}

	/**
	 *  insertBefore() inserts an item in this DList immediately before "node".
	 *  If "node" is null, do nothing.
	 *  @param item the item to be inserted.
	 *  @param node the node to insert the item before.
	 *  Performance:  runs in O(1) time.
	 */
	public void insertBefore(Object item, DListNode node) {
		if(contains(node)){
			DListNode nodex = node.prev;
			node.prev = newNode(item, nodex,node);
		}
	}

	/**
	 *  remove() removes "node" from this DList.  If "node" is null, do nothing.
	 *  Performance:  runs in O(1) time.
	 */
	public void remove(DListNode node) {
		if(contains(node)) {
			node.prev.next = node.next;
			node.next.prev = node.prev;
		}
	}

	/**
	 *  toString() returns a String representation of this DList.
	 *
	 *  DO NOT CHANGE THIS METHOD.
	 *
	 *  @return a String representation of this DList.
	 *  Performance:  runs in O(n) time, where n is the length of the list.
	 */
	public String toString() {
		String result = "[  ";
		DListNode current = head.next;
		while (current != head) {
			result = result + current.item + "  ";
			current = current.next;
		}
		return result + "]";
	}
}
