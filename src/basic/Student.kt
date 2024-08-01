package basic

class Student {
    var Name:String = ""
    var Id:Int = 0
    var address:String = ""

    constructor()

    constructor(name:String){
        this.Name = name
    }
    constructor(name:String, id:Int){
        this.Id = id
    }
    constructor(name:String, id:Int,address:String){
        this.Name = name
        this.Id = id
        this.address = address
    }
    fun display(){
        if (Name.equals("") && Id == 0 && address.equals("")){
            println("No Data")
        }
        else if(Id==0 && address.equals("")){
            println("Name:$Name")
        }
        else if (address.equals("")){
            println("Name:$Name, Id:$Id")
        }
        else{
            println("Nname: $Name, Id:$Id, Address: $address")
        }
    }
}