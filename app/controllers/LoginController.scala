package controllers

import javax.inject._

import models.{Accounts, LoginData}
import play.api.data.Form
import play.api.data.Forms._
import play.api.mvc._
import services.{AppCacheProvider, MD5}

@Singleton
class LoginController @Inject()(cache: AppCacheProvider) extends Controller {



  def showProfile(username: String) = Action { implicit request =>

    val CacheUser: Option[Accounts] = cache.retrieve(username)
    Ok(views.html.profile(CacheUser.toList))
  }

  def processForm(uname:String,psw:String) = Action { implicit request =>

    val CacheUser: Option[Accounts] = cache.retrieve(uname)
    println(CacheUser)
    val result = CacheUser.map(x =>

      if (x.uname == uname && x.pswd == psw) true
      else false
    )

    if (result.contains(true)) {
      Redirect(routes.LoginController.showProfile(uname)).withSession("currentUser" ->uname).flashing("msg" -> "Login Successful")
    }
    else
      Redirect(routes.HomeController.index()).flashing("msg" -> "Incorrect username or password")
  }

  def logout = Action { implicit request =>

    Redirect(routes.HomeController.index()).withNewSession
  }


}
