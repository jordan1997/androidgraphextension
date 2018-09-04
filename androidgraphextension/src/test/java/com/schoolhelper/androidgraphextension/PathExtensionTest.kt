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
	lateinit var pointF: PointF
	
	@MockK(relaxUnitFun = true)
	lateinit var point: Point
	
	val x = 20
	val y = 30
	
	@Before
	fun setup() {
		MockKAnnotations.init(this, relaxUnitFun = true)
		pointF.x = 20F
		pointF.y = 30F
		
		point.x = 20
		point.y = 30
		
		mockkStatic("com.schoolhelper.androidgraphextension.PointFExtensionKt")
		
		every {
			point.toPointF()
		} returns pointF
	}
	
	@Test
	fun testMoveToPointF() {
		path.moveTo(pointF)
		
		verify { path.moveTo(pointF.x, pointF.y) }
	}
	
	@Test
	fun testMoveToPoint() {
		path.moveTo(point)
		
		verify { path.moveTo(point.x.toFloat(), point.y.toFloat()) }
	}
	
	@Test
	fun testMoveToInt() {
		path.moveTo(x, y)
		
		verify { path.moveTo(x.toFloat(), y.toFloat()) }
	}
	
	@Test
	fun testLineToPointF() {
		path.lineTo(pointF)
		
		verify { path.lineTo(pointF.x, pointF.y) }
	}
	
	@Test
	fun testLineToPoint() {
		path.lineTo(point)
		
		verify { path.lineTo(point.x, point.y) }
	}
	
	@Test
	fun testLineToInt() {
		path.lineTo(x, y)
		
		verify { path.lineTo(x.toFloat(), y.toFloat()) }
	}
	
	@Test
	fun testOffSetPointF() {
		path.offset(pointF)
		
		verify { path.offset(pointF.x, pointF.y) }
	}
	
	@Test
	fun testOffSetPoint() {
		path.offset(point)
		
		verify { path.offset(point.x, point.y) }
	}
	
	@Test
	fun testQuadTo() {
		val controlPoint = PointF()
		controlPoint.x = 5F
		controlPoint.y = 5F
		path.quadTo(controlPoint, pointF)
		
		verify { path.quadTo(controlPoint.x, controlPoint.y, pointF.x, pointF.y) }
	}
	
	@After
	fun after() {
		unmockkAll()
	}
}
