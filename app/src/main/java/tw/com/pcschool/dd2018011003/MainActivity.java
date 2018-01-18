package tw.com.pcschool.dd2018011003;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Handler handler1 = new Handler()
    {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            Log.d("MSG","取得一個Message");

            Bundle bd1 = msg.getData();
            String str1 = bd1.getString("Data1");
            Log.d("MSG2", "data1:" + str1);

        }
    };
    public void click1(View v)
    {
        Message message1 = new Message();
//        handler1.sendMessage(message1);

        Bundle bd1 = new Bundle();
        bd1.putString("Data1", "我是data");
        message1.setData(bd1);
        handler1.sendMessageDelayed(message1, 3000);


    }
}
