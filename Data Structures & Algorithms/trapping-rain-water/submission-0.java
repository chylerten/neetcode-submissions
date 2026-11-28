class Solution {
    public int trap(int[] height) {
        int index = 0;
        int[] maxes = new int[height.length];
        int[] maxes2 = new int[height.length];
        int sum = 0;
        int max = 0;
        while(index < height.length){
            maxes[index] = max;
            if(height[index] > max){
                max = height[index];
            }
            index++;
        }
        index--;
        max = 0;
        while(index >= 0){
            maxes2[index] = max;
            if(height[index] > max){
                max = height[index];
            }
            index--;
        }
        index++;
        while(index < height.length){
            if(Math.min(maxes[index], maxes2[index]) - height[index] > 0){
                sum += Math.min(maxes[index], maxes2[index]) - height[index];
            }
            
            index++;
        }
        return sum;
    }
}
