
# EasyingContext

[![](https://jitpack.io/v/ldh-star/EasyingContext.svg)](https://jitpack.io/#ldh-star/EasyingContext) ![](https://img.shields.io/badge/author-ldh-orange.svg) ![](https://img.shields.io/hexpm/l/plug.svg)


## Start

#### Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

#### Step 2. Add the dependency

```gradle
dependencies {
	implementation 'com.github.ldh-star:EasyingContext:$last_version'
}
```

#### Step 3. Usage

```kotlin

val context = EasyingContext.context

val activity = EasyingContext.currentActivity

```

#### End