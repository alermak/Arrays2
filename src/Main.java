public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int total = 0;
        int maxSpend = 0;
        int minSpend = 200000;
        for (int y = 0; y < arr.length; y++) {
            total = total + arr[y];
        }
        System.out.println("Сумма трат за месяц составила: " + total + " Рублей.");
        for (int k : arr) {
            if (k < minSpend)
                minSpend = k;
        }
        for (int j : arr) {
            if (j > maxSpend)
                maxSpend = j;
        }
        int meanValue =  total / 30;
        System.out.println("Минимальная сумма трат за день составила " + minSpend + " рублей. Максимальная сумма трат за день составила " + maxSpend + " рублей.");
        System.out.println("Средняя сумма трат за месяц составила " + meanValue + " рублей.");
        //
        char[] revFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = revFullName.length - 1; i >= 0 ; i--) {
            System.out.print(revFullName[i]);
        }




    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }




}
