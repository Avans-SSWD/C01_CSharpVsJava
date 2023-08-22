
public class Student extends AbstractPerson
{
  private int studentNumber;

  public Student(String firstName, String lastName, int studentNumber) {
    super(firstName, lastName);
  
    this.studentNumber = studentNumber;
  }

  public int getStudentNumber()
  {
    return studentNumber;
  }

}