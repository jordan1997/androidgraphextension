package tech.schoolhelper.androidgraphextension

import android.graphics.Point
import android.graphics.PointF
import android.view.MotionEvent

/**
	* Method calculate dimension to MotionEvent
	*/
fun MotionEvent.distanceTo(event: MotionEvent): Double {
	return dim(PointF(this), PointF(event))
}

/**
	* Method calculate dimension to Point
	*/
fun MotionEvent.distanceTo(point: Point): Double {
	return dim(PointF(this), PointF(point))
}

/**
	* Method calculate dimension to PointF
	*/
fun MotionEvent.distanceTo(pointF: PointF): Double {
	return dim(PointF(this), pointF)
}

/**
	* Method calculate dimension to PointF
	*/
fun MotionEvent.distanceTo(x: Int, y: Int): Double {
	return dim(PointF(this), PointF(x, y))
}

/**
	* Method calculate dimension to coordinate
	* @param x
	* @param y
	*/
fun MotionEvent.distanceTo(x: Float, y: Float): Double {
	return dim(PointF(this), PointF(x, y))
}

/**
	* Method calculate dimension to coordinate
	* @param x
	* @param y
	*/
fun MotionEvent.distanceTo(x: Double, y: Double): Double {
	return dim(PointF(this), PointF(x, y))
}
