package com.shop.myapp.service;

import java.util.List;

import com.shop.myapp.dto.SampleDTO;

public interface SampleService {
	public List<SampleDTO> findAll();
	public SampleDTO getSample(String id);
}
