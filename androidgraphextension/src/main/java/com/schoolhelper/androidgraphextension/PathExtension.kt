package com.schoolhelper.androidgraphextension

import android.graphics.Path
import android.graphics.Point
import android.graphics.PointF

/**
 * Set the beginning of the next contour to the point.
 *
 * @param point The coordinate of the start of a new contour
 */
fun Path.moveTo(point: PointF) = this.moveTo(point.x, point.y)

fun Path.moveTo(point: Point) = this.moveTo(point.toPointF())

fun Path.moveTo(x: Int, y: Int) = this.moveTo(x.toFloat(), y.toFloat())

fun Path.lineTo(point: PointF) = this.lineTo(point.x, point.y)

fun Path.lineTo(point: Point) = this.lineTo(point.x, point.y)

fun Path.lineTo(x: Int, y: Int) = this.lineTo(x.toFloat(), y.toFloat())

fun Path.setLastPoint(point: PointF) = this.setLastPoint(point.x, point.y)

fun Path.offset(point: PointF) = this.offset(point.x, point.y)

fun Path.offset(point : Point) = this.offset(point.toPointF())

fun Path.offset(x : Int, y : Int) = this.offset(x.toFloat(), y.toFloat())

fun Path.quadTo(controlPoint: PointF, point: PointF) = this.quadTo(controlPoint.x, controlPoint.y, point.x, point.y)

fun Path.quadToByPreviousPoint(previousPoint: PointF, point: PointF) = this.quadTo(
		previousPoint.x, previousPoint.y,
		(previousPoint.x + point.x) / 2F,
		(previousPoint.y + point.y) / 2F)

fun Path.addRect(a: PointF, b: PointF) = this.addRect(a.x, a.y, b.x, b.y, Path.Direction.CW)

fun Path.addRect(a: PointF, b: PointF, dir: Path.Direction) = this.addRect(a.x, a.y, b.x, b.y, dir)

fun List<PointF>.toQuadPath(): Path {
	if (this.size < 2) {
		return Path()
	}
	val path = Path()
	path.moveTo(this.first())
	(1..this.lastIndex).forEach { index ->
		path.quadToByPreviousPoint(this[index - 1], this[index])
	}
	path.setLastPoint(this.last())
	return path
}