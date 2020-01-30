/**
* Classwork #1: Define the methods for problems #1-9
*/
public class TwoDArrayMethods
{

public static void main(String[] args)
{
// Decaling a 2D array in one line of code, to be used for testing
int[][] board = {{2, 4, 6, 8},
{1, 2, 7, 9},
{4, 6, 1, 10},
{1, 3, 11, 2}};

/** These are the method calls for the static methods you will define
printMatrix(board);
findTotal(board);
findMax(board);
sumRows(board);
sumColumns(board);
largestinRows(board);
largestinColumns(board);
System.out.println(isSquare(board));
System.out.println(isRowMagic(board));
System.out.println(isColumnMagic(board));
**/
}

/* #1 Write a method for printing the elements in an array. Each row should
* be on its own line, so that the 2D array prints as a matrix of data

*/
public static void printMatrix(int[][] matrix)
{
    for (int i = 0; i < matrix.length; i++)
    {
        for (int j = 0; j < matrix[i].length; j++)
        {
            System.out.print(matrix[i][j] + " ");
            System.out.println("");
        }
    }
}
/*
* #2 Write a method to print the sum of all elements in the array. The
* The output should read:
* &quot;The sum of all elements in the array is 77
*/
public static void findTotal(int[][] matrix)
{
    int sum = 0;
    for (int i = 0; i < matrix.length; i++)
    {
        for (int j = 0; j < matrix[i].length; j++)
        {
            sum += matrix[i][j];
        }
    }
    System.out.println("The sum of all elements in the array is " + sum);
}
/*
* #3 Write a method that prints the maximum value in the entire 2D array.
* For example, this method call in our main method on page 1 should read:
* &quot;The maximum value in the entire matrix is 11
*/
public static void findMax(int[][] matrix)
{
    int max = matrix[0][0];
    for (int i = 0; i < matrix.length; i++)
    {
        for (int j = 0; j < matrix[i].length; j++)
        {
            if (max < matrix[i][j])
            {
                max = matrix[i][j];
            }
        }
    }
    System.out.println("The max value is " + max);
}

/* #4 Write a method for printing the sum of each row in the array

* For example, this method call in our main method should output:
* &quot;The sum of the elements in row 0 is 20.&quot;
* &quot;The sum of the elements in row 1 is 19.&quot; etc.
*/
public static void sumRows(int[][] matrix)
{
    int rSum;
    for (int r = 0; r < matrix.length; r++)
    {
        rSum = 0;
        for (int c = 0; c < matrix[r].length; c++)
        {
            rSum += matrix[r][c];
        }
        System.out.println("The sum of the elements in row " + r + " is " + rSum);
    }
}

/* #5 Write a method for finding the sum of each column in the array
* For example, this method call in our main method should output:
* &quot;The sum of the elements in column 0 is 8&quot;
* &quot;The sum of the elements in column 1 is 15&quot; etc.
*/
public static void sumColumns(int[][] matrix)
{
    int cSum;
    for (int c = 0; c < matrix[0].length; c++)
    {
        cSum = 0;
        for (int r = 0; r < matrix.length; r++)
        {
            cSum += matrix[r][c];
        }
        System.out.println("The sum of the elements in column " + c + " is " + cSum);
    }
}

/* #6 Write a method for printing the largest value in each row.
* For example, this method call in our main method should output:

* &quot;The largest value in row 0 is 8&quot; etc.
* &quot;The largest value in row 1 is 9&quot; etc.
*/
public static void largestinRows(int[][] matrix)
{
    int rMax = matrix[0][0];
    for (int r = 0; r < matrix.length; r++)
    {
        for (int c = 0; c < matrix[r].length; c++)
        {
            if (matrix[r][c] > rMax)
            {
                rMax = matrix[r][c];
            }
        }
        System.out.println("The largest value in row " + r + " is " + rMax);
    }
}
/* #7 Write a method for printing the largest value in each column.
* For example, this method call in our main method should output:
* &quot;The largest value in column 0 is 4&quot; etc.
* &quot;The largest value in column 1 is 6&quot; etc.
*/
public static void largestinColumns(int[][] matrix)
{
    int cMax;
    for (int c = 0; c < matrix[0].length; c++)
    {
        cMax = matrix[0][c];
        for (int r = 0; r < matrix.length; r++)
        {
            if (matrix[r][c] > cMax)
            {
                cMax = matrix[r][c];
            }
        }
        System.out.println("The largest value in column " + c + " is " + cMax);
}
}

/*
* #8 Write a method that checks if the array is a square matrix

* A square matrix has the same number of rows and columns!
*/
public static boolean isSquare(int[][] matrix)
{
    return (matrix.length == matrix[0].length);
}
/*
* #9 Write a method that checks if the array is &quot;row-magic&quot;, which means
* that every row has the same row sum. You will need to change the values of
* the test array in the main method to do this.
*/
public static boolean isRowMagic(int[][] matrix)
{
    int sum = 0;
    for (int i = 0; i < 1; i++)
    {
        for (int j = 0; j < matrix[0].length; j++)
        {
            sum += matrix[i][j];
        }
    }
    int rSum;
    for (int r = 0; r < matrix.length; r++)
    {
        rSum = 0;
        for (int c = 0; c < matrix[r].length; c++)
        {
            rSum += matrix[r][c];
        }
        if (sum != rSum)
        {
            return false;
        }
    }
    return true;
    
}
}