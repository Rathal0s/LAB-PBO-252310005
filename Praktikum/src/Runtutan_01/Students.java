package Runtutan_01;

public class Students {
    private int npm;
    private String fullname;
    private String className;
    private int semester;
    private float gpa;

    public int getNPM(int value) {
        this.npm = value;
        return this.npm;
    }

    public String getFullname(String value) {
        this.fullname = value;
        return this.fullname;
    }

    public String getClassName(String value) {
        this.className = value;
        return this.className;
    }

    public int getSemester(int value) {
        this.semester = value;
        return this.semester;
    }

    public float getGPA(float value) {
        this.gpa = value;
        return this.gpa;
    }
}