package co.gov.mintic.misiontic.ciclo4.usa;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    TextView etiMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etiMensaje = (TextView) findViewById(R.id.txtMensaje);
    }

    public void mostarMensaje4(View view) {
        Snackbar.make(view, "Mensaje Modificado", Snackbar.LENGTH_INDEFINITE)
                .setBackgroundTint(getResources().getColor(R.color.color_mensaje_fondo_ok))
                .setActionTextColor(getResources().getColor(R.color.purple_700))
                .setTextColor(getResources().getColor(R.color.color_mensaje_letra_ok))
                .setAction("AZUL", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Button btn = (Button)view;
                        etiMensaje.setText("Accion: "+btn.getText());
                        Intent i = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(i);
                    }
                })
                .show();
    }


    public void mostarMensaje3(View view) {
        Snackbar.make(view, "Mensaje Violeta",Snackbar.LENGTH_INDEFINITE)
                .setActionTextColor(getResources().getColor(R.color.color_mensaje))
                .setAction("Aceptar", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Button btn = (Button)view;
                        etiMensaje.setText("Accion: "+btn.getText());
                    }
                })
                .show();
    }

    public void mostarMensaje2(View view) {
        Snackbar.make(view,"Mensaje Con accion",Snackbar.LENGTH_INDEFINITE)
                .setAction("Ok", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Button btn = (Button)view;
                        etiMensaje.setText("Accion: "+btn.getText());
                    }
                })
                .show();
    }

    public void mostarMensaje1(View view) throws InterruptedException {
       Snackbar mensaje = Snackbar.make(view, "Mensaje simple", Snackbar.LENGTH_LONG);
        mensaje.show();
        // Thread.sleep(5000);
        Toast.makeText(this, "Mensaje muyyy Simple", Toast.LENGTH_LONG).show();
    }
}