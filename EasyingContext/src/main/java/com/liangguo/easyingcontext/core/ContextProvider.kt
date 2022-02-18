package com.liangguo.easyingcontext.core

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Application
import android.content.Context
import android.os.Bundle


/**
 * @author ldh
 * 时间: 2022/2/16 15:24
 * 邮箱: 2637614077@qq.com
 */
@SuppressLint("StaticFieldLeak")
internal object ContextProvider {

    lateinit var app: Application

    /**
     * 初始化，设置context的持有以及监听Activity的生命周期
     */
    fun init(context: Context) {
        this.app = context.applicationContext as Application
        app.registerActivityLifecycleCallbacks(mActivityLifecycleCallback)
    }


    private val mActivityLifecycleCallback = object : Application.ActivityLifecycleCallbacks {

        override fun onActivityCreated(p0: Activity, p1: Bundle?) {
            MyActivityManager.pushActivity(p0)
        }

        override fun onActivityDestroyed(p0: Activity) {
            MyActivityManager.removeActivity(p0)
        }

        override fun onActivityStarted(p0: Activity) {}

        override fun onActivityResumed(p0: Activity) {}

        override fun onActivityPaused(p0: Activity) {}

        override fun onActivityStopped(p0: Activity) {}

        override fun onActivitySaveInstanceState(p0: Activity, p1: Bundle) {}

    }

}