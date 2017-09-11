import java.util.Scanner;

/**
 * @author Natasya Virgichalia
 * Date 09/10/2017
 * CSC-201
 * Assignment 6.37
 * Professor Tanes Kanchanawanchai
 */
public class formatInt {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = keyboard.nextInt();
        System.out.println("Enter the width");
        int wid = keyboard.nextInt();
        System.out.print(format(num, wid));
    }

    /**
     *
     * @param number numbers entered by the user
     * @param width width of the numbers entered by the user
     * @return the number with the width entered
     */
    public static String format(int number, int width) {
        String nSize = number + "";
        if(nSize.length() < width) {
            for(int i = width-nSize.length(); i>0; i--) {
                nSize = 0+nSize;
            }
        }
        return nSize;
    }
}
