package prec.mytoDoList.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import prec.mytoDoList.domain.ToDoPlanVO;
import prec.mytoDoList.service.ToDoPlanService;
import prec.mytoDoList.service.ToDoPlanServiceTests;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/mytoDoList/*")
@AllArgsConstructor
@Controller
public class ToDoPlanController {

	private ToDoPlanService service;
	
    @GetMapping("/list")
    public void list(Model model) {
    	
    	log.info("list");
    	model.addAttribute("list", service.getList());
    }
    
	@PostMapping("/register")
	public String register(ToDoPlanVO toDoPlan, RedirectAttributes rttr){
		log.info("register: " + toDoPlan);
	
		service.register(toDoPlan);
	
		rttr.addFlashAttribute("result", toDoPlan.getBno());
	
		return "redirect:/mytoDoList/list";
	}
	
	@GetMapping("/get")
	public void get(@RequestParam("bno") Long bno, Model model) {
		
		log.info("/get or modify ");
		model.addAttribute("toDoPlan", service.get(bno));
	}
	
	@PostMapping("/modify")
	public String modify(ToDoPlanVO toDoPlan, RedirectAttributes rttr) {
		
		log.info("modify:" + toDoPlan);
		
		if (service.modify(toDoPlan)) {
			rttr.addFlashAttribute("result", "success");
		 }
		return "redirect:/mytoDoList/list";
	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("bno") Long bno, RedirectAttributes rttr){
		
		 log.info("remove..." + bno);
		
		 if (service.remove(bno)) {
			 rttr.addFlashAttribute("result", "success");
		 }
		 return "redirect:/mytoDoList/list";
	}
	
	
}
