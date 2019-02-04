package com.example.umpirehelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    BallStrikeCounter bsc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bsc = new BallStrikeCounter();
        updateView();
    }

    /**
     * Runs when any of the three buttons are clicked
     * @param view - View with called this method
     */
    public void buttonClick(View view) {
        if (view.getId() == R.id.balls_button) {
            bsc.callBall();
        } else if (view.getId()==R.id.strikes_button) {
            bsc.callStrike();
        } else if (view.getId() == R.id.reset_button) {
            bsc.reset();
        } else {
            throw new RuntimeException("Unregistered button click detected");
        }
        updateView();
}

    /**
     * Runs when the controller updates the model
     */
    private void updateView() {
        TextView ballsDisplay = findViewById(R.id.numBalls);
        TextView strikesDisplay= findViewById(R.id.numStrikes);
        ballsDisplay.setText(String.format(Locale.US, "%d", bsc.getnBalls()));
        strikesDisplay.setText(String.format(Locale.US, "%d", bsc.getnStrikes()));
    }

}
