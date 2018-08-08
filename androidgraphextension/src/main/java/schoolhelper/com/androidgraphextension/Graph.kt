package schoolhelper.com.androidgraphextension

import android.graphics.Path
import android.graphics.Point
import android.graphics.PointF
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D
import org.apache.commons.math3.util.FastMath

fun dim(a: PointF, b: PointF) = Math.sqrt(((a.x - b.x).sqr + (a.y - b.y).sqr).toDouble())

val Float.sqr: Float
	get() = this.toDouble().sqr.toFloat()

val Double.sqr: Double
	get() = FastMath.pow(this, 2.0)

fun Vector2D(startPoint: PointF, endPoint: PointF) = Vector2D((startPoint.x - endPoint.x).toDouble(), (startPoint.y - endPoint.y).toDouble())

fun Vector2D(startPoint: Point, endPoint: Point) = Vector2D((startPoint.x - endPoint.x).toDouble(), (startPoint.y - endPoint.y).toDouble())

fun Vector2D.safeNormalize() = (if (this == Vector2D.ZERO) {
	Vector2D.ZERO
} else {
	this.normalize()
})!!

fun Vector2D.makeNormalVector() = Vector2D(-this.y, this.x)

operator fun PointF.unaryMinus() = PointF(-this.x, -this.y)

operator fun PointF.minus(a: Float) = PointF(this.x - a, this.y - a)

operator fun PointF.minus(vector: Vector2D) = PointF((this.x - vector.x).toFloat(), (this.y - vector.y).toFloat())

operator fun PointF.plus(vector: Vector2D) = PointF((this.x + vector.x).toFloat(), (this.y + vector.y).toFloat())

operator fun PointF.plus(point: PointF) = PointF(this.x + point.x, this.y + point.y)

operator fun PointF.times(k: Double) = PointF((this.x * k).toFloat(), (this.y * k).toFloat())

operator fun PointF.times(k: Float) = this.times(k.toDouble())

operator fun PointF.times(k: Int) = this.times(k.toFloat())

fun Path.moveTo(point: PointF) = this.moveTo(point.x, point.y)

fun Path.lineTo(point: PointF) = this.lineTo(point.x, point.y)

fun Path.setLastPoint(point: PointF) = this.setLastPoint(point.x, point.y)

fun Path.offset(point: PointF) = this.offset(point.x, point.y)

fun Path.quadTo(previewPoint: PointF, point: PointF) = this.quadTo(
		previewPoint.x, previewPoint.y,
		(previewPoint.x + point.x) / 2F,
		(previewPoint.y + point.y) / 2F)

fun List<PointF>.toPath(): Path {
	if (this.size < 2) {
		return Path()
	}
	val path = Path()
	path.moveTo(this.first())
	(1..this.lastIndex).forEach { index ->
		path.quadTo(this[index - 1], this[index])
	}
	path.setLastPoint(this.last())
	return path
}