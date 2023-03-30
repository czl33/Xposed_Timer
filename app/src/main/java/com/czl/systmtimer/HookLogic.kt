package com.czl.systmtimer

import android.util.Log
import de.robv.android.xposed.IXposedHookLoadPackage
import de.robv.android.xposed.IXposedHookZygoteInit
import de.robv.android.xposed.XposedBridge
import de.robv.android.xposed.callbacks.XC_LoadPackage

/**
 *
 * @Author Czl
 * @Date 2023/3/30-17:36
 * @Email chenzhouliang@twh.com.cn
 */
class HookLogic : IXposedHookLoadPackage {
    companion object{
        const val TAG = "HookLogic"
    }
    override fun handleLoadPackage(lpparam: XC_LoadPackage.LoadPackageParam) {
        Log.i(TAG,"hookName:${lpparam.packageName}")
        XposedBridge.log("HookLogic >> current package:" + lpparam.packageName)
    }
}