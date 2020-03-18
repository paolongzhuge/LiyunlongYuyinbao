package cn.a7e7.liyunongyuyinbao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16, bt17, bt18, bt19, bt20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);      //设置屏幕不随手机旋转
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);      //设置手机直向显示
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);   //设置屏幕不进入休眠
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);
        bt10 = findViewById(R.id.bt10);
        bt11 = findViewById(R.id.bt11);
        bt12 = findViewById(R.id.bt12);
        bt13 = findViewById(R.id.bt13);
        bt14 = findViewById(R.id.bt14);
        bt15 = findViewById(R.id.bt15);
        bt16 = findViewById(R.id.bt16);
        bt17 = findViewById(R.id.bt17);
        bt18 = findViewById(R.id.bt18);
        bt19 = findViewById(R.id.bt19);
        bt20 = findViewById(R.id.bt20);

    }

    public void btt1(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.a1);//这时就不用调用setDataSource了
        mp.start();     //开始播放
    }

    public void btt2(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.a2);//这时就不用调用setDataSource了
        mp.start();     //开始播放
    }

    public void btt3(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.a3);//这时就不用调用setDataSource了
        mp.start();     //开始播放
    }

    public void btt4(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.a4);//这时就不用调用setDataSource了
        mp.start();     //开始播放
    }

    public void btt5(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.a5);//这时就不用调用setDataSource了
        mp.start();     //开始播放
    }

    public void btt6(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.a6);//这时就不用调用setDataSource了
        mp.start();     //开始播放
    }

    public void btt7(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.a7);//这时就不用调用setDataSource了
        mp.start();     //开始播放
    }

    public void btt8(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.a8);//这时就不用调用setDataSource了
        mp.start();     //开始播放
    }

    public void btt9(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.a9);//这时就不用调用setDataSource了
        mp.start();     //开始播放
    }

    public void btt10(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.a10);//这时就不用调用setDataSource了
        mp.start();     //开始播放
    }

    public void btt11(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.a11);//这时就不用调用setDataSource了
        mp.start();     //开始播放
    }

    public void btt12(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.a12);//这时就不用调用setDataSource了
        mp.start();     //开始播放
    }

    public void btt13(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.a13);//这时就不用调用setDataSource了
        mp.start();     //开始播放
    }

    public void btt14(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.a14);//这时就不用调用setDataSource了
        mp.start();     //开始播放
    }

    public void btt15(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.a15);//这时就不用调用setDataSource了
        mp.start();     //开始播放
    }

    public void btt16(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.a16);//这时就不用调用setDataSource了
        mp.start();     //开始播放
    }

    public void btt17(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.a17);//这时就不用调用setDataSource了
        mp.start();     //开始播放
    }

    public void btt18(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.a18);//这时就不用调用setDataSource了
        mp.start();     //开始播放
    }

    public void btt19(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.a19);//这时就不用调用setDataSource了
        mp.start();     //开始播放
    }

    public void btt20(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.a20);//这时就不用调用setDataSource了
        mp.start();     //开始播放
    }

}