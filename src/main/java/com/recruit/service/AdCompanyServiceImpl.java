package com.recruit.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.recruit.domain.AdminCriteria;
import com.recruit.domain.AdminSearchCriteria;
import com.recruit.domain.AmainVO;
import com.recruit.domain.RecruitVO;
import com.recruit.persistence.AdCompanyDAO;

@Service
public class AdCompanyServiceImpl implements AdCompanyService {

	@Inject
	private AdCompanyDAO dao;

	@Override
	public AmainVO read(String id) throws Exception {
		return dao.read(id);
	}

	@Override
	public void modify(AmainVO vo) throws Exception {
		System.out.println("service test");
		dao.update(vo);
	}

	@Override
	public void remove(String id) throws Exception {
		dao.delete(id);
	}

	@Override
	public List<AmainVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public List<AmainVO> listCriteria(AdminCriteria cri) throws Exception {
		return dao.listCriteria(cri);
	}

	@Override
	public int listCountCriteria(AdminCriteria cri) throws Exception {
		return dao.countPaging(cri);
	}

	@Override
	public List<AmainVO> listSearchCriteria(AdminSearchCriteria cri) throws Exception {
		return dao.listSearch(cri);
	}

	@Override
	public int listSearchCount(AdminSearchCriteria cri) throws Exception {
		return dao.listSearchCount(cri);
	}

	@Override
	public void modify(RecruitVO vo) throws Exception {
		System.out.println("service test");
		dao.update(vo);
	}
	
	@Override
	public void remove(int bno) throws Exception {
		dao.delete(bno);
	}
}