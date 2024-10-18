import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class practical5dop {
    // Ракітенко Артем КН-21
    // Доп.Завдання
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Введення кількості чисел
        System.out.print("Кількість чисел: ");
        int numberOfElements = scanner.nextInt();

        // Введення діапазону чисел
        System.out.print("Мінімальне значення діапазону: ");
        double minRange = scanner.nextDouble();
        System.out.print("Максимальне значення діапазону: ");
        double maxRange = scanner.nextDouble();


        // Створення списку і обчислення суми та добутку
        ArrayList<Double> array = new ArrayList<>();
        double sum = 0, product = 1;

        for (int i = 0; i < numberOfElements; ++i) {
            double value = minRange + (maxRange - minRange) * random.nextDouble();
            array.add(value);
            sum += value;
            product *= value;
        }

        // Використання циклу з елементами списку
        for (int i = 0; i < array.size(); ++i) {
            System.out.printf("Елемент %d: %.2f\n", i + 1, array.get(i));
        }

        // Обчислення середнього арифметичного і геометричного
        double arithmeticMean = sum / numberOfElements;
        double geometricMean = Math.pow(product, 1.0 / numberOfElements);

        // Виведення результатів
        System.out.printf("Середнє арифметичне: %.2f\n", arithmeticMean);
        System.out.printf("Середнє геометричне: %.2f\n", geometricMean);

        scanner.close();
    }
}
