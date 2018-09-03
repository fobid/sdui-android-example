package com.fobid.sdui

import io.reactivex.Flowable
import retrofit2.http.GET

interface TestService {

    @GET("/")
    fun home(): Flowable<Home>
}