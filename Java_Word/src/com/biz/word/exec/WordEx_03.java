package com.biz.word.exec;

import com.biz.word.domain.WordGameService;

public class WordEx_03 {
	
	public static void main(String[] args) {
		
		WordGameService wService = new WordGameServiceV3();
		
		wService.loadWord();
		wService.playGame();
		wService.gameOver();
		
	}
	
	

}
