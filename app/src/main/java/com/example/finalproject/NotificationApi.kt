package com.example.finalproject

import com.example.finalproject.Constants.Companion.CONTENT_TYPE
import com.example.finalproject.Constants.Companion.SERVER_KEY
import com.example.finalproject.PushNotification
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface NotificationApi {

    @Headers("Authorization: key=$SERVER_KEY","Content-type:$CONTENT_TYPE")
    @POST("fcm/send")
    suspend fun postNotification(
        @Body notification:PushNotification
    ): Response<ResponseBody>
}