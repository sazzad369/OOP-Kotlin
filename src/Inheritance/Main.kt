package Inheritance

fun main(){
    val student = Student("sazzad", 23, "male", 20)
    val teacher = Teacher("arman", 90, "male",21,"CSE")
    val buisness = Buisness("Frozen ", 20,"male",60000.00)

    student.display()
    teacher.display()
    buisness.display()
}