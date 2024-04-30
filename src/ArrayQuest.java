import java.util.Arrays;

public class ArrayQuest {
    public static void main(String[] args) {

        int [] swamy={10,30,22,33,44,66,100};
       // System.out.println(Arrays.toString(swamy));
        swap(swamy,2,5);
       // System.out.println(Arrays.toString(swamy));

        int lin=linearserach(swamy,448);
        System.out.println(lin);
    }

    static int linearserach(int arr[],int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int i=0;i<arr.length;i++)
        {
            int element=arr[i];
            if(element==target)
            {
                return i;
            }
        }

        return -1;
    }

    static void swap(int myarr[],int index1,int index2)
    {
        int temp=myarr[index1];
        myarr[index1]=myarr[index2];
        myarr[index2]=temp;
    }



}
