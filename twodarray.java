import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        int size = 3;
        Scanner sc = new Scanner(System.in);
        int [][] array = new int[size][2];
        int c1=0;
        int c2=0;
        for (int i=0;i<size;i++){
            System.out.println("Enter Subject marks");
            array[i][0] = sc.nextInt();
            c1 = c1+array[i][0];
            System.out.println("Enter Student marks");
            array[i][1] = sc.nextInt();
            c2 = c2+array[i][1];
        }
        float avgofsubjects = c1/size;
        float avgofstudents = c2/size;
        System.out.println("The average of subject marks is "+avgofsubjects);
        System.out.println("The average of student marks is "+avgofstudents);

    }
    
}
