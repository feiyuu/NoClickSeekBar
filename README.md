# NoClickSeekBar
禁止点击进度条快进的seekbar，很靓的增大滑块区域实现方式，很靓的防止点击滑块跳转进度方式，还能给滑块加旋转等待动画

简书地址：https://www.jianshu.com/p/15f3e3d2ee95

    同时优化了体验：
        增加了滑块触摸区域
        增加了滑块等待动画



Step 1. Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.feiyuu:NoClickSeekBar:Tag'
	}

