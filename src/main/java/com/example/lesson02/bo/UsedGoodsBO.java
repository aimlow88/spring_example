package com.example.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.domain.UsedGoods;
import com.example.lesson02.mapper.UsedGoodsMapper;

@Service  // BO에 붙이는 어노테이션, spring bean
public class UsedGoodsBO {
	
	@Autowired  // spring bean(객체) 가져오는 것 - DI(Dependency Injection)
	private UsedGoodsMapper usedGoodsMapper;
	
	// input (controller로부터 요청 받음) : X
	// output (controller에게 돌려줌) : List<UsedGoods>
	
	public List<UsedGoods> getUsedGoodsList() {
		return usedGoodsMapper.selectUsedGoodsList();
	}

}
