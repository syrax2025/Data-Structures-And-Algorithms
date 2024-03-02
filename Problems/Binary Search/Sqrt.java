class Sqrt {
    public int mySqrt(int x) {
        int start = 1,end=x;
	    int mid = 0;
	    while(start <= end)
	    {
	        mid = start + (end - start)/2;
	        if((mid) == (x/mid))
	        {
	            return (int)mid;
	        }
	        else if ((mid) > (int)(x/mid))
	        {
	            end = mid-1;
	        }
	        else 
	        {
	            start = mid+1;
	        }
	        	    System.out.println(mid + " "+start+" "+end);

	    }
	   // System.out.println(mid);
	    return (int)end;
    }
}