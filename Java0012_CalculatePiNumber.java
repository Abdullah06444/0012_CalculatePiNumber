package Beginner;

//import java.lang.Math;

public class Java0012_CalculatePiNumber {

    public static void main(String[] args) {

        double value = 0;
        boolean flag1, flag2, flag3, flag4, flag5;
        flag1 = flag2 = flag3 = flag4 = flag5 = true;
        int i = 0, j = 1;
        do
        {

            if (i++ % 2 == 0)
                value += 4.0 / j;
            else
                value -= 4.0 / j;
            //System.out.println(" "+ i +"\t"+ value +"\t"+ (value-Math.PI));
            j += 2;
            if (3.1 <= value && value < 3.2 && flag1) // 3.1
            {
                System.out.println("First one fraction digit is the same in "+ i +"th term of series.\n");
                flag1 = false;
            }
            if (3.14 <= value && value < 3.15 && flag2) // 3.14
            {
                System.out.println("First two fraction digit is the same in "+ i +"th term of series.\n");
                flag2 = false;
            }
            if (3.141 <= value && value < 3.142 && flag3) // 3.141
            {
                System.out.println("First three fraction digit is the same in "+ i +"th term of series.\n");
                flag3 = false;
            }
            if (3.1415 <= value && value < 3.1416 && flag4) // 3.1415
            {
                System.out.println("First four fraction digit is the same in "+ i +"th term of series.\n");
                flag4 = false;
            }
            if (3.14159 <= value && value < 3.1416) // 3.14159
            {
                System.out.println("First five fraction digit is the same in "+ i +"th term of series.\n");
                flag5 = false;
            }
        } while (flag5);
    }
}
