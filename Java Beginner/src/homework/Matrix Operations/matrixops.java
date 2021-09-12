
public class matrixops {

    public static void main(String[] args) {
        // satır ve sütun, sonra rastgale sayı , yön, step sayısı 

        if (isValid(args)) {
// isValid metotu args yani argümanların kontrol ediyor (başta girileen değerler)
            matrixOps(args);
        } else {
            System.exit(1);
        }

    }

    public static boolean isValid(String[] args) {
//       girdiğimiz argümanların sayısını kontrol ettiriyoruz
        if (args.length != 5) {
            System.out.println("Usage: matrixops.exe 5 5 -1 100 2");
            //bu formattta yazılmasını istiyoruz
        }
        try {
            Integer.parseInt(args[0]);
            Integer.parseInt(args[1]);
            Integer.parseInt(args[2]);
            Integer.parseInt(args[3]);
            Integer.parseInt(args[4]);

        } catch (Exception e) {
            System.out.println("Usage: matrixops.exe 5 5 -1 100 2");
            return false;
        }
        if (!(Integer.parseInt(args[2]) == 1 || Integer.parseInt(args[2]) == -1)) {
            System.out.println("Direction must be -1 or 1");
            return false;
        }
        return true;
    }

    public static void matrixOps(String[] args) {
        int row = Integer.parseInt(args[0]);
        int colomn = Integer.parseInt(args[1]);
        int direction = Integer.parseInt(args[2]);
        int randomNum = Integer.parseInt(args[3]);
        int stepNum = Integer.parseInt(args[4]);

        int[][] matrix = new int[row][colomn];
        getRandomMatrix(randomNum, matrix);
        System.out.println("Matrix before: ");
        print(matrix);
        System.out.println("---------------------\nMatrix after: \n");
        turnMatrix(matrix, direction, stepNum);
        print(matrix);
    }

    public static void getRandomMatrix(int randomNum, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * randomNum);
            }
        }
    }

    public static void turnMatrix(int[][] matrix, int direction, int stepNum) {
        
        //Köşelerdeki tüm sayıları bir tek diziye atıyoruz..
        // köşelerdeki eleman sayısı 2. sütun -4
        //matrix.length= satır, matrşx[].length=sütun
        //
        
        int numberOfElements = matrix.length * 2 + matrix[0].length * 2 - 4;
        if (stepNum >= numberOfElements) {
            stepNum %= numberOfElements;
        }
        //listOfElements köşelerdki elemanlar 
        // clocwise saat yönü, counterclockwise tersi yönde

        int[] listOfElements = getElements(matrix);
        if (direction == -1) {
            placeElementsClockwise(matrix, listOfElements, stepNum);
        } else {
            placeElementsCounterClockwise(matrix, listOfElements, stepNum);

        }
    }

    public static void placeElementsCounterClockwise(int[][] matrix, int[] listOfElements, int stepNum) {
        listOfElements = newList(listOfElements, stepNum);
        placeElementsToMatrix(matrix, listOfElements);

    }

    public static void placeElementsClockwise(int[][] matrix, int[] kosedekiSayilar, int donmeSayisi) {
        kosedekiSayilar = newList(kosedekiSayilar, kosedekiSayilar.length - donmeSayisi);
        placeElementsToMatrix(matrix, kosedekiSayilar);

    }

    public static int[] getElements(int[][] matrix) {
        int[] elements = new int[matrix.length * 2 + matrix[0].length * 2 - 4];
        int index = 0;
 // birinci for birinci satırı
        for (int i = 0; i < matrix[0].length; i++) {
            elements[index++] = matrix[0][i];
        }
// , ikinci for son sütünu alıyor
        for (int i = 0; i < matrix.length - 1; i++) {
            elements[index++] = matrix[i + 1][matrix[0].length - 1];
        }

        for (int i = matrix[0].length - 2; 0 <= i; i--) {
            elements[index++] = matrix[matrix.length - 1][i];
        }

        for (int i = 0; i < matrix.length - 2; i++) {
            elements[index++] = matrix[matrix.length - 2 - i][0];
        }
        return elements;
    }

    public static int[] newList(int[] list, int stepNum) {
        int[] newList = new int[list.length];
        int index = 0;

        for (int i = stepNum; i < list.length; i++) {
            newList[index++] = list[i];
        }

        for (int i = 0; i < stepNum; i++) {
            newList[index++] = list[i];
        }
        return newList;
    }

    public static void placeElementsToMatrix(int[][] matrix, int[] elements) {
        int index = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            matrix[0][i] = elements[index++];
        }

        for (int i = 0; i < matrix.length - 1; i++) {
            matrix[i + 1][matrix[0].length - 1] = elements[index++];
        }

        for (int i = matrix[0].length - 2; 0 <= i; i--) {
            matrix[matrix.length - 1][i] = elements[index++];
        }

        for (int i = 0; i < matrix.length - 2; i++) {
            matrix[matrix.length - 2 - i][0] = elements[index++];
        }
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
