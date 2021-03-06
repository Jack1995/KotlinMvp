package com.junlong0716.mvpbaselibrary

import android.icu.lang.UCharacter.GraphemeClusterBreak.T


/**
 *@author: 巴黎没有摩天轮Li
 *@description: Model层 与 Presenter层 交互的CallBack
 *@date: Created in 上午11:00 2017/11/10
 *@modified by:
 */
interface Callback<T> {
    /**
     * 数据请求成功
     * @param data 请求到的数据
     */
    fun onSuccess(data: T)

    /**
     * 使用网络API接口请求方式时，虽然已经请求成功但是由
     * 于`msg`的原因无法正常返回数据。
     */
    fun onFailure(msg: String)

    /**
     * 请求数据失败，指在请求网络API接口请求方式时，出现无法联网、
     * 缺少权限，内存泄露等原因导致无法连接到请求数据源。
     */
    fun onError()

    /**
     * 当请求数据结束时，无论请求结果是成功，失败或是抛出异常都会执行此方法给用户做处理，通常做网络
     * 请求时可以在此处隐藏“正在加载”的等待控件
     */
    fun onComplete()
}