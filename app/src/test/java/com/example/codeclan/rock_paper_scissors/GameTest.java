package com.example.codeclan.rock_paper_scissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;

    @Before
    public void before(){
       game = new Game(ChoiceType.PAPER, ChoiceType.ROCK);
//        game = new Game();
    }

    @Test
    public void canGetPlayerChoice(){
        assertEquals(ChoiceType.PAPER, game.getPlayerChoice());
    }

    @Test
    public void canSetPlayerChoice(){
        game.setPlayerChoice(ChoiceType.ROCK);
        assertEquals(ChoiceType.ROCK, game.getPlayerChoice());
    }

    @Test
    public void canGetAWinnerPlayer(){
        String result = game.getWinner();
        assertEquals("Player Wins!!", result);
    }

    @Test
    public void canGetAWinnerAndroid(){
        game.setAndroidChoice(ChoiceType.SCISSORS);
        String result = game.getWinner();
        assertEquals("Android Wins!!", result);
    }

    @Test
    public void canGetWinnerDraw(){
        game.setPlayerChoice(ChoiceType.ROCK);
        game.setAndroidChoice(ChoiceType.ROCK);
        assertEquals("The game is a draw", game.getWinner());
    }

    @Test
    public void canGetRandomAndroidChoice(){
        ChoiceType result = game.randomiseAndroidChoice();
        game.setAndroidChoice(result);
        assertEquals(ChoiceType.PAPER, game.getAndroidChoice());
    }

    @Test
    public void canAccumulateWins(){
        ChoiceType result = game.randomiseAndroidChoice();
        game.setAndroidChoice(result);
        game.getWinner();
        game.countWins();
        game.getWinner();
        game.countWins();
        assertEquals(0, game.getPlayerWinCounter());
        assertEquals(0, game.getAndroidWinCounter());
        assertEquals(0, game.getNumOfDraws());

    }


}
