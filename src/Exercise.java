public class Exercise {

    public static int Calculate(int number1, int number2){

          int [][] Array = new int[number1 + 1][number2 + 1];

            for (int i = 0; i <= number1; i++) {
                for (int j = 0; j <= Math.min(i, number2); j++) {

                    if (j == 0 || j == i) {
                        Array[i][j] = 1;
                    } else {
                        Array[i][j] = Array[i - 1][j - 1] + Array[i - 1][j];
                    }

                }
            }

            return Array[number1][number2] * Array[number1][number2 - 1];
    }

    static int findNN( int number1, int number2)
        {
            return (Calculate(number1, number2)) / number1;
        }
}
