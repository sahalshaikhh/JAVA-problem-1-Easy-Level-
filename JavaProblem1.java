import java.util.*;

public class JavaProblem1 {
    public static void main(String[] args) throws Exception {
        Scanner Sc = new Scanner(System.in);
        // Taking Input from user

        float pencil = Sc.nextFloat();
        float pen = Sc.nextFloat();
        float eraser = Sc.nextFloat();
        Sc.close();

        // .... Bill Amount without gst
        float Bill = pencil + pen + eraser;
        System.out.println("Your bill is " + Bill + " and");
        // Adding 18% gst
        float gst = 18;
        float TotalGst = (gst * Bill) / 100;
        // Value of gst
        System.out.println("The Gst will be " + TotalGst);
        // Total Bill With gst
        System.out.println("Total Bill will be " + (Bill + TotalGst));

        // .................................will it Run?
        // int $ = 24;
        // System.out.println($);
    }
}
