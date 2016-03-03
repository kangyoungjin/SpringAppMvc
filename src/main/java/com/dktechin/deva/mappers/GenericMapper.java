package com.dktechin.deva.mappers;


public interface GenericMapper<E, K> {
	void create(E vo) throws Exception;
	E read(K key) throws Exception;
	void update(E vo) throws Exception;
	void delete(K key) throws Exception;
	/*List<E> list(CriteriaVO cri) throws Exception;*/
	
}
