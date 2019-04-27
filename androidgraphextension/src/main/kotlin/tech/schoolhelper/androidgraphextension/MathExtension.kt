package tech.schoolhelper.androidgraphextension

import android.graphics.PointF

/**
 * Method calculate dimension between two pointF; Use java math library
 * @param a start of line
 * @param b end of line
 */
fun dim(a: PointF, b: PointF) = Math.sqrt(((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y)).toDouble())