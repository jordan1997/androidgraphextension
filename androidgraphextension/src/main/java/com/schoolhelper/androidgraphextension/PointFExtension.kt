package com.schoolhelper.androidgraphextension

import android.graphics.PointF
import android.view.MotionEvent

fun PointF(event: MotionEvent) = PointF(event.x, event.y)

operator fun PointF.unaryMinus() = PointF(-this.x, -this.y)

operator fun PointF.minus(a: Float) = PointF(this.x - a, this.y - a)

operator fun PointF.plus(point: PointF) = PointF(this.x + point.x, this.y + point.y)

operator fun PointF.times(k: Double) = PointF((this.x * k).toFloat(), (this.y * k).toFloat())

operator fun PointF.times(k: Float) = this.times(k.toDouble())

operator fun PointF.times(k: Int) = this.times(k.toDouble())

operator fun PointF.div(k: Double) = PointF((this.x / k).toFloat(), (this.y / k).toFloat())

operator fun PointF.div(k: Float) = this.times(k.toDouble())

operator fun PointF.div(k: Int) = this.times(k.toDouble())

