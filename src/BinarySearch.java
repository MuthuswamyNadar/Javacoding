public class BinarySearch {

    public static void main(String[] args) {

        int[] swamy={10,20,30,60,90,120,150,180,200};
        int trgt=180;
        int mysearch= binarySearch(swamy,trgt);
        System.out.println(mysearch);
    }

    static int binarySearch(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;

        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;

            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;

    }


}
