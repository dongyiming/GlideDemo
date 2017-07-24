package com.example.glide_image_ui;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *  @Description :
 *  @autho : dongyiming
 *  @version : 1.0
 *  @data : 2017/7/21 2:52
 */
public class FileHttpInvoke {

    private final String filePath = "http://192.168.1.102:8080/file";
    private final FileService fileService;

    public FileHttpInvoke() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(filePath)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        fileService = retrofit.create(FileService.class);
    }

    /*public void downLoad(String filePath, Subscriber<Bitmap> subscriber) {

        fileService.downLoad(filePath)
                .map(new Fun1())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);

    }*/
}
