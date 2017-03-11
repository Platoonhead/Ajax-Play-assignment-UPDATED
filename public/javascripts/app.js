 $(document).ready(function(){

 $('#reg').unbind().on("click",function(){
               jsRoutes.controllers.SignupController.processForm(
                                $('#fname').val(),
                                $('#uname').val(),
                                $('#psw').val(),
                                $('#repsw').val(),
                                $('#mobile').val(),
                                $('#gender').val(),
                                $('#age').val()
                ).ajax({
                            success: function(data){
                              $('body').html(data);
                            },
                            error: function(){
                            alert("Oops! Something went wrong");
                          }

                })

                     return false;
            });


 $('#log').unbind().on("click",function(){
               jsRoutes.controllers.LoginController.processForm(
                                $('#Loguname').val(),
                                $('#Logpsw').val()
                ).ajax({
                            success: function(data){
                              $('body').html(data);
                            },
                            error: function(){
                            alert("Oops! Something went wrong");
                          }

                })

                     return false;
            });

 });