class Solution {
    public boolean isPerfectSquare(int num) {

        long lower = 1;
        long upper = num;
        while(lower<=upper)
        {
           long mid = (upper+lower)/2;
            
            long square = mid*mid;
        
        if(square==num)
        {
            return true;
        }
        else if(square<num)
        {
            lower = mid+1;
        }
        else
        {
            upper = mid -1;
        }

        }
        return false;
    }
}
