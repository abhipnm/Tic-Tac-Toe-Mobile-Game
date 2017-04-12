package com.example.lenovo.tictactoeupdated;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.speech.tts.*;
import android.widget.Button;
import java.util.Locale;
import android.widget.Toast;

public class Single extends AppCompatActivity implements TextToSpeech.OnInitListener {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    final Context context=this;
    int turn;
    private TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eo);

        tts=new TextToSpeech(this,this);

        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);

        turn=1;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b1.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b1.setText("O");
                    }
                }
                b1.setEnabled(false);
                endGame();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b2.setText("O");
                    }
                }
                b2.setEnabled(false);
                endGame();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b3.setText("O");
                    }
                }
                b3.setEnabled(false);
                endGame();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b4.setText("O");
                    }
                }
                b4.setEnabled(false);
                endGame();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b5.setText("O");
                    }
                }
                b5.setEnabled(false);
                endGame();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b6.setText("O");
                    }
                }
                b6.setEnabled(false);
                endGame();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b7.setText("O");
                    }
                }
                b7.setEnabled(false);
                endGame();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b8.setText("O");
                    }
                }
                b8.setEnabled(false);
                endGame();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b9.setText("O");
                    }
                }
                b9.setEnabled(false);
                endGame();
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
            Toast.makeText(Single.this,"PLAYER X WINS",Toast.LENGTH_LONG).show();
            end=true;String text="PLAYER X WINS";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);
            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show();
        }
        else if(a.equals(e)&& a.equals(i) && a.equals("X")){
            Toast.makeText(Single.this,"PLAYER X WINS",Toast.LENGTH_LONG).show();
            end=true;String text="PLAYER X WINS";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);
            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);

            Show();
        }
        else if(a.equals(d)&& a.equals(g) && a.equals("X")){
            Toast.makeText(Single.this,"PLAYER X WINS",Toast.LENGTH_LONG).show();
            end=true;String text="PLAYER X WINS";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);

            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show();
        }
        else if(a.equals(b)&& a.equals(c) && a.equals("O")){
            Toast.makeText(Single.this,"PLAYER O WINS",Toast.LENGTH_LONG).show();
            end=true;String text="PLAYER O WINS";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);

            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show();
        }
        else if(a.equals(e)&& a.equals(i) && a.equals("O")){
            Toast.makeText(Single.this,"PLAYER O WINS",Toast.LENGTH_LONG).show();
            end=true;String text="PLAYER O WINS";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);

            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show();
        }
        else if(a.equals(d)&& a.equals(g) && a.equals("O")){
            Toast.makeText(Single.this,"PLAYER O WINS",Toast.LENGTH_LONG).show();
            end=true;
            Show();String text="PLAYER O WINS";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);

            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
        }


        else if(b.equals(e)&& b.equals(h) && b.equals("O")){
            Toast.makeText(Single.this,"PLAYER O WINS",Toast.LENGTH_LONG).show();
            end=true;String text="PLAYER O WINS";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);

            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show();
        }

        else if(b.equals(e)&& b.equals(h) && b.equals("X")){
            Toast.makeText(Single.this,"PLAYER x WINS",Toast.LENGTH_LONG).show();
            end=true;String text="PLAYER X WINS";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);

            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show();
        }


        else if(c.equals(f)&& c.equals(i) && c.equals("O")){
            Toast.makeText(Single.this,"PLAYER O WINS",Toast.LENGTH_LONG).show();
            end=true;String text="PLAYER O WINS";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);

            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show();
        }
        else if(c.equals(i)&& c.equals(f) && c.equals("X")){
            Toast.makeText(Single.this,"PLAYER X WINS",Toast.LENGTH_LONG).show();
            end=true;String text="PLAYER X WINS";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);

            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show();
        }
        else if(c.equals(e)&& c.equals(g) && c.equals("X")){
            Toast.makeText(Single.this,"PLAYER X WINS",Toast.LENGTH_LONG).show();
            end=true;String text="PLAYER X WINS";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);

            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show();
        }
        else if(c.equals(e)&& c.equals(g) && c.equals("O")){
            Toast.makeText(Single.this,"PLAYER X WINS",Toast.LENGTH_LONG).show();
            end=true;String text="PLAYER X WINS";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);

            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show();
        }


        else if(d.equals(e)&& d.equals(f) && d.equals("O")){
            Toast.makeText(Single.this,"PLAYER O WINS",Toast.LENGTH_LONG).show();
            end=true;String text="PLAYER O WINS";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);

            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show();
        }
        else if(d.equals(f)&& d.equals(e) && d.equals("X")){
            Toast.makeText(Single.this,"PLAYER X WINS",Toast.LENGTH_LONG).show();
            end=true;
            String text="PLAYER X WINS";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);
            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show();
        }


        else if(g.equals(h)&& g.equals(i) && g.equals("X")){
            Toast.makeText(Single.this,"PLAYER X WINS",Toast.LENGTH_LONG).show();
            end=true;
            String text="PLAYER X WINS";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);
            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show();
        }
        else if(g.equals(h)&& g.equals(i) && g.equals("O")){
            Toast.makeText(Single.this,"PLAYER O WINS",Toast.LENGTH_LONG).show();
            end=true;
            String text="PLAYER O WINS";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);
            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show();
        }
        if(!b1.isEnabled() && !b2.isEnabled() && !b3.isEnabled() &&
                !b6.isEnabled() && !b5.isEnabled() && !b4.isEnabled() &&
                !b7.isEnabled() && !b8.isEnabled() && !b9.isEnabled()){
            Toast.makeText(Single.this,"MATCH DRAW!!!",Toast.LENGTH_LONG).show();
            String text="MATCH DRAW!!!";
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);
            tts.setSpeechRate(0.7f);
            tts.setPitch(0.8f);
            Show();
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

    void Show(){
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(context);
        alertDialogBuilder.setIcon(R.drawable.s);
        alertDialogBuilder.setTitle("PLAY AGAIN???");

        alertDialogBuilder.setMessage("CLICK YES TO CONTINUE")
                .setCancelable(false)
                .setPositiveButton("NO",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog,int id){
                        Single.this.finish();
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

