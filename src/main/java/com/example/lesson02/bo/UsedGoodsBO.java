package com.example.lesson02.bo;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.lesson02.domain.UsedGoods;

@Service  // BO에 붙이는 어노테이션, spring bean
public class UsedGoodsBO {
	
	// input (controller로부터 요청 받음) : X
	// output (controller에게 돌려줌) : List<UsedGoods>
	
	public List<UsedGoods> getUsedGoodsList() {
		
	}

}
