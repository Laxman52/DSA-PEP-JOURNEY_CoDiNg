
class Solution {
    public int[] productExceptSelf(int[] nums) {
      int []pre=new int[nums.length];
      int []pos=new int[nums.length];
      int []ans=new int[nums.length];
      // pre array
      pre[0]=1;
      for(int i=1;i<nums.length;i++){
        pre[i]=pre[i-1]*nums[i-1];
      }
      pos[nums.length-1]=1;
      for(int i=nums.length-2;i>=0;i--){
        pos[i]=pos[i+1]*nums[i+1];
      }
      for(int i=0;i<nums.length;i++){
        ans[i]=pre[i]*pos[i];
      }
      return ans;
    }
}

//Time complexity - > O(N)
//Space complexity - > O(N)


// Optimal Solution -----
// time complexity -> O(N)
// Space complexity -> O(1)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // Step 1: Prefix product
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Step 2: Postfix product (and multiply directly into ans[])
        int post = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * post;
            post *= nums[i];
        }

        return ans;
    }
}


