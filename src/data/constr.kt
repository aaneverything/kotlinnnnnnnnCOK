package data

class constr(paramBrand: String, paramSpeed: Int, paramYear: Int = 2024) {

    //secondary constructor
    constructor(paramBrand: String,paramSpeed: Int) : this(paramBrand, paramSpeed, paramYear = 2020)
    var brand : String = paramBrand
    var paramSpeed : Int = paramSpeed
    var year : Int = paramYear
}