package com.schoolhelper.androidgraphextension

import android.content.Context
import android.graphics.Canvas
import android.graphics.PointF
import android.view.View

class TestView(context: Context?) : View(context) {
	
	init {
	
	
	}
	
	override fun onDraw(canvas: Canvas) {
		super.onDraw(canvas)
		
		val samplePoints = listOf(PointF(0F, 2F), PointF(4F, 4F), PointF(0F, 6F))
		val path = samplePoints.toQuadPath()
		canvas.drawPath(path, paint)
	}
	
}