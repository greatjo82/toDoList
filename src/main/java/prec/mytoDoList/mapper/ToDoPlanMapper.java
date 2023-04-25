package prec.mytoDoList.mapper;

import java.util.List;

//import org.apache.ibatis.annotations.Select;

import prec.mytoDoList.domain.ToDoPlanVO;


public interface ToDoPlanMapper {
	
	//@Select("select * from tbl_todoplan where bno > 0")
	public List<ToDoPlanVO> getList();
	
	public void insert(ToDoPlanVO todoPlan);
	
	public void insertSelectKey(ToDoPlanVO todoPlan);

	public ToDoPlanVO read(Long bno);
	
	public int delete(Long bno);

	public int update(ToDoPlanVO todoPlan);

}
