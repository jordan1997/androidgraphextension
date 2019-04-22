package tech.schoolhelper.androidgraphextension

import android.graphics.Point
import android.graphics.PointF
import android.view.MotionEvent

fun MotionEvent.distanceTo(event: MotionEvent): Double {
	return dim(PointF(this), PointF(event))
}

fun MotionEvent.distanceTo(point: Point): Double {
	return dim(PointF(this), PointF(point))
}

fun MotionEvent.distanceTo(pointF: PointF): Double {
	return dim(PointF(this), pointF)
}
