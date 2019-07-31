fun toDouble(input: RationalNumber): Double {
    var double : Double = (input.numerator.toDouble()/input.denominator.toDouble())
    return (double)
}
fun add(input: RationalNumber, input2: RationalNumber ): RationalNumber{
    var x = input.denominator
    var z = input2.denominator
    var y = z
    var a = y/x
    var b = input.numerator * a
    var newmorator = b + input2.numerator
    var denewmorator =  y
    return RationalNumber (newmorator, denewmorator)

}
