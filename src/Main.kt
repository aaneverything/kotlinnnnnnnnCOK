import org.jetbrains.annotations.Nullable
const val APPNAME = "jokowi"
const val VERSIONN = "0.0.1"

fun main() {
    //helo world
    println("Hello Kotlin")
    print("Hello World")
    println("Hello World")

    //char
    var inichar : Char = 'a'
    println(inichar)

    //bool
    var bener : Boolean = true
    var salah : Boolean = false


    //string
    var nama_depan : String = "aan"
    var nama_belakang : String = "vinanta"
    var alamat : String = """
        
        jalan kenari
        rt 14 rw 9
        desa sapta mulia
    """.trimIndent()

    println(alamat)
    println(nama_depan + " " + nama_belakang + " " + alamat)
    println("nah ini adalah jawaban yang $bener")

    //variabel

    // val itu immutable kaya const js
    // var itu mutable
    val thisName : String = "widodo"
    //penamaan tipe data itu sebenarnya gausah gapapa
    val thoseName = "joko"
//    thisName = thoseName          error

    //nullable
    //setiap pendeklarasian tipe data harus ada isinya tidak boleh tidak. tapi jika mau bisa pake tanda tanya
    var iniNull : String? = null

    println("variabel constant")
    //variable constant
    //dibuat diluar fun main jadi global
    // const val WANJAY = "flkjsdfla"
    println("$APPNAME : $VERSIONN ")

    //array
    println("array")
    val namaa : Array<String> = arrayOf("jokowi", "kaesang", "gibran", "erina") //

    namaa[0] = "joko widodo"
    println(namaa[0])

    //array of null
    println("array of null")
    val members : Array<String?> = arrayOfNulls<String>(5)
    members[0] = "joko"
    members[1] = "widodo"
    println(members[0])

    //range
    println("range")
    val range = 1..20 //step 2 :: kenaikanya 2

    println(range)
    println(range.contains(20))
    println(range.first)
    println(range.last)
    println(range.step)

    //math operator
    val result = 5 * 5
    println(result)

    //perbandingan
    val perb : Boolean = result < 10
    println(perb)

    //boolean lagi
    val kehadiran = 75
    val nilaii = 80
    val ekstra = 75

    val lulusKehadiran = kehadiran > 80
    val lulusNilaii = nilaii > 76
    val lulusExtra = ekstra > 70

    val lulus = lulusNilaii && lulusKehadiran && lulusExtra
//    val lulus = (lulusNilaii && lulusKehadiran) && lulusExtra
//    val lulus = ((lulusNilaii && lulusKehadiran) && lulusExtra)

    println(lulus)


    //if ekspresion
    if (kehadiran > 90) {
        println("anjay kamu lulus kehadiran")
    }else if(kehadiran > 50) {
        println("ya lumayan")
    }
    else{
        println("anjay kamu tidak lulus kehadiran")
    }

    //when ekspression
    when(kehadiran) {
        90 -> println("keren")
        80 -> println("waw")
        50 -> println("waduh")
        else -> println("anjay kamu tidak lulus kehadiran")
    }

    when(nilaii){
        90, 80, 70 -> println("wanjay")
        else -> println("walah cik")
    }
    val yournilai = arrayOf(90, 80, 70)

    when (nilaii) {
        in yournilai -> println("woalah cikk")
        !in yournilai -> println("ooo alah")
    }

    val exam = 90

    when{
        exam > 80 -> println("horee")
        exam > 60 -> println("walah")
        else -> println("anjay")
    }

    //for loops
    val namaSaya = arrayOf("aan", "triya", "vinanta")
    for (name in namaSaya) {
        println(name)
    }

    //for range
    for (i in 1..5){
        println(i)
    }

    for (i in 5 downTo 1){
        println("indek ke $i")
    }

    //while loop
    var i = 0
    while (i < 5){
        println("while ke $i")
        i++
    }

    //do while loops
    var j = 0
    do {
         println("do while ke $j")
         j++
     }while (j < 5)

     //break
     var k = 0

     while (true){
         println("do while ke $k")
         k++
         if (k == 5){
             break
         }

     }
    for (o in 1..10){
        if (o % 2 == 0){
            continue
        }
        println("anjay ke $o")
    }


}
