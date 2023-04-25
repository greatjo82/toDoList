<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="en">
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta http-equiv="x-ua-compatible" content="ie=edge" />
    <title>Material Design for Bootstrap</title>
    <!-- MDB icon -->
    <link rel="icon" href="img/mdb-favicon.ico" type="image/x-icon" />
    <!-- Font Awesome -->
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
    />
    <!-- Google Fonts Roboto -->
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&display=swap"
    />
    <!-- MDB -->
    <link rel="stylesheet"  href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.2.0/mdb.min.css"
   />
    
  </head>
  <body>
   <section class="vh-200" style="background-color: #eee;">
  <div class="container-xl py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col col-lg-9 col-xl-9">
        <div class="card rounded-3">
          <div class="card-body p-4">

            <h4 class="text-center my-3 pb-3">To Do App</h4>

            <form id="todocontents" class="row row-cols-lg g-2 justify-content-center align-items-center mb-4 pb-2">
              <div class="col-12">
                <div class="form-outline">
                  <input type="text" id="form1" class="form-control" />
                  <label class="form-label" for="form1">Enter a task here</label>
                </div>
              </div>

				<div class="col-12 d-grid gap-2 d-md-flex justify-content-md-end">
              	  <button id="save" type="button" class="btn btn-primary">Save</button>
             	  <button id="init" type="button" class="btn btn-warning">Init</button>
              	</div>
            </form>

            <table class="table mb-4">
              <thead>
                <tr>
                  <th scope="col">No.</th>
                  <th scope="col">Todo item</th>
                  <th scope="col">Status</th>
                  <th scope="col">Date</th>
                  <th scope="col">Actions</th>
                </tr>
              </thead>
              <tbody>
              
              <!-- 리스트 뿌릴곳  -->
              <c:forEach items="${list}" var="todoplan">
              	  <tr>
	                  <th scope="row"><c:out value="${todoplan.bno}" /></th>
	                  <td><c:out value="${todoplan.title}" /></td>
	                  <td><c:out value="${todoplan.status}" /></td>
	                  <td><fmt:formatDate pattern="yyyy-MM-dd" value="${todoplan.regdate}" /></td>
	                  <td>
	                  	<div class="d-grid gap-1 d-md-flex">
		                  	<button type="submit" class="btn btn-dark">Modify</button>
		                    <button type="submit" class="btn btn-danger">Delete</button>
		                    <button type="submit" class="btn btn-success me-md-2">Finished</button>
	                  	</div>
	                  </td>
	               </tr>
              </c:forEach>
              
              </tbody>
            </table>

			<!-- Modal  추가 -->
				<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
					aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title" id="myModalLabel">Modal title</h4>
							</div>
							<div class="modal-body">처리가 완료되었습니다.</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default"
									data-dismiss="modal">Close</button>
							</div>
						</div>
						<!-- /.modal-content -->
					</div>
					<!-- /.modal-dialog -->
				</div>
				<!-- /.modal -->

          </div>
        </div>
      </div>
    </div>
  </div>
</section>

    <!-- MDB -->
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.2.0/mdb.min.js"></script>
    <!-- JQuery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <!-- Custom scripts -->
    <script type="text/javascript">
    
    
    $(function () {
		$("#save").on("click", todocontent_save);
		$("#init").on("click", todocontent_init);
	});
    
    
    function todocontent_save(){
       
    	var params = {
    			title : $("#form1").val()
    	}
    	
    	$.ajax({
            type: "POST",
            url: "/mytoDoList/register",
            data: params,
            	
            success: function(){
                window.location.href = "/mytoDoList/list"
            },
            error: function (request, status, error){        
                console.log(error);
            }
        }); 
    }
    
    function todocontent_init(){
    	var input = document.getElementById("form1");
    	input.value = "";
    	input.focus();
    }
     
    </script>
  </body>
</html>

