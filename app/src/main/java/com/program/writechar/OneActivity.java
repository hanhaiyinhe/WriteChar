package com.program.writechar;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.io.IOException;
import java.io.InputStream;
import java.util.Timer;
import java.util.TimerTask;;

/**
 * Created by tianhua on 2017/9/23.
 */

public class OneActivity extends Activity {
    MediaPlayer mediaPlayer;
    private ImageView iv_frame;
    int i = 1;
    float x1, x2, x3;
    float y1, y2, y3;
    int igvx, igvy;
    int type = 0;
    int widthPixels, heightPixels;
    float scaleWidth, scaleHeight;
    Timer touchTimer = null;
    Bitmap arrdown;
    boolean typedialog = true;
    private LinearLayout linearLayout = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        if(MainActivity.isPlay) {
            PlayMusic();
        }
        initView();
    }

    private void initView() {
        iv_frame = (ImageView) findViewById(R.id.iv_frame);
        linearLayout = (LinearLayout) findViewById(R.id.LinearLayout1);
        LinearLayout write_layout = (LinearLayout) findViewById(R.id.LinearLayout_number);
        write_layout.setBackgroundResource(R.drawable.bg1);
        widthPixels = this.getResources().getDisplayMetrics().widthPixels;
        heightPixels = this.getResources().getDisplayMetrics().heightPixels;
        scaleWidth = ((float) widthPixels / 720);
        scaleHeight = ((float) heightPixels / 1280);
        try {
            InputStream is = getResources().getAssets().open("on1_1.png");
            arrdown = BitmapFactory.decodeStream(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) iv_frame.getLayoutParams();
        layoutParams.width = (int) (arrdown.getWidth() * scaleWidth);
        layoutParams.height = (int) (arrdown.getHeight() * scaleHeight);
        iv_frame.setLayoutParams(layoutParams);
        lodimagep(1);

        linearLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        x1 = motionEvent.getX();
                        y1 = motionEvent.getY();
                        igvx = iv_frame.getLeft();
                        igvy = iv_frame.getTop();
                        if(x1 >= igvx && x1<= igvx + (int) (arrdown.getWidth() * scaleWidth)
                                && y1 >= igvy && y1<= igvy + (int) (arrdown.getWidth() * scaleWidth)) {
                            type = 1;
                        } else {
                            type = 0;
                        }
                        break;
                    case MotionEvent.ACTION_MOVE:
                        igvx = iv_frame.getLeft();
                        igvy = iv_frame.getTop();
                        x2 = motionEvent.getX();
                        y2 = motionEvent.getY();
                        if(type == 1) {
                            if(x2 >= igvx && x2 <= igvx + (int) (arrdown.getWidth() * scaleWidth)) {
                                if(y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 && y2 >= igvy) {
                                    lodimagep(1);
                                } else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 2) {
                                    lodimagep(2);
                                } else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 3) {
                                    lodimagep(3);
                                } else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 4) {
                                    lodimagep(4);
                                } else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 5) {
                                    lodimagep(5);
                                } else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 6) {
                                    lodimagep(6);
                                } else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 7) {
                                    lodimagep(7);
                                } else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 8) {
                                    lodimagep(8);
                                } else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 9) {
                                    lodimagep(9);
                                } else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 10) {
                                    lodimagep(10);
                                } else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 11) {
                                    lodimagep(11);
                                } else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 12) {
                                    lodimagep(12);
                                } else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 13) {
                                    lodimagep(13);
                                } else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 14) {
                                    lodimagep(14);
                                } else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 15) {
                                    lodimagep(15);
                                } else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 16) {
                                    lodimagep(16);
                                } else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 17) {
                                    lodimagep(17);
                                } else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 18) {
                                    lodimagep(18);
                                } else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 19) {
                                    lodimagep(19);
                                } else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 20) {
                                    lodimagep(20);
                                } else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 21) {
                                    lodimagep(21);
                                } else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 22) {
                                    lodimagep(22);
                                } else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 23) {
                                    lodimagep(23);
                                } else if (y2 <= igvy + (int) (arrdown.getHeight() * scaleHeight) / 24 * 24) {
                                    lodimagep(24);
                                } else {
                                    type = 0;
                                }
                            }
                        }
                        break;
                    case MotionEvent.ACTION_UP:
                        type = 0;
                        if(touchTimer != null) {
                            touchTimer.cancel();
                            touchTimer = null;
                        }
                        touchTimer = new Timer();
                        touchTimer.schedule(new TimerTask(){
                            @Override
                            public void run() {
                                Thread thread = new Thread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Message message = new Message();
                                        message.what = 2;
                                        mHandler.sendMessage(message);
                                    }
                                });
                                thread.start();
                            }
                        }, 300, 200);
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
    } //创建initView()方法尾部

    public Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch(msg.what) {
                case 2:
                    jlodimage();
                    break;
                default:
                    break;
            }
            super.handleMessage(msg);
        }
    };

    private void jlodimage() {
        if(i == 25) {

        } else if (i < 25) {
            if(i > 1) {
                i--;
            } else if (i == 1) {
                i = 1;
                if(touchTimer != null) {
                    touchTimer.cancel();
                    touchTimer = null;
                }
            }
            String name = "on1_" + i;
            int imgid = getResources().getIdentifier(name, "drawable", "com.program.writechar");
            iv_frame.setBackgroundResource(imgid);
        }
    }

    private synchronized void lodimagep(int j) {
        i = j;
        if(i < 25) {
            String name ="on1_" + i;
            int imgid = getResources().getIdentifier(name, "drawable", "com.program.writechar");
            iv_frame.setBackgroundResource(imgid);
            i++;
        }
        if(j == 24) {
            if(typedialog) {
                dialog();
            }
        }
    }

    protected void dialog() {
        typedialog = false;
        AlertDialog.Builder builder = new AlertDialog.Builder(OneActivity.this);
        builder.setMessage("太棒了！书写完成！");
        builder.setTitle("提示");
        builder.setPositiveButton("完成", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                typedialog = true;
                finish();
            }
        });
        builder.setNegativeButton("再来一次", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                typedialog = true;
                i = 1;
                lodimagep(i);
            }
        });
        builder.create().show();
    }

    private void PlayMusic() {
        mediaPlayer = MediaPlayer.create(this, R.raw.music1);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        if(MainActivity.isPlay) {
            PlayMusic();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
