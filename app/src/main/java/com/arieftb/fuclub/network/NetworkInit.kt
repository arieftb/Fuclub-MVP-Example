/*
 * Copyright www.arieftb.com (c) 2018.
 */

package com.arieftb.fuclub.network

import com.arieftb.fuclub.BuildConfig
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object NetworkInit {
    fun create(): NetworkService {
        val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BuildConfig.BASE_URL)
                .build()

        return retrofit.create(NetworkService::class.java)
    }
}