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

/**
 * Set the beginning of the next contour to the point (x,y).
 *
 * @param point The point of the start of a new contour
 */
fun Path.moveTo(point: Point) = this.moveTo(point.toPointF())

/**
 * Set the beginning of the next contour to the point (x,y).
 *
 * @param x The x-coordinate of the start of a new contour
 * @param y The y-coordinate of the start of a new contour
 */
fun Path.moveTo(x: Int, y: Int) = this.moveTo(x.toFloat(), y.toFloat())

/**
 * Add a line from the last point to the specified point (x,y).
 * If no moveTo() call has been made for this contour, the first point is
 * automatically set to (0,0).
 *
 * @param point The point (x, y) of the end of a line
 */
fun Path.lineTo(point: PointF) = this.lineTo(point.x, point.y)

/**
 * Add a line from the last point to the specified point (x,y).
 * If no moveTo() call has been made for this contour, the first point is
 * automatically set to (0,0).
 *
 * @param point The point (x, y) of the end of a line
 */
fun Path.lineTo(point: Point) = this.lineTo(point.x, point.y)

/**
 * Add a line from the last point to the specified point (x,y).
 * If no moveTo() call has been made for this contour, the first point is
 * automatically set to (0,0).
 *
 * @param x The x-coordinate of the end of a line
 * @param y The y-coordinate of the end of a line
 */
fun Path.lineTo(x: Int, y: Int) = this.lineTo(x.toFloat(), y.toFloat())

/**
 * Sets the last point of the path.
 *
 * @param point The point for the last point
 */
fun Path.setLastPoint(point: PointF) = this.setLastPoint(point.x, point.y)

/**
 * Sets the last point of the path.
 *
 * @param point The point for the last point
 */
fun Path.setLastPoint(point: Point) = this.setLastPoint(point.toPointF())

/**
 * Sets the last point of the path.
 *
 * @param dx The new X coordinate for the last point
 * @param dy The new Y coordinate for the last point
 */
fun Path.setLastPoint(dx: Int, dy: Int) = this.setLastPoint(dx.toFloat(), dy.toFloat())

/**
 * Offset the path by pointF
 *
 * @param point The amount in the (X,Y) direction to offset the entire path
 */
fun Path.offset(point: PointF) = this.offset(point.x, point.y)

/**
 * Offset the path by point
 *
 * @param point The amount in the (X,Y) direction to offset the entire path
 */
fun Path.offset(point: Point) = this.offset(point.toPointF())

/**
 * Offset the path by (dx,dy)
 *
 * @param dx The amount in the X direction to offset the entire path
 * @param dy The amount in the Y direction to offset the entire path
 */
fun Path.offset(dx: Int, dy: Int) = this.offset(dx.toFloat(), dy.toFloat())

/**
 * Add a closed rectangle contour to the path
 *
 * @param a   The left and top sides of a rectangle to add to the path
 * @param b   The right and bottom sides of a rectangle to add to the path
 */
fun Path.addRect(a: PointF, b: PointF) = this.addRect(a.x, a.y, b.x, b.y)

/**
 * Add a closed rectangle contour to the path
 *
 * @param a   The left and top sides of a rectangle to add to the path
 * @param b   The right and bottom sides of a rectangle to add to the path
 */
fun Path.addRect(a: Point, b: Point) = this.addRect(a.toPointF(), b.toPointF())

/**
 * Add a closed rectangle contour to the path
 *
 * @param left   The left side of a rectangle to add to the path
 * @param top    The top of a rectangle to add to the path
 * @param right  The right side of a rectangle to add to the path
 * @param bottom The bottom of a rectangle to add to the path
 */
fun Path.addRect(left: Int, top: Int, right: Int, bottom: Int) = this.addRect(left.toFloat(), top.toFloat(), right.toFloat(), bottom.toFloat())

/**
 * Add a closed rectangle contour to the path
 *
 * @param left   The left side of a rectangle to add to the path
 * @param top    The top of a rectangle to add to the path
 * @param right  The right side of a rectangle to add to the path
 * @param bottom The bottom of a rectangle to add to the path
 */
fun Path.addRect(left: Float, top: Float, right: Float, bottom: Float) = this.addRect(left, top, right, bottom, Path.Direction.CW)

fun Path.quadTo(controlPoint: PointF, point: PointF) = this.quadTo(controlPoint.x, controlPoint.y, point.x, point.y)

fun Path.quadToByPreviousPoint(previousPoint: PointF, point: PointF) = this.quadTo(
		previousPoint.x, previousPoint.y,
		(previousPoint.x + point.x) / 2F,
		(previousPoint.y + point.y) / 2F)

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