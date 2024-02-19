package academy.devdojomaratonajava.introducao;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        // 1,2,3,4, Meses
        // 31, 24, 20, 23 dias

        int [][] dias = new int[4][4];

        dias[0][0] = 31;
        dias[0][1] = 24;
        dias[0][2] = 20;
        dias[0][3] = 23;


        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                if(dias[i][j] != 0) {
                    System.out.println(dias[i][j]);
                }
            }
        }

        // ForEach
        for(int[] arrBase: dias) {
            for(int num: arrBase) {
                if(num != 0) {
                    System.out.println(num);
                }
            }
        }

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[]{1,23,45};
        arrayInt[1] = new int[]{23,24,47,57};
        arrayInt[2] = new int[]{234,546,23,78,94};

        for(int[] arrayBase: arrayInt) {
            System.out.println("\n------");
            for(int num: arrayBase) {
                System.out.print(num + ",");
            }
        }

        int[][] arrayInt2 = {{2},{12,123,12},{34,234,234,234},{23,234,234}};

        for(int[] arrayBase: arrayInt2) {
            System.out.println("\n------");
            for(int num: arrayBase) {
                System.out.print(num + ",");
            }
        }
    }
}
