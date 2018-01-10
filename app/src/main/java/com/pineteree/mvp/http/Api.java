package com.pineteree.mvp.http;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Administrator on 2018/1/8.
 */

public interface Api {

    @GET("data/{category}/{pageSize}/{page}")
    Observable<GankModel> getCategoryData(@Path("category") String category,
                                          @Path("pageSize") int pageSize,
                                          @Path("page") int page);
}
