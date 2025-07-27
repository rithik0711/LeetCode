class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor=image[sr][sc];
        if(color!=originalColor){
            floodfillAlgorithm(image, sr, sc, originalColor, color);
        }
        return image;
    }
    public void floodfillAlgorithm(int[][] image, int sr, int sc, int originalColor, int newColor){
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) return;
        if(image[sr][sc]!=originalColor) return ;
        image[sr][sc]=newColor;
        floodfillAlgorithm(image, sr, sc-1, originalColor, newColor);//left
        floodfillAlgorithm(image, sr-1, sc, originalColor, newColor);//up
        floodfillAlgorithm(image, sr, sc+1, originalColor, newColor);//right
        floodfillAlgorithm(image, sr+1, sc, originalColor, newColor);//down
    }
}