package prec.mytoDoList.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import prec.mytoDoList.domain.ToDoPlanVO;
import prec.mytoDoList.mapper.ToDoPlanMapper;
import prec.mytoDoList.mapper.ToDoPlanMapperTests;

@Log4j
@Service
@AllArgsConstructor
public class ToDoPlanServiceImpl implements ToDoPlanService{

	@Setter(onMethod_ = @Autowired)
	private ToDoPlanMapper mapper;
	
	@Override
	public List<ToDoPlanVO> getList(){
		 log.info("getList..........");
		
		 return mapper.getList();	
	};
	
	//특정 게시물
	public ToDoPlanVO get(Long bno){
		log.info("get......" + bno);

		return mapper.read(bno);
	}
	
	@Override
	public void register(ToDoPlanVO toDoPlan){
		log.info("register......" + toDoPlan);

		mapper.insertSelectKey(toDoPlan);
	};
	
	@Override
	public boolean modify(ToDoPlanVO toDoPlan){
		log.info("modify......" + toDoPlan);

		return mapper.update(toDoPlan) == 1;
	};

	@Override
	public boolean remove(Long bno){
		log.info("remove...." + bno);

		return mapper.delete(bno) == 1;
	};
}
