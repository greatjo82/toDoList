<!DOCTYPE html>
<html lang="en">
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
   <section class="vh-100" style="background-color: #eee;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col col-lg-9 col-xl-9">
        <div class="card rounded-3">
          <div class="card-body p-4">

            <h4 class="text-center my-3 pb-3">To Do App</h4>

            <form class="row row-cols-lg g-2 justify-content-center align-items-center mb-4 pb-2">
              <div class="col-12">
                <div class="form-outline">
                  <input type="text" id="form1" class="form-control" />
                  <label class="form-label" for="form1">Enter a task here</label>
                </div>
              </div>

				<div class="col-12 d-grid gap-2 d-md-flex justify-content-md-end">
              	  <button type="submit" class="btn btn-primary">Save</button>
             	  <button type="submit" class="btn btn-warning">Init</button>
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
                <tr>
                  <th scope="row">1</th>
                  <td>Buy groceries for next week</td>
                  <td>In progress</td>
                  <td>2023-04-23</td>
                  <td>
                  	<div class="d-grid gap-1 d-md-flex">
	                  	<button type="submit" class="btn btn-dark">Modify</button>
	                    <button type="submit" class="btn btn-danger">Delete</button>
	                    <button type="submit" class="btn btn-success me-md-2">Finished</button>
                  	</div>
                  </td>
                </tr>
              <!--   
	                <tr>
	                  <th scope="row">2</th>
	                  <td>Renew car insurance</td>
	                  <td>In progress</td>
	                  <td>
	                    <button type="submit" class="btn btn-danger">Delete</button>
	                    <button type="submit" class="btn btn-success ms-1">Finished</button>
	                  </td>
	                </tr>
	                <tr>
	                  <th scope="row">3</th>
	                  <td>Sign up for online course</td>
	                  <td>In progress</td>
	                  <td>
	                    <button type="submit" class="btn btn-danger">Delete</button>
	                    <button type="submit" class="btn btn-success ms-1">Finished</button>
	                  </td>
	                </tr>
                 -->
              </tbody>
            </table>

          </div>
        </div>
      </div>
    </div>
  </div>
</section>

    <!-- MDB -->
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.2.0/mdb.min.js"></script>
    <!-- Custom scripts -->
    <script type="text/javascript">
    	document.querySelectorAll('.form-outline').forEach((formOutline) => {
    	  new mdb.Input(formOutline).update();
    	});
    </script>
  </body>
</html>

