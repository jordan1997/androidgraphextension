package com.schoolhelper.androidgraphextension

import android.graphics.Point
import android.graphics.PointF

fun Point.toPointF() = PointF(x.toFloat(), y.toFloat())

operator fun Point.unaryMinus() = Point(-this.x, -this.y)

operator fun Point.minus(a: Float) = Point((this.x - a).toInt(), (this.y - a).toInt())

operator fun Point.plus(point: Point) = this.apply {
	offset(point.x, point.y)
}

operator fun Point.times(k: Double) = Point((this.x * k).toInt(), (this.y * k).toInt())

operator fun Point.times(k: Float) = this.times(k.toDouble())

operator fun Point.times(k: Int) = this.times(k.toDouble())

operator fun Point.div(k: Double) = Point((this.x / k).toInt(), (this.y / k).toInt())

operator fun Point.div(k: Float) = this.times(k.toDouble())

operator fun Point.div(k: Int) = this.times(k.toDouble())