# Changelog

## 1.0.0

### Codebase
- Split library to two modules: android graph, apache math
- Migration from package com to tech

### Migration/Updates
- Kotlin from 1.2.71 to 1.3.11

### Other
- Update gradle plugin for deploy lib
- Add javadoc.jar to maven central

## 0.3.0

### Code base
#### Rect
- implement `Rect.contains(Point)`
- implement `Rect.contains(PointF)`
- implement `Rect.contains(RectF)`

#### RectF (Thanks, [yoavst](https://github.com/yoavst) for [PR](https://github.com/schoolhelper/androidgraphextension/pull/26))
- implement `RectF.contains(MotionEvent)`
- implement `RectF.contains(x, y)'
- implement `RectF.contains(Point)'
- implement `RectF.contains(PointF)`
- implement `RectF.contains(Rect)'
- implement `RectF.getCenter()'
- implement `RectF.isNotEmpty'

### Others
- Add auto deploy documentation to [web page](http://schoolhelper.tech/)
- Add documentation to the library methods.
- Clean unused grade plugin.

## 0.2.1

### Migration/Updates
- Kotlin from 1.2.70 to 1.2.71
- android-maven-gradle-plugin from 1.4.1 to 2.1
- android-tools-build-gradle from 3.1.4 to 3.2.0
- gradle from 4.4 to 4.6

### Others
- remove build jacoco report from the CI system

## 0.2

### Code base
- added `setLastPoint` for Point and PointF
- added the operators to the Point (unary minus, minus, plus, times, div)
- added contains for Int params and MotionEvent
- added getCenter method

### Migration/Updates
- Update Kotlin version to 1.2.70
- Migration CI from CircleCi to TravisCI 



