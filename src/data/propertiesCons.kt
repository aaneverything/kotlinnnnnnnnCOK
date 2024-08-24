package data

import java.awt.Shape

//cuma nambah var anjer
//class propertiesCons(var usernameParam: String, var passwordParam: String) {
//}

//function oop
class propertiesCons(var prop: String = "") {

    fun run(){
        println("aku lari coy")
    }

    //tinggal tambahin fun doang didalem anjer
    fun sayAnjay(yourname: String){
        println("lo alah cik $prop koen iki $yourname ta")
    }

    //function overloading
    fun tahu(merek: String){
        println("cok mereke $merek njirr")
    }
    //nama sama yg penting parameter bedain
    fun tahu(merek: String, jumlah: Int){
        println("lah inimah $merek banyak bgt $jumlah njir")
    }
}

//inheritance
open class employee(val name: String){
    //function overriding
   open fun ohOh(umur: Int){
        println("oh oh $umur oh ${this.name}")
    }

    fun tahi(name: String){
        println(name)
    }

}

class manager(name: String) : employee(name){
    //child overriding
    override fun ohOh(umur: Int){
        super.ohOh(umur)
    }
}
class ceo(name: String) :employee(name)

//properties overriding



