// function biasa
fun helloWorld(){
    println("Hello World")
}

//function parameter
fun hello(firstname: String, secondname: String){
    println("Hello $firstname $secondname")
}

fun tambah(x : Int, y : Int ){
   println( x + y)
}

//function default param
fun defParam(nama : String,agama: String? = "kristem"){
    println("nama saya $nama, agama saya $agama")
}

//function named argument
fun namedArg(nama: String,
            kelas: String,
             Umur: Int){
    println("nama saya $nama, kelas saya $kelas, Umur $Umur")
}

//function with return
fun retursn(a : Int, b: Int):Int{
    val total = a + b
    return total
}

//single ekspresion function
fun kalidua(a: Int): Int = a * 2

fun hai(name:String): Unit = println("Hello $name")

//varargs
 fun hitungTotal(vararg hasil: Int): Int {
     var total = 0

    for (a in hasil) {
        total += a
    }

    return total
 }

//extension function
fun String.hello(): String = "Hello $this"
fun String.allo(): Unit = println("Hai $this")

//function infix notation
infix fun String.to(type: String): String {
    if (type == "UP"){
        return this.toUpperCase()
    }
    else{
        return this.toLowerCase()
    }
}

//recursive function
fun factorialLoop(value: Int): Int {
   return when (value){
       1 -> 1
       else -> value * factorialLoop(value -1)
   }
}

tailrec fun display(value : Int){
    println(value)
    if (value > 0){
        display(value - 1)
    }
}

//higher order function
fun oii(name: String, tranformer: (String)-> String): String{
    val nameTransform = tranformer(name)
    return "halo $nameTransform"
}


fun main(){
//lamda expression
val contohLamda : (String, String) -> String = {nama: String, Agama: String ->
    val ini = "halo pak $nama masa iya kamu $Agama"
    ini
}

val anjay :(String) -> String = {
    "halo $it"
}

//anonymous function
    val upper = fun(value: String): String{
        if (value == ""){
            return "ANJAY MULYONO"
        }else{
            return value.toUpperCase()
        }
    }

    helloWorld()
    helloWorld()
    tambah(10, 9)
    hello("aan", "jokowi")
    defParam("aan") // kalo mau ganti agama tinggal tambahin paramnya
    namedArg(nama = "jokowi",
        Umur = 40,
        kelas = "gorong gorong")
    println(retursn(8, 15))
    hai("MULYONO")
    println(kalidua(3))
    val hasil = hitungTotal(10,10,10,10,10,10,10)
    println(hasil)
    val nama = "aan jokowi"
    println(nama.hello())
    "jokowi ohoh".allo()
    val huasil = "JOKOWI AKA MULYONO" to "o"
    println(huasil)
    println(factorialLoop(10))
    println(contohLamda("jokowi lagi", "kristen"))
    println(anjay("jokowi"))

    //higher order dan anonymous func
    println(oii("JOKO WIDODO", upper))
    println(oii("", upper))

}
