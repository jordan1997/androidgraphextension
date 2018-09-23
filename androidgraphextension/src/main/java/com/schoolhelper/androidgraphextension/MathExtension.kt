package com.schoolhelper.androidgraphextension

import android.graphics.PointF
import org.apache.commons.math3.util.FastMath

fun dim(a: PointF, b: PointF) = Math.sqrt(((a.x - b.x).sqr + (a.y - b.y).sqr).toDouble())


val Float.sqr: Float
	get() = this.toDouble().sqr.toFloat()

val Double.sqr: Double
	get() = FastMath.pow(this, 2.0)