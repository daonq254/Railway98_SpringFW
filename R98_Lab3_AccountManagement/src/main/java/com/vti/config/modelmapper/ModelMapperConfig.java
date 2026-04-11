package com.vti.config.modelmapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vti.dto.DepartmentDto;
import com.vti.entity.Department;

@Configuration
public class ModelMapperConfig {

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//		Cấu hình cho Department
		mapper.addMappings(new PropertyMap<Department, DepartmentDto>() {
			@Override
			protected void configure() {
				// Nếu Department và DepartmentDto cùng tên field thì để trống
			}
		});
//		Chuyển đổi Account
//		mapper.addMappings(new PropertyMap<Account, AccontDto>() {
//			@Override
//			protected void configure() {
//				// Nếu Department và DepartmentDto cùng tên field thì để trống
//			}
//		});
		return mapper;

	}

}
