package com.soumik.numbershapes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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

        Number myNumber=new Number();
        myNumber.number=16;
        System.out.println(myNumber.isSquare());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}