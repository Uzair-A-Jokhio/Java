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

    public Matrix(int row,int columns){
        this.numRow = row;
        this.numColumns = columns;
        this.matrix =  new int[row][columns];
    }

    public void setMatrix(int row, int colums, int value){
        if(isValid(row, colums)){
            matrix[row][colums] = value;
        }
    }
    
    private boolean isValid(int n, int m) {
        return n >= 0 && m < this.numRow && m >= 0 && n < this.numColumns;
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
        Matrix matrix = new Matrix(3, 03);
        matrix.setMatrix(2, 02, 05);
        matrix.display();
    }
}
