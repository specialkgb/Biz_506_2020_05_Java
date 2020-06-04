package com.biz.list.service;

import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreServiceV2 {

	public void scoreList(List<ScoreVO> scoreList) {
		this.scoreList(scoreList);

		int scoreSize = scoreList.size();
		for (int i = 0; i < scoreSize; i++) {
			ScoreVO scoreVO = scoreList.get(i);
			
			int sum = ((scoreVO.getKor() + scoreVO.getEng() + scoreVO.getMath()) / 3);
			
	
		
		
	}

		}

	}
