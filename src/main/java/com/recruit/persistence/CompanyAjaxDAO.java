package com.recruit.persistence;

import java.util.HashMap;
import java.util.List;

import com.recruit.domain.CInfoVO;
import com.recruit.domain.JobGroupVO;
import com.recruit.domain.RecruitVO;
import com.recruit.domain.RegionVO;
import com.recruit.domain.ResumeVO;


public interface CompanyAjaxDAO {
	

	public List<JobGroupVO> list(int id2)throws Exception;

	public List<JobGroupVO> jobgroupList() throws Exception;
	

	public List<RegionVO> SubRegion(String id2) throws Exception;
	
	public List<RecruitVO> RecruitList1(String id) throws Exception;
	
	public List<ResumeVO> PersonRecomList(int bno) throws Exception;
	
	public void FavorPerson(int bno, String id) throws Exception;
	
}
