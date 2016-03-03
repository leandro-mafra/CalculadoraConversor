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
import android.widget.TextView;
import com.mafra.calculadoraconversor.comprimento.ConverCompri;

import java.util.ArrayList;
import java.util.List;

public class ActivityComprimento extends AppCompatActivity {

    private Spinner spiCompri;
    private String[] lista = new String[]{"Quilômetro - km", "Metro - m", "Centímetro - cm", "Milímetro - mm", "Milha - mi", "Jarda - yd", "Pés - ft", "Polegada - in", "Milha náutica - mn"};
    private ArrayAdapter<String> spi;

    private EditText entrada;

    private TextView resu1;
    private TextView resu2;
    private TextView resu3;
    private TextView resu4;
    private TextView resu5;
    private TextView resu6;
    private TextView resu7;
    private TextView resu8;

    private TextView viw1;
    private TextView viw2;
    private TextView viw3;
    private TextView viw4;
    private TextView viw5;
    private TextView viw6;
    private TextView viw7;
    private TextView viw8;

    private int posicao;

    private ConverCompri velo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_comprimento);

        spiCompri = (Spinner)findViewById(R.id.spinnerCompri);
        spi = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, lista);
        spiCompri.setAdapter(spi);
        spiCompri.setOnItemSelectedListener(spinne);

        entrada = (EditText)findViewById(R.id.editCompri);
        entrada.addTextChangedListener(testoEntrada);

        resu1 = (TextView)findViewById(R.id.reComp1);
        resu2 = (TextView)findViewById(R.id.reComp2);
        resu3 = (TextView)findViewById(R.id.reComp3);
        resu4 = (TextView)findViewById(R.id.reComp4);
        resu5 = (TextView)findViewById(R.id.reComp5);
        resu6 = (TextView)findViewById(R.id.reComp6);
        resu7 = (TextView)findViewById(R.id.reComp7);
        resu8 = (TextView)findViewById(R.id.reComp8);

        viw1 = (TextView)findViewById(R.id.viComp1);
        viw2 = (TextView)findViewById(R.id.viComp2);
        viw3 = (TextView)findViewById(R.id.viComp3);
        viw4 = (TextView)findViewById(R.id.viComp4);
        viw5 = (TextView)findViewById(R.id.viComp5);
        viw6 = (TextView)findViewById(R.id.viComp6);
        viw7 = (TextView)findViewById(R.id.viComp7);
        viw8 = (TextView)findViewById(R.id.viComp8);

        velo = new ConverCompri();

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
                    viw5.setText(lista[5]);
                    viw6.setText(lista[6]);
                    viw7.setText(lista[7]);
                    viw8.setText(lista[8]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    resu4.setText("0.0");
                    resu5.setText("0.0");
                    resu6.setText("0.0");
                    resu7.setText("0.0");
                    resu8.setText("0.0");
                    break;
                case 1:
                    viw1.setText(lista[0]);
                    viw2.setText(lista[2]);
                    viw3.setText(lista[3]);
                    viw4.setText(lista[4]);
                    viw5.setText(lista[5]);
                    viw6.setText(lista[6]);
                    viw7.setText(lista[7]);
                    viw8.setText(lista[8]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    resu4.setText("0.0");
                    resu5.setText("0.0");
                    resu6.setText("0.0");
                    resu7.setText("0.0");
                    resu8.setText("0.0");
                    break;
                case 2:
                    viw1.setText(lista[1]);
                    viw2.setText(lista[0]);
                    viw3.setText(lista[3]);
                    viw4.setText(lista[4]);
                    viw5.setText(lista[5]);
                    viw6.setText(lista[6]);
                    viw7.setText(lista[7]);
                    viw8.setText(lista[8]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    resu4.setText("0.0");
                    resu5.setText("0.0");
                    resu6.setText("0.0");
                    resu7.setText("0.0");
                    resu8.setText("0.0");
                    break;
                case 3:
                    viw1.setText(lista[1]);
                    viw2.setText(lista[2]);
                    viw3.setText(lista[0]);
                    viw4.setText(lista[4]);
                    viw5.setText(lista[5]);
                    viw6.setText(lista[6]);
                    viw7.setText(lista[7]);
                    viw8.setText(lista[8]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    resu4.setText("0.0");
                    resu5.setText("0.0");
                    resu6.setText("0.0");
                    resu7.setText("0.0");
                    resu8.setText("0.0");
                    break;
                case 4:
                    viw1.setText(lista[1]);
                    viw2.setText(lista[2]);
                    viw3.setText(lista[3]);
                    viw4.setText(lista[0]);
                    viw5.setText(lista[5]);
                    viw6.setText(lista[6]);
                    viw7.setText(lista[7]);
                    viw8.setText(lista[8]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    resu4.setText("0.0");
                    resu5.setText("0.0");
                    resu6.setText("0.0");
                    resu7.setText("0.0");
                    resu8.setText("0.0");
                    break;
                case 5:
                    viw1.setText(lista[1]);
                    viw2.setText(lista[2]);
                    viw3.setText(lista[3]);
                    viw4.setText(lista[4]);
                    viw5.setText(lista[0]);
                    viw6.setText(lista[6]);
                    viw7.setText(lista[7]);
                    viw8.setText(lista[8]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    resu4.setText("0.0");
                    resu5.setText("0.0");
                    resu6.setText("0.0");
                    resu7.setText("0.0");
                    resu8.setText("0.0");
                    break;
                case 6:
                    viw1.setText(lista[1]);
                    viw2.setText(lista[2]);
                    viw3.setText(lista[3]);
                    viw4.setText(lista[4]);
                    viw5.setText(lista[5]);
                    viw6.setText(lista[0]);
                    viw7.setText(lista[7]);
                    viw8.setText(lista[8]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    resu4.setText("0.0");
                    resu5.setText("0.0");
                    resu6.setText("0.0");
                    resu7.setText("0.0");
                    resu8.setText("0.0");
                    break;
                case 7:
                    viw1.setText(lista[1]);
                    viw2.setText(lista[2]);
                    viw3.setText(lista[3]);
                    viw4.setText(lista[4]);
                    viw5.setText(lista[5]);
                    viw6.setText(lista[6]);
                    viw7.setText(lista[0]);
                    viw8.setText(lista[8]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    resu4.setText("0.0");
                    resu5.setText("0.0");
                    resu6.setText("0.0");
                    resu7.setText("0.0");
                    resu8.setText("0.0");
                    break;
                case 8:
                    viw1.setText(lista[1]);
                    viw2.setText(lista[2]);
                    viw3.setText(lista[3]);
                    viw4.setText(lista[4]);
                    viw5.setText(lista[5]);
                    viw6.setText(lista[6]);
                    viw7.setText(lista[7]);
                    viw8.setText(lista[0]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    resu4.setText("0.0");
                    resu5.setText("0.0");
                    resu6.setText("0.0");
                    resu7.setText("0.0");
                    resu8.setText("0.0");
                    break;

            };
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };

    private TextWatcher testoEntrada = new TextWatcher() {
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

            resul = velo.Ordena(valor,posicao);

            resu1.setText(resul.get(0));
            resu2.setText(resul.get(1));
            resu3.setText(resul.get(2));
            resu4.setText(resul.get(3));
            resu5.setText(resul.get(4));
            resu6.setText(resul.get(5));
            resu7.setText(resul.get(6));
            resu8.setText(resul.get(7));

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
