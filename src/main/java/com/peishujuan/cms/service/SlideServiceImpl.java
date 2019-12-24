package com.peishujuan.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peishujuan.cms.dao.SlideMapper;
import com.peishujuan.cms.domain.Slide;
@Service
public class SlideServiceImpl implements SlideService{

	@Autowired
	private SlideMapper slideMapper;
	@Override
	public List<Slide> selects() {
		// TODO Auto-generated method stub
		return slideMapper.selects();
	}

}
