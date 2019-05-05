# GraphExtension
A library for more easy work with the android canvas

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Android%20Graph%20Extension-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/7167)
[![Dependabot Status](https://api.dependabot.com/badges/status?host=github&repo=schoolhelper/androidgraphextension)](https://dependabot.com)

## Documentation
### Android graph extension
`master` [Documentation](https://schoolhelper.tech/master/dokka/androidgraphextension/)

`dev` [Documentation](https://schoolhelper.tech/dev/dokka/androidgraphextension/)

### Apache math extension
`master` [Documentation](https://schoolhelper.tech/master/dokka/apachmathextension/index.html)

`dev` [Documentation](https://schoolhelper.tech/dev/dokka/apachmathextension/index.html)


## Branches stastus
`master` [![Build Status](https://travis-ci.org/schoolhelper/androidgraphextension.svg?branch=master)](https://travis-ci.org/schoolhelper/androidgraphextension) [![codecov](https://codecov.io/gh/schoolhelper/androidgraphextension/branch/master/graph/badge.svg)](https://codecov.io/gh/schoolhelper/androidgraphextension)

`dev` [![Build Status](https://travis-ci.org/schoolhelper/androidgraphextension.svg?branch=dev)](https://travis-ci.org/schoolhelper/androidgraphextension) [![codecov](https://codecov.io/gh/schoolhelper/androidgraphextension/branch/dev/graph/badge.svg)](https://codecov.io/gh/schoolhelper/androidgraphextension)

## Add android graph extension to project
[![Maven Central](https://img.shields.io/maven-central/v/tech.schoolhelper/graphextension.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22tech.schoolhelper%22%20AND%20a:%22graphextension%22)

```groovy
implementation 'tech.schoolhelper:graphextension:1.1.0'
```

## Add apache math extension to project
[![Maven Central](https://img.shields.io/maven-central/v/tech.schoolhelper/apachextension.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22tech.schoolhelper%22%20AND%20a:%22apachextension%22)
```groovy
implementation 'tech.schoolhelper:apachextension:1.1.0'
```

## Graphextension module include following kotlin extension methods

### Module has the following extension methods for path (`android.graphics.Path`):
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
