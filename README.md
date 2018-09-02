# GraphExtension
A library for more easy work with the android canvas

# The library include extension methods

## Path

### Easy add point to path

```kotlin

val point1 = Point(2, 2)
val point2 = Point(4, 4)
val point3 = Point(6, 6)
val path = Path()

path.moveTo(point1)
path.lineTo(point2)
path.setLastPoint(point3)

```