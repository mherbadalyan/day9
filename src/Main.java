import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2 String and program will compare them.");
        compareAndPrintInputTwoStrings(scanner.nextLine(),scanner.nextLine());

        System.out.println("Enter your name and program will compare them with name Mher.");
        compareAndPrintInputOneStrings("Mher",scanner.nextLine());

        System.out.println("Enter number and program print info about it.");
        printNumInfo(scanner.nextInt());

        System.out.println("Enter two number and program print max of them");
        compareTwoNumAndPrintMax(scanner.nextInt(),scanner.nextInt());

        System.out.println("Enter number and program print it absolute value");
        printAbsoluteValue(scanner.nextInt());

        System.out.println("Enter string and program check it");
        checkString(scanner.nextLine());

        System.out.println("Enter 3 number and program print max of them");
        compareThreeNumsAndPrintMax(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());

        System.out.println("What is the correct way to declare a variable to store an integer value in Java?\n" +
                "   a. int 1x=10;\n" +
                "   b. int x=10;\n" +
                "   c. float x=10.0f;\n" +
                "   d. string x=\"10\";\n" +
                "   Enter your choice: \n");
        checkAndPrintAnswer(scanner.nextLine());

        System.out.println("Enter letter and program print is it Vowel or Consonant");
        checkAndPrintIsVowel(scanner.nextLine());

        System.out.println("Print number from 1 to 9");
        printPressedNumber(scanner.nextInt());

        System.out.println("Enter number and program print it add or even");
        printEvenOrOdd(scanner.nextInt());

        System.out.println("Enter number1");
        int num1 = scanner.nextInt();
        System.out.println("Enter number1");
        int num2 = scanner.nextInt();
        System.out.println("Enter operation \n'+'\n'-'\n'*'\n'/'");
        scanner.nextLine();
        calculator(num1,num2,scanner.nextLine());

        System.out.println("Enter number from 1 to 7 and program print weekday");
        printWeekday(scanner.nextInt());

        System.out.println("Enter your scores to know your grade." +
                "\n1.quiz.\n2.mid-term.\n3.final score");
        printGrade(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());

    }

    /**
     * calculating and print grade
     * @param quiz
     * @param mid_term
     * @param final_score
     */
    private static void printGrade(int quiz, int mid_term, int final_score) {
        int average = (quiz+mid_term+final_score)/3;
        if (average >=40 ){
            if (average >= 60){
                if (average >= 80){
                    System.out.println("Grade - A");
                }else System.out.println("Grade - B");
            }else System.out.println("Grade - C");
        }else System.out.println("Grade - F");
    }

    /**
     * Print day of week
     * @param num
     */
    private static void printWeekday(int num) {
        switch (num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
                default:
                    System.out.println("Wrong number");
        }
    }

    /**
     * doing arithmetic operations with input numbers
     * @param num1
     * @param num2
     * @param operand
     */
    private static void calculator(int num1, int num2, String operand) {
        switch (operand) {
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                if (num2 == 0) System.out.println("Can't devide by zero");
                else System.out.println(num1/num2);
                break;
                default:
                    System.out.println("Wrong operation");
                    break;
        }
    }

    private static void printEvenOrOdd(int num) {
        switch ((num & 1) == 1 ? 1 : 0) {
            case 1:
                System.out.println("Number is odd");
                break;
            case 0:
                System.out.println("Number is even");
                break;
        }
    }

    /**
     * check and print if number from 1 to 9
     * @param num
     */
    private static void printPressedNumber(int num) {
              if (num >= 1 && num <=9 ) System.out.println(num);
              else System.out.println("Not allowed");
        }


    /**
     * check and print is letter Vowel
     * @param str
     */
    private static void checkAndPrintIsVowel(String str) {
        switch (str.toLowerCase().charAt(0)){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
                default:
                    System.out.println("Consonant");
                    break;
        }
    }

    /**
     * check and print answer of question
     * @param str
     */
    private static void checkAndPrintAnswer(String str) {
        switch (str){
            case "c" :
                System.out.println("Congratulations!!!");
                break;

                default:
                    System.out.println("Wrong answer");
                    break;

        }
    }

    /**
     * find and print max of three numbers
     * @param num1
     * @param num2
     * @param num3
     */
    private static void compareThreeNumsAndPrintMax(int num1, int num2, int num3) {
        System.out.println(num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3) );
    }

    /**
     * check if the given String
     * -  is a null so print -1
     * -  if given String is  “ ” print  0
     * -  else print 1
     * @param inputString
     */
    private static void checkString(String inputString) {
        System.out.println(inputString == null ? -1 : ((inputString.equals("")) ? 0 : 1 ));
    }

    /**
     * print absolute value of input num
     * @param inputNum
     */
    private static void printAbsoluteValue(int inputNum) {
        System.out.println(inputNum > 0 ? inputNum : -inputNum);
    }

    /**
     * compare and print max value of input numbers
     * @param num1
     * @param num2
     */
    private static void compareTwoNumAndPrintMax(int num1, int num2) {
        System.out.println(num1 > num2 ? num1 : num2);
    }

    /**
         * if value greater than 0 print positive, else print negative, else if 0 print 0;
         */
    private static void printNumInfo(int inputNum) {
        System.out.println(inputNum == 0 ? "Number is zero" : inputNum > 0 ? "Number is positive" : "Number is negative");
    }

    /**
     * compare two input Strings with == and equals
     * @param str1
     * @param str2
     */
    private static void compareAndPrintInputTwoStrings(String str1, String str2) {
        System.out.println(str1 + " == " + str2 + "  " + (str1 == str2));
        System.out.println(str1 + " equals " + str2 + "  " + (str1.equals(str2)));

    }

    /**
     *  compare one input Strings and one literal with == and equals
     * @param str1
     * @param str2
     */
    private static void compareAndPrintInputOneStrings(String str1, String str2) {
        System.out.println(str1 + " == " + str2 + "  " + (str1 == str2));
        System.out.println(str1 + " equals " + str2 + "  " + (str1.equals(str2)));

    }
}
