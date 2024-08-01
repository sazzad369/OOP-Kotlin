package basic

class veihcle( var model:String, var brand:String , var engine:String, var seat:Int , var madeIn:String){
      init{
            println("model : $model")
            println("brand : $brand")
            println("engine : $engine")
            println("seat : $seat")
            println("madeIn : $madeIn")

      }
      fun horn(){
            println("Sound is Pip Pip Pip")
      }
}
