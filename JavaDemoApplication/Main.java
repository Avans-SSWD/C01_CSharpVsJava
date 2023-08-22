class Main {
  public static void main(String[] args) {

    Teacher firstTeacher = new Teacher("Johan", "Smarius", "jawsmari");
    int eenInt;

    Class dotNetClass = new Class("Dotnet rocks!", firstTeacher);
    Teacher secondTeacher = new Teacher("Marcel", "De Groot", "mggroot");

    Student student1 = new Student("Paul", "Allen", 1001);
    Student student2 = new Student("Bill", "Gates", 1002);

    dotNetClass.addTeacher(secondTeacher);
    dotNetClass.addStudent(student1);
    dotNetClass.addStudent(student2);

    System.out.println("The persons in this class " + dotNetClass.getTitle() + " are:");
    for (Person person : dotNetClass.getAllPersons()){
      String name = person.getFirstName() + " " + person.getLastName();

      System.out.println(name);
    }

  }
}