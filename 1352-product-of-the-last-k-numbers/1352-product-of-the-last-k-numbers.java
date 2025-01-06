class ProductOfNumbers {
 private ArrayList<Integer> a; 

    public ProductOfNumbers() {
        a = new ArrayList<>(); 
        a.add(1); 
    }
    
    public void add(int num) {
        if(num>0){
            a.add(a.get(a.size()-1)*num);
        }
        else
        {
            a=new ArrayList();
            a.add(1);
        }
    }
    
    public int getProduct(int k) {
        int n=a.size();
        return k<n? a.get(n-1)/a.get(n-k-1):0;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
