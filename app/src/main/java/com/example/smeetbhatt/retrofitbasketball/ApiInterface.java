package com.example.smeetbhatt.retrofitbasketball;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by smeetbhatt on 12/09/17.
 */

public interface ApiInterface  {

    @GET("/retrofit_basketball/getTeams.php")
    Call<List<Basketball>> getTeamInfo(@Query("get_team") String get_team);
}
