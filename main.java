import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        String[] arr = new String[5];
        arr[0] = "hello";
        arr[1] = "World";
        arr[2] = "hello";
        arr[3] = "!";
        arr[4] = "World";
        Arrays.sort(arr);

        String[] uniqArr = new String[arr.length];
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] == arr[i + 1]) {
                uniqArr[i + 1] = arr[i + 1];
            } else {
                uniqArr[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(uniqArr));

        int countNull = 0;
        for (int i = 0; i < uniqArr.length; i++) {
            if (uniqArr[i] == null) {
                countNull++;
            }
        }

        String[] finalArr = new String[uniqArr.length - countNull];
        for (int i = 0, j = 0; i < uniqArr.length; i++) {
            if (uniqArr[i] != null) {
                finalArr[j] = uniqArr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(finalArr));



    }
}



