package assi2q2;
public class Student 
{
    private int student_ID;
    private double student_GPA;
    private Subject student_subject;
    private address student_address;
    
    public Student( int student_ID,double student_GPA,  Subject student_subject, address student_address)
    {
        this.student_ID=student_ID;
        this.student_GPA=student_GPA;
        this.student_address=student_address;
        this.student_subject= student_subject;
    }
    public void display()
    {
        System.out.println("the ID : "+student_ID);
        System.out.println("the GPA : "+student_GPA);
        System.out.println("the address : "+student_address);
        System.out.println("the subject : "+student_subject);
    }
}
