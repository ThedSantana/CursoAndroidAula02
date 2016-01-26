package luisamorim.com.br.cursoandroidaula02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.btnSomar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num1 = ((EditText)findViewById(R.id.editTextNum1)).getText().toString();
                String num2 = ((EditText)findViewById(R.id.editTextNum2)).getText().toString();
                BigDecimal bigDecimal = new BigDecimal(num1);
                BigDecimal bigDecimal1 = new BigDecimal(num2);
                BigDecimal result = bigDecimal.add(bigDecimal1);
                ((TextView)findViewById(R.id.txtResultado)).setText(result.toString());

            }
        });
    }
}
