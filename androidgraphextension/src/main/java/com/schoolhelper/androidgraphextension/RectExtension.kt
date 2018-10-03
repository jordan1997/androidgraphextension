package com.schoolhelper.androidgraphextension

import android.graphics.Rect
import android.view.MotionEvent

fun Rect.contains(event: MotionEvent) = this.contains(event.x, event.y)

fun Rect.contains(x: Float, y: Float) = this.contains(x.toInt(), y.toInt())