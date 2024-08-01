package Inheritance

class Buisness(name:String, age:Int, gender:String, var annoualIncome : Double):Person(name, age, gender) {
    fun display() {
        println("Name: $name")
        println("Age: $age")
        println("Gender: $gender")
        println("Annoual Income: $annoualIncome")
    }
}