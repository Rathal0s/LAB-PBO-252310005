package Runtutan_01;

import java.util.Scanner;

public class Latihan09 {
    private static Students myBio = new Students();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM       : ");
        int npm = input.nextInt();
        input.nextLine(); 

        System.out.print("Masukkan Fullname  : ");
        String fullname = input.nextLine();

        System.out.print("Masukkan ClassName : ");
        String className = input.nextLine();

        System.out.print("Masukkan Semester  : ");
        int semester = input.nextInt();

        System.out.print("Masukkan GPA       : ");
        float gpa = input.nextFloat();

        System.out.println("NPM       : " + myBio.getNPM(npm));
        System.out.println("Fullname  : " + myBio.getFullname(fullname));
        System.out.println("ClassName : " + myBio.getClassName(className));
        System.out.println("Semester  : " + myBio.getSemester(semester));
        System.out.println("GPA       : " + myBio.getGPA(gpa));

    }
}
