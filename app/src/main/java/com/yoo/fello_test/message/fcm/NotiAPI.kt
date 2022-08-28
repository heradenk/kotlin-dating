package com.yoo.fello_test.message.fcm

import com.yoo.fello_test.message.fcm.Repo.Companion.CONTENT_TYPE
import com.yoo.fello_test.message.fcm.Repo.Companion.SERVER_KEY
import com.yoo.fello_test.message.fcm.Repo.Companion.SERVER_KEY
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface NotiAPI {

    @Headers("Authorization: key=$SERVER_KEY", "Content-Type:$CONTENT_TYPE")
    @POST("fcm/send")
    suspend fun postNotification(@Body notification: PushNotification): Response<ResponseBody>

}