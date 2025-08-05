class Solution {
    public String simplifyPath(String path) {
        Stack<String> s= new Stack<>();
        String[] pts = path.split("/");
        for(String pt : pts){
            if(pt.equals("") || pt.equals("."))
            continue;
            else if(pt.equals("..")){
                if(!s.isEmpty())
                s.pop();
            }
            else
            s.push(pt);
        }
        StringBuilder h = new StringBuilder();
        for(String d:s)
        h.append("/").append(d);
        if (h.length() > 0) {
    return h.toString();
} else {
    return "/";
}

    }
}