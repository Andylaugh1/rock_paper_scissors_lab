package com.example.codeclan.rock_paper_scissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    Game game = new Game();

    TextView playerChoice, androidsChoice, gameResult, playerWins, androidWins;
    Button rockButton, paperButton, scissorsButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        playerChoice = findViewById(R.id.player_choice);
        androidsChoice = findViewById(R.id.android_choice);
        gameResult = findViewById(R.id.game_result);
        rockButton = findViewById(R.id.rock_button);
        paperButton = findViewById(R.id.paper_button);
        scissorsButton = findViewById(R.id.scissors_button);
        playerWins = findViewById(R.id.player_wins);
        androidWins = findViewById(R.id.android_wins);




    }


    public void onClickRockButton(View button){
        playerChoice.setText("Player chose ROCK");

        game.setPlayerChoice(ChoiceType.ROCK);

        ChoiceType androidChoice = game.randomiseAndroidChoice();
        game.setAndroidChoice(androidChoice);
        ChoiceType choice = game.getAndroidChoice();
        androidsChoice.setText("Android chose " + choice.toString());

        String winner = game.getWinner();
        game.countWins();

        playerWins.setText(game.getPlayerWinCounter());
        androidWins.setText(game.getAndroidWinCounter());
        gameResult.setText(winner);
    }

    public void onClickPaperButton(View button){
        playerChoice.setText("Player chose PAPER");

        game.setPlayerChoice(ChoiceType.PAPER);

        ChoiceType androidChoice = game.randomiseAndroidChoice();
        game.setAndroidChoice(androidChoice);
        ChoiceType choice = game.getAndroidChoice();
        androidsChoice.setText("Android chose " + choice.toString());


        String winner = game.getWinner();
        game.countWins();

        playerWins.setText(game.getPlayerWinCounter());
        androidWins.setText(game.getAndroidWinCounter());

        gameResult.setText(winner);
    }

    public void onClickScissorsButton(View button){
        playerChoice.setText("Player chose SCISSORS");

        game.setPlayerChoice(ChoiceType.SCISSORS);

        ChoiceType androidChoice = game.randomiseAndroidChoice();
        game.setAndroidChoice(androidChoice);
        ChoiceType choice = game.getAndroidChoice();
        androidsChoice.setText("Android chose " + choice.toString());

        String winner = game.getWinner();
        game.countWins();

        playerWins.setText(game.getPlayerWinCounter());
        androidWins.setText(game.getAndroidWinCounter());

        gameResult.setText(winner);
    }

}
