public class Infinite {
    public static void main(String[] args) {
        int []array={3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target=170;
        int my=serach(array,target);
        System.out.println(my);
    }
    public static int serach(int array[],int target)
    {
        int start=0;
        int end=1;
        while (target>array[end])
        {
            int temp=end+1;
            end=start+(end-start+1)*2;
            start=temp;
        }
        return binarysearch(array,target,start,end);
    }

    public static int binarysearch(int array[],int target,int start, int end)
    {
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<array[mid])
            {
                end=mid-1;
            } else if (target>array[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}

