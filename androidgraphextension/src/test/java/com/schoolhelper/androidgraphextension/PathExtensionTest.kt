package com.schoolhelper.androidgraphextension

import android.graphics.Path
import android.graphics.PointF
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
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
	
	@Test
	fun testQuadTo() {
		val controlPoint = PointF()
		controlPoint.x = 5F
		controlPoint.y = 5F
		path.quadTo(controlPoint, point)
		
		Mockito.verify(path).quadTo(controlPoint.x, controlPoint.y, point.x, point.y)
	}
	
	
	@After
	fun validate() {
		Mockito.validateMockitoUsage()
	}
}