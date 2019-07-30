fun toDouble(Numerator: Int, Denominator: Int): Double {
    var double : Double = (Numerator.toDouble()/Denominator.toDouble())
    return (double)
}
fun add(Numerator: Int, Denominator: Int, Numerator2: Int, Denominator2: Int): RationalNumber{
    var x = Denominator
    var z = Denominator2
    var y = z
    var a = y/x
    var b = Numerator * a
    var Newmorator = b + Numerator2
    var Denewmorator =  y
    return RationalNumber (Newmorator, Denewmorator)

}
