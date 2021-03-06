package com.recruit.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.recruit.domain.CInfoVO;
import com.recruit.domain.CodeVO;
import com.recruit.domain.RecruitVO;
import com.recruit.domain.RegionVO;
import com.recruit.domain.ResumeVO;

@Repository
public class CompanyDAOImpl implements CompanyDAO{

	@Inject
	private SqlSession session;
	
	private static String namespace
	="com.recruit.mapper.CompanyMapper";
	
	
	@Override
	public CInfoVO CompanyInfoRead(String id) throws Exception{
		return session.selectOne(namespace+".companyinfoRead", id);
	}
	
	@Override
	public void CompanyInfoUpdate(CInfoVO CInfo) throws Exception {
	  session.update(namespace + ".companyinfoUpdate", CInfo);
	}
	
	@Override
	public List<CodeVO> CodeList() throws Exception{
		
		return session.selectList(namespace + ".codeList");
	}
	@Override
	public List<RegionVO> RegionList() throws Exception{
		
		return session.selectList(namespace + ".regionList");
	}
	@Override
	public void RecruitWrite(RecruitVO recruitWrtie) throws Exception{
		
		session.insert(namespace + ".recruitWrite", recruitWrtie);
	}
	@Override
	public List<RecruitVO> RecruitList(String id) throws Exception{
//		System.out.println("comDAO부분 id : "+id);
		return session.selectList(namespace + ".recruitListt", id);
	}
	@Override
	public RecruitVO RecruitInfoRead(int recruitNum) throws Exception{
		return session.selectOne(namespace +".recruitinfoRead", recruitNum);
	}
	@Override
	public List<ResumeVO> FavorList(String id)throws Exception{
		
		return session.selectList(namespace +".favorList", id);		
	}
	
	@Override
	public void updateViewCnt(int recruitNum) throws Exception {
		session.update(namespace + ".updateViewCnt", recruitNum);
	}
	
	@Override
	public RecruitVO RecruitInfoRead3(int recruitNum) throws Exception{
		return session.selectOne(namespace +".recruitinfoRead3", recruitNum);
	}

	
}
