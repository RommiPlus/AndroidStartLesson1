package omron.omron.com.androidstartlesson1;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText editText = findViewById(R.id.editText);
        final EditText editText2 = findViewById(R.id.editText2);
        Button button = findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(editText.getText().toString(), editText2.getText().toString());
            }
        });
    }

    private void showToast(String userName, String password) {
        Toast.makeText(MainActivity.this, getString(userName, password), Toast.LENGTH_LONG).show();
    }

    @NonNull
    private String getString(String userName, String password) {
        return "userName: " + userName + " password: " + password;
    }
}
