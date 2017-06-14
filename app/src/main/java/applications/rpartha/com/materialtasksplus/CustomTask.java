package applications.rpartha.com.materialtasksplus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by tillu on 6/10/2017.
 */

public class CustomTask extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_task);

        Button button = (Button)findViewById(R.id.submit_btn);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(CustomTask.this, MainActivity.class));
                //Toast.makeText(getApplicationContext(), "Custom tasks are not complete yet!", Toast.LENGTH_LONG);
            }
        });
    }

    @Override
    public void onBackPressed(){
        //do nothing
    }
}
