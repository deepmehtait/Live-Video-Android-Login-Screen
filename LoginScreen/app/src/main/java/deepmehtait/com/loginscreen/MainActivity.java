package deepmehtait.com.loginscreen;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    EditText emailID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView videoView = (VideoView) findViewById(R.id.vid);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vid);
        videoView.setDrawingCacheEnabled(true);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
        Button btn = (Button) findViewById(R.id.btn_login);
        emailID = (EditText) findViewById(R.id.input_email);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String emailid = emailID.getText().toString();
                Toast.makeText(getApplicationContext(), "Hello " + emailid + ".!", Toast.LENGTH_LONG).show();
            }
        });

    }
}
