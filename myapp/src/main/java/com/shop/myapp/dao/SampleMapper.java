package com.shop.myapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.myapp.dto.SampleDTO;

@Mapper
@Repository
public interface SampleMapper {
	List<SampleDTO> findAll();
	SampleDTO getSample(String id);
}
