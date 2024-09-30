package Nivel2_1;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Input {
    static Scanner sc = new Scanner(System.in);

    public Input(){
    }

    public static byte readByte(String message) throws InputMismatchException{
        byte num = 0;
       try{
           System.out.println(message);
           num = sc.nextByte();
           return num;
       } catch (InputMismatchException e){
           sc.nextLine();
           throw new InputMismatchException("No, you have to input a byte value");
       }
    }

    public static int readInt(String message) throws InputMismatchException {
        int num = 0;
        try{
            System.out.println(message);
            num = sc.nextInt();
            return num;
        } catch (InputMismatchException e){
            sc.nextLine();
            throw new InputMismatchException("No, you have to input an int value");
        }

    }

    public static float readFloat(String message) throws InputMismatchException{
        float num = 0f;
        try{
            System.out.println(message);
            num = sc.nextFloat();
            return num;
        } catch (InputMismatchException e){
            sc.nextLine();
            throw new InputMismatchException("No, you have to input a float value");
        }

    }

    public static double readDouble(String message) throws InputMismatchException{
        double num = 0d;
        try{
            System.out.println(message);
            num = sc.nextDouble();
            return num;
        } catch(InputMismatchException e){
            sc.nextLine();
            throw new InputMismatchException("No, you have to input a float value");
        }
    }

    public static char readChar(String message) throws Exception{
        char let = ' ';
        try{
            System.out.println(message);
            let = sc.next().charAt(0);
               return let;
        } catch (Exception e){
            throw new Exception("No, you have to input a char value");
        }
    }

    public static String readString (String message) throws Exception{
        String let = "";
        boolean NumberTest = false;
        try{
            System.out.println(message);
            let = sc.next();
            try{
                int test = Integer.parseInt(let);

            }catch (NumberFormatException e){
                NumberTest = true;

            }
        if (NumberTest == false){
            return let;
        } else {
            throw new Exception("No, you have to input a String value");
        }
        } catch (Exception e) {
            throw new Exception("No, you have to input a String value");
        }
    }

    public static boolean readYesNo(String message) throws Exception{
        String yn = "";
        boolean let = true;
        try {
            System.out.println(message);
            yn = sc.next();
            if (yn.equalsIgnoreCase("y")){
            } else if (yn.equalsIgnoreCase("n")){
                let = false;
            } else {
                throw new Exception("No, you need to input a letter 'y' or a letter 'n'");
            }
            return let;

        } catch(Exception e){
            throw new Exception("No, you need to input a letter 'y' or a letter 'n'");
        }
    }

}
