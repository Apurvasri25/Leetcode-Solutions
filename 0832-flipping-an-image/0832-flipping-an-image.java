class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r=image.length,c=image[0].length;
        for(int i=0;i<r;i++){
            int right=c-1,left=0;
            while(left<=right){
                int a=image[i][right]^1;
                image[i][right]=image[i][left]^1;
                image[i][left]=a;
                left++;
                right--;
            }
        }
        return image;
    }
}