package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class NumbersToLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số:");
        int number = Integer.parseInt(sc.nextLine());
        String str = "";
        int hundreds;
        int numberDozen;
        int ones;
        if (number < 10 && number >= 0) {
            switch (number) {
                case 0:
                    str += "Zero ";
                    break;
                case 1:
                    str += "One ";
                    break;
                case 2:
                    str += "Two ";
                    break;
                case 3:
                    str += "Tree ";
                    break;
                case 4:
                    str += "Four ";
                    break;
                case 5:
                    str += "Five ";
                    break;
                case 6:
                    str += "Six ";
                    break;
                case 7:
                    str += "Seven ";
                    break;
                case 8:
                    str += "Eight ";
                    break;
                case 9:
                    str += "Nine ";
                    break;
                default:
                    break;
            }
        } else if (number < 20) {
            switch (number) {
                case 10:
                    str += "Ten ";
                    break;
                case 11:
                    str += "Eleven ";
                    break;
                case 12:
                    str += "Twelfth ";
                    break;
                case 13:
                    str += "Thirteen ";
                    break;
                case 14:
                    str += "Fourteen";
                    break;
                case 15:
                    str += "Fifteen ";
                    break;
                case 16:
                    str += "Sixteen ";
                    break;
                case 17:
                    str += "Seventeen ";
                    break;
                case 18:
                    str += "Eighteen ";
                    break;
                case 19:
                    str += "Nineteen ";
                    break;
                default:
                    break;
            }
        } else if (number < 100) {
            numberDozen = number / 10;
            switch (numberDozen) {
                case 2:
                    str += "Twenty ";
                    break;
                case 3:
                    str += "Thirty ";
                    break;
                case 4:
                    str += "Forty ";
                    break;
                case 5:
                    str += "Fifty ";
                    break;
                case 6:
                    str += "Sixty ";
                    break;
                case 7:
                    str += "Seventy ";
                    break;
                case 8:
                    str += "Eighty";
                    break;
                case 9:
                    str += "Ninety ";
                    break;
                default:
                    break;
            }
            ones = number - numberDozen * 10;
            switch (ones) {
                case 1:
                    str += "one";
                    break;
                case 2:
                    str += "two";
                    break;
                case 3:
                    str += "three";
                    break;
                case 4:
                    str += "four";
                    break;
                case 5:
                    str += "five";
                    break;
                case 6:
                    str += "six";
                    break;
                case 7:
                    str += "seven";
                    break;
                case 8:
                    str += "eight";
                    break;
                case 9:
                    str += "nine";
                    break;
                default:
                    break;
            }
        } else if (number < 1000) {
            hundreds = number / 100;
            switch (hundreds) {
                case 1:
                    str += "One hundred ";
                    break;
                case 2:
                    str += "Two hundred ";
                    break;
                case 3:
                    str += "Three hundred ";
                    break;
                case 4:
                    str += "Four hundred ";
                    break;
                case 5:
                    str += "Five hundred ";
                    break;
                case 6:
                    str += "Six hundred ";
                    break;
                case 7:
                    str += "Seven hundred ";
                    break;
                case 8:
                    str += "Eight hundred ";
                    break;
                case 9:
                    str += "Nine hundred ";
                    break;
                default:
                    break;
            }
            numberDozen = number - hundreds * 100;
            int ten = numberDozen / 10;
            ones = numberDozen - ten * 10;
            if (ten != 1) {
                switch (ten) {
                    case 2:
                        str += "and twenty ";
                        break;
                    case 3:
                        str += "and thirty ";
                        break;
                    case 4:
                        str += "and forty ";
                        break;
                    case 5:
                        str += "and fifty ";
                        break;
                    case 6:
                        str += "and sixty ";
                        break;
                    case 7:
                        str += "and seventy ";
                        break;
                    case 8:
                        str += "and eighty ";
                        break;
                    case 9:
                        str += "and ninety ";
                        break;
                    default:
                        break;
                }
                switch (ones) {
                    case 1:
                        str += "one ";
                        break;
                    case 2:
                        str += "two ";
                        break;
                    case 3:
                        str += "three";
                        break;
                    case 4:
                        str += "four";
                        break;
                    case 5:
                        str += "five";
                        break;
                    case 6:
                        str += "six";
                        break;
                    case 7:
                        str += "seven";
                        break;
                    case 8:
                        str += "eight";
                        break;
                    case 9:
                        str += "nine";
                        break;
                    default:
                        break;
                }
            } else {
                switch (ones) {
                    case 0:
                        str += "and ten ";
                        break;
                    case 1:
                        str += "and eleven ";
                        break;
                    case 2:
                        str += "and twelfth ";
                        break;
                    case 3:
                        str += "and thirteen ";
                        break;
                    case 4:
                        str += "and fourteen";
                        break;
                    case 5:
                        str += "and fifteen ";
                        break;
                    case 6:
                        str += "and sixteen ";
                        break;
                    case 7:
                        str += "and seventeen ";
                        break;
                    case 8:
                        str += "and eighteen ";
                        break;
                    case 9:
                        str += "and nineteen ";
                        break;
                    default:
                        break;
                }
            }
        } else {
            str += "Out of ability!";
        }
        System.out.println(str);
    }
}
