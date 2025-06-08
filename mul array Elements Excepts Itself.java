class Main {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5}; 
    int [] result =Mul(nums);
    for(int num:result){
    System.out.print(num+" ");
    }

    }
    public static int[] Mul(int[] nums){
        int n = nums.length;
        int li[] = new int[n];
        int ri[] = new int[n];
        li[0]=1;
        ri[n-1]=1;
        for(int i=1; i<n; i++){
            li[i]= nums[i-1]*li[i-1];
        }
        
        for(int i=n-2; i>=0; i--){
            ri[i]= nums[i+1]*ri[i+1];
        }
        int ans[]= new int[n];
        for(int i=0; i<n; i++){
            ans[i]= li[i]*ri[i];
        }
        return ans;
    }
