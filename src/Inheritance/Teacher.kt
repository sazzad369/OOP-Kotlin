package Inheritance


class Teacher(name:String, age:Int, gender:String, var teacherID:Int, var subject: String):Person(name, age, gender) {
    fun display() {
        println("Name: $name")
        println("Age: $age")
        println("Gender: $gender")
        println("teachar ID: $teacherID")
        println("subject: $subject")
    }
}