package com.yjmfortune.lxdanmudemo;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;

import com.yjmfortune.lxdanmudemo.danmu.DanmuControl;
import com.yjmfortune.lxdanmudemo.model.Danmu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import master.flame.danmaku.controller.IDanmakuView;

public class MainActivity extends AppCompatActivity {


    private IDanmakuView mDanmakuView;
    private DanmuControl mDanmuControl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDanmuControl = new DanmuControl(this);
        initView();
    }

    private void initView() {
        mDanmakuView = (IDanmakuView) findViewById(R.id.danmakuView);
        mDanmuControl.setDanmakuView(mDanmakuView);

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                setData();
            }
        },500);

    }


    private void setData() {
        List<Danmu> danmus = new ArrayList<>();
        Danmu danmu1 = new Danmu(0, 1, "Like", R.mipmap.ic_default_header, "");
        danmu1.url="http://tp1.sinaimg.cn/2080085600/180/5621408993/1";
        Danmu danmu2 = new Danmu(0, 2, "Comment", R.mipmap.ic_default_header, "这是一条弹幕啦啦啦");
        danmu2.url="http://tp1.sinaimg.cn/2080085600/180/5621408993/1";
        Danmu danmu3 = new Danmu(0, 3, "Like", R.mipmap.ic_default_header, "");
        danmu3.url="http://tp1.sinaimg.cn/2080085600/180/5621408993/1";
        Danmu danmu4 = new Danmu(0, 1, "Comment", R.mipmap.wat, "这又是一条弹幕啦啦啦");
        danmu4.url="http://tp1.sinaimg.cn/2080085600/180/5621408993/1";
        Danmu danmu5 = new Danmu(0, 2, "Like", R.mipmap.wat, "");
        danmu5.url="http://tp1.sinaimg.cn/2080085600/180/5621408993/1";
        Danmu danmu6 = new Danmu(0, 3, "Comment", R.mipmap.wat, "这还是一条弹幕啦啦啦");
        danmu6.url="http://tp1.sinaimg.cn/2080085600/180/5621408993/1";
        danmus.add(danmu1);
        danmus.add(danmu2);
        danmus.add(danmu3);
        danmus.add(danmu4);
        danmus.add(danmu5);
        danmus.add(danmu6);
        Collections.shuffle(danmus);
        mDanmuControl.addDanmuList(danmus);
    }



}
