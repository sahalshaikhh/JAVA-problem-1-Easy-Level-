import java.util.*;

public class PassOrFail {

    public static void main(String[] args) throws Exception {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Your Marks Champ");
        int Marks = Sc.nextInt();
        Sc.close();

        String Result = (Marks >= 33) ? "Pass" : "Fail";
        System.out.println(Result);
    }
}