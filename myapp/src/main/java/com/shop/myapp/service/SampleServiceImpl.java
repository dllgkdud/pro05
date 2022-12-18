package com.shop.myapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.myapp.dao.SampleMapper;
import com.shop.myapp.dto.SampleDTO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SampleServiceImpl implements SampleService {
	private final SampleMapper sampleMapper;

	@Override
	public List<SampleDTO> findAll() {
		return sampleMapper.findAll();
	}

	@Override
	public SampleDTO getSample(String id) {
		return sampleMapper.getSample(id);
	}
}
