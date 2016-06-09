package com.dktechin.deva.service;

import org.springframework.stereotype.Service;

import com.dktechin.deva.mappers.GenericMapper;
import com.dktechin.deva.vo.UsersVO;

@Service("UsersService")
public interface UsersService extends GenericMapper<UsersVO, String> {

}
