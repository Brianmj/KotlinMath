import kotlin.math.sqrt

public data class Vector2(var xDir: Float = 0.0f, var yDir: Float = 0.0f){
    val length: Float get() =  sqrt((xDir * xDir) + (yDir * yDir))
    val lengthSqr: Float get() = (xDir * xDir) + (yDir * yDir)
    val normalized: Vector2 get() = this / length
}

operator fun Vector2.plus(other: Vector2): Vector2 {
    return Vector2(this.xDir + other.xDir, this.yDir + other.yDir)
}

operator fun Vector2.minus(other: Vector2): Vector2 {
    return Vector2(this.xDir - other.xDir, this.yDir - other.yDir)
}

operator fun Vector2.unaryMinus() = Vector2(-xDir, -yDir)

operator fun Vector2.times(scalar: Float): Vector2 {
    return Vector2(this.xDir * scalar, this.yDir * scalar)
}

operator fun Float.times(vector2: Vector2): Vector2 {
    return vector2 * this
}

operator fun Vector2.div(scalar: Float): Vector2 {
    return Vector2(this.xDir / scalar, this.yDir / scalar)
}

operator fun Float.div(vector2: Vector2): Vector2 {
    return Vector2(this/ vector2.xDir, this / vector2.yDir)
}

public data class Vector3(var xDir: Float = 0.0f, var yDir: Float = 0.0f, var zDir: Float = 0.0f)
{
    val length: Float get() = sqrt((xDir * xDir) + (yDir * yDir) + (zDir * zDir))
    val lengthSqr: Float get() = (xDir * xDir) + (yDir * yDir) + (zDir * zDir)
    val normalized: Vector3 get() = this / length
}

operator fun Vector3.plus(other: Vector3) = Vector3(this.xDir + other.xDir, this.yDir + other.yDir, this.zDir + other.zDir)

operator fun Vector3.minus(other: Vector3) = Vector3(this.xDir - other.xDir, this.yDir - other.yDir, this.zDir - other.zDir)

operator fun Vector3.unaryMinus(): Vector3 = Vector3(-this.xDir, -this.yDir, -this.zDir)

operator fun Vector3.times(scalar: Float) = Vector3(this.xDir * scalar, this.yDir * scalar, this.zDir * scalar)
operator fun Float.times(vector3: Vector3) = vector3 * this

operator fun Vector3.div(scalar: Float) = Vector3(this.xDir / scalar, this.yDir / scalar, this.zDir / scalar)
operator fun Float.div(vector3: Vector3) = Vector3(this / vector3.xDir, this / vector3.yDir, this / vector3.zDir)