# GraphExtension
A library for more easy work with the android canvas

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## Branchs stastus
`master` [![CircleCI](https://circleci.com/gh/jordan1997/androidgraphextension/tree/master.svg?style=svg)](https://circleci.com/gh/jordan1997/androidgraphextension/tree/master)

`dev` [![CircleCI](https://circleci.com/gh/jordan1997/androidgraphextension/tree/dev.svg?style=svg)](https://circleci.com/gh/jordan1997/androidgraphextension/tree/dev)

# Add to project
```groovy
implementation 'com.schoolhelper.graphextension:graphextension:1.1.1'
```

# The library include extension methods

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

### Easy make point base on event
```kotlin

view.setOnTouchListener { v, event ->
	val point = PointF(event)
	return@setOnTouchListener true
}

```

### Easy make Quad Path

```kotlin

val samplePoints = listOf<PointF>() // list must be init
val path = samplePoints.toQuadPath()
canvas.drawPath(path, paint)

```

## PointF

### Easy times for point
```kotlin

val point = PointF(5F, 5F)
val scaleUpPoint = point * 5
val scaleDownPoint = point / 5

```
