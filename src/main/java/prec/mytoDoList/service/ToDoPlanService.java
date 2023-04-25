package prec.mytoDoList.service;


import java.util.List;

import prec.mytoDoList.domain.ToDoPlanVO;

public interface ToDoPlanService {

	
	public List<ToDoPlanVO> getList();
		
	//전체 리스트들중 특정 게시물 
	public ToDoPlanVO get(Long bno);
	
	public void register(ToDoPlanVO toDoPlan);
	
	public boolean modify(ToDoPlanVO toDoPlan);

	public boolean remove(Long bno);

}
