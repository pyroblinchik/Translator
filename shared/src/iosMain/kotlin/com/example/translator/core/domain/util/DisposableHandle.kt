package com.example.translator.core.domain.util

fun interface DisposableHandle : kotlinx.coroutines.DisposableHandle
//
// Equals to
//
//fun DisposableHandle(block: () -> Unit): DisposableHandle{
//    return object : DisposableHandle{
//        override fun dispose() {
//            block()
//        }
//    }
//}