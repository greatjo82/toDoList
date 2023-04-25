package prec.mytoDoList.service;


import static org.junit.Assert.assertNull;

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
public class ToDoPlanServiceTests {

	@Setter(onMethod_ = @Autowired)
	private ToDoPlanService service;
	
	
	//service 객체 주입 가능 여부 체크
//	@Test
	public void testExist(){
		
		//객체가 null인지 여부
		assertNull(service);
		log.info(service);
	}
	
//	@Test
	public void testgetList(){
		service.getList().forEach(todoPlan -> log.info(todoPlan));
	};
		
	//특정 게시물
//	@Test
	public void testget(){
		log.info(service.get(1L));
	}

//	@Test
	public void testregister(){
		ToDoPlanVO todoplan = new ToDoPlanVO();
		
		todoplan.setTitle("service샘플제목");
			
		service.register(todoplan);
		
		log.info("service에서 추가된 생성게시물 번호" + todoplan.getBno());
	}
	
//	@Test
	public void testmodify(){
		ToDoPlanVO todoplan = service.get(1L);
		
		if(todoplan == null){
			return;
		}
		
		todoplan.setTitle("service수정된샘플제목1");
		
		
		//정상처리시  result 결과는 true
		log.info("update result :" + service.modify(todoplan));
	}

	@Test
	public void testremove(){
		log.info("remove result :" + service.remove(2L));
	};

}
