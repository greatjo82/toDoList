package prec.mytoDoList.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import prec.mytoDoList.domain.ToDoPlanVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ToDoPlanMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private ToDoPlanMapper mapper;

//	@Test
	public void testgetList(){
		mapper.getList().forEach(todoPlan -> log.info(todoPlan));
	}
	
//	@Test
	public void testinsert(){
		
		ToDoPlanVO todoplan = new ToDoPlanVO();
		
		todoplan.setTitle("샘플제목2");
			
		mapper.insert(todoplan);
		
		log.info(todoplan);
		
	}
	
//	@Test
	public void insertSelectKey(){
		ToDoPlanVO todoplan = new ToDoPlanVO();
		
		todoplan.setTitle("샘플제목2");
			
		mapper.insertSelectKey(todoplan);
		
		log.info(todoplan);
	}

	@Test
	public void read(){
		ToDoPlanVO todoplan = mapper.read(2L);
		log.info(todoplan);
	}
	
//	@Test
	public void testupdate(){
		ToDoPlanVO todoplan = new ToDoPlanVO();
		
		todoplan.setBno(3L);
		todoplan.setTitle("수정된샘플제목2");
		todoplan.setStatus("수정된샘플상태2");
		
		int count = mapper.update(todoplan);

		//정상처리시 count는 1
		log.info("update count :" + count);
	};

//	@Test
	public void delete(){
		
		int count = mapper.delete(3L);

		//정상처리시 count는 1
		log.info("delete count :" + count);
	}


}
