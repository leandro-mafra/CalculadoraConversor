package com.mafra.calculadoraconversor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import com.mafra.calculadoraconversor.velocidade.*;

import java.util.ArrayList;
import java.util.List;

public class ActivityVelo extends AppCompatActivity {

    private Spinner spiVelo;
    private String[] lista = new String[]{"Quilômetro por hora - Km/h", "Metro por segundo - m/s", "Milha por hora - Mph", "Pés por segundo - ft/s" ,"Milha náutica - Nó"};
    private ArrayAdapter<String> spi;

    private EditText entrada;

    private TextView viw1;
    private TextView resu1;
    private TextView viw2;
    private TextView resu2;
    private TextView viw3;
    private TextView resu3;
    private TextView viw4;
    private TextView resu4;

    private int posicao;

    private ConverVelo velo;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_velo);

        spiVelo = (Spinner)findViewById(R.id.spinnerVelo);
        spi = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, lista);
        spiVelo.setAdapter(spi);
        spiVelo.setOnItemSelectedListener(spinne);


        entrada = (EditText)findViewById(R.id.EntradaVelo);
        entrada.addTextChangedListener(testoEntre);

        viw1 = (TextView)findViewById(R.id.viVelo1);
        viw2 = (TextView)findViewById(R.id.viVelo2);
        viw3 = (TextView)findViewById(R.id.viVelo3);
        viw4 = (TextView)findViewById(R.id.viVelo4);

        resu1 = (TextView)findViewById(R.id.reVelo1);
        resu2 = (TextView)findViewById(R.id.reVelo2);
        resu3 = (TextView)findViewById(R.id.reVelo3);
        resu4 = (TextView)findViewById(R.id.reVelo4);

        velo = new ConverVelo();

    }

    private AdapterView.OnItemSelectedListener spinne = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            posicao = position;
            switch (position){
                case 0:
                    viw1.setText(lista[1]);
                    viw2.setText(lista[2]);
                    viw3.setText(lista[3]);
                    viw4.setText(lista[4]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    resu4.setText("0.0");
                    break;
                case 1:
                    viw1.setText(lista[0]);
                    viw2.setText(lista[2]);
                    viw3.setText(lista[3]);
                    viw4.setText(lista[4]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    resu4.setText("0.0");
                    break;
                case 2:
                    viw1.setText(lista[1]);
                    viw2.setText(lista[0]);
                    viw3.setText(lista[3]);
                    viw4.setText(lista[4]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    resu4.setText("0.0");
                    break;
                case 3:
                    viw1.setText(lista[1]);
                    viw2.setText(lista[2]);
                    viw3.setText(lista[0]);
                    viw4.setText(lista[4]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    resu4.setText("0.0");
                    break;
                case 4:
                    viw1.setText(lista[1]);
                    viw2.setText(lista[2]);
                    viw3.setText(lista[3]);
                    viw4.setText(lista[0]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    resu4.setText("0.0");
                    break;

            };
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };

    private TextWatcher testoEntre = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            String valor = ""+s;
            if(valor.equals(".")) {
                valor = "0.";
                entrada.setText("0.");
                entrada.setSelection(entrada.length());
            }

            if(valor.equals("")){
                valor = ""+0;
            }
            List<String> resul = new ArrayList<String>();

            resul = velo.Ordena(valor, posicao);

            resu1.setText(resul.get(0));
            resu2.setText(resul.get(1));
            resu3.setText(resul.get(2));
            resu4.setText(resul.get(3));

        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);

    }
}
