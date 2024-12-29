class MyLinkedList {
    class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    
    int size;
    Node dummy;
    
    public MyLinkedList() {
        dummy = new Node(-1);  
        size = 0;
    }
    
    public int get(int index) {
        if (index >= size) return -1;  
        Node curr = dummy;
        for (int i = 0; i < index; i++) { 
            curr = curr.next;
        }
        return curr.next.val;   }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = dummy.next;
        dummy.next = node;
        size++;
    }
    
    public void addAtTail(int val) {
        Node node = new Node(val);
        Node curr = dummy;
        while (curr.next != null) {  
            curr = curr.next;
        }
        curr.next = node;  
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size) return; 
        Node node = new Node(val);
        Node curr = dummy;
        for (int i = 0; i < index; i++) {  
            curr = curr.next;
        }
        node.next = curr.next;
        curr.next = node;  
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index >= size) return; 
        Node curr = dummy;
        for (int i = 0; i < index; i++) {  
            curr = curr.next;
        }
        curr.next = curr.next.next;  
        size--;
    }
}
