public class jacked_array {
    public static void main(String[] args){
        int brr[][] = {
                {1,2},
                {2,3,4,9,8},
                {3,4,11,5,2,6,7},
                {4,5}
        };
        int rowLength = brr.length;
        for(int i=0;i<rowLength;i++){
            int colLength = brr[i].length;
            for(int j=0;j<colLength;j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
