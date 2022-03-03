package com.company;
import java.util.Arrays;
class Array{
    int n;
    int data[];
    Array()
    {
        n=10;
        data=new int [n];
    }
    Array(int size)
    {
        n=size;
        data=new int [n];
    }
    Array(int arr[])
    {
        data=arr;
    }
    void Display()
    {
        for(int i=0;i<data.length;i++)
            System.out.print(data[i]+" ");
    }
    void Reverse_an_array()
    {
        for(int i=0;i<data.length/2;i++)
        {
            int temp=data[i];
            data[i]=data[data.length-1-i];
            data[data.length-1-i]=temp;
        }
    }

    int Maximum_of_array()
    {
        int max=data[0];
        for(int i=1;i<data.length;i++)
            if(data[i]>max)
                max=data[i];
        return max;
    }
    float Average_of_array()
    {

        int sum=0;
        for(int i=0;i<data.length;i++)
            sum+=data[i];
        return (float) sum/data.length;
    }
    void sorting()
    {
        Arrays.sort(data);
    }

    int search(int elm)
    {
        int start=0;
        int end=data.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(data[mid]==elm)
                return mid;
            else if(data[mid]<elm)
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }

        public static void main(String[] args) {
            // write your code here
            int arr[]={67,89,10,7,56,34,18,9,45,23,90,23};
            int s=5;
            int elm=32;
            Array obj= new Array();
            Array obj1=new Array(6);
            Array obj2=new Array(arr);
            obj2.Display();
            System.out.println("\n\nreverse array is:");
            obj2.Reverse_an_array();
            obj2.Display();
            System.out.println("\n\nMaximum element in the array is: "+obj2.Maximum_of_array());
            System.out.println("\nAverage of the array is: "+obj2.Average_of_array());
            obj2.sorting();
            System.out.println("\nSorted array is: ");
            obj2.Display();
            System.out.println("\nposition of elm "+elm +" is "+obj2.search(elm));
        }

}


