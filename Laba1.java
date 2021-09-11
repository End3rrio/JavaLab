public class Laba1 {
    private static int[] array = new int[10];
    private static int count;


    public static void main(String[] args) {


        for (int i = 0; i < 10; i++)
            array[i] = i;

        for (int i = 0; i < 10; i++)
            count += array[i];
        System.out.println(count);


        count = 0;
        int i = 0;

        while (i < 10) {
            count += array[i];
            i++;
        }
        System.out.println(count);

        count = 0;
        i = 0;

        do {
            count += array[i];
            i++;
        } while (i < 10);
        System.out.println(count);



    }
}
