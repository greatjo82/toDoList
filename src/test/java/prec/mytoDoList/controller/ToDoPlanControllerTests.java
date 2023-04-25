package prec.mytoDoList.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
public class ToDoPlanControllerTests {

	@Setter(onMethod_ = @Autowired)
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup(){
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	
    @Test
    public void testlist() throws Exception{
    	
    	log.info(
    			mockMvc.perform(MockMvcRequestBuilders.get("/mytoDoList/list"))
    			.andReturn()
    			.getModelAndView()
    			.getModelMap());
    }
    
//    @Test
    public void testregister() throws Exception{
    	
    	String resultPage =	mockMvc.perform(MockMvcRequestBuilders.post("/mytoDoList/register")
    			.param("title" , "controller샘플제목"))
    			.andReturn().getModelAndView().getViewName();
    	
    	log.info(resultPage);
    }

//    @Test
    public void testget() throws Exception{
    	
    	log.info(
    			mockMvc.perform(MockMvcRequestBuilders.get("/mytoDoList/get")
    			.param("bno", "5"))		
    			.andReturn().getModelAndView().getModelMap());
    }
    
//    @Test
    public void testmodify() throws Exception{
    	
    	String resultPage =	mockMvc.perform(MockMvcRequestBuilders.post("/mytoDoList/modify")
    			.param("bno" , "5")
    			.param("title" , "controller샘플제목수정")
    			.param("status" , "finished"))
    			.andReturn().getModelAndView().getViewName();
    	
    	log.info(resultPage);
    }
    
 //   @Test
  	public void testremove() throws Exception{
    	
    	String resultPage =	mockMvc.perform(MockMvcRequestBuilders.post("/mytoDoList/remove")
    			.param("bno" , "4"))
    			.andReturn().getModelAndView().getViewName();
    	
    	log.info(resultPage);
    }
    
	
}
