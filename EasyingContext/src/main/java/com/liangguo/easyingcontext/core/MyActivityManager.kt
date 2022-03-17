package com.liangguo.easyingcontext.core

import android.app.Activity
import java.lang.ref.WeakReference
import java.util.*


/**
 * @author ldh
 * 时间: 2022/2/16 15:27
 * 邮箱: 2637614077@qq.com
 */
internal object MyActivityManager {

    /**
     * Activity弱引用的栈
     */
    val activityStack = Stack<WeakReference<Activity>>()

    /**
     * 新的Activity入栈
     */
    fun pushActivity(activity: Activity) {
        activityStack.push(WeakReference(activity))
    }

    /**
     * 移除掉Activity
     */
    fun removeActivity(activity: Activity) {
        activityStack.lastOrNull { it.get() == activity }?.let {
            activityStack.remove(it)
        }
    }

    /**
     * 获取当前的Activity栈
     */
    fun getCurrentActivityStack() = Stack<Activity>().apply {
        activityStack.forEach { wr ->
            wr.get()?.let {
                push(it)
            }
        }
    }

    /**
     * 获取栈顶Activity
     */
    fun getLastActivity(): Activity? = activityStack.lastOrNull()?.let {
        it.get() ?: let {
            activityStack.pop()
            getLastActivity()
        }
    }


}