class Solution{
  public int[] searchRange(int[] nums,int target){
    int first=-1,last=-1;
    int left=0;right=nums.length-1;
    while(left<=right){
      int mid=left+(right-left)/2;
      if(nums[mid]>=target)
        right=mid-1;
      else
        left=mid+1;
    }
    if(left==nums.length||nums[left]!=target)
      return new int[]{-1,-1};
    first=left;
    right=nums.length-1;
    while(left<=right){
      int mid=left+(right-left)/2;
      if(nums[mid]<=target)
        left=mid+1;
      else
        right=mid-1;
    }
    last=right;
    return new int[]{first,last};
  }
}
