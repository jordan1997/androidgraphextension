package com.schoolhelper.androidgraphextension

import android.graphics.Rect
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.mockkStatic
import io.mockk.verify
import org.junit.Before
import org.junit.Test
import tech.schoolhelper.androidgraphextension.getCenter

class RectExtensionTest {
	
	private val centerX = 10
	private val centerY = 20
	
	@MockK(relaxUnitFun = true)
	lateinit var rect: Rect
	
	@Before
	fun setup() {
		MockKAnnotations.init(this, relaxUnitFun = true)
		mockkStatic("android.graphics.Point")
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
		rect.getCenter()
		
		verify { rect.centerX() }
		verify { rect.centerY() }
	}
}