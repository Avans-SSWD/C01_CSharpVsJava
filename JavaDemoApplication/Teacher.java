public class Teacher extends AbstractPerson {

  private String teacherCode;

  public Teacher(String firstName, String lastName, String teacherCode){
    super(firstName, lastName);

    this.teacherCode = teacherCode;
  }

  public String getTeacherCode(){
    return teacherCode;
  }

}