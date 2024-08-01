package NestedClass

class Outer1 {
    var name: String = "sazzad"
    inner class Inner{

        fun display(){
        }
    }
}
fun main(){
    val out = Outer1()
    val inner = out.Inner()
    inner.display()
}