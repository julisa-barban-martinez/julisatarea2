package julisabarbanmartinez.example.julisatarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hola extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola);
    }
    public void siguient (View view){
        Intent siguient = new Intent(this, MainActivity.class);
        startActivity(siguient);
    }
}
