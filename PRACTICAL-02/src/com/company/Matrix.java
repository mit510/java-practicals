package com.company;

import java.util.Scanner;

public class Matrix {
    int row,col;
    float mat[][];
    Scanner in=new Scanner(System.in);


//    constructor with passing parameter as 2d array
    Matrix(float a[][]){
        this.row=a.length;
        this.col=a[0].length;
        mat=a;
    }


//without any parameter constructor
    Matrix(){

        System.out.println("Enter row and cols of matrix");
        row=in.nextInt();
        col=in.nextInt();
        mat=new float[row][col];
    }

//    constructor with two arguments
    Matrix(int row, int col){
        this.row=row;
        this.col=col;
        mat=new float[row][col];
    }

    void readMatrix()
    {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.println("Enter elm for position"+"["+i+j+"]");
                this.mat[i][j]=in.nextFloat();
            }
        }
    }

    float [][] transpose( )
    {
        float transpose[][]=new float[this.row][this.col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[i][j]=mat[j][i];
            }
        }
        return transpose;
    }

    //multiply two matrices and return result
    float [][] matrixMultiplication(Matrix second )
    {
        if (second.row != this.col) {

            System.out.println(
                    "\nMultiplication Not Possible");
            return new float[-1][-1];
        }

        float C[][] = new float[this.row][this.col];

        // Multiply the two matrices
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < second.col; j++) {
                for (int k = 0; k < second.row; k++)
                    C[i][j] += this.mat[i][k] * second.mat[k][j];
            }
        }
        return  C;
    }

//    //display content of argument array
    static void displayMatrix(float [][]a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
    void displayMatrix(){
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.mat[i].length; j++) {
                System.out.print(this.mat[i][j]+" ");
            }
            System.out.println();
        }

    }

    // return maximum element of first array
    float maximum_of_array() {
        float max=this.mat[0][0];
        for (int i = 0; i <this.mat.length; i++) {
            for (int j = 0; j < this.mat[i].length; j++) {
                if(this.mat[i][j]>max)
                    max=this.mat[i][j];
            }
        }
        return  max;
        }


    // return average of first array
    float average_of_array(){
    float sum=0;
    int count=0;
     for (int i = 0; i <this.mat.length; i++) {
        for (int j = 0; j < this.mat[i].length; j++) {
            sum+=this.mat[i][j];
            count++;
        }
    }
     return sum/count;
    }



    public static void main(String[] args) {

        float [][]arr={{1,2,3},
                {4,5,6},
                {7,8,9}};
        float [][]transpose;
        float [][]mul;
       Matrix m1=new Matrix();
       Matrix m2=new Matrix(3,3);
       Matrix m3=new Matrix(arr);

        System.out.println("Manipulate first matrix");
        m1.readMatrix();
        m1.displayMatrix();
        transpose=m1.transpose();
        System.out.println("\ntransposed matrix");
        displayMatrix(transpose);

        System.out.println("\nManipulate second matrix");
        m2.readMatrix();
        m2.displayMatrix();

        System.out.println("\nManipulate third matrix");
        m3.displayMatrix();

        System.out.println("\nmultiplication of matrix 2 and matrix 3");
        mul=m2.matrixMultiplication(m3);
        displayMatrix(mul);

        System.out.println("\nMaximum element in the matrix is");
        System.out.println(m1.maximum_of_array());

        System.out.println("\nAverage of the matrix is");
        System.out.println(m1.average_of_array());
    }
}
