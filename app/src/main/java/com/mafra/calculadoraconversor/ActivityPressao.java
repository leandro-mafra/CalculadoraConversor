package com.mafra.calculadoraconversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

import com.mafra.calculadoraconversor.pressao.ConverPressao;

import java.util.ArrayList;
import java.util.List;

public class ActivityPressao extends AppCompatActivity {

    private Spinner spipressao;
    private String[] lista = new String[]{"Bar", "Psi", "Quilograma-Força - kgf/cm²", "Pascal - Pa", "Quilopascal - kPa", "Polegada de mercurio - inHg", "Centímetro de mercúrio - cmHg", "Milímetro de mercúrio - mmHg"};
    private ArrayAdapter<String> spi;

    private EditText entrada;

    private TextView resu1;
    private TextView resu2;
    private TextView resu3;
    private TextView resu4;
    private TextView resu5;
    private TextView resu6;
    private TextView resu7;

    private TextView view1;
    private TextView view2;
    private TextView view3;
    private TextView view4;
    private TextView view5;
    private TextView view6;
    private TextView view7;

    private int posicao;

    private ConverPressao velo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_pressao);

        spipressao = (Spinner)findViewById(R.id.spinnerPressao);
        spi = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, lista);
        spipressao.setAdapter(spi);
        spipressao.setOnItemSelectedListener(spinner);

        entrada = (EditText)findViewById(R.id.entradaPressao);
        entrada.addTextChangedListener(testoEntrada);

        resu1 = (TextView)findViewById(R.id.rePress1);
        resu2 = (TextView)findViewById(R.id.rePress2);
        resu3 = (TextView)findViewById(R.id.rePress3);
        resu4 = (TextView)findViewById(R.id.rePress4);
        resu5 = (TextView)findViewById(R.id.rePress5);
        resu6 = (TextView)findViewById(R.id.rePress6);
        resu7 = (TextView)findViewById(R.id.rePress7);

        view1 = (TextView)findViewById(R.id.viPress1);
        view2 = (TextView)findViewById(R.id.viPress2);
        view3 = (TextView)findViewById(R.id.viPress3);
        view4 = (TextView)findViewById(R.id.viPress4);
        view5 = (TextView)findViewById(R.id.viPress5);
        view6 = (TextView)findViewById(R.id.viPress6);
        view7 = (TextView)findViewById(R.id.viPress7);

        velo = new ConverPressao();

    }

    private AdapterView.OnItemSelectedListener spinner = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            posicao = position;

            switch (position){
                case 0:
                    view1.setText(lista[1]);
                    view2.setText(lista[2]);
                    view3.setText(lista[3]);
                    view4.setText(lista[4]);
                    view5.setText(lista[5]);
                    view6.setText(lista[6]);
                    view7.setText(lista[7]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    resu4.setText("0.0");
                    resu5.setText("0.0");
                    resu6.setText("0.0");
                    resu7.setText("0.0");
                    break;
                case 1:
                    view1.setText(lista[0]);
                    view2.setText(lista[2]);
                    view3.setText(lista[3]);
                    view4.setText(lista[4]);
                    view5.setText(lista[5]);
                    view6.setText(lista[6]);
                    view7.setText(lista[7]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    resu4.setText("0.0");
                    resu5.setText("0.0");
                    resu6.setText("0.0");
                    resu7.setText("0.0");
                    break;
                case 2:
                    view1.setText(lista[1]);
                    view2.setText(lista[0]);
                    view3.setText(lista[3]);
                    view4.setText(lista[4]);
                    view5.setText(lista[5]);
                    view6.setText(lista[6]);
                    view7.setText(lista[7]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    resu4.setText("0.0");
                    resu5.setText("0.0");
                    resu6.setText("0.0");
                    resu7.setText("0.0");
                    break;
                case 3:
                    view1.setText(lista[1]);
                    view2.setText(lista[2]);
                    view3.setText(lista[0]);
                    view4.setText(lista[4]);
                    view5.setText(lista[5]);
                    view6.setText(lista[6]);
                    view7.setText(lista[7]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    resu4.setText("0.0");
                    resu5.setText("0.0");
                    resu6.setText("0.0");
                    resu7.setText("0.0");
                    break;
                case 4:
                    view1.setText(lista[1]);
                    view2.setText(lista[2]);
                    view3.setText(lista[3]);
                    view4.setText(lista[0]);
                    view5.setText(lista[5]);
                    view6.setText(lista[6]);
                    view7.setText(lista[7]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    resu4.setText("0.0");
                    resu5.setText("0.0");
                    resu6.setText("0.0");
                    resu7.setText("0.0");
                    break;
                case 5:
                    view1.setText(lista[1]);
                    view2.setText(lista[2]);
                    view3.setText(lista[3]);
                    view4.setText(lista[4]);
                    view5.setText(lista[0]);
                    view6.setText(lista[6]);
                    view7.setText(lista[7]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    resu4.setText("0.0");
                    resu5.setText("0.0");
                    resu6.setText("0.0");
                    resu7.setText("0.0");
                    break;
                case 6:
                    view1.setText(lista[1]);
                    view2.setText(lista[2]);
                    view3.setText(lista[3]);
                    view4.setText(lista[4]);
                    view5.setText(lista[5]);
                    view6.setText(lista[0]);
                    view7.setText(lista[7]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    resu4.setText("0.0");
                    resu5.setText("0.0");
                    resu6.setText("0.0");
                    resu7.setText("0.0");
                    break;
                case 7:
                    view1.setText(lista[1]);
                    view2.setText(lista[2]);
                    view3.setText(lista[3]);
                    view4.setText(lista[4]);
                    view5.setText(lista[5]);
                    view6.setText(lista[6]);
                    view7.setText(lista[0]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    resu4.setText("0.0");
                    resu5.setText("0.0");
                    resu6.setText("0.0");
                    resu7.setText("0.0");
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
