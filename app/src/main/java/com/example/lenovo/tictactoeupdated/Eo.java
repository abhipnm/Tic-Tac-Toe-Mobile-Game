package com.example.lenovo.tictactoeupdated;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.Locale;

public class Eo extends AppCompatActivity implements TextToSpeech.OnInitListener  {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    final Context context=this;
    int turn;
    private TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eo);

        tts = new TextToSpeech(this, this);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setText("X");
                b1.setEnabled(false);
                endGame();
                if(b9.getText().toString().equals("")){
                    b9.setText("0");
                    b9.setEnabled(false);
                    endGame();
                }
                else if(b7.getText().toString().equals("")){
                    b7.setText("0");
                    b7.setEnabled(false);
                    endGame();
                }
                else if(b3.getText().toString().equals("")){
                    b3.setText("0");
                    b3.setEnabled(false);
                    endGame();
                }
                else if(b4.getText().toString().equals("")){
                    b4.setText("0");
                    b4.setEnabled(false);
                    endGame();
                }
                else if(b6.getText().toString().equals("")){
                    b6.setText("0");
                    b6.setEnabled(false);
                    endGame();
                }
                else if(b8.getText().toString().equals("")){
                    b8.setText("0");
                    b8.setEnabled(false);
                    endGame();
                }
                else if(b2.getText().toString().equals("")){
                    b2.setText("0");
                    b2.setEnabled(false);
                    endGame();
                }
                else if(b5.getText().toString().equals("")){
                    b5.setText("0");
                    b5.setEnabled(false);
                    endGame();
                }
                else{
                    endGame();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2.setText("X");
                b2.setEnabled(false);
                endGame();
                if(b8.getText().toString().equals("")){
                    b8.setText("0");
                    b8.setEnabled(false);
                    endGame();
                }
                else if(b1.getText().toString().equals("")){
                    b1.setText("0");
                    b1.setEnabled(false);
                    endGame();
                }
                else if(b4.getText().toString().equals("")){
                    b4.setText("0");
                    b4.setEnabled(false);
                    endGame();
                }
                else if(b6.getText().toString().equals("")){
                    b6.setText("0");
                    b6.setEnabled(false);
                    endGame();
                }
                else if(b3.getText().toString().equals("")){
                    b3.setText("0");
                    b3.setEnabled(false);
                    endGame();
                }
                else if(b7.getText().toString().equals("")){
                    b7.setText("0");
                    b7.setEnabled(false);
                    endGame();
                }
                else if(b9.getText().toString().equals("")){
                    b9.setText("0");
                    b9.setEnabled(false);
                    endGame();
                }
                else if(b5.getText().toString().equals("")){
                    b5.setText("0");
                    b5.setEnabled(false);
                    endGame();
                }
                else{
                    endGame();
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3.setText("X");
                b3.setEnabled(false);
                endGame();
                if(b7.getText().toString().equals("")){
                    b7.setText("0");
                    b7.setEnabled(false);
                    endGame();
                }
                else if(b1.getText().toString().equals("")){
                    b1.setText("0");
                    b1.setEnabled(false);
                    endGame();
                }
                else if(b9.getText().toString().equals("")){
                    b9.setText("0");
                    b9.setEnabled(false);
                    endGame();
                }
                else if(b4.getText().toString().equals("")){
                    b4.setText("0");
                    b4.setEnabled(false);
                    endGame();
                }
                else if(b6.getText().toString().equals("")){
                    b6.setText("0");
                    b6.setEnabled(false);
                    endGame();
                }
                else if(b8.getText().toString().equals("")){
                    b8.setText("0");
                    b8.setEnabled(false);
                    endGame();
                }
                else if(b2.getText().toString().equals("")){
                    b2.setText("0");
                    b2.setEnabled(false);
                    endGame();
                }
                else if(b5.getText().toString().equals("")){
                    b5.setText("0");
                    b5.setEnabled(false);
                    endGame();
                }
                else{
                    endGame();
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4.setText("X");
                b4.setEnabled(false);
                endGame();
                if(b6.getText().toString().equals("")){
                    b6.setText("0");
                    b6.setEnabled(false);
                    endGame();
                }
                else if(b2.getText().toString().equals("")){
                    b2.setText("0");
                    b2.setEnabled(false);
                    endGame();
                }
                else if(b8.getText().toString().equals("")){
                    b8.setText("0");
                    b8.setEnabled(false);
                    endGame();
                }
                else if(b1.getText().toString().equals("")){
                    b1.setText("0");
                    b1.setEnabled(false);
                    endGame();
                }
                else if(b3.getText().toString().equals("")){
                    b3.setText("0");
                    b3.setEnabled(false);
                    endGame();
                }
                else if(b7.getText().toString().equals("")){
                    b7.setText("0");
                    b7.setEnabled(false);
                    endGame();
                }
                else if(b9.getText().toString().equals("")){
                    b9.setText("0");
                    b9.setEnabled(false);
                    endGame();
                }
                else if(b5.getText().toString().equals("")){
                    b5.setText("0");
                    b5.setEnabled(false);
                    endGame();
                }
                else{
                    endGame();
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b5.setText("X");
                b5.setEnabled(false);
                endGame();
                if(b9.getText().toString().equals("")){
                    b9.setText("0");
                    b9.setEnabled(false);
                    endGame();
                }
                else if(b7.getText().toString().equals("")){
                    b7.setText("0");
                    b7.setEnabled(false);
                    endGame();
                }
                else if(b3.getText().toString().equals("")){
                    b3.setText("0");
                    b3.setEnabled(false);
                    endGame();
                }
                else if(b1.getText().toString().equals("")){
                    b1.setText("0");
                    b1.setEnabled(false);
                    endGame();
                }
                else if(b6.getText().toString().equals("")){
                    b6.setText("0");
                    b6.setEnabled(false);
                    endGame();
                }
                else if(b8.getText().toString().equals("")){
                    b8.setText("0");
                    b8.setEnabled(false);
                    endGame();
                }
                else if(b2.getText().toString().equals("")){
                    b2.setText("0");
                    b2.setEnabled(false);
                    endGame();
                }
                else if(b4.getText().toString().equals("")){
                    b4.setText("0");
                    b4.setEnabled(false);
                    endGame();
                }
                else{
                    endGame();
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b6.setText("X");
                b6.setEnabled(false);
                endGame();
                if(b4.getText().toString().equals("")){
                    b4.setText("0");
                    b4.setEnabled(false);
                    endGame();
                }
                else if(b8.getText().toString().equals("")){
                    b8.setText("0");
                    b8.setEnabled(false);
                    endGame();
                }
                else if(b2.getText().toString().equals("")){
                    b2.setText("0");
                    b2.setEnabled(false);
                    endGame();
                }
                else if(b1.getText().toString().equals("")){
                    b1.setText("0");
                    b1.setEnabled(false);
                    endGame();
                }
                else if(b3.getText().toString().equals("")){
                    b3.setText("0");
                    b3.setEnabled(false);
                    endGame();
                }
                else if(b7.getText().toString().equals("")){
                    b7.setText("0");
                    b7.setEnabled(false);
                    endGame();
                }
                else if(b9.getText().toString().equals("")){
                    b9.setText("0");
                    b9.setEnabled(false);
                    endGame();
                }
                else if(b5.getText().toString().equals("")){
                    b5.setText("0");
                    b5.setEnabled(false);
                    endGame();
                }
                else{
                    endGame();
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b7.setText("X");
                b7.setEnabled(false);
                endGame();
                if(b9.getText().toString().equals("")){
                    b9.setText("0");
                    b9.setEnabled(false);
                    endGame();
                }
                else if(b3.getText().toString().equals("")){
                    b3.setText("0");
                    b3.setEnabled(false);
                    endGame();
                }
                else if(b1.getText().toString().equals("")){
                    b1.setText("0");
                    b1.setEnabled(false);
                    endGame();
                }
                else if(b4.getText().toString().equals("")){
                    b4.setText("0");
                    b4.setEnabled(false);
                    endGame();
                }
                else if(b6.getText().toString().equals("")){
                    b6.setText("0");
                    b6.setEnabled(false);
                    endGame();
                }
                else if(b8.getText().toString().equals("")){
                    b8.setText("0");
                    b8.setEnabled(false);
                    endGame();
                }
                else if(b2.getText().toString().equals("")){
                    b2.setText("0");
                    b2.setEnabled(false);
                    endGame();
                }
                else if(b5.getText().toString().equals("")){
                    b5.setText("0");
                    b5.setEnabled(false);
                    endGame();
                }
                else{
                    endGame();
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b8.setText("X");
                b8.setEnabled(false);
                endGame();
                if(b2.getText().toString().equals("")){
                    b2.setText("0");
                    b2.setEnabled(false);
                    endGame();
                }
                else if(b4.getText().toString().equals("")){
                    b4.setText("0");
                    b4.setEnabled(false);
                    endGame();
                }
                else if(b6.getText().toString().equals("")){
                    b6.setText("0");
                    b6.setEnabled(false);
                    endGame();
                }
                else if(b1.getText().toString().equals("")){
                    b1.setText("0");
                    b1.setEnabled(false);
                    endGame();
                }
                else if(b3.getText().toString().equals("")){
                    b3.setText("0");
                    b3.setEnabled(false);
                    endGame();
                }
                else if(b7.getText().toString().equals("")){
                    b7.setText("0");
                    b7.setEnabled(false);
                    endGame();
                }
                else if(b9.getText().toString().equals("")){
                    b9.setText("0");
                    b9.setEnabled(false);
                    endGame();
                }
                else if(b5.getText().toString().equals("")){
                    b5.setText("0");
                    b5.setEnabled(false);
                    endGame();
                }
                else{
                    endGame();
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b9.setText("X");
                b9.setEnabled(false);
                endGame();
                if(b1.getText().toString().equals("")){
                    b1.setText("0");
                    b1.setEnabled(false);
                    endGame();
                }
                else if(b7.getText().toString().equals("")){
                    b7.setText("0");
                    b7.setEnabled(false);
                    endGame();
                }
                else if(b3.getText().toString().equals("")){
                    b3.setText("0");
                    b3.setEnabled(false);
                    endGame();
                }
                else if(b4.getText().toString().equals("")){
                    b4.setText("0");
                    b4.setEnabled(false);
                    endGame();
                }
                else if(b6.getText().toString().equals("")){
                    b6.setText("0");
                    b6.setEnabled(false);
                    endGame();
                }
                else if(b8.getText().toString().equals("")){
                    b8.setText("0");
                    b8.setEnabled(false);
                    endGame();
                }
                else if(b2.getText().toString().equals("")){
                    b2.setText("0");
                    b2.setEnabled(false);
                    endGame();
                }
                else if(b5.getText().toString().equals("")){
                    b5.setText("0");
                    b5.setEnabled(false);
                    endGame();
                }
                else{
                    endGame();
                }
            }
        });
    }
    public void endGame(){
        boolean end=false;
        String a,b,c,d,e,f,g,h,i;
        a=b1.getText().toString();
        b=b2.getText().toString();
        c=b3.getText().toString();
        d=b4.getText().toString();
        e=b5.getText().toString();
        f=b6.getText().toString();
        g=b7.getText().toString();
        h=b8.getText().toString();
        i=b9.getText().toString();

        if(a.equals(b)&& a.equals(c) && a.equals("X")){
            end=true;
            String text="YOU WON THE MATCH!!!!!!";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);
            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show();
        }
        else if(a.equals(e)&& a.equals(i) && a.equals("X")){
            end=true;String text="YOU WON THE MATCH!!!!!!";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);
            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);

            Show();
        }
        else if(a.equals(d)&& a.equals(g) && a.equals("X")){
            end=true;String text="YOU WON THE MATCH!!!!!!";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);

            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show();
        }
        else if(a.equals(b)&& a.equals(c) && a.equals("0")){
            end=true;String text="PLAYER 0 WINS";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);
            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show2();
        }
        else if(a.equals(e)&& a.equals(i) && a.equals("0")){
            end=true;String text="YOU LOST THE MATCH!!!";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);

            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show2();
        }
        else if(a.equals(d)&& a.equals(g) && a.equals("0")){
            end=true;
            String text="YOU LOST THE MATCH!!!";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);

            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show2();
        }


        else if(b.equals(e)&& b.equals(h) && b.equals("0")){
            end=true;String text="YOU LOST THE MATCH!!!";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);

            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show2();
        }

        else if(b.equals(e)&& b.equals(h) && b.equals("X")){
            end=true;String text="YOU WON THE MATCH!!!!!!";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);

            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show();
        }


        else if(c.equals(f)&& c.equals(i) && c.equals("0")){
            end=true;String text="YOU LOST THE MATCH!!!";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);

            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show2();
        }
        else if(c.equals(i)&& c.equals(f) && c.equals("X")){
            end=true;String text="YOU WON THE MATCH!!!!!!";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);
            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show();
        }
        else if(c.equals(e)&& c.equals(g) && c.equals("X")){
            end=true;String text="YOU WON THE MATCH!!!!!!";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);

            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show();
        }
        else if(c.equals(e)&& c.equals(g) && c.equals("0")){
            end=true;String text="YOU WON THE MATCH!!!!!!";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);
            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show2();
        }

        else if(d.equals(e)&& d.equals(f) && d.equals("0")){
            end=true;String text="YOU LOST THE MATCH!!!";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);
            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show2();
        }
        else if(d.equals(f)&& d.equals(e) && d.equals("X")){
            end=true;
            String text="YOU WON THE MATCH!!!!!!";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);
            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show();
        }


        else if(g.equals(h)&& g.equals(i) && g.equals("X")){
            end=true;
            String text="YOU WON THE MATCH!!!!!!";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);
            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show();
        }
        else if(g.equals(h)&& g.equals(i) && g.equals("0")){
            end=true;
            String text="YOU LOST THE MATCH!!!";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);
            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show2();
        }
        else if(!b1.getText().toString().equals("") && !b2.getText().toString().equals("") && !b3.getText().toString().equals("") &&
                !b6.getText().toString().equals("") && !b5.getText().toString().equals("") && !b4.getText().toString().equals("") &&
                !b7.getText().toString().equals("") && !b8.getText().toString().equals("") && !b9.getText().toString().equals("")){
            String text="MATCH DRAW!!!";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);
            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show1();
        }

        if(end){
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    }



    public void Show(){

        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(context);
        alertDialogBuilder.setIcon(R.drawable.s);
        alertDialogBuilder.setTitle("YOU WON!!!\nPLAY AGAIN???");
        alertDialogBuilder.setMessage("CLICK YES TO CONTINUE")
                .setCancelable(false)
                .setPositiveButton("NO",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog,int id){
                        Eo.this.finish();
                    }
                })
                .setNegativeButton("YES",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                        b1.setText("");
                        b2.setText("");
                        b3.setText("");
                        b4.setText("");
                        b5.setText("");
                        b6.setText("");
                        b7.setText("");
                        b8.setText("");
                        b9.setText("");
                        b1.setEnabled(true);
                        b2.setEnabled(true);
                        b3.setEnabled(true);
                        b4.setEnabled(true);
                        b5.setEnabled(true);
                        b6.setEnabled(true);
                        b7.setEnabled(true);
                        b8.setEnabled(true);
                        b9.setEnabled(true);
                    }
                });

        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.translucent_black)));
        alertDialog.show();
    }

    public void Show1(){

        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(context);
        alertDialogBuilder.setIcon(R.drawable.s);
        alertDialogBuilder.setTitle("MATCH DRAW!!!\nPLAY AGAIN???");

        alertDialogBuilder.setMessage("CLICK YES TO CONTINUE")
                .setCancelable(false)
                .setPositiveButton("NO",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog,int id){
                        Eo.this.finish();
                    }
                })
                .setNegativeButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                        b1.setText("");
                        b2.setText("");
                        b3.setText("");
                        b4.setText("");
                        b5.setText("");
                        b6.setText("");
                        b7.setText("");
                        b8.setText("");
                        b9.setText("");
                        b1.setEnabled(true);
                        b2.setEnabled(true);
                        b3.setEnabled(true);
                        b4.setEnabled(true);
                        b5.setEnabled(true);
                        b6.setEnabled(true);
                        b7.setEnabled(true);
                        b8.setEnabled(true);
                        b9.setEnabled(true);
                    }
                });

        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.translucent_black)));
        alertDialog.show();
    }

    public void Show2(){

        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(context);
        alertDialogBuilder.setIcon(R.drawable.s);
        alertDialogBuilder.setTitle("YOU LOST!!!\nPLAY AGAIN???");

        alertDialogBuilder.setMessage("CLICK YES TO CONTINUE")
                .setCancelable(false)
                .setPositiveButton("NO",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog,int id){
                        Eo.this.finish();
                    }
                })
                .setNegativeButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                        b1.setText("");
                        b2.setText("");
                        b3.setText("");
                        b4.setText("");
                        b5.setText("");
                        b6.setText("");
                        b7.setText("");
                        b8.setText("");
                        b9.setText("");
                        b1.setEnabled(true);
                        b2.setEnabled(true);
                        b3.setEnabled(true);
                        b4.setEnabled(true);
                        b5.setEnabled(true);
                        b6.setEnabled(true);
                        b7.setEnabled(true);
                        b8.setEnabled(true);
                        b9.setEnabled(true);
                    }
                });

        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.translucent_black)));
        alertDialog.show();
    }
    @Override
    public void onInit(int status) {
        if (status == TextToSpeech.SUCCESS) {
            int result = tts.setLanguage(Locale.US);
            if (result == TextToSpeech.LANG_MISSING_DATA
                    || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS", "This Language is not supported");
            } else {
                speakOut();
            }
        } else {
            Log.e("TTS", "Initilization Failed!");
        }
    }
    void speakOut(){

    }
}
