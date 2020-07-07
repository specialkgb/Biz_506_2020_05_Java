package com.biz.word.exec;

import com.biz.word.domain.WordGameService;

public class WordEx_01 {

	public static void main(String[] args) {
		
		WordGameService wService = new WordGameServiceImplV1();
		
		wService.loadWord();
		
		wService.playGame();
		
		wService.gameOver();
	}
}
		
		
		