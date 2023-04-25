package prec.mytoDoList.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ToDoPlanVO {

	private Long bno;
	private String title;
	private String status;
	private Date regdate;
	
}
