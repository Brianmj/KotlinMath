

fun main(args: Array<String>){
    val p1 = Point(1.0f, 0.0f)
    val v = Vec(2.0f, 3.0f)

    val p2 = p1.addVector(v)

    println(p2)

    println(p2 - p1)
    println(p2 + p1)
    println((p2 + p1).length())
}