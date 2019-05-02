package tech.schoolhelper.androidgraphextension

import android.graphics.Rect
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import io.mockk.mockkStatic
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class RectExtensionTest {
	
	@MockK(relaxed = true)
	lateinit var rect: Rect
	
	@Before
	fun setup() {
		MockKAnnotations.init(this, relaxUnitFun = true)
		mockkStatic("android.graphics.Point")
		mockkStatic("android.graphics.Rect")
	}
	
	@Test
	fun testGetCenter() {
		rect.getCenter()
		
		verify { rect.centerX() }
		verify { rect.centerY() }
	}
	
	@Test
	fun testContainsFloat() {
		rect.contains(0.5F, 0.5F)
		
		verify { rect.contains(0, 0) }
	}
	
	@Test
	fun testContainsDouble() {
		rect.contains(1.35, 23.44)
		
		verify { rect.contains(1, 23) }
	}
}