package com.schoolhelper.androidgraphextension

import android.graphics.Rect
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.mockkStatic
import org.junit.Before
import org.junit.Test

class RectExtensionTest {
	
	private val centerX = 10
	private val centerY = 20
	
	@MockK(relaxUnitFun = true)
	lateinit var rect: Rect
	
	@Before
	fun setup() {
		MockKAnnotations.init(this, relaxUnitFun = true)
		
		mockkStatic("android.graphics.Rect")
		
		every {
			rect.centerX()
		} returns centerX
		
		every {
			rect.centerY()
		} returns centerY
	}
	
	@Test
	fun testGetCenter() {
		val point = rect.getCenter()
		
		point.x shl (centerX / 2)
	}
}