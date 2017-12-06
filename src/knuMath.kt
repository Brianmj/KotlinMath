import kotlin.math.sqrt

public data class Vec(var xDir: Float = 0.0f, var yDir: Float = 0.0f){

    val asPoint: Point
    get() { return Point(xDir, yDir)}

    fun length() = sqrt((xDir * xDir) + (yDir * yDir))

}

operator fun Vec.times(scalar: Float): Vec {
    return Vec(this.xDir * scalar, this.yDir * scalar)
}

operator fun Float.times(vec: Vec): Vec {
    return vec * this
}

public data class Point(var x: Float = 0.0f, var y: Float = 0.0f) {
    fun addVector(vec: Vec): Point {
        val x1 = x + vec.xDir
        val y1 = y + vec.yDir

        return Point(x1, y1)
    }
}

operator fun Point.plus(other: Point): Vec {
    return Vec(this.x + other.x, this.y + other.y)
}

operator fun Point.minus(other: Point): Vec {
    return Vec(this.x - other.x, this.y - other.y)
}