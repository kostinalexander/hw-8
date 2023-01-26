public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000)+ 100000;
        }
        return arr;
    }

    public static void Task1(){
        System.out.println("Задание1");
        int[] arr = generateRandomArray();
        int summ = 0;
        for( int i=0;i<arr.length; i++ ) {
            summ = arr[i]+ summ;
                System.out.println("Сумма всех трат за месяц = " + summ);

            }
        }


    public static void Task2(){
        System.out.println("Задание2");
        int[] arr = generateRandomArray();
        int max = -1;
        for (int k : arr) {
            System.out.println(k);
            if (k > max) {
                max = k;
            }
        }
System.out.println("Максимальная трата за день= "  +max);
        int min = 3000000;
        for (int j : arr) {
            System.out.println(j);
            if (j < min) {
                min = j;
            }
        }
System.out.println("Минимальная трата за день= "+min);
    }

    public static void Task3(){
        System.out.println("Задание3");
        int[] arr = generateRandomArray();
        double max = 0;
        double sr = 0;
        for( int i=0;i<arr.length; i++ ) {
            System.out.println(arr[i]);
            max = arr[i]+ max;
            sr = max/ arr.length;}

        System.out.println("Среднее число трат за месяц= "+ sr);
    }

    public static void Task4() {
        System.out.println("Задание4");
        char[] reversFullName = {'.', 'n',  'a',  'v',  'I',  ' ',  'v',  'o',  'n',  'a',  'v',  'I'};
        for (int i = reversFullName.length-1; i>=0; i--){
            System.out.print(reversFullName[i]);
        }


    }
}