import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr={3, 3, 87, 56,
                1, 87, 3, 2 } ;
        int[] new_arr=new int[arr.length];
        int size=0;
        for (int i = 0; i < arr.length; i++) {
            boolean exits=false;
            for (int j = 0; j <size ; j++) {
                if (arr[i]==new_arr[j]) {
                    exits=true;
                    break;
                }
            }
            if (!exits) {
                new_arr[size]=arr[i];
                size++;

            }

        }
        int[] uniquie_arr=Arrays.copyOf(new_arr, size);
        System.out.println("Old array  : " + Arrays.toString(arr));
        System.out.println("New array  : " + Arrays.toString(uniquie_arr));
            
        }









    }



