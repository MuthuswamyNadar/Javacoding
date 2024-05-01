public class SmallestCharacter {
    public static void main(String[] args) {
        int myarr[]={10,20,30,40,60,90,120};
        int target=90;
        int mns=binaryalgo(myarr,target);
        System.out.println(mns);

    }
    public static int binaryalgo(int array[],int target)
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
        return -1;
    }
}
