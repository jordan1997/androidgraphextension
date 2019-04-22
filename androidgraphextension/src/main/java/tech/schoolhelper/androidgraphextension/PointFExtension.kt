package tech.schoolhelper.androidgraphextension

import android.graphics.Point
import android.graphics.PointF
import android.view.MotionEvent

fun PointF.distanceTo(event: MotionEvent): Double {
	return dim(this, PointF(event))
}

fun PointF.distanceTo(point: Point): Double {
	return dim(this, PointF(point))
}

fun PointF.distanceTo(pointF: PointF): Double {
	return dim(this, pointF)
}

fun PointF(event: MotionEvent) = PointF(event.x, event.y)

fun PointF.toPoint() = Point(this.x.toInt(), this.y.toInt())

operator fun PointF.unaryMinus() = PointF(-this.x, -this.y)

operator fun PointF.minus(a: Float) = this.apply {
	this.offset(-a, -a)
}

operator fun PointF.plus(point: PointF) = this.apply {
	this.offset(point.x, point.y)
}

operator fun PointF.times(k: Double) = PointF((this.x * k).toFloat(), (this.y * k).toFloat())

operator fun PointF.times(k: Float) = this.times(k.toDouble())

operator fun PointF.times(k: Int) = this.times(k.toDouble())

operator fun PointF.div(k: Double) = PointF((this.x / k).toFloat(), (this.y / k).toFloat())

operator fun PointF.div(k: Float) = this.times(k.toDouble())

operator fun PointF.div(k: Int) = this.times(k.toDouble())

