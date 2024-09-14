bool isPalindrome(int x) {

    int rev=0;
    int b=x;
    if(x<0)
    return false;

    while(x!=0)
    {
        if(rev>INT_MAX/10 || rev<INT_MIN/10)return 0;
        rev=rev*10+x%10;
        x/=10;
    }
    if (rev==b)
    {
        return true;
    }
    else
    return false;
}
