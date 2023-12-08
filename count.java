public class count 
{
    public static void main(String[] args) 
     {
         int arr[]={5,9,5,7,3,9,8,2,3,9,4,7,4};
         System.out.print("Original Array: ");
         for(int i=0; i<arr.length; i++)
         {
            System.out.print(arr[i]+" ");
         }
         System.out.println();
         sort_arr(arr);
         System.out.print
         ("Sorted Array: ");
         for(int i=0; i<arr.length; i++)
         {
            System.out.print(arr[i]+" ");
         }
      }
     static void sort_arr(int[] arr)
     {
         int min=arr[0];
         int max=arr[0];
         for(int i=0; i<arr.length; i++)
         {
            if(arr[i]<min)
            {
                min=arr[i];
            }
         }
         for(int i=0; i<arr.length; i++)
         {
            if(arr[i]>max)
            {
                max=arr[i];
            }
         }

         // frequency
         int farr[]=new int[max-min+1];
         for(int i=0; i<arr.length; i++)
         {

             farr[(arr[i]-min)]+=1;
         }

         // prefixsum
         for(int i=1; i<farr.length; i++)
         {
            farr[i]=farr[i]+farr[i-1];
         }
         int n=arr.length;
         int[] ans=new int[n];
         
         for(int i=n-1; i>=0; i--)
         {
            int ele=arr[i];
            int pos=farr[ele-min];
            ans[pos-1]=ele;
            farr[ele-min]--;
         }
         for(int i=0; i<n; i++)
         {
            arr[i]=ans[i];
         }
      }
}
