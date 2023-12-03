package Java_Task;


/*      QUS 2 (A)
 Create a class called 'Matrix' containing constructor that initializes 
 the number of rows and number of columns of a new Matrix object.
 The Matrix class has the following information: 
 1. Number of rows of matrix. 
 2  number of columns of matrix. 
 3 Elements of matrix in the form of 2D array.
*/

public class Matrix {

    private int numRow, numColumns;
    private int[][] matrix;

    public Matrix(int row,int columns, int[][] matrix){
        this.numRow = row;
        this.numColumns = columns;
        this.matrix =  matrix;
    }

    public  int getNumRow(){ 
        return this.numRow;
    }
    public int getNumCol(){
        return this.numColumns;
    }
    

    public void display() {
        System.out.println("Matrix");

        for (int i = 0; i < numRow; i++) {
            for (int j = 0; j < numColumns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {

        int[][] matrixElements = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
            };
        Matrix matrix = new Matrix(3, 03, matrixElements);
        matrix.display();
        System.out.println("Number of Rows: " + matrix.getNumRow());
        System.out.println("Number of Rows: " + matrix.getNumCol());
    }
}
