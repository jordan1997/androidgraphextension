# GraphExtension
A library for more easy work with the android canvas

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