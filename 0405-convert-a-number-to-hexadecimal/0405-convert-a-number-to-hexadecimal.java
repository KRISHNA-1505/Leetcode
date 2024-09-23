class Solution {
    public String toHex(int num) {
        if(num==0)
        return "0";
       final char[] hex={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder s=new StringBuilder();
        while(num!=0)
        {
            s.append(hex[num & 0xf]);
            num>>>=4;
        }
        return s.reverse().toString();
}
}