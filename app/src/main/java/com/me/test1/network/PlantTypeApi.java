package com.me.test1.network;

import com.me.test1.dto.PlantTypeListRecordDTO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PlantTypeApi {
    @GET("/api/v1/plant/types")
    Call<List<PlantTypeListRecordDTO>> getPlantTypes();
}