package NestedClass

class Outer {
    var name: String = "Sazzad"
    class Nested {
        var outer = Outer()
        fun display(){
            println(outer.name)

        }
    }
}
fun main() {
    val outer = Outer()
    val nested = Outer.Nested()
    nested.display()
}