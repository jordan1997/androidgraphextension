package com.schoolhelper.androidgraphextension

import android.graphics.PointF
import org.junit.Test
import org.mockito.Mockito

class PointFExtensionTest {
	
	@Test
	fun testTimesFloat() {
		val time = 5F
		val point = Mockito.mock(PointF::class.java)
		point.times(time)
		Mockito.verify(point).times(time.toDouble())
	}
}