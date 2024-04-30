public class BinaryserachC {
    public static void main(String[] args) {
        int swamy[]={-1,0,1,3,4,6,8,9};
        int target=0;
        int ser=search(swamy,target);
        System.out.println(ser);
    }
    static int search(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;

        while (start<=end)
        {
            int mid=start+(end-start)/2;

            if(target<arr[mid])
            {
                end=mid-1;
            }else if(target>arr[mid])
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
