

fun main(args: Array<String>){

    val p = Point(0f, -1f)
    val i = Point(1f, 1f)
    val c = Point(2f, -1f)

    val cp = p - c
    val ip = p - i

    val cPLengthSqr = cp.lengthSqr
    val ipLengthSqr = ip.lengthSqr

    println("Length squared of cp $cPLengthSqr")
    println("Length squared of ip $ipLengthSqr")


    /*val p1 = Point(1.0f, 0.0f)
    val v = Vec(2.0f, 3.0f)

    val p2 = p1.addVector(v)*/

    /*println(p2)

    println(p2 - p1)
    println(p2 + p1)
    println((p2 + p1).length)

    println((p2 + p1) * 0.5f)
    println((p2 + p1) / 3.0f)*/

    /*val p3 = Point(3.0f, 4.0f)
    val p4 = Point(1.0f, 2f)

    val v2 = p3 - p4
    val normalized = v2.normalized

    println(normalized.xDir)
    println(normalized.yDir)
    println(normalized.length)*/

    /*val v1 = Vec(4f, 0f)
    val v2 = Vec(0f, -5f)

    val r = v1 - v2
    println(r)*/



}