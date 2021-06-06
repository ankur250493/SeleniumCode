public class MinMunArray {
    public static void  main(String [] args) {

        int [][] arr = {{3,4,5},{7,6,2},{19,4,0}};
int minNum = arr[0][0];
        for(int i=0; i<3;i++){
            for (int j=0 ;j<3;j++){
                if(arr[i][j]<minNum){

                minNum=arr[i][j];
                }

            }


        }
        System.out.println(minNum);
    }
}
