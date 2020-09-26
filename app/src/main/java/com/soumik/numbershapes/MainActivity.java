package com.soumik.numbershapes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number{

        int number;

        public boolean isSquare(){

            int y=1;
            int squareNumber=1;
            while(squareNumber<number){
                squareNumber=y*y;
                y++;
            }
            if(squareNumber==number){
                return true;
            }
            else{
                return false;
            }

        }


        public boolean isTriangular(){

            int x=1;
            int triangularNumber=1;
            while(triangularNumber<number){

                x++;
                triangularNumber+=x;
            }
            if(triangularNumber==number){
                return true;

            }else{
                return false;
            }
        }

    }

    public void checkNumber(View view){
        EditText newNumber=(EditText)findViewById(R.id.enteredNumber);

        Number myNumber=new Number();
        myNumber.number=Integer.parseInt(newNumber.getText().toString());

        String message;
        if(myNumber.isSquare() && myNumber.isTriangular()){
            message=newNumber.getText().toString()+" is Triangular as well as a Square number.";
        }
        else if(myNumber.isTriangular()){
            message=newNumber.getText().toString()+" is a Triangular Number";
        }
        else if(myNumber.isSquare()){
            message=newNumber.getText().toString()+" is a Square Number";
        }
        else{
            message=newNumber.getText().toString()+" is neither a Square nor a Triangular Number";
        }

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}