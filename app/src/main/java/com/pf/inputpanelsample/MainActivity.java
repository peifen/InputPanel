package com.pf.inputpanelsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.pf.inputpanel.view.HandwritingBoardView;

public class MainActivity extends AppCompatActivity {

    private HandwritingBoardView mBoardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBoardView = this.findViewById(R.id.hbv);
    }

    public void onClickSave(View view) {

    }

    public void onClickUndo(View view) {
        mBoardView.undo();
    }

    public void onClickClear(View view) {
        mBoardView.redo();
    }
}