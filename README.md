# NetDetect
An Android library to check actual internet connectivity.

[![](https://jitpack.io/v/SalahoAmro/NetDetect.svg)](https://jitpack.io/#SalahoAmro/NetDetect)

### How To Use

1. Add the JitPack repository to your build file. Add it in your root build.gradle at the end of repositories:
``` 
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
  ```
  
2. Add the dependency:
```
implementation 'com.github.SalahoAmro:NetDetect:1.0.0'
```

3. Initialize NetDetect in Application class:
```
NetDetect.init(this);
```

4. Use it anywhere!
```
NetDetect.check((isConnected -> Toast.makeText(this, isConnected + "", Toast.LENGTH_SHORT).show()));
```
