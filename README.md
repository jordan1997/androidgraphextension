# GraphExtension
A library for more easy work with the android canvas

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Maven Central](https://img.shields.io/maven-central/v/tech.schoolhelper/graphextension.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22tech.schoolhelper%22%20AND%20a:%22graphextension%22)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Android%20Graph%20Extension-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/7167)

## Documentation
`master` [Documenation](http://schoolhelper.tech/master/dokka/androidgraphextension/)

`dev` [Documenation](http://schoolhelper.tech/dev/dokka/androidgraphextension/)

## Branches stastus
`master` [![Build Status](https://travis-ci.org/schoolhelper/androidgraphextension.svg?branch=master)](https://travis-ci.org/schoolhelper/androidgraphextension)

`dev` [![Build Status](https://travis-ci.org/schoolhelper/androidgraphextension.svg?branch=dev)](https://travis-ci.org/schoolhelper/androidgraphextension)

# Add to project
```groovy
implementation 'tech.schoolhelper:graphextension:0.3.0'
```

# The library include following kotlin extension methods

The library included a lot extension for work with path, point and pointF object. Included following method:
## PointF

### The library included following for path (`android.graphics.Path`):
- Path.moveTo(PointF)
- Path.moveTo(Point)
- Path.moveTo(Int, Int)
- Path.lineTo(PointF)
- Path.lineTo(Point)
- Path.lineTo(Int, Int)
- Path.setLastPoint(PointF)
- Path.setLastPoint(Point)
- Path.setLastPoint(Int, Int)
- Path.offset(PointF)
- Path.offset(Point)
- Path.offset(Int, Int)
- Path.addRect(PointF, PointF)
- Path.addRect(PointF, PointF, Path.Direction)
- Path.addRect(Int, Int, Int)
- Path.addRect(Float, Float, Float)
- Path.quadTo(controlPoint: PointF, point: PointF)
- Path.quadToByPreviousPoint(previousPoint: PointF, point: PointF)

### The library included operators for Point(`android.graphics.Point`) and PointF (`android.graphics.PointF`):
- unaryMinus `val point = -somePoint`
- minus `pointA - pointB`
- plus `pointA + pointB`
- times `point * Double`
- times `point * Float`
- times `point * Int`
- div `point / Double`
- div `point / Float`
- div `point / Int`

### The library included operators for the Rect(`android.graphics.Rect`)
- Rect.contains(event: MotionEvent)
- Rect.contains(Float, Float)
- Rect.isNotEmpty
- Rect.contains(Point)
- Rect.contains(PointF)
- Rect.contains(RectF)

### The library included operators for the RectF(`android.graphics.RectF`)
- RectF.contains(MotionEvent)
- RectF.contains(x, y)
- RectF.contains(Point)
- RectF.contains(PointF)
- RectF.contains(Rect)
- RectF.getCenter()
- RectF.isNotEmpty

### Easy make Quad Path

```kotlin

val samplePoints = listOf<PointF>() // list must be init
val path = samplePoints.toQuadPath()
canvas.drawPath(path, paint)

```

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
