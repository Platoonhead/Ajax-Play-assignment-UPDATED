package controllers

import javax.inject._

import models.{Accounts, Operations}
import play.api.data.Form
import play.api.data.Forms._
import play.api.mvc._
import services.{AppCacheProvider, MD5}

@Singleton
class SignupController @Inject()(cache: AppCacheProvider) extends Controller {


  def processForm(nam:String,unam:String,pass:String,repass:String,mobile:String,gender:String,age:String) = Action { implicit request =>
    val user = Accounts(nam,unam,pass,repass,mobile,gender,age.toInt)
    if(cache.retrieve(unam) == None){

      if(pass == repass){

        if(mobile.length ==10){
          cache.insert(unam,user)
          Redirect(routes.LoginController.showProfile(nam)).withSession("currentUser" -> nam).flashing("msg" -> "Registration Successful")
        }
        else {
          Redirect(routes.HomeController.index()).flashing("mobile" -> "Invalid Mobile Number")
        }
      }
      else{
        Redirect(routes.HomeController.index()).flashing("passMismatch" -> "Pasword dosent Match")
      }
    }
    else{

      Redirect(routes.HomeController.index()).flashing("alreadyExist" -> "Username Already Taken")

    }

  }
}

