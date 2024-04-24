public class negative 
{
    public static void main(String[] args)
    {
        int arr[]={1, -1, 3, 2, -7, -5, 11, 6};
        int negativeIndex=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            {
                if(i!=negativeIndex)
                {
                    int temp=arr[i];
                    for(int j=i;j>negativeIndex;j--)
                    {
                        arr[j]=arr[j-1];
                    }

                    arr[negativeIndex]=temp;
                }
                negativeIndex++;
            }
        }
        

        for(int x:arr)    
        {
            System.out.print(x+" ");
        }
    }
    
}
 













// public class negative
//  {
//     public static void main(String[] args) 
//     {
//         int arr[] = {1, -1, 3, 2, -7, -5, 11, 6};

//         int negativeIndex = 0;

//         for (int i = 0; i < arr.length; i++)
//          {
//             if (arr[i] >= 0) 
//             {

                
//                 if (i != negativeIndex) 
//                 {
//                     int temp = arr[i];
//                     for (int j = i; j > negativeIndex; j--)
//                     {
//                         arr[j] = arr[j - 1];
//                     }
//                     arr[negativeIndex] = temp;
//                 }
//                 negativeIndex++;
//             }
//         }

//         for (int x : arr) {
//             System.out.print(x + " ");
//         }
//     }
// }
