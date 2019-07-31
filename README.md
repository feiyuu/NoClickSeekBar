# NoClickSeekBar
禁止点击进度条快进的seekbar

SeekBar可拖动不可点击，滑块禁止点击快进【总结】：
https://blog.csdn.net/m0_38058826/article/details/90263182

seetkBar给滑块thumb设置旋转等待缓冲动画，drawable方式【总结】
https://blog.csdn.net/m0_38058826/article/details/86589809

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

