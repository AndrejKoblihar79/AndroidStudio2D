package cz.example.kalkulacka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView obraz;
    private TextView cislo1;
    private TextView cislo2;
    private TextView operace;

    private boolean prosel = false;
    private boolean c1Nastaven = false;

    private double c1;
    private double c2;
    private double vys;

    private int metoda = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        obraz = findViewById(R.id.obrazovka);
        obraz.setText("0");

        cislo1 = findViewById(R.id.cislo1);
        cislo1.setText("NaN");

        cislo2 = findViewById(R.id.cislo2);
        cislo2.setText("NaN");

        operace = findViewById(R.id.znamenko);
        operace.setText("...");

        public void zapisCislo(View sender) {
            Button tlac = (Button) sender;
            float number = Float.parseFloat(tlac.getText().toString());

            int pom = obraz.length();

            if (pom >= 9) {
                if (!prosel) {
                    if (number == 0) {
                        obraz.setText("0");
                        return;
                    } else {
                        obraz.setText(tlac.getText());
                        prosel = true;
                    }
                }

                return;
            }

            if (!prosel) {
                if (number != 0) {
                    obraz.setText(tlac.getText());
                    prosel = true;
                }
            } else {
                obraz.append(tlac.getText());
            }
        }
    }

}
