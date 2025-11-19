public class PartC {
    public static void main(String[] args) {
        int count = 10; // Change to 1000 later
        int sum = 0;

        for (int i = 0; i < count; i++) {
            int num = (int)(Math.random() * 10) + 1; // 1 to 10
            System.out.println(num);
            sum += num;
        }
        double average = (double)sum / count;
        System.out.println("Average value: " + average);
    }
}
