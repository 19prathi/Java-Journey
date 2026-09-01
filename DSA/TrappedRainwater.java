package DSA;

public class TrappedRainwater {
    public int trap(int[] height) {
        int n = height.length;
        int leftMAX[] = new int[n];
        leftMAX[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMAX[i] = Math.max(height[i], leftMAX[i-1]);
        }
        int rightMAX[] = new int[n];
        rightMAX[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightMAX[i] = Math.max(height[i], rightMAX[i+1]);
        }
        int trappedwater = 0;
        for(int i = 0; i < n; i++){
            int waterlevel = Math.min(leftMAX[i], rightMAX[i]);
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;
    }
    public static void main(String[] args){
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(new TrappedRainwater().trap(height));
    }
}
