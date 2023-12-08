public class radix_sort {
    public static void main(String[] args) {
        int arr[]={514,392,479,1572};
        System.out.print("Original array: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        radix(arr);
        System.out.print("Sorted array: ");
        for(int i=0; i<arr.length; i++)
        {
           System.out.print(arr[i]+" ");
        }
    }
    static void radix(int[] arr)
    {
       int min=arr[0];
       int max=arr[0];

       for(int i=0; i<arr.length; i++)
       {
        if(arr[i]>max)
        {
            max=arr[i];
        }
       }
       

       for(int i=0; i<arr.length; i++)
       {
        if(arr[i]<min)
        {
            min=arr[i];
        }
       }
    }
}
