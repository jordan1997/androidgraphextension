# GraphExtension
A library for more easy work with the android canvas

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## Branches stastus
`master` [![CircleCI](https://circleci.com/gh/jordan1997/androidgraphextension/tree/master.svg?style=svg)](https://circleci.com/gh/jordan1997/androidgraphextension/tree/master)

`dev` [![CircleCI](https://circleci.com/gh/jordan1997/androidgraphextension/tree/dev.svg?style=svg)](https://circleci.com/gh/jordan1997/androidgraphextension/tree/dev)

# Add to project
```groovy
implementation 'com.schoolhelper.graphextension:graphextension:1.1.1'
```

The library included a lot extension for work with path, point and pointF object. Included following method:

- Path.moveTo(PointF)
- Path.moveTo(Point)
- Path.moveTo(Int, Int)
- Path.lineTo(PointF)
- Path.lineTo(Point)
- Path.lineTo(Int, Int)
- Path.setLastPoint(PointF)
- Path.offset(PointF)
- Path.offset(Point)
- Path.offset(Int, Int)
- Path.addRect(PointF, PointF)
- Path.addRect(PointF, PointF, Path.Direction)

The library included operators for pointF:
- unaryMinus (val point = -somePoint)
- minus (pointFa - pointFb)
- plus (pointFa + pointFb)
- times (pointF * Double)
- times (pointF * Float)
- times (pointF * Int)
- div (pointF / Double)
- div (pointF / Float)
- div (pointF / Int)

# The library include following kotlin extension methods

## PointF

### Easy make point base on event
```kotlin

view.setOnTouchListener { v, event ->
	val point = PointF(event)
	return@setOnTouchListener true
}

```
### Easy times for point
```kotlin

val point = PointF(5F, 5F)
val scaleUpPoint = point * 5
val scaleDownPoint = point / 5

```

### Convert

#### Point -> PointF
```kotlin

val point = Point(5, 5)
point.toPointF()

```
#### PointF -> Point
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

### Easy make Quad Path

```kotlin

val samplePoints = listOf<PointF>() // list must be init
val path = samplePoints.toQuadPath()
canvas.drawPath(path, paint)

```

