package com.apprinka.api.remote

import android.telecom.Call
import com.apprinka.api.data.User
import com.apprinka.api.data.UserList
import retrofit2.http.GET
import retrofit2.http.Query

interface UserService {

    @GET("/users")
    fun listUser() : retrofit2.Call<List<User>>

    @GET("/users/")
    fun detailUser(@Query("user_name") url: String) : retrofit2.Call<UserList>

    @GET("/search/users?q=")
    fun searchUser(@Query("q") url: String) : retrofit2.Call<UserList>
}