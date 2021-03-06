package com.study.notice;

import java.util.List;
import java.util.Map;

public interface NoticeService {

	int total(Map map);

	List<NoticeDTO> list(Map map);

	int create(NoticeDTO dto);
	
	NoticeDTO read(int noticeno);

	int update(NoticeDTO dto);

	void upCnt(int noticeno);

	int passwd(Map map);

	int delete(int noticeno);
	
}
