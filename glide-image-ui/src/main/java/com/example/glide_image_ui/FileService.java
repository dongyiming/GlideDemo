package com.example.glide_image_ui;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @version : 1.0
 * @Description :
 * @autho : dongyiming
 * @data : 2017/7/21 2:46
 */
public interface FileService {

    @GET("down")
    Observable<ResponseBody> downLoad(@Query("filePath") String filePath);
}
