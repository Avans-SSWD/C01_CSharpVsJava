using System;

namespace DemoApplication
{
    class Program
    {
        static void Main(string[] args)
        {
            var teacher2 = new Teacher("Johan", "Smarius", "jawsmari");
            var secondTeacher = new Teacher("Marcel", "De Groot", "mggroot");

            var dotNetClass = new Class("Dotnet rocks!", teacher2);

            var student1 = new Student("Paul", "Allen", 1001);
            var student2 = new Student("Bill", "Gates", 1002);
            dotNetClass.AddTeacher(secondTeacher);
            dotNetClass.AddStudent(student1);
            dotNetClass.AddStudent(student2);

            Console.WriteLine($"The persons in this class {dotNetClass.Title} are:");
            foreach (var person in dotNetClass.GetAllPersons())
            {
                Console.WriteLine($"{person.FirstName} {person.LastName}");
            }
        }
    }
}
