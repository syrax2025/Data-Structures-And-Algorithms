class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int maxValue = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++)
        {
            maxValue = Math.max(maxValue,piles[i]);
        }
        
        // System.out.println(maxValue);
        int start = 1,end=maxValue;
        
        int ans = -1;
        
        while(start < end)
        {
            int mid = start + (end - start)/2;
            if(canEat(piles,h,mid))
            {
                end = mid;
            }
            else
            {
                start = mid + 1;
            }
        }
        
        return start;
    }

      boolean canEat(int[] piles, int h, int speed) {
        long time = 0;
        for(int pile : piles) {
            time += (pile % speed == 0) ? (pile / speed) : (pile / speed + 1);
        }
        return time <= h;
    }
}