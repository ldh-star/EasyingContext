package com.liangguo.easyingcontext.core

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri


/**
 * @author ldh
 * 时间: 2022/2/16 15:15
 * 邮箱: 2637614077@qq.com
 */
internal class MyContentProvider : ContentProvider() {

    override fun onCreate(): Boolean {
        ContextProvider.init(context!!)
        return true
    }

    override fun query(
        p0: Uri,
        p1: Array<out String>?,
        p2: String?,
        p3: Array<out String>?,
        p4: String?
    ): Cursor? = null

    override fun getType(p0: Uri): String? = null

    override fun insert(p0: Uri, p1: ContentValues?): Uri? = null

    override fun delete(p0: Uri, p1: String?, p2: Array<out String>?): Int = 0

    override fun update(p0: Uri, p1: ContentValues?, p2: String?, p3: Array<out String>?): Int = 0

}