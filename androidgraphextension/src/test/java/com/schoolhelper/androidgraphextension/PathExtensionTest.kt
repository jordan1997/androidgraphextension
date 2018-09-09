package com.schoolhelper.androidgraphextension

import android.graphics.Path
import android.graphics.Point
import android.graphics.PointF
import io.mockk.*
import io.mockk.impl.annotations.MockK
import org.junit.After
import org.junit.Before
import org.junit.Test

class PathExtensionTest {
	
	@MockK(relaxUnitFun = true)
	lateinit var path: Path
	
	@MockK(relaxUnitFun = true)
	lateinit var pointF1: PointF
	
	@MockK(relaxUnitFun = true)
	lateinit var pointF2: PointF
	
	@MockK(relaxUnitFun = true)
	lateinit var point1: Point
	
	@MockK(relaxUnitFun = true)
	lateinit var point2: Point
	
	private val x1 = 20
	private val y1 = 30
	
	private val x2 = 20
	private val y2 = 30
	
	@Before
	fun setup() {
		MockKAnnotations.init(this, relaxUnitFun = true)
		pointF1.x = x1.toFloat()
		pointF1.y = y1.toFloat()
		
		point1.x = x1
		point1.y = y1
		
		pointF2.x = x2.toFloat()
		pointF2.y = y2.toFloat()
		
		point2.x = x2
		point2.y = y2
		
		mockkStatic("com.schoolhelper.androidgraphextension.PointFExtensionKt")
		
		every {
			point1.toPointF()
		} returns pointF1
		
		every {
			point2.toPointF()
		} returns pointF2
	}
	
	@Test
	fun testMoveToPointF() {
		path.moveTo(pointF1)
		
		verify { path.moveTo(pointF1.x, pointF1.y) }
	}
	
	@Test
	fun testMoveToPoint() {
		path.moveTo(point1)
		
		verify { path.moveTo(point1.x.toFloat(), point1.y.toFloat()) }
	}
	
	@Test
	fun testMoveToInt() {
		path.moveTo(x1, y1)
		
		verify { path.moveTo(x1.toFloat(), y1.toFloat()) }
	}
	
	@Test
	fun testLineToPointF() {
		path.lineTo(pointF1)
		
		verify { path.lineTo(pointF1.x, pointF1.y) }
	}
	
	@Test
	fun testLineToPoint() {
		path.lineTo(point1)
		
		verify { path.lineTo(point1.x, point1.y) }
	}
	
	@Test
	fun testLineToInt() {
		path.lineTo(x1, y1)
		
		verify { path.lineTo(x1.toFloat(), y1.toFloat()) }
	}
	
	@Test
	fun testOffSetPointF() {
		path.offset(pointF1)
		
		verify { path.offset(pointF1.x, pointF1.y) }
	}
	
	@Test
	fun testOffSetPoint() {
		path.offset(point1)
		
		verify { path.offset(point1.x, point1.y) }
	}
	
	@Test
	fun testOffSetInt() {
		path.offset(x1, y1)
		
		verify { path.offset(x1.toFloat(), y1.toFloat()) }
	}
	
	@Test
	fun testAddRectPointF() {
		path.addRect(pointF1, pointF2)
		
		verify { path.addRect(x1.toFloat(), y1.toFloat(), x2.toFloat(), y2.toFloat(), Path.Direction.CW) }
	}
	
	@Test
	fun testAddRectPoint() {
		path.addRect(point1, point2)
		
		verify { path.addRect(x1.toFloat(), y1.toFloat(), x2.toFloat(), y2.toFloat(), Path.Direction.CW) }
	}
	
	@Test
	fun testAddRectInt() {
		path.addRect(x1, y1, x2, y2)
		
		verify { path.addRect(x1.toFloat(), y1.toFloat(), x2.toFloat(), y2.toFloat(), Path.Direction.CW) }
	}
	
	@Test
	fun testQuadTo() {
		val controlPoint = PointF()
		controlPoint.x = 5F
		controlPoint.y = 5F
		path.quadTo(controlPoint, pointF1)
		
		verify { path.quadTo(controlPoint.x, controlPoint.y, pointF1.x, pointF1.y) }
	}
	
	@After
	fun after() {
		unmockkAll()
	}
}