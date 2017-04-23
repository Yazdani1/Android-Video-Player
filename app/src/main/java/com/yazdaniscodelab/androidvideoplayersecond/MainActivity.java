package com.yazdaniscodelab.androidvideoplayersecond;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView myvideoview;
    MediaController mymedicontroller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myvideoview=(VideoView)findViewById(R.id.video_xml);

        mymedicontroller=new MediaController(this);

    }


    public void videoplay(View view){

        String myvideopath="android.resource://com.yazdaniscodelab.androidvideoplayersecond/"+R.raw.myvideo;
        Uri uri=Uri.parse(myvideopath);
        myvideoview.setVideoURI(uri);
        myvideoview.setMediaController(mymedicontroller);
        mymedicontroller.setAnchorView(myvideoview);
        myvideoview.start();

    }



}
