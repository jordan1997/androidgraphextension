package com.schoolhelper.androidgraphextension

import android.graphics.Path
import android.graphics.PointF
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class PathExtensionTest {
	
	@Mock
	lateinit var path: Path
	
	@Mock
	lateinit var point: PointF
	
	@Before
	fun setup() {
		MockitoAnnotations.initMocks(this)
		point.x = 33F
		point.y = 76F
	}
	
	@Test
	fun testMoveTo() {
		path.moveTo(point)
		
		Mockito.verify(path).moveTo(point.x, point.y)
	}
	
	@Test
	fun testLineTo() {
		path.lineTo(point)
		
		Mockito.verify(path).lineTo(point.x, point.y)
	}
	
	@Test
	fun testOffSet() {
		path.offset(point)
		
		Mockito.verify(path).offset(point.x, point.y)
	}
}