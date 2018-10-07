package com.arieftb.fuclub.network

import com.arieftb.fuclub.model.teamlist.TeamListResponse
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query

interface NetworkService {
    @GET("lookup_all_teams.php")
    fun getTeamList(@Query("id") id: String): Flowable<TeamListResponse>
}