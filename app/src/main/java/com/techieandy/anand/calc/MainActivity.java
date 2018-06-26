package com.techieandy.anand.calc;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.javia.arity.Symbols;
import org.javia.arity.SyntaxException;


public class MainActivity extends AppCompatActivity{

    public String in = "";
    TextView input,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (TextView)findViewById(R.id.input);
        result = (TextView) findViewById(R.id.ans);

        Button AC,C,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_00,btn_eq;

        //  Numeric Buttons Action Listener

        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in = in.concat("1");
                input.setText(in);
            }
        });

        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in = in + "2";
                input.setText(in);
            }
        });

        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in = in + "3";
                input.setText(in);
            }
        });

        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in = in + "4";
                input.setText(in);
            }
        });

        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in = in + "5";
                input.setText(in);
            }
        });

        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in = in + "6";
                input.setText(in);
            }
        });

        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in = in + "7";
                input.setText(in);
            }
        });

        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in = in + "8";
                input.setText(in);
            }
        });

        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in = in + "9";
                input.setText(in);
            }
        });
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in = in + "0";
                input.setText(in);
            }
        });
        btn_00 = (Button) findViewById(R.id.btn_00);
        btn_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in = in + "00";
                input.setText(in);
            }
        });

        btn_eq = (Button) findViewById(R.id.btn_eq);
        btn_eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Covert x to * for Multiplication to occur.

                in = in.replace("x", "*");

                // Calc Logic Here
                Symbols symbols = new Symbols();

                try {
                    Double res = symbols.eval(in);

                    result.setText(res.toString());

                } catch (SyntaxException e) {

                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Error");
                    builder.setMessage("Invalid Input");
                    builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            in = "0";
                            input.setText(in);
                            result.setText(in);
                        }
                    });
                    builder.show();
                }


            }
        });

    }

    public void all_clear(View view) {
            input.setText("0");
            result.setText("0");
            in = "";
    }

    public void clear(View view) {
        result.setText("");
        in = in.replace("*", "x");
        if(in.length()>0){
            in = in.substring(0, in.length() - 1);
        }
            input.setText(in);
    }


    public void div(View view) {
        in = in + "/";
        input.setText(in);
    }

    public void mul(View view) {
        in = in + "x";
        input.setText(in);
    }

    public void percent(View view) {
        in = in + "%";
        input.setText(in);
    }

    public void dec(View view) {
        in = in + ".";
        input.setText(in);
    }

    public void add(View view) {
        in = in + "+";
        input.setText(in);
    }

    public void sub(View view) {
        in = in + "-";
        input.setText(in);
    }
}

