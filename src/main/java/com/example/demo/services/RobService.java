package com.example.demo.services;

import java.util.List;

import com.example.demo.model.ResponseFormat;

@org.springframework.stereotype.Service
public class RobService {
	RobService(){
		
	}
	
	public ResponseFormat rob(List<Integer> numbers) {
		int nextIndex;
		Integer[] nums = (Integer[]) numbers.toArray(new Integer[0]);
		int[] indexes = {0 ,1}, acums = {0, 0};
		try {
			acums[0]+= nums[indexes[0]];
			acums[1]+= nums[indexes[1]];
		}catch(IndexOutOfBoundsException e) {
			return new ResponseFormat(acums[0]);
		}
		for(int i = 0; i < indexes.length; i++) {			
			while(indexes[i] < nums.length) {
				nextIndex = chooseBestOption(nums, indexes[i]);
				if(nextIndex == indexes[i]) break;
				acums[i] += nums[nextIndex];
				indexes[i] = nextIndex;
			}
		}
		
		return new ResponseFormat((acums[0] > acums[1])? acums[0]: acums[1]);
	}
	
	private int chooseBestOption(Integer[] nums, int currentIndex) { 
		if(currentIndex + 2 >= nums.length) return currentIndex;
		if(currentIndex + 3 >= nums.length) return currentIndex + 2;
		return (nums[currentIndex + 2] >= nums[currentIndex + 3]) ? (currentIndex + 2) : (currentIndex + 3);
	}
}
