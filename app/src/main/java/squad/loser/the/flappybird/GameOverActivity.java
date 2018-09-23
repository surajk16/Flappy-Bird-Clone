package squad.loser.the.flappybird;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity{
    TextView score;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy_game_over);
        score = findViewById(R.id.score);
        score.setText(""+getIntent().getFloatExtra("score",0));
    }
}
