public class sorted_matrix {

    public static boolean sorted(int matirx[][],int key){
        int row=0;
        int col=matirx[0].length-1;
         
        while (row<matirx.length && col>=0) {
            if(key==matirx[row][col]){
                System.out.println("found "+ row+","+col);
                return true;
            }
            else if(key<matirx[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
        
    }
    public static void main(String[] args) {
        int matrix[][]={ { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 } };
        sorted(matrix, 10);
    }
}
