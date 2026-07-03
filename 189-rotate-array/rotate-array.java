class Solution {

    // helper method to reverse part of the array
    public static void reverse(int[] a, int i, int j) {
        int li = i;   // left index
        int ri = j;   // right index

        while (li < ri) {
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;

            li++;
            ri--;
        }
    }

    // rotate method
    public static void rotate(int[] a, int k) {
        k = k % a.length;  // handle when k > array length
        if (k < 0) {
            k = k + a.length; // handle negative rotation
        }

        // part 1
        reverse(a, 0, a.length - k - 1);

        // part 2
        reverse(a, a.length - k, a.length - 1);

        // all
        reverse(a, 0, a.length - 1);
    }

    // test main
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(arr, k);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
