package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    EditText express,result;
    Button btsin,btcos,bttan,btpower,btlog,btln,btleft,btright,btsqrt,btclear,btdevide,btfact,bt7,bt8,bt9;
    Button btX,btreverse,bt4,bt5,bt6,btminus,btpai,bt1,bt2,bt3,btplus,bte,btzero,btdot,bteq,btdel;
    String res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        express=(EditText)findViewById(R.id.express);
        result=(EditText)findViewById(R.id.result);


        btsin=(Button)findViewById(R.id.btsin);
        btcos=(Button)findViewById(R.id.btcos);
        bttan=(Button)findViewById(R.id.bttan);
        btpower=(Button)findViewById(R.id.btpower);
        btlog=(Button)findViewById(R.id.btlog);

        btln=(Button)findViewById(R.id.btln);
        btleft=(Button)findViewById(R.id.btleft);
        btright=(Button)findViewById(R.id.btright);
        btsqrt=(Button)findViewById(R.id.btsqrt);
        btclear=(Button)findViewById(R.id.btclear);

        btdevide=(Button)findViewById(R.id.btdevide);
        btfact=(Button)findViewById(R.id.btfact);
        bt7=(Button)findViewById(R.id.bt7);
        bt8=(Button)findViewById(R.id.bt8);
        bt9=(Button)findViewById(R.id.bt9);

        btX=(Button)findViewById(R.id.btX);
        btreverse=(Button)findViewById(R.id.btreverse);
        bt4=(Button)findViewById(R.id.bt4);
        bt5=(Button)findViewById(R.id.bt5);
        bt6=(Button)findViewById(R.id.bt6);

        btminus=(Button)findViewById(R.id.btminus);
        btpai=(Button)findViewById(R.id.btpai);
        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);
        bt3=(Button)findViewById(R.id.bt3);

        btplus=(Button)findViewById(R.id.btplus);
        bte=(Button)findViewById(R.id.bte);
        btzero=(Button)findViewById(R.id.btzero);
        btdot=(Button)findViewById(R.id.btdot);
        bteq=(Button)findViewById(R.id.bteq);

        btdel=(Button)findViewById(R.id.btdel);

       //number click

        btzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"0");
            }
        });

       bt1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               express.setText(express.getText()+"1");
           }
       });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"2");
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"3");
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"4");
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"5");
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"6");
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"7");
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"8");
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"9");
            }
        });


        //sign click

        btleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"(");
            }
        });

        btright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+")");
            }
        });

        btplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"+");
            }
        });

        btminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"-");
            }
        });

        btX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"x");
            }
        });

        btdevide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"/");
            }
        });

        bte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"e");
            }
        });

        btpai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"pai");
            }
        });

        btdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+".");
            }
        });


        btsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"sin");
            }
        });

        btcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"cos");
            }
        });

        bttan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"tan");
            }
        });

        btlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"log");
            }
        });

        btln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"ln");
            }
        });


        btpower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"^");

            }
        });

        btsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"sqrt");
            }
        });

        btfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(express.getText()+"!");
            }
        });

        btreverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText("1/"+express.getText());
            }
        });

        btclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express.setText(null);
                result.setText(null);
            }
        });

        btdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String my =express.getText().toString();
                String mynew="";

                for(int i=0;i<my.length()-1;i++){
                    mynew+=my.charAt(i);
                }

                express.setText(mynew.toString());
            }
        });




        bteq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String mys=solveFirst(express.getText().toString());
                //result.setText(String.valueOf(mys));
                result.setText(String.valueOf(solveExpress(express.getText().toString())));
            }


        });


    }

    private String solveFirst(String str) {












        return "";
    }


    private int solveExpress(String expression) {

        //Stack for Numbers
        Stack<Integer> numbers = new Stack<>();

        //Stack for operators
        Stack<Character> operations = new Stack<>();
        for(int i=0; i<expression.length();i++) {
            char c = expression.charAt(i);
            //check if it is number
            if(Character.isDigit(c)){
                //Entry is Digit, it could be greater than one digit number
                int num = 0;
                while (Character.isDigit(c)) {
                    num = num*10 + (c-'0');
                    i++;
                    if(i < expression.length())
                        c = expression.charAt(i);
                    else
                        break;
                }
                i--;
                //push it into stack
                numbers.push(num);
            }else if(c=='('){
                //push it to operators stack
                operations.push(c);
            }
            //Closed brace, evaluate the entire brace
            else if(c==')') {
                while(operations.peek()!='('){
                    int output = performOperation(numbers, operations);
                    //push it back to stack
                    numbers.push(output);
                }
                operations.pop();
            }
            // current character is operator
            else if(isOperator(c)){
                //1. If current operator has higher precedence than operator on top of the stack,
                //the current operator can be placed in stack
                // 2. else keep popping operator from stack and perform the operation in  numbers stack till
                //either stack is not empty or current operator has higher precedence than operator on top of the stack
                while(!operations.isEmpty() && precedence(c)<=precedence(operations.peek())){
                    int output = performOperation(numbers, operations);
                    //push it back to stack
                    numbers.push(output);
                }
                //now push the current operator to stack
                operations.push(c);
            }



        }
        //If here means entire expression has been processed,
        //Perform the remaining operations in stack to the numbers stack

        while(!operations.isEmpty()){
            int output = performOperation(numbers, operations);
            //push it back to stack
            numbers.push(output);
        }
        return numbers.pop();

    }

    static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case 'x':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public int performOperation(Stack<Integer> numbers, Stack<Character> operations) {
        int a = numbers.pop();
        int b = numbers.pop();

        //float a = numbers.pop();
        //float b = numbers.pop();
        char operation = operations.pop();
        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return b - a;
            case 'x':
                return a * b;
            case '/':
                if (a == 0)
                    throw new
                            UnsupportedOperationException("Cannot divide by zero");
                return b / a;
        }
        return 0;
    }

    public boolean isOperator(char c){
        return (c=='+'||c=='-'||c=='/'||c=='x'||c=='^');
    }




}