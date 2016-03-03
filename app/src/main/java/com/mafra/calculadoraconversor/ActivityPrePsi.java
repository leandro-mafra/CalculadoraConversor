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
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.mafra.calculadoraconversor.prePsi.CalcuPressao;

import java.util.ArrayList;
import java.util.List;

public class ActivityPrePsi extends AppCompatActivity {

    private Spinner spiprepsi;
    private String[] lista = new String[]{"Psi", "Pascal - Pa", "Quilopascal - kPa", "Quilograma-Força - kgf/cm²"};
    private String[] psi = new String[]{"Força - lb", "Área - in²", "Pressão - psi"};
    private String[] pa = new String[]{"Força - N", "Área - m²", "Pressão - Pa"};
    private String[]kpa = new String[]{"Força - N", "Área - m²", "Pressão - kPa"};
    private String[]kgf = new String[]{"Força - kgf", "Área - cm²", "Pressão - kgf/cm²"};
    private ArrayAdapter<String> spi;

    private EditText entra1;
    private EditText entra2;

    private TextView view1;
    private TextView view2;
    private TextView viewresu;

    private TextView resuprepsi;

    private ImageButton btnmuda;

    private int posicao;
    private int etapa;

    private CalcuPressao velo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_pre_psi);

        spiprepsi = (Spinner)findViewById(R.id.spinnerPrePsi);
        spi = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, lista);
        spiprepsi.setAdapter(spi);
        spiprepsi.setOnItemSelectedListener(spinne);

        entra1 = (EditText)findViewById(R.id.entPrePsi1);
        entra1.addTextChangedListener(entrada);

        entra2 = (EditText)findViewById(R.id.entPrePsi2);
        entra2.addTextChangedListener(entrada);

        view1 = (TextView)findViewById(R.id.viPrePsi1);
        view2 = (TextView)findViewById(R.id.viPrePsi2);
        viewresu = (TextView)findViewById(R.id.viResuPrePsi);
        resuprepsi = (TextView)findViewById(R.id.resuPrePsi);

        btnmuda = (ImageButton)findViewById(R.id.btnMudaPrePsi);
        btnmuda.setOnClickListener(muda);

        velo = new CalcuPressao();

    }

    private AdapterView.OnItemSelectedListener spinne = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            posicao = position;
            etapa = 0;
            MudaOrdem();
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };

    private View.OnClickListener muda = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(etapa == 2){
                etapa = 0;
            }else{
                etapa++;
            }
            MudaOrdem();
        }
    };

    private TextWatcher entrada = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            String ent1 = entra1.getText().toString();
            String ent2 = entra2.getText().toString();

            if(ent1.equals("")){
                ent1 = "0";
            }else if(ent1.equals(".")){
                ent1 = "0.";
                entra1.setText("0.");
                entra1.setSelection(entra1.length());
            }

            if(ent2.equals("")){
                ent2 = "0";
            }else if(ent2.equals(".")){
                ent2 = "0.";
                entra2.setText("0.");
                entra2.setSelection(entra2.length());
            }

            resuprepsi.setText(velo.Ordem(posicao, etapa, ent1, ent2));

        }
    };

    public void MudaOrdem(){


        switch (posicao){
            case 0:

                switch (etapa){
                    case 0:
                        view1.setText(psi[0]);
                        view2.setText(psi[1]);
                        viewresu.setText(psi[2]);

                        entra1.setText("");
                        entra2.setText("");
                        resuprepsi.setText("0.0");
                        break;
                    case 1:
                        view1.setText(psi[1]);
                        view2.setText(psi[2]);
                        viewresu.setText(psi[0]);

                        entra1.setText("");
                        entra2.setText("");
                        resuprepsi.setText("0.0");
                        break;
                    case 2:
                        view1.setText(psi[2]);
                        view2.setText(psi[0]);
                        viewresu.setText(psi[1]);

                        entra1.setText("");
                        entra2.setText("");
                        resuprepsi.setText("0.0");
                        break;
                };

                break;
            case 1:

                switch (etapa){
                    case 0:
                        view1.setText(pa[0]);
                        view2.setText(pa[1]);
                        viewresu.setText(pa[2]);

                        entra1.setText("");
                        entra2.setText("");
                        resuprepsi.setText("0.0");
                        break;
                    case 1:
                        view1.setText(pa[1]);
                        view2.setText(pa[2]);
                        viewresu.setText(pa[0]);

                        entra1.setText("");
                        entra2.setText("");
                        resuprepsi.setText("0.0");
                        break;
                    case 2:
                        view1.setText(pa[2]);
                        view2.setText(pa[0]);
                        viewresu.setText(pa[1]);

                        entra1.setText("");
                        entra2.setText("");
                        resuprepsi.setText("0.0");
                        break;
                };

                break;
            case 2:

                switch (etapa){
                    case 0:
                        view1.setText(kpa[0]);
                        view2.setText(kpa[1]);
                        viewresu.setText(kpa[2]);

                        entra1.setText("");
                        entra2.setText("");
                        resuprepsi.setText("0.0");
                        break;
                    case 1:
                        view1.setText(kpa[1]);
                        view2.setText(kpa[2]);
                        viewresu.setText(kpa[0]);

                        entra1.setText("");
                        entra2.setText("");
                        resuprepsi.setText("0.0");
                        break;
                    case 2:
                        view1.setText(kpa[2]);
                        view2.setText(kpa[0]);
                        viewresu.setText(kpa[1]);

                        entra1.setText("");
                        entra2.setText("");
                        resuprepsi.setText("0.0");
                        break;
                };

                break;
            case 3:

                switch (etapa){
                    case 0:
                        view1.setText(kgf[0]);
                        view2.setText(kgf[1]);
                        viewresu.setText(kgf[2]);

                        entra1.setText("");
                        entra2.setText("");
                        resuprepsi.setText("0.0");
                        break;
                    case 1:
                        view1.setText(kgf[1]);
                        view2.setText(kgf[2]);
                        viewresu.setText(kgf[0]);

                        entra1.setText("");
                        entra2.setText("");
                        resuprepsi.setText("0.0");
                        break;
                    case 2:
                        view1.setText(kgf[2]);
                        view2.setText(kgf[0]);
                        viewresu.setText(kgf[1]);

                        entra1.setText("");
                        entra2.setText("");
                        resuprepsi.setText("0.0");
                        break;
                };

                break;
        };
    }

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
