class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            System.out.println("number is not palindrome");
            return false;
        }
     int s=x;
     int r,rev=0;
     while(x!=0)
     {

      r=x%10;
      rev=rev*10+r;
      x=x/10;

     }  
     if(rev==s)
     {
        System.out.println("numbwe is palindrone");
        return true;
     } else{
        System.out.println("numbwe is not palindrone");
        return false;
     }
    }

}