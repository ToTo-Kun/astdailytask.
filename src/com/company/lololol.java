import java.lololol;
import java.util.Scanner;
public class task. {
    public static void main(String[] args) {

        int a1=1;
        int a2=1;
        int a3=1;
        int a4=1;
        int a5=1;
        while(true){

            Scanner Obj = new Scanner(System.in);
            System.out.println("");
            System.out.println("*************");
            System.out.println("**            MENU           **");
            System.out.println("*                                   *");
            System.out.println("*          1. Insert Marks          *");
            System.out.println("*          2. Display Marks         *");
            System.out.println("*          3. Find Average          *");
            System.out.println("*          4. Edit marks            *");
            System.out.println("*          5. Exit                  *");
            System.out.println("*************");
            System.out.println("");
            System.out.println("**     Enter your Choice:    **");

            int o = Obj.nextInt();


            if (o == 1) {
                for (int ii=1;ii<99;ii++) {
                    System.out.println("*************");
                    System.out.println("*   1.       Input Marks            *");
                    System.out.println("*         for the following:        *");
                    System.out.println("*************");
                    System.out.println("*             MATHS                    *");
                    System.out.println("*             SCIENCE                  *");
                    System.out.println("*             ENGLISH                  *");
                    System.out.println("*             MALAYALAM                 *");
                    System.out.println("*             SOCAIL STUDIES            *");
                    System.out.println("*************");
                    System.out.println("*    2.     Back to Home            *");
                    System.out.println("*************");
                    int s = Obj.nextInt();

                    if (s == 1) {
                        System.out.println("Enter Marks for MATHS");
                        a1 = Obj.nextInt();
                        System.out.println("Enter Marks for SCIENCE");
                        a2 = Obj.nextInt();
                        System.out.println("Enter Marks for ENGLISH");
                        a3 = Obj.nextInt();
                        System.out.println("Enter Marks for MALAYALAM");
                        a4 = Obj.nextInt();
                        System.out.println("Enter Marks for SOCAIL STUDIES");
                        a5 = Obj.nextInt();
                        break;


                    }
                    else  {
                        break;
                    }
                }


            } else if (o == 2) {

                System.out.println("**************");
                System.out.println("*         Marks Obtained         *");
                System.out.println("*                                    *");
                System.out.println("*           MATHS         : " + a1+"          *");
                System.out.println("*           SCIENCE       : " + a2+"            *");
                System.out.println("*           ENGLISH       : " + a3+"            *");
                System.out.println("*           MALAYALAM     : " + a4+"            *");
                System.out.println("*           SOCAIL STUDIES: " + a5+"            *");
                System.out.println("**************");
                System.out.println("*           1. Back to Home          *");
                System.out.println("**************");
                int b = Obj.nextInt();
            }
            else if (o == 3) {

                int avrg= (a1+a2+a3+a4+a5)/5;
                System.out.println("**************");
                System.out.println("*                                    *");
                System.out.println("*      Average Marks Scored: "+avrg+"      *");
                System.out.println("*                                    *");
                System.out.println("**************");
                System.out.println("*          1. Back to Home           *");
                System.out.println("**************");
                int b = Obj.nextInt();
            }
            else if (o == 4) {
                if (a1==1){

                    System.out.println("************");
                    System.out.println("*              ERROR               *");
                    System.out.println("*        No Marks Inputted         *");
                    System.out.println("* Please use Step 1 to input Marks *");
                    System.out.println("************");
                    System.out.println("");
                    System.out.println("1. Back to Home");
                    int b = Obj.nextInt();
                }else
                {for (int ii=1;ii<99;ii++) {

                    System.out.println("Edit Marks Already Inputted");
                    System.out.println("");
                    System.out.println("**************");
                    System.out.println("**        Current Values        **");
                    System.out.println("*          1. MATHS: " + a1+"          *");
                    System.out.println("*          2. SCIENCE: " + a2+"          *");
                    System.out.println("*          3. ENGLISH: " + a3+"          *");
                    System.out.println("*          4. MALAYALAM: " + a4+"          *");
                    System.out.println("*          5. SOCAIL STUDIES: " + a5+"          *");
                    System.out.println("**************");

                    System.out.println("* Select the Subject to Edit Marks *");

                    System.out.println("*          6. Back to Home           *");

                    System.out.println("**************");
                    int nm = Obj.nextInt();
                    if (nm == 1) {
                        System.out.println("Enter New Marks for MATHS");
                        a1 = Obj.nextInt();

                    } else if (nm == 2) {
                        System.out.println("Enter New Marks for SCIENCE");
                        a2 = Obj.nextInt();

                    } else if (nm == 3) {
                        System.out.println("Enter New Marks for ENGLISH");
                        a3 = Obj.nextInt();

                    } else if (nm == 4) {
                        System.out.println("Enter New Marks for MALAYALAM");
                        a4 = Obj.nextInt();

                    } else if (nm == 5) {
                        System.out.println("Enter New Marks for SOCIAL STUDIES");
                        a5 = Obj.nextInt();

                    } else if (nm == 6) {
                        break;
                    }
                }
                }
            }
            else if (o == 5) {
                break;
            }
        }

    }
}
