public class MinAndMaxNumber {

    public static void main(String[] args) {

        int[][] arr = {{3, 4, 5}, {7, 6, 2}, {19, 4, 0}};
        int minNum = arr[0][0];
        int minClm = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] < minNum) {

                    minNum = arr[i][j];
                    minClm = j;
                }

            }


        }
        int k = 0;
        int maxClm = arr[0][minClm];
        while (k < 3) {

            if (arr[k][minClm] > maxClm) {
                maxClm = arr[k][minClm];

            }
            k++;
        }

        System.out.println("minimum number " + minNum + "\n" + "maximun munber " + maxClm);
    }
}
