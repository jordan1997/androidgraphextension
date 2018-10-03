package com.schoolhelper.androidgraphextension

import android.graphics.Point
import android.graphics.Rect
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
fun Rect.contains(event: MotionEvent) = this.contains(event.x, event.y)

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
fun Rect.contains(x: Float, y: Float) = this.contains(x.toInt(), y.toInt())

/**
	* @return the center of the rectangle. If the computed value
	*         is fractional, this method returns the Point with the largest integers as coordinates that is
	*         less than the computed value.
	*/

fun Rect.getCenter() = Point(this.centerX(), this.centerY())

/**
	* Returns true if the rectangle is not empty (right >= left or bottom >= top)
	*/
val Rect.isNotEmpty
	get() = !this.isEmpty