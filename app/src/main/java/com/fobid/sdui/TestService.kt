package com.fobid.sdui

import com.fobid.sdui.models.Home
import io.reactivex.Flowable
import retrofit2.http.GET

interface TestService {

    @GET("/")
    fun home(): Flowable<Home>
}