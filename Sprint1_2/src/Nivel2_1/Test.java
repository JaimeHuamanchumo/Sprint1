package Nivel2_1;
import javax.swing.*;
import java.util.InputMismatchException;

public class Test {
    //all of these are for testing the functions;
    byte t1 = 0;
    int t2 = 0;
    float t3 = 0f;
    double t4 = 0d;
    char t5 = ' ';
    String t6 = "";


    public Test(){
    }

    public void maxTest(){
        testByte();
        testInt();
        testFloat();
        testDouble();
        testChar();
        testString();
        testYN();
    }

    public void testByte(){
        try {
            t1 = Input.readByte("Try inputting a byte value");
        }catch (InputMismatchException e){
            System.out.println("No, this test only works once you input a byte value");
            testByte();
        }
    }

    public void testInt(){
        try{
            t2 = Input.readInt("Try inputting an int value");
        } catch(InputMismatchException e){
            System.out.println("No, this test only works once you input a int value");
            testInt();
        }
    }

    public void testFloat(){
        try{
            t3 = Input.readFloat("Try inputting a float value");
        } catch(InputMismatchException e){
            System.out.println("No, this test only works once you input a float value");
            testFloat();
        }
    }

    public void testDouble(){
        try{
            t4 = Input.readDouble("Try inputting a double value");
        }catch(InputMismatchException e){
            System.out.println("No, this test only works once you input a double value");
            testDouble();
        }
    }

    public void testChar() {
        try{
            t5 = Input.readChar("Try inputting a char value");
        } catch(Exception e){
            System.out.println("No, this test only works once you input a char value");
            testChar();
        }
    }

    public void testString(){
        try{
            t6 = Input.readString("Try inputting a string value");
        }catch(Exception e){
            System.out.println("No, this test only works once you input a String value");
            testString();
        }
    }

    public void testYN(){
        try{
            Input.readYesNo("Try inputting 'y' or 'n' ");
        } catch (Exception e) {
            System.out.println("No, this test only works once you input the letter 'y' or 'n' as values, everything" +
                    " else is forfeit");
            testYN();
        }
    }
}
