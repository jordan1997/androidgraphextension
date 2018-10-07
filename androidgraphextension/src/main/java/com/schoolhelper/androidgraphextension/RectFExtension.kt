package com.schoolhelper.androidgraphextension

import android.graphics.Point
import android.graphics.PointF
import android.graphics.Rect
import android.graphics.RectF
import android.view.MotionEvent

/**
 * Returns true if (event.x,event.y) is inside the rectangle. The left and top are
 * considered to be inside, while the right and bottom are not. This means
 * that for a event.x, event.y to be contained: left <= event.x < right and top <= event.y < bottom.
 * An empty rectangle never contains any point.
 *
 * @param event The the event being tested for containment
 * @return true iff (event.x,event.y) are contained by the rectangle, where containment
 *              means left <= event.x < right and top <= event.y < bottom
 */
fun RectF.contains(event: MotionEvent) = this.contains(event.x, event.y)

/**
 * Returns true if (x,y) is inside the rectangle. The left and top are
 * considered to be inside, while the right and bottom are not. This means
 * that for a x,y to be contained: left <= x < right and top <= y < bottom.
 * An empty rectangle never contains any point.
 *
 * @param x The X coordinate of the point being tested for containment
 * @param y The Y coordinate of the point being tested for containment
 * @return true iff (x,y) are contained by the rectangle, where containment
 *              means left <= x < right and top <= y < bottom
 */
fun RectF.contains(x: Int, y: Int) = this.contains(x.toFloat(), y.toFloat())

/**
 * Returns true if [point] is inside the rectangle. The left and top are
 * considered to be inside, while the right and bottom are not. This means
 * that for a point of value (x,y) to be contained: left <= x < right and top <= y < bottom.
 * An empty rectangle never contains any point.
 *
 * @param point the point being tested for containment
 * @return true iff point of value (x,y) is contained by the rectangle, where containment
 *              means left <= x < right and top <= y < bottom
 */
fun RectF.contains(point: Point) = this.contains(point.x, point.y)

/**
 * Returns true if [point] is inside the rectangle. The left and top are
 * considered to be inside, while the right and bottom are not. This means
 * that for a point of value (x,y) to be contained: left <= x < right and top <= y < bottom.
 * An empty rectangle never contains any point.
 *
 * @param point the point being tested for containment
 * @return true iff point of value (x,y) is contained by the rectangle, where containment
 *              means left <= x < right and top <= y < bottom
 */
fun RectF.contains(point: PointF) = this.contains(point.x, point.y)

/**
 * Returns true iff the [rect] is inside or equal
 * to this rectangle. i.e. is this rectangle a superset of the specified
 * rectangle. An empty rectangle never contains another rectangle.
 *
 * @param rect the rectangle being tested for containment
 * @return true iff [rect] is contained in this rectangle
 */
fun RectF.contains(rect: Rect) = this.contains(rect.left.toFloat(), rect.top.toFloat(), rect.right.toFloat(), rect.bottom.toFloat())

/**
 * @return the center of the rectangle. If the computed value
 *         is fractional, this method returns the Point with the largest integers as coordinates that is
 *         less than the computed value.
 */

fun RectF.getCenter() = PointF(this.centerX(), this.centerY())

/**
 * Returns true if the rectangle is not empty (right >= left or bottom >= top)
 */
val RectF.isNotEmpty
    get() = !this.isEmpty