package app

import data.Car
import data.ceo
import data.manager
import data.propertiesCons

fun main() {
    val hyundai = Car()
    hyundai.nama = "Ya Hyundai"
    hyundai.speed = 100
    println(hyundai.nama)
    println(hyundai.speed)


    //properties constructor

    //function constructor
//    val orang = propertiesCons("anjing")
//    println(orang.sayAnjay("jokowi"))

//    println(orang.run())

    //function overloading
//    println(orang.tahu("sumedang"))
//    println( orang.tahu("konci", 90))

    val manager = manager("tulo")
    manager.ohOh(90)

    val cto = ceo("kimak")
    cto.ohOh(16)
}
