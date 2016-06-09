package com.dktechin.deva.service;

import java.util.List;
import com.dktechin.deva.vo.CriteriaVO;

public interface GenericService <E, K> {
	void regist(E vo) throws Exception;
	E view(K key) throws Exception;
	void modify(E vo) throws Exception;
	void remove(K key) throws Exception;
	List<E> getList(CriteriaVO vo) throws Exception;
}
