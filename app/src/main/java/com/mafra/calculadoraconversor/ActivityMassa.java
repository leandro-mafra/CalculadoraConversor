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

import com.mafra.calculadoraconversor.massa.ConverMassa;

import java.util.ArrayList;
import java.util.List;

public class ActivityMassa extends AppCompatActivity {

    private Spinner spimassa;
    private String[] lista = new String[]{"Quilo - k", "Grama - g", "Libra - lb", "Onça - oz"};
    private ArrayAdapter<String> spi;

    private EditText entrada;

    private TextView resu1;
    private TextView resu2;
    private TextView resu3;

    private TextView view1;
    private TextView view2;
    private TextView view3;

    private int posicao;

    private ConverMassa velo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_massa);

        spimassa = (Spinner)findViewById(R.id.spinnerMassa);
        spi = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, lista);
        spimassa.setAdapter(spi);
        spimassa.setOnItemSelectedListener(spinne);

        entrada = (EditText)findViewById(R.id.entadaMassa);
        entrada.addTextChangedListener(testoEntrada);

        resu1 = (TextView)findViewById(R.id.reMassa1);
        resu2 = (TextView)findViewById(R.id.reMassa2);
        resu3 = (TextView)findViewById(R.id.reMassa3);

        view1 = (TextView)findViewById(R.id.viMassa1);
        view2 = (TextView)findViewById(R.id.viMassa2);
        view3 = (TextView)findViewById(R.id.viMassa3);

        velo = new ConverMassa();

    }

    private AdapterView.OnItemSelectedListener spinne = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            posicao = position;

            switch (position){
                case 0:
                    view1.setText(lista[1]);
                    view2.setText(lista[2]);
                    view3.setText(lista[3]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    break;
                case 1:
                    view1.setText(lista[0]);
                    view2.setText(lista[2]);
                    view3.setText(lista[3]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    break;
                case 2:
                    view1.setText(lista[1]);
                    view2.setText(lista[0]);
                    view3.setText(lista[3]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
                    break;
                case 3:
                    view1.setText(lista[1]);
                    view2.setText(lista[2]);
                    view3.setText(lista[0]);

                    entrada.setText("");
                    resu1.setText("0.0");
                    resu2.setText("0.0");
                    resu3.setText("0.0");
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
