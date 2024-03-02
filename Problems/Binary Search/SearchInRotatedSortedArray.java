class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
         int pivot = findPivot(nums);
        if(pivot != -1)
        {
            int res = binarySearch(nums,target,0,pivot);
            return res != -1 ? res : binarySearch(nums,target,pivot+1,nums.length-1);
        }
        
        return binarySearch(nums,target,0,nums.length-1);
    }

        public static int binarySearch(int[] nums,int target,int start,int end)
    {
        while(start <= end)
        {
            int mid = start + (end - start) /2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] > target)
            {
                end = mid - 1;
            }
            else 
            {
                start = mid + 1;
            }
        }
        
        return -1;
    }

        public static int findPivot(int[] nums)
    {
        int start = 0,end=nums.length-1,mid=0;
        
        while(start < end)
        {
            mid = start + (end - start)/2;
            if(nums[mid] > nums[mid+1])
            {
                return mid;
            }
            else if(nums[mid] < nums[end])
            {
                end = mid;
            }
            else if(nums[mid] > nums[end])
            {
                start = mid;
            }
        
        }
        
        return -1;
    }
}