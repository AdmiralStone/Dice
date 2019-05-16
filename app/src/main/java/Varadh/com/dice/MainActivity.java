package Varadh.com.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        final ImageView leftDice;
        final ImageView rightDice;

        rollButton = (Button) findViewById(R.id.roll_button);
        leftDice = (ImageView) findViewById(R.id.image_LDice);
        rightDice = (ImageView) findViewById(R.id.image_RDice);

        final int[] diceArray = {R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumGenerator = new Random();
                int RandNum = randomNumGenerator.nextInt(6);
                int RandNum2 = randomNumGenerator.nextInt(6);

                leftDice.setImageResource(diceArray[RandNum]);

                rightDice.setImageResource(diceArray[RandNum2]);

            }
        });



    }
}
