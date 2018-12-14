package tech.schoolhelper.apachmathextension

import android.graphics.Point
import android.graphics.PointF
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D

/**
 * Build a vector by two points
 * @param startPoint start of the vector
 * @param endPoint end of the vector
 * @return A instance of a (org.apach.commons.math3.geometry.exclidean.twod.Vector2D) vector
 */
fun Vector2D(startPoint: PointF, endPoint: PointF) = Vector2D((startPoint.x - endPoint.x).toDouble(), (startPoint.y - endPoint.y).toDouble())

fun Vector2D(startPoint: Point, endPoint: Point) = Vector2D((startPoint.x - endPoint.x).toDouble(), (startPoint.y - endPoint.y).toDouble())

/**
 * @return a vector which normal verctor for this. if this is a zero vector method returns a zero verctor
 */
fun Vector2D.safeNormalize() = (if (this == Vector2D.ZERO) {
	Vector2D.ZERO
} else {
	this.normalize()
})!!

/**
 * @return a normal vector for this
 */
fun Vector2D.makeNormalVector() = Vector2D(-this.y, this.x)
