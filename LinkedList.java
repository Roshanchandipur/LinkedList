final class LinkedList{
	
	private Node head;
	private int ind = -1;
	
	private class Node{
		int data;
		Node next;
		private Node(int data) {
			this.data = data;
			this.next = null; 
		} 
		private Node() {
		}
	}
	  // add element at the last
	public boolean add(int data) {
		Node a = new Node(data);
		ind++;
		if(head == null) {
			head = a;
			return true;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = a;
		return true;
	}
	public void print() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
}