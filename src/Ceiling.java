public class Ceiling {

    public static void main(String[] args) {
        int myarr[]={10,20,30,40,50,60,80};
        int target=55;
        int sal=ceil(myarr,target);
        System.out.println("the ceiling "+sal);
    }

    static int ceil(int array[],int target)
    {
        int start=0;
        int end=array.length-1;

        while (start<=end)
        {
            int mid=start+(end-start)/2;

            if(target<array[mid])
            {
                end=mid-1;
            }
            else if(target>array[mid])
            {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}
