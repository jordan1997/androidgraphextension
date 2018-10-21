package com.schoolhelper.androidgraphextension

import android.graphics.PointF
import org.apache.commons.math3.util.FastMath

/**
 * <Block for check version>
 * Method calculate dimention beetween two pointF; Use java math library
 * @param a start of line
 * @param b end of line
 */
fun dim(a: PointF, b: PointF) = Math.sqrt(((a.x - b.x).sqr + (a.y - b.y).sqr).toDouble())

/**
 * This value is squary for the float value, getter use library FastMath from the Apache
 */
val Float.sqr: Float
	get() = this.toDouble().sqr.toFloat()
/**
 * This values is squary for the double value, gettre use library FastMath from the Apache
 */
val Double.sqr: Double
	get() = FastMath.pow(this, 2.0)
