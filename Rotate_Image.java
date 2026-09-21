public class Rotate_Image {
    
    public void rotate(int[][] matrix) {
        for(int i=1; i<matrix.length ; i++){
            for(int j=0 ; j<i ; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        for(int row=0 ; row<matrix.length ; row++){
            int s =0 , e = matrix[0].length-1;
            while(s<e){
                int temp = matrix[row][s];
                matrix[row][s] = matrix[row][e];
                matrix[row][e] = temp;
                s++;
                e--;
            }
        }
    }
}

