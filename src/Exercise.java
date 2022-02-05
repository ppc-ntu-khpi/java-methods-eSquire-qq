public class Exercise {

    public static void Calculate(){
        int number = 10;
        boolean condition = true;

        for (int counter1 = 2; counter1 <= number; counter1++) {
              for (int counter2 = 2; counter2 < counter1; counter2++) {
                  if (counter1 % counter2 == 0) {
                    condition = false;
                    break;
                  }
         }

         if (condition) {
            System.out.print(counter1 + ",");
         } 
         
         else {
            condition = true;
         }

      }
    }
}