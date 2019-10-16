# GraphExtension
A library for more easy work with the android canvas

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![CodeFactor](https://www.codefactor.io/repository/github/schoolhelper/androidgraphextension/badge)](https://www.codefactor.io/repository/github/schoolhelper/androidgraphextension)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Android%20Graph%20Extension-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/7167)
[![Dependabot Status](https://api.dependabot.com/badges/status?host=github&repo=schoolhelper/androidgraphextension)](https://dependabot.com)
[![JitPack](https://jitpack.io/v/schoolhelper/androidgraphextension.svg)](https://jitpack.io/#schoolhelper/androidgraphextension)

## Branches stastus
`master` [![Build Status](https://travis-ci.org/schoolhelper/androidgraphextension.svg?branch=master)](https://travis-ci.org/schoolhelper/androidgraphextension) [![codecov](https://codecov.io/gh/schoolhelper/androidgraphextension/branch/master/graph/badge.svg)](https://codecov.io/gh/schoolhelper/androidgraphextension)

`dev` [![Build Status](https://travis-ci.org/schoolhelper/androidgraphextension.svg?branch=dev)](https://travis-ci.org/schoolhelper/androidgraphextension) [![codecov](https://codecov.io/gh/schoolhelper/androidgraphextension/branch/dev/graph/badge.svg)](https://codecov.io/gh/schoolhelper/androidgraphextension)

## Integration
Add it in your root build.gradle at the end of repositories:
```groovy
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Add the dependency
```groovy
dependencies {
	        implementation 'com.github.schoolhelper:androidgraphextension:1.2.0'
}
```

## Graphextension include following kotlin extension methods

### Module has the following extension methods for path (`android.graphics.Path`):
|with library						|without library                 				|
|-------------------------------------------------------|---------------------------------------------------------------|
|path.moveTo(pointF)					|path.moveTo(pointF.x, pointF.y)				|
|path.moveTo(point)					|path.moveTo(point.x.toFloat(), point.y.toFloat())		|
|path.moveTo(xIntValue, yIntValue)			|path.moveTo(xIntValue.toFloat(), yIntValue.toFloat()		|
|path.lineTo(pointF)					|path.lineTo(pointF.x, pointF.y)				|
|path.lineTo(point)					|path.lineTo(point.x.toFloat(), point.y.toFloat())		|
|path.lineTo(xIntValue, yIntValue)			|path.lineTo(xIntValue.toFloat(), yIntValue.toFloat()		|
|path.setLastPoint(pointF)				|path.setLastPoint(pointF.x, pointF.y)				|
|path.setLastPoint(point)				|path.setLastPoint(point.x.toFloat(), point.y.toFloat())	|
|path.setLastPoint(xIntValue, yIntValue)		|path.setLastPoint(xIntValue.toFloat(), yIntValue.toFloat()	|
|path.offset(pointF)					|path.offset(pointF.x, pointF.y)				|
|path.offset(point)					|path.offset(point.x.toFloat(), point.y.toFloat())		|
|path.offset(xIntValue, yIntValue)			|path.offset(xIntValue.toFloat(), yIntValue.toFloat()		|
|path.addRect(pointF1, pointF2)				|path.addRect(pointF1.x, pointF1.y, pointF2.x, pointF2.y)	|
|path.addRect(point1, point2)				|path.addRect(point1.x.toFloat(), point1.y.toFloat(), point2.x.toFloat(), point2.y.toFloat())	|
|path.addRect(leftInt, topInt, rightInt, bottomInt)	|path.addRect(leftInt.toFloat(), topInt.toFloat(), rightInt.toFloat(), bottomInt.toFloat())
|path.quadTo(controlPointF, pointF)			|path.quadTo(controlPointF.x, controlPointF.y, pointF.x, pointF.y)|

### Module has the following operators for Point(`android.graphics.Point`) and PointF (`android.graphics.PointF`):
- unaryMinus `val point = -somePoint`
- minus `pointA - pointB`
- plus `pointA + pointB`
- times `point * Double`
- times `point * Float`
- times `point * Int`
- div `point / Double`
- div `point / Float`
- div `point / Int`

### Module has the following extension methods for the Point(`android.graphics.Point`), PointF (`android.graphics.PointF`) and MotionEvent(`android.view.MotionEvent`):
- distanceTo(MotionEvent)
- distanceTo(Point)
- distanceTo(PointF)
- distanceTo(Int, Int)
- distanceTo(Float, Float)
- distanceTo(Double, Double)

### Module has following operators for the Rect(`android.graphics.Rect`)
- Rect.contains(event: MotionEvent) : Boolean
- Rect.contains(Float, Float) : Boolean
- Rect.contains(Double, Double)
- Rect.contains(Point) : Boolean
- Rect.contains(PointF) : Boolean
- Rect.contains(RectF) : Boolean
- Rect.getCenter() : PointF
- Rect.isNotEmpty : Boolean

### Module has following operators for the RectF(`android.graphics.RectF`)
- RectF.contains(MotionEvent) : Boolean 
- RectF.contains(Float, Float) : Boolean
- RectF.contains(Double, Double)
- RectF.contains(Point) : Boolean
- RectF.contains(PointF) : Boolean
- RectF.contains(Rect) : Boolean
- RectF.getCenter() : PointF
- RectF.isNotEmpty : Boolean

### Easy make Quad Path

```kotlin
val samplePoints = listOf<PointF>() // list must be init
val path = samplePoints.toQuadPath()
canvas.drawPath(path, paint)

```

## Apachextension module include following kotlin extension methods

### Module has following variables for work with numbers (this variable use FastMath)
- Float.sqr
- Double.sqr

### Module has following variables for Vector2D:
- Vector2D(PointF, PointF) : Vector2D
- Vector2D(Point, Point) : Vector2D
- Vector2D.safeNormalize : Vector2D
- Vector2D.makeNormalVector : Vector2D

# Samples

## Easy make point base on event
```kotlin
view.setOnTouchListener { v, event ->
	val point = PointF(event)
	return@setOnTouchListener true
}

```
## Easy times for point
```kotlin
val point = PointF(5F, 5F)
val scaleUpPoint = point * 5
val scaleDownPoint = point / 5
```

## Convert

### Point -> PointF
```kotlin

val point = Point(5, 5)
point.toPointF()

```
### PointF -> Point
```kotlin
val pointF = PointF(5F, 5F)
pointF.toPoint()
```

## Path

### Easy add point to path

```kotlin
val point1 = PointF(2, 2)
val point2 = PointF(4, 4)
val point3 = PointF(6, 6)
val path = Path()

path.moveTo(point1)
path.lineTo(point2)
path.setLastPoint(point3)
```

# Deploy
```bash
./gradlew uploadArchives -PNEXUS_USERNAME=$NEXUS_USERNAME -PNEXUS_PASSWORD=$NEXUS_PASSWORD -Psigning.secretKeyRingFile=../secring.gpg -Psigning.keyId=$keyId -Psigning.password=$password
```
