//remove
	public boolean remove(int data) {
		
		if(head == null) return false;
		if(head.data == data) {
			head = head.next;
			len--;
			return true;
		}
		
		Node temp = head.next,prev = head;
		while(temp!=null) {
			if(temp.data == data) {
				prev.next = temp.next;
				return true;
			}
			prev = prev.next;
			temp = temp.next;
		}
		return false;
	}
	
	public int length() {
		return len;
	}
	
	
	public int getIndex(int data) {
		int ind = 0;
		Node temp = head;
		while(temp!=null) {
			if(temp.data==data) {
				return ind;
			}
			ind++;
			temp = temp.next;
		}
		return -1;
	}
	
	public boolean isPresent(int data) {
		int ind = getIndex(data);
		if(ind>=0) return true;
		return false;
	}