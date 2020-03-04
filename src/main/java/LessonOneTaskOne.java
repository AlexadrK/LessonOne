public class LessonOneTaskOne {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] array = new int[20];
        //Random random = new Random();
        for (int i=0; i < array.length; i++){
            array[i] = (int)(Math.random()*20 +3);
            //  array[i] = random.nextInt(31) -0;
            //  array[i] = random.nextInt(31);
            if (min > array[i]) min = array[i];
            if (max < array[i]) max = array[i];
            System.out.print(array[i]+"\t");
        }
        int sum = 0;
        for (int num:array){
            sum = sum + num;

        }
        System.out.println();
        System.out.println("Sum of array elements " + sum);
        System.out.println("Number of array elements " + array.length);
        System.out.println("Average " + sum/array.length);
        System.out.print("разница между средним арифметическим и значением минимального элемента ");
        System.out.print(sum/array.length-min);

        System.out.println();
        System.out.println("The minimum value of the array " + min);
        System.out.println("The maximum value of the array " + max);

    }
}