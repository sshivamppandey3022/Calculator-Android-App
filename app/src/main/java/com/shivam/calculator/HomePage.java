package com.shivam.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {

    TextView answer, number1;
    Button bracket, bracket1, mod, clear, num7,num8,num9,div,num4,num5,num6,num1,num2
            ,num3,minus,num0,dot,equal,add,mul;

    String latestOp="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        answer=findViewById(R.id.answer);
        number1=findViewById(R.id.number1);
        bracket=findViewById(R.id.bracket);
        bracket1=findViewById(R.id.bracket1);
        mul=findViewById(R.id.mul);
        mod=findViewById(R.id.mod);
        clear=findViewById(R.id.clear);
        num7=findViewById(R.id.num7);
        num8=findViewById(R.id.num8);
        num9=findViewById(R.id.num9);
        div=findViewById(R.id.div);
        num4=findViewById(R.id.num4);
        num5=findViewById(R.id.num5);
        num6=findViewById(R.id.num6);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        num3=findViewById(R.id.num3);
        minus=findViewById(R.id.minus);
        num0=findViewById(R.id.num0);
        dot=findViewById(R.id.dot);
        equal=findViewById(R.id.equal);
        add=findViewById(R.id.add);


        clear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        answer.setText("Ans = 0");
                        number1.setText("0");
                        latestOp="";
                    }
                }
        );
        num1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        addCharectors("1");
                    }
                }
        );
        num2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        addCharectors("2");
                    }
                }
        );
        num3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        addCharectors("3");
                    }
                }
        );
        num4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        addCharectors("4");
                    }
                }
        );
        num5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        addCharectors("5");
                    }
                }
        );
        num6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        addCharectors("6");
                    }
                }
        );
        num7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        addCharectors("7");
                    }
                }
        );
        num8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        addCharectors("8");
                    }
                }
        );
        num9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        addCharectors("9");
                    }
                }
        );
        num0.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        addCharectors("0");
                    }
                }
        );

        add.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        addCharectors("+");
                    }
                }
        );
        minus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        addCharectors("-");

                    }
                }
        );
        mul.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        addCharectors("x");
                    }
                }
        );
        div.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        addCharectors("÷");

                    }
                }
        );

        equal.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        char dig=number1.getText().toString().charAt(number1.length()-1);
                       if(dig!='+'&&dig!='-'&&dig!='x'&&dig!='÷'){
                           double digit1=0,digit2=0;
                           String  operator="";
                           int lastIndex=0;
                           for(int i=0;i<number1.length();i++){
                               if(number1.getText().toString().charAt(i)=='+'){
                                   if(!operator.equals("")){
                                       digit2=Double.parseDouble(number1.getText().toString().substring(lastIndex+1,i));
                                     digit1=  perfomrOperation(digit1,digit2,operator);
                                       lastIndex=i;
                                       operator="+";
                                   }else{
                                       digit1=Double.parseDouble(number1.getText().toString().substring(lastIndex,i));
                                       lastIndex=i;
                                       operator="+";
                                   }

                               }else  if(number1.getText().toString().charAt(i)=='x'){

                                   if(!operator.equals("")){
                                       digit2=Double.parseDouble(number1.getText().toString().substring(lastIndex+1,i));
                                       digit1=  perfomrOperation(digit1,digit2,operator);
                                       lastIndex=i;
                                       operator="x";
                                   }else{
                                       digit1=Double.parseDouble(number1.getText().toString().substring(lastIndex,i));
                                       lastIndex=i;
                                       operator="x";
                                   }
                               }else  if(number1.getText().toString().charAt(i)=='-'){
                                   if(!operator.equals("")){
                                       digit2=Double.parseDouble(number1.getText().toString().substring(lastIndex+1,i));
                                       digit1=  perfomrOperation(digit1,digit2,operator);
                                       lastIndex=i;
                                       operator="-";
                                   }else{
                                       digit1=Double.parseDouble(number1.getText().toString().substring(lastIndex,i));
                                       lastIndex=i;
                                       operator="-";
                                   }
                               }else  if(number1.getText().toString().charAt(i)=='÷'){
                                   if(!operator.equals("")){
                                       digit2=Double.parseDouble(number1.getText().toString().substring(lastIndex+1,i));
                                       digit1=  perfomrOperation(digit1,digit2,operator);
                                       lastIndex=i;
                                       operator="÷";
                                   }else{
                                       digit1=Double.parseDouble(number1.getText().toString().substring(lastIndex,i));
                                       lastIndex=i;
                                       operator="÷";
                                   }
                               }

                           }
                           digit2=Double.parseDouble(number1.getText().toString().substring(lastIndex+1,number1.length()));
                           digit1=  perfomrOperation(digit1,digit2,operator);

                           answer.setText("Ans = "+digit1);
                        }else{
                            Toast.makeText(getApplicationContext(),"Statement ends with operator !.",Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );

    }

    public void addCharectors(String num){
        String str=number1.getText().toString();
        str=str+num;
        number1.setText(str);
    }

    public void addOperators(String op){
        latestOp=op;
        String str=number1.getText().toString();
        str=str+op;
        answer.setText(str);
        number1.setText("0");
    }

    public double perfomrOperation(double dig1,double dig2,String op){

        double ans=0;
        if(op.equals("+")){

           ans=dig1+dig2;


        }else  if(op.equals("x")){

            ans=dig1*dig2;

        }else  if(op.equals("-")){

            ans=dig1-dig2;

        }else  if(op.equals("÷")){

            ans=dig1/dig2;

        }
        return ans;
    }
}
