package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacManGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacManGame(); //1: Object creation
		
		//2: Object Creation + Wiring of Dependencies
		//Game is a Dependency of GameRunner
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
