
public class AddNumbers {
    private int[] numbers;

    public AddNumbers(int[] numbers) {
        this.numbers = numbers;


    }

    public int calculateSum() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;

    }

    public static <string> void main(String[] args) {
            int numbers [] = {12,18,56,82,91,27,12};

            AddNumbers add = new AddNumbers(numbers);
            int totalSum = add.calculateSum();
            System.out.println("The sum of the numbers is: " + totalSum);
    }
}