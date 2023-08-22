import java.util.ArrayList;

public class Class {
  private ArrayList<Student> students = new ArrayList<Student>();
  private Teacher teacher;
  private Teacher secondTeacher;
  private String title;

  public Class(String title, Teacher teacher) {
    this.title = title;
    this.teacher = teacher;
  }

  void addStudent(Student student){
      students.add(student);
  }

  String getTitle() {
    return title;
  }

  ArrayList<Person> getAllPersons(){
    ArrayList<Person> completeList = new ArrayList<Person>(students);

    completeList.add(teacher);
    completeList.add(secondTeacher);

    return completeList;
  }

public void addTeacher(Teacher secondTeacher) {
  this.secondTeacher = secondTeacher;
}

}
