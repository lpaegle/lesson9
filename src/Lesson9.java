public class Lesson9 {

    public static void main(String[] args) {

        int[] firstArray = new int[3];
        firstArray[0] = 55;
        firstArray[1] = 1900;
        firstArray[2] = 1;

        System.out.println("First element: " + firstArray[0]);

        //Shorthand
        int[] temperatures = {33, 34, 31, 30, 29, 28, 36};
        System.out.println("Friday temp. is: " + temperatures[4]);
        System.out.println("Length of temp is: " + temperatures.length);
        //Last element of array
        System.out.println("Last element is: " + temperatures[temperatures.length - 1]);

        int[] weatherForecast = new int[7];
        weatherForecast[0] = 29;
        weatherForecast[1] = 31;
        weatherForecast[2] = 30;
        weatherForecast[3] = 30;
//        int[] weatherForecast = {29, 31, 30};
        weatherForecast[4] = 37;
        weatherForecast[5] = 30;
        weatherForecast[6] = 19;

        //average temperature of the week
        double averageTemp = (weatherForecast[0] + weatherForecast[1] + weatherForecast[2] + weatherForecast[3] + weatherForecast[4] + weatherForecast[5] + weatherForecast[6]) /7d;
        System.out.println("Average temp is " + averageTemp);


        //LOOPS

        for(int i = 2; i < 10; i++){
            System.out.println("Hello, this is a cool loop. " + i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("New iteration: " + i);
        }
        //Test task 1
        for (int i = 85; i < 95; i++) {
            System.out.println("First task: " + i);
        }
        //Test task 2
        for (int i = 53; i > -47; i--) {
            System.out.println("Second task: " + i);
        }
        //Test task 3
        //Counts how many elements are printed
        int counter = 0;
        for (int i = 59; i < 1005; i++) {
            System.out.println("Third task #" + counter);
            counter++;
        }

        //Shows the time and how many times clock alarms.
        counter = 1;
        for(int currentTime = 8; currentTime < 12; currentTime++){
            System.out.println("It is " + currentTime + " o'clock.");
            System.out.println("This is the " + counter + " time the clock alarmed.");
            counter++;
        }
        System.out.println("----------------");

        //////////  Arrays + Loops

        int[] grades = {8,9,7,8,9,9,5,8,9,1,2,9,9,10,7,8};

        int gradeSum = 0;
        for (int i = 0; i < grades.length; i++) {
            gradeSum += grades[i];
        }
        System.out.println("Sum of grades are " + gradeSum);

        double averageGrade = gradeSum / (double)grades.length;
        System.out.println("Average grade is " + averageGrade);


        ////Examples
        boolean[] arrayOfBooleans = {true, false, false, true};
        String[] arrayOfStrings = {"Message 1", "Message 2", "Message3"};
        double monthlySalary[] = {1000, 1100, 1200d, 1300d};
        boolean[] covidTest = {false, false, true, false};
        String[] students = {"Artjoms", "Laura", "Tatjana"};

        /// Coffee example
        for (int i = 0; i < 100; i++) {
            if (i % 7 == 0){
                System.out.println("This coffee is for FREE!");
            }else{
                System.out.println("You need to pay for this coffee still, #" + i);
            }
        }

    }
}
