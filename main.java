import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] favorite_num = {5, 14, 7, 12};
        System.out.println(favorite_num);
        System.out.println(favorite_num.length);
        System.out.println(Arrays.toString(favorite_num));
        System.out.println(Arrays.binarySearch(favorite_num, 14));
        int[] random_numbers = new int[7];
        System.out.println(Arrays.toString(random_numbers)); 
        Arrays.fill(random_numbers, 7);
        System.out.println(Arrays.toString(random_numbers));
    }
}
