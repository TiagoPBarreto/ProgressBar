package com.cursoandroid.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBarHorizontal;
    private ProgressBar progressBarCircular;
    private int progresso =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         progressBarHorizontal =findViewById(R.id.progressBarHorizontal);
         progressBarCircular =findViewById(R.id.progressBarCircular);

         // visibilidade do progresBar
        progressBarCircular.setVisibility(View.GONE);

    }

    public void carregarProgressBar(View view){

            // configurar ProgressBarHorizontal
            this.progresso = this.progresso +1;
            progressBarHorizontal.setProgress( this.progresso );
            // configurar ProgressBarCircular
            progressBarCircular.setVisibility(View.VISIBLE);

            //finalizar a barra de carregamento

        if(this.progresso== 10 ){
            progressBarCircular.setVisibility(View.GONE);
        }
    }
}