package com.liangguo.easyingcontext

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Application
import androidx.fragment.app.FragmentActivity
import com.liangguo.easyingcontext.core.ContextProvider
import com.liangguo.easyingcontext.core.MyActivityManager
import java.lang.ref.WeakReference
import java.util.*


/**
 * @author ldh
 * 时间: 2022/2/16 15:12
 * 邮箱: 2637614077@qq.com
 *
 * 快速获取当前应用的context，Activity
 */
@SuppressLint("StaticFieldLeak")
object EasyingContext {

    val application: Application
        get() = ContextProvider.app

    /**
     * 这个context本质上还是[application]，只是为了提高调用方代码的可复用性和可迁移性，才新增这个名为context的属性。
     *
     * This is essentially an application. The reason why I wrote it is to improve the reusability of the caller's code.
     */
    val context = application

    /**
     * 当前栈顶Activity
     *
     * Current stack top activity
     */
    val currentActivity: Activity?
        get() = MyActivityManager.getLastActivity()

    /**
     * 当前栈顶的FragmentActivity
     * 如果当前栈顶的Activity不是FragmentActivity，则会返回null
     */
    val currentFragmentActivity: FragmentActivity?
        get() = currentActivity?.let {
            if (it is FragmentActivity) it
            else null
        }

    /**
     * 当前的Activity栈
     *
     * Current activity stack
     */
    val currentActivityStack: Stack<Activity>
        get() = MyActivityManager.getCurrentActivityStack()

    /**
     * Activity弱引用栈。
     */
    val activityWeakReferenceStack: Stack<WeakReference<Activity>>
        get() = MyActivityManager.activityStack

}