public class CeilingFunction {
    public static void main(String[] args) {
        int array[]={10,30,50,70,90,100,120,140};
        int target=102;
        int myans=celiing(array,target);
        System.out.println("the celiing is "+myans);
    }
    public static int celiing(int arr[],int target)
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
        return start;
    }
}
