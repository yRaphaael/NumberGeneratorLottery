import java.util.Random;
import java.util.Scanner;
public class AleatoryNumber {
    int i, j, value;
    int[] number = new int[6];

    public void Generate() {
        Random rand = new Random();

                // instanciar e randomizar os números
                for (i = 0; i < number.length; i++) {
                    value = rand.nextInt(60) + 1;

                    // evitar repetição de números
                    for (j = 0; j < number.length; j++) {
                        if (value == number[j] && j != i) {
                            value = rand.nextInt(60) + 1;
                        } else {
                            number[i] = value;
                        }
                    }
                }

                for (i = 0; i < number.length; i++) {
                    for (j = i + 1; j < number.length; j++) {
                        if (number[i] > number[j]) {
                            value = number[i];
                            number[i] = number[j];
                            number[j] = value;
                        }
                    }
                }

                for (i = 0; i < number.length; i++) {
                    System.out.println(number[i] + "  ");
                }
    }
}
