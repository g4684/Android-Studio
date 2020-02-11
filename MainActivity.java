package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    private Button [] [] buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buildGUIByCode();
    }

    private void buildGUIByCode() {
        // get width of screen
        Point size = new Point();
        getWindowManager().getDefaultDisplay().getSize(size);
        int w = size.x/TicTacToe.SIDE;

        // create the layout Manager as a GridLayout

        GridLayout gridLayout = new GridLayout (this);
        gridLayout.setColumnCount(TicTacToe.SIDE);
        gridLayout.setRowCount(TicTacToe.SIDE);
        // create the buttons and add them to the gridlayout

        buttons = new Button[TicTacToe.SIDE][TicTacToe.SIDE];
        for (int row = 0; row <TicTacToe.SIDE; row ++){
            for ( int col = 0; col < TicTacToe.SIDE; col ++){
                buttons[row] [col] = new Button(this);
                gridLayout.addView(buttons [row] [col], w, w);
            }
        }
        // set the GridLayout as the view of this Activity
        setContentView(gridLayout);
    }
}
