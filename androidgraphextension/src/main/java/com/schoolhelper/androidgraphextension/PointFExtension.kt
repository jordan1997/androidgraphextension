package com.schoolhelper.androidgraphextension

import android.graphics.PointF
import android.view.MotionEvent
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D

fun PointF(event: MotionEvent) = PointF(event.x, event.y)

operator fun PointF.unaryMinus() = PointF(-this.x, -this.y)

operator fun PointF.minus(a: Float) = PointF(this.x - a, this.y - a)

operator fun PointF.minus(vector: Vector2D) = PointF((this.x - vector.x).toFloat(), (this.y - vector.y).toFloat())

operator fun PointF.plus(vector: Vector2D) = PointF((this.x + vector.x).toFloat(), (this.y + vector.y).toFloat())

operator fun PointF.plus(point: PointF) = PointF(this.x + point.x, this.y + point.y)

operator fun PointF.times(k: Double) = PointF((this.x * k).toFloat(), (this.y * k).toFloat())

operator fun PointF.times(k: Float) = this.times(k.toDouble())

operator fun PointF.times(k: Int) = this.times(k.toFloat())
