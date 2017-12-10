

fun main(args: Array<String>){
    val p1 = Point(1.0f, 0.0f)
    val v = Vec(2.0f, 3.0f)

    val p2 = p1.addVector(v)

    /*println(p2)

    println(p2 - p1)
    println(p2 + p1)
    println((p2 + p1).length)

    println((p2 + p1) * 0.5f)
    println((p2 + p1) / 3.0f)*/

    val p3 = Point(3.0f, 4.0f)
    val p4 = Point(1.0f, 2f)

    val v2 = p3 - p4
    val normalized = v2.normalized

    println(normalized.xDir)
    println(normalized.yDir)
    println(normalized.length)

}