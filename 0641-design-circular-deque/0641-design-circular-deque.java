class MyCircularDeque {
    private int[] v;
    private int f,b,size,cap;
    public MyCircularDeque(int k) {
        v=new int[k];
        Arrays.fill(v,-1);
        f=0;
        b=0;
        size=0;
        cap=k;
    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;
        if(f==0) f=cap-1;
        else f--;
        v[f]=value;
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()) return false;
        v[b]=value;
        if(b==cap-1) b=0;
        else
        b++;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()) return false;
        v[f]=-1;
        if(f==cap-1)f=0;
        else f++;
        size--;
        return true;
    }

    
    public boolean deleteLast() {
        if(isEmpty()) return false;
        if(b==0) b=cap-1;
        else b--;
        v[b]=-1;
        size--;
        return true;
    }
    
    public int getFront() {
         if (isEmpty()) {
            return -1;
        }
        return v[f];
    }
    
    public int getRear() {
                if(isEmpty()) return -1;
        if(b==0) return v[cap-1];
        else return v[b-1];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==cap;     
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */