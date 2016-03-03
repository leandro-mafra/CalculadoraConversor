package com.mafra.calculadoraconversor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText Telacal;
    private TextView Telasinbol;
    private TextView Telaresul;
    private Button btnback;
    private Button btnapatela;
    private Button btnapatudo;
    private Button btnraiz;
    private Button nu0;
    private Button nu1;
    private Button nu2;
    private Button nu3;
    private Button nu4;
    private Button nu5;
    private Button nu6;
    private Button nu7;
    private Button nu8;
    private Button nu9;
    private Button btnponto;
    private Button btnmais;
    private Button btnigual;
    private Button btnmenos;
    private Button btnvezes;
    private Button btndivi;
    private boolean inicio = true;
    private String ValorCal = "";
    private String ValorSimbol = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Telacal = (EditText) findViewById(R.id.TelaCal);
        Telasinbol = (TextView) findViewById(R.id.TestoSinbol);
        Telaresul = (TextView) findViewById(R.id.TestoResul);


        nu0 = (Button) findViewById(R.id.nu0);
        nu0.setOnClickListener(this);

        nu1 = (Button) findViewById(R.id.nu1);
        nu1.setOnClickListener(this);

        nu2 = (Button) findViewById(R.id.nu2);
        nu2.setOnClickListener(this);

        nu3 = (Button) findViewById(R.id.nu3);
        nu3.setOnClickListener(this);

        nu4 = (Button) findViewById(R.id.nu4);
        nu4.setOnClickListener(this);

        nu5 = (Button) findViewById(R.id.nu5);
        nu5.setOnClickListener(this);

        nu6 = (Button) findViewById(R.id.nu6);
        nu6.setOnClickListener(this);

        nu7 = (Button) findViewById(R.id.nu7);
        nu7.setOnClickListener(this);

        nu8 = (Button) findViewById(R.id.nu8);
        nu8.setOnClickListener(this);

        nu9 = (Button) findViewById(R.id.nu9);
        nu9.setOnClickListener(this);

        btnback = (Button) findViewById(R.id.btnBack);
        btnback.setOnClickListener(this);

        btnapatela = (Button) findViewById(R.id.btnApaTela);
        btnapatela.setOnClickListener(this);

        btnapatudo = (Button) findViewById(R.id.btnApaTudo);
        btnapatudo.setOnClickListener(this);

        btnraiz = (Button) findViewById(R.id.btnRaiz);
        btnraiz.setOnClickListener(this);

        btnponto = (Button) findViewById(R.id.btnPonto);
        btnponto.setOnClickListener(this);

        btnmais = (Button) findViewById(R.id.btnMais);
        btnmais.setOnClickListener(this);

        btnigual = (Button) findViewById(R.id.btnIgual);
        btnigual.setOnClickListener(this);

        btnmenos = (Button) findViewById(R.id.btnMenos);
        btnmenos.setOnClickListener(this);

        btnvezes = (Button) findViewById(R.id.btnVezes);
        btnvezes.setOnClickListener(this);

        btndivi = (Button) findViewById(R.id.btnDivi);
        btndivi.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.item1){
            Intent it = new Intent(this, MainActivity.class);
            startActivity(it);
        }else if(id == R.id.item2){
            Intent it = new Intent(this, ActivityVelo.class);
            startActivity(it);
        }else if(id == R.id.item3){
            Intent it = new Intent(this, ActivityComprimento.class);
            startActivity(it);
        }else if(id == R.id.item4){
            Intent it = new Intent(this, ActivityMassa.class);
            startActivity(it);
        }else if(id == R.id.item5){
            Intent it = new Intent(this, ActivityPressao.class);
            startActivity(it);
        }else if(id == R.id.item6){
            Intent it = new Intent(this, ActivityPrePsi.class);
            startActivity(it);
        }



        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onClick(View v) {
        if(v == nu0 || v == nu1 || v == nu2 || v == nu3 || v == nu4 || v == nu5 || v == nu6 || v == nu7 || v == nu8 || v == nu9 || v == btnponto){
            Entranumero(v);
        }else if(v == btnback){
            if (Telacal.length() > 0) {
                String nume = Telacal.getText().toString();
                Telacal.setText(nume.substring(0,nume.length()-1));
            }
        }else if(v == btnapatela){
            Telacal.setText("");
        }else if(v == btnapatudo){
            Telacal.setText("");
            Telaresul.setText("");
            Telasinbol.setText("");
            inicio = true;
        }else if(v == btnmais || v == btnmenos || v == btnvezes || v == btndivi){
            Operacao(v);
        }else if(v == btnraiz){
            if(Telacal.length() == 0){

            }else {
                double cal = Double.parseDouble(Telacal.getText().toString());
                Telacal.setText("" + Math.sqrt(cal));
            }
        }else if(v == btnigual){
            Igual();
            inicio = true;
            Telasinbol.setText("");
        }

    }
/*********** acrecenta o numeros a tela ***************/
    public void Entranumero(View v){
        if (v == nu1){

            Telacal.append("1");
            inicio = false;

        }else if (v == nu2){

            Telacal.append("2");
            inicio = false;

        }else if (v == nu3){

            Telacal.append("3");
            inicio = false;

        }else if(v == nu4){

            Telacal.append("4");
            inicio = false;

        }else if(v == nu5){

            Telacal.append("5");
            inicio = false;

        }else if(v == nu6){

            Telacal.append("6");
            inicio = false;

        }else if(v == nu7){

            Telacal.append("7");
            inicio = false;

        }else if(v == nu8){

            Telacal.append("8");
            inicio = false;

        }else if(v == nu9){

            Telacal.append("9");
            inicio = false;

        }else if(v == nu0 && inicio == false){

            Telacal.append("0");

        }else if(v == btnponto){
            inicio = false;
            if(Telacal.length() == 0){
                Telacal.setText("0.");
            }else{
                Telacal.append(".");
            }
        }
    }
    /************************ as operações ************************/
    public void Operacao(View v){
        inicio = true;
        if(Telasinbol.length() == 0) {

            if(Telacal.length() == 0){

            }else{
                Telaresul.setText(Telacal.getText().toString());

            }



        }else{
            if(Telacal.length() != 0) {
                Igual();
            }
        }

        if (v == btnmais) {
            Telasinbol.setText("+");
            Telacal.setText("");
        } else if (v == btnmenos) {
            Telasinbol.setText("-");
            Telacal.setText("");
        } else if (v == btndivi) {
            Telasinbol.setText("/");
            Telacal.setText("");
        } else if (v == btnvezes) {
            Telasinbol.setText("X");
            Telacal.setText("");
        }


    }

    public void Igual(){
        if(Telacal.length() == 0){
            Telacal.setText("0");
        }

        if(Telaresul.length() == 0){
            Telaresul.setText("0");
        }

        double cal = Double.parseDouble(Telacal.getText().toString());
        double rel = Double.parseDouble(Telaresul.getText().toString());

        switch (Telasinbol.getText().toString()) {
            case "+":
                double res = rel + cal;
                Telaresul.setText("" + res);
                ValorCal = Telacal.getText().toString();
                ValorSimbol = Telasinbol.getText().toString();
                Telacal.setText("");
                break;
            case "-":
                double res1 = rel - cal;
                Telaresul.setText("" + res1);
                ValorCal = Telacal.getText().toString();
                ValorSimbol = Telasinbol.getText().toString();
                Telacal.setText("");
                break;
            case "X":
                double res2 = rel * cal;
                Telaresul.setText("" + res2);
                ValorCal = Telacal.getText().toString();
                ValorSimbol = Telasinbol.getText().toString();
                Telacal.setText("");
                break;
            case "/":
                double res3 = rel / cal;
                Telaresul.setText("" + res3);
                ValorCal = Telacal.getText().toString();
                ValorSimbol = Telasinbol.getText().toString();
                Telacal.setText("");
                break;
            case "":
                double calFinal = 0;
                if(ValorCal.length() != 0){
                    calFinal = Double.parseDouble(ValorCal);
                }
                double resFinal = 0;
                if(ValorSimbol.equals("+")){
                    resFinal = rel + calFinal;
                    Telaresul.setText(""+resFinal);

                }else if(ValorSimbol.equals("-")){
                    resFinal = rel - calFinal;
                    Telaresul.setText(""+resFinal);

                }else if(ValorSimbol.equals("X")){
                    resFinal = rel * calFinal;
                    Telaresul.setText(""+resFinal);

                }else if(ValorSimbol.equals("/")){
                    resFinal = rel / calFinal;
                    Telaresul.setText(""+resFinal);

                }
        };
    }
}
