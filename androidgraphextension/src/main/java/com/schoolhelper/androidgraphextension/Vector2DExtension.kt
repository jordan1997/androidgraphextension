package com.schoolhelper.androidgraphextension

import android.graphics.Point
import android.graphics.PointF
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D

fun Vector2D(startPoint: PointF, endPoint: PointF) = Vector2D((startPoint.x - endPoint.x).toDouble(), (startPoint.y - endPoint.y).toDouble())

fun Vector2D(startPoint: Point, endPoint: Point) = Vector2D((startPoint.x - endPoint.x).toDouble(), (startPoint.y - endPoint.y).toDouble())

fun Vector2D.safeNormalize() = (if (this == Vector2D.ZERO) {
	Vector2D.ZERO
} else {
	this.normalize()
})!!

fun Vector2D.makeNormalVector() = Vector2D(-this.y, this.x)