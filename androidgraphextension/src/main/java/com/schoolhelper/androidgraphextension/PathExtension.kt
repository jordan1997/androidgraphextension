package com.schoolhelper.androidgraphextension

import android.graphics.Path
import android.graphics.PointF

/**
 * Set the beginning of the next contour to the point.
 *
 * @param point The coordinate of the start of a new contour
 */
fun Path.moveTo(point: PointF) = this.moveTo(point.x, point.y)

fun Path.lineTo(point: PointF) = this.lineTo(point.x, point.y)

fun Path.setLastPoint(point: PointF) = this.setLastPoint(point.x, point.y)

fun Path.offset(point: PointF) = this.offset(point.x, point.y)

fun Path.quadTo(previewPoint: PointF, point: PointF) = this.quadTo(
		previewPoint.x, previewPoint.y,
		(previewPoint.x + point.x) / 2F,
		(previewPoint.y + point.y) / 2F)

fun List<PointF>.toQuadPath(): Path {
	if (this.size < 2) {
		return Path()
	}
	val path = Path()
	path.moveTo(this.first())
	(1..this.lastIndex).forEach { index ->
		path.quadTo(this[index - 1], this[index])
	}
	path.setLastPoint(this.last())
	return path
}