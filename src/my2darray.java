public class my2darray {
    public static void main(String[] args) {

        int [][] arr = {
                {1,3,4,6},
                {2,3,9},
                {7,9}
        };

        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }



    }
}
