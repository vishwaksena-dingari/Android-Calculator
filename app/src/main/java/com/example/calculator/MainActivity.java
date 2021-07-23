package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.calculator.EvaluateString;

public class MainActivity extends AppCompatActivity {

    TextView textViewInput, textViewOutput;
    int i = 0;
    boolean deci;
    int lrbr, rrbr;
    Button button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_add, button_sub,
            button_mul, button_div, button_equ, button_C, button_dec, button_lrbr, button_rrbr, button_del;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_0 = (Button) findViewById(R.id.btn_0);
        button_1 = (Button) findViewById(R.id.btn_1);
        button_2 = (Button) findViewById(R.id.btn_2);
        button_3 = (Button) findViewById(R.id.btn_3);
        button_4 = (Button) findViewById(R.id.btn_4);
        button_5 = (Button) findViewById(R.id.btn_5);
        button_6 = (Button) findViewById(R.id.btn_6);
        button_7 = (Button) findViewById(R.id.btn_7);
        button_8 = (Button) findViewById(R.id.btn_8);
        button_9 = (Button) findViewById(R.id.btn_9);
        button_lrbr = (Button) findViewById(R.id.btn_lrbr);
        button_rrbr = (Button) findViewById(R.id.btn_rrbr);
        button_dec = (Button) findViewById(R.id.btn_dec);
        button_add = (Button) findViewById(R.id.btn_add);
        button_sub = (Button) findViewById(R.id.btn_sub);
        button_mul = (Button) findViewById(R.id.btn_mul);
        button_div = (Button) findViewById(R.id.btn_div);
        button_C = (Button) findViewById(R.id.btn_c);
        button_equ = (Button) findViewById(R.id.btn_equ);
        button_del = (Button) findViewById(R.id.btn_del);

        textViewInput = (TextView) findViewById(R.id.textViewInput);
        textViewOutput = (TextView) findViewById(R.id.textViewOutput);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewInput.length() >= 16)
                    textViewInput.setTextSize(30);
                if (textViewInput.length() <= 16)
                    textViewInput.setTextSize(40);
                if (i == 0) {
                    textViewInput.setText("1");
                    i++;
                } else
                    textViewInput.setText(textViewInput.getText() + "1");
//                if(lrbr || rrbr) {
//                    //do nothing
//                }else {
//                    Double x = (Double) EvaluateString.evaluate(textViewInput.getText().toString());
//                    String output = x.toString();
//                    textViewOutput.setText(output);
//                }
//                lrbr = false;
//                rrbr = false;
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewInput.length() >= 16)
                    textViewInput.setTextSize(30);
                if (textViewInput.length() <= 16)
                    textViewInput.setTextSize(40);
                if (i == 0) {
                    textViewInput.setText("2");
                    i++;
                } else
                    textViewInput.setText(textViewInput.getText() + "2");
//                Double x = (Double) EvaluateString.evaluate(textViewInput.getText().toString());
//                String output = x.toString();
//                textViewOutput.setText(output);
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewInput.length() >= 16)
                    textViewInput.setTextSize(30);
                if (textViewInput.length() <= 16)
                    textViewInput.setTextSize(40);
                if (i == 0) {
                    textViewInput.setText("3");
                    i++;
                } else
                    textViewInput.setText(textViewInput.getText() + "3");
//                Double x = (Double) EvaluateString.evaluate(textViewInput.getText().toString());
//                String output = x.toString();
//                textViewOutput.setText(output);
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewInput.length() >= 16)
                    textViewInput.setTextSize(30);
                if (textViewInput.length() <= 16)
                    textViewInput.setTextSize(40);
                if (i == 0) {
                    textViewInput.setText("4");
                    i++;
                } else
                    textViewInput.setText(textViewInput.getText() + "4");
//                Double x = (Double) EvaluateString.evaluate(textViewInput.getText().toString());
//                String output = x.toString();
//                textViewOutput.setText(output);
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewInput.length() >= 16)
                    textViewInput.setTextSize(30);
                if (textViewInput.length() <= 16)
                    textViewInput.setTextSize(40);
                if (i == 0) {
                    textViewInput.setText("5");
                    i++;
                } else
                    textViewInput.setText(textViewInput.getText() + "5");
//                Double x = (Double) EvaluateString.evaluate(textViewInput.getText().toString());
//                String output = x.toString();
//                textViewOutput.setText(output);
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewInput.length() >= 16)
                    textViewInput.setTextSize(30);
                if (textViewInput.length() <= 16)
                    textViewInput.setTextSize(40);
                if (i == 0) {
                    textViewInput.setText("6");
                    i++;
                } else
                    textViewInput.setText(textViewInput.getText() + "6");
//                Double x = (Double) EvaluateString.evaluate(textViewInput.getText().toString());
//                String output = x.toString();
//                textViewOutput.setText(output);
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewInput.length() >= 16)
                    textViewInput.setTextSize(30);
                if (textViewInput.length() <= 16)
                    textViewInput.setTextSize(40);
                if (i == 0) {
                    textViewInput.setText("7");
                    i++;
                } else
                    textViewInput.setText(textViewInput.getText() + "7");
//                Double x = (Double) EvaluateString.evaluate(textViewInput.getText().toString());
//                String output = x.toString();
//                textViewOutput.setText(output);
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewInput.length() >= 16)
                    textViewInput.setTextSize(30);
                if (textViewInput.length() <= 16)
                    textViewInput.setTextSize(40);
                if (i == 0) {
                    textViewInput.setText("8");
                    i++;
                } else
                    textViewInput.setText(textViewInput.getText() + "8");
//                Double x = (Double) EvaluateString.evaluate(textViewInput.getText().toString());
//                String output = x.toString();
//                textViewOutput.setText(output);
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewInput.length() >= 16)
                    textViewInput.setTextSize(30);
                if (textViewInput.length() <= 16)
                    textViewInput.setTextSize(40);
                if (i == 0) {
                    textViewInput.setText("9");
                    i++;
                } else
                    textViewInput.setText(textViewInput.getText() + "9");
//                Double x = (Double) EvaluateString.evaluate(textViewInput.getText().toString());
//                String output = x.toString();
//                textViewOutput.setText(output);
            }
        });

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewInput.length() >= 16)
                    textViewInput.setTextSize(30);
                if (textViewInput.length() <= 16)
                    textViewInput.setTextSize(40);
                if (i == 0) {
                    textViewInput.setText("0");
                    i++;
                } else
                    textViewInput.setText(textViewInput.getText() + "0");
//                Double x = (Double) EvaluateString.evaluate(textViewInput.getText().toString());
//                String output = x.toString();
//                textViewOutput.setText(output);
            }
        });

        button_lrbr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewInput.length() >= 16)
                    textViewInput.setTextSize(30);
                if (textViewInput.length() <= 16)
                    textViewInput.setTextSize(40);
                lrbr++;
                deci = false;
                if (i == 0) {
                    textViewInput.setText("(");
                    i++;
                } else
                    textViewInput.setText(textViewInput.getText() + "(");
//                Double x = (Double) EvaluateString.evaluate(textViewInput.getText().toString());
//                String output = x.toString();
//                textViewOutput.setText(output);
            }
        });

        button_rrbr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewInput.length() >= 16)
                    textViewInput.setTextSize(30);
                if (textViewInput.length() <= 16)
                    textViewInput.setTextSize(40);
                rrbr++;
                deci = false;
                if (i == 0) {
                    textViewInput.setText("(");
                    i++;
                } else
                    textViewInput.setText(textViewInput.getText() + ")");
//                Double x = (Double) EvaluateString.evaluate(textViewInput.getText().toString());
//                String output = x.toString();
//                textViewOutput.setText(output);
            }
        });

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewInput.length() >= 16)
                    textViewInput.setTextSize(30);
                if (textViewInput.length() <= 16)
                    textViewInput.setTextSize(40);
                if (textViewInput.getText().length() != 0) {
                    deci = false;
                    textViewInput.setText(textViewInput.getText() + "+");
                }
            }
        });

        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewInput.length() >= 16)
                    textViewInput.setTextSize(30);
                if (textViewInput.length() <= 16)
                    textViewInput.setTextSize(40);
                if (textViewInput.getText().length() != 0) {
                    deci = false;
                    textViewInput.setText(textViewInput.getText() + "-");
                }
            }
        });

        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewInput.length() >= 16)
                    textViewInput.setTextSize(30);
                if (textViewInput.length() <= 16)
                    textViewInput.setTextSize(40);
                if (textViewInput.getText().length() != 0) {
                    deci = false;
                    textViewInput.setText(textViewInput.getText() + "*");
                }
            }
        });

        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewInput.length() >= 16)
                    textViewInput.setTextSize(30);
                if (textViewInput.length() <= 16)
                    textViewInput.setTextSize(40);
                if (textViewInput.getText().length() != 0) {
                    deci = false;
                    textViewInput.setText(textViewInput.getText() + "/");
                }
            }
        });

        button_equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double x = (Double) EvaluateString.evaluate(textViewInput.getText().toString());
                String output = x.toString();
                textViewOutput.setText(output);
            }
        });

        button_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setTextSize(40);
                textViewInput.setText("");
                textViewOutput.setText("");
            }
        });

        button_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewInput.length() >= 16)
                    textViewInput.setTextSize(30);
                if (textViewInput.length() <= 16)
                    textViewInput.setTextSize(40);
                if (deci) {
                    //do nothing or you can show the error
                } else {
                    textViewInput.setText(textViewInput.getText() + ".");
                    deci = true;
                }

            }
        });

        button_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewInput.length() <= 16)
                    textViewInput.setTextSize(40);
                String string = textViewInput.getText().toString();
                StringBuffer sb = new StringBuffer(string);
                if (sb.length() <= 1) {
                    textViewInput.setText("");
                } else {
                    sb.deleteCharAt(sb.length() - 1);
                    textViewInput.setText(sb);
                }
            }
        });
    }
}