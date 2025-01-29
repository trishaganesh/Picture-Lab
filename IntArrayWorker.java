/*
 * Purpose: This is the IntArrayWorker Object class with 3 methods to getCount, getLargest values, and getColTotal.
 *
 * < Trisha Ganesh >
 * < 6/30/2021 >
 *
 * modify this class to include the methods:
 *    getCount
 *    getLargest
 *    getColTotal
 */

public class IntArrayWorker
{
  /** two dimensional matrix */
  private int[][] matrix = null;

  /** set the matrix to the passed one
   * @param theMatrix the one to use
   */
  public void setMatrix(int[][] theMatrix)
  {
    matrix = theMatrix;
  }

  //the total of all integers in a specified column
  public int getColTotal(int numbers) {
    int total = 0;
    for (int row = 0; row <matrix.length; row++) {
      total = total + matrix[row][numbers];
    }
    return total;
  }

  /**
   * Method to return the total
   * @return the total of the values in the array
   */
  public int getTotal()
  {
    int total = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        total = total + matrix[row][col];
      }
    }
    return total;
  }

  /**
   * Method to return the total using a nested for-each loop
   * @return the total of the values in the array
   */
  public int getTotalNested()
  {
    int total = 0;
    for (int[] rowArray : matrix)
    {
      for (int item : rowArray)
      {
        total = total + item;
      }
    }
    return total;
  }

  /* public int: getCount method to return the count of the number of times
  an integer has been passed in the matrix */
  public int getCount(int numbers) {
    //get number of columns
    int numCols = matrix[0].length;
    int numCount = 0;
    //for loop for rows
    for (int row = 0; row < matrix.length; row++)
    {
      //for loop for columns
      for (int col = 0; col < numCols; col++)
      {
        if(matrix[row][col] == numbers)
        {
          numCount++;
        }
      }
    }
    return numCount;
  }

  /**
   * Method to fill with an increasing count
   */
  public void fillCount()
  {
    int numCols = matrix[0].length;
    int count = 1;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < numCols; col++)
      {
        matrix[row][col] = count;
        count++;
      }
    }
  }

  //public int: getLargest returns the largest value in the matrix
  public int getLargest() {
    int numCols = matrix[0].length;
    int maxValue = Integer.MIN_VALUE;
    //for loop for rows
    for (int row = 0; row < matrix.length; row++) {
      //for loop for columns
      for (int col = 0; col < numCols; col++) {
        if(matrix[row][col] > maxValue) {
          maxValue = matrix[row][col];
        }
      }
    }
    return maxValue;
  }

  /**
   * print the values in the array in rows and columns
   */
  public void print()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        System.out.print( matrix[row][col] + " " );
      }
      System.out.println();
    }
    System.out.println();
  }


  /**
   * fill the array with a pattern
   */
  public void fillPattern1()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length;
           col++)
      {
        if (row < col)
          matrix[row][col] = 1;
        else if (row == col)
          matrix[row][col] = 2;
        else
          matrix[row][col] = 3;
      }
    }
  }

}