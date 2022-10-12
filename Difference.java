public class Difference {

    public int sumwintoutoutSmallest(int[] array) {
        int sum = 0;

        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minimum > array[i]) {
                minimum = array[i];
            }
            sum = sum + array[i];


        }

        return sum - minimum;
    }
}


