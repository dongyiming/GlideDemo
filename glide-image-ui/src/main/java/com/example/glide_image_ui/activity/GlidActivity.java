package com.example.glide_image_ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.glide_image_ui.R;

/**
 * @version : 1.0
 * @Description : glide的简单实用
 * @autho : dongyiming
 * @data : 2017/7/23 23:47
 */
public class GlidActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;
    private ImageView glideView1;
    private ImageView glideView2;
    private ImageView glideView3;
    //本地文件服务器
    private final String imageUrl = "http://192.168.1.102:8080/images/andy.jpg";
    private final String gifUrl = "http://192.168.1.102:8080/images/parkgif.gif";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_glide);
        initView();
        initWidget();
    }

    private void initWidget() {
        btn.setOnClickListener(this);
    }

    private void initView() {
        btn = (Button) findViewById(R.id.btn);
        glideView1 = (ImageView) findViewById(R.id.img_glide1);
        glideView2 = (ImageView) findViewById(R.id.img_glide2);
        glideView3 = (ImageView) findViewById(R.id.img_glide3);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btn) {

            Glide.with(this)
                    .load(gifUrl)//自动识别gif格式
                    .placeholder(R.drawable.img_default)
                    .error(R.drawable.img_error)
                    .diskCacheStrategy(DiskCacheStrategy.NONE)//这个不加GIF加载失败，禁用硬盘缓存
                    .into(glideView1);

            Glide.with(this)
                    .load(imageUrl)
                    .asBitmap()//只允许加静态图片
                    .placeholder(R.drawable.img_default)
                    .error(R.drawable.img_error)
                    .into(glideView2);

            Glide.with(this)
                    .load(imageUrl)
                    .placeholder(R.drawable.img_default)
                    .error(R.drawable.img_error)
                    .skipMemoryCache(true)//禁用掉内存缓存
                    .override(200, 200)//设置尺寸
                    .into(glideView3);

        }
    }
}
