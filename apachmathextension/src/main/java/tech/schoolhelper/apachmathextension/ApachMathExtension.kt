package tech.schoolhelper.apachmathextension;

import org.apache.commons.math3.util.FastMath

/**
 * This value is square for the float value, getter use library FastMath from the Apache
 */
val Float.sqr: Float
	get() = this.toDouble().sqr.toFloat()
/**
 * This values is square for the double value, getter use library FastMath from the Apache
 */
val Double.sqr: Double
	get() = FastMath.pow(this, 2.0)
