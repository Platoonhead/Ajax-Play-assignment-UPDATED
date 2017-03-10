package controllers

import play.api.mvc.{Action, Controller}
import javax.inject._


@Singleton
class Application extends Controller {

  /**
    * This action is used to serve Home page of the application
    *
    * @return
    */
  def index = Action { implicit request =>
    Ok(views.html.index("Your new application is ready."))
  }

  /**
    * This action is used to handle Ajax request
    *
    * @return
    */

  def ajaxCall = Action { implicit request =>
    Ok(views.html.firstcolor())
  }

  def ajaxCall1 = Action { implicit request =>
    Ok(views.html.secondcolor())
  }
  def ajaxCall2 = Action { implicit request =>
    Ok(views.html.thirdcolor())
  }
  def ajaxCall3 = Action { implicit request =>
    Ok(views.html.fourthcolor())
  }
  def ajaxCall4 = Action { implicit request =>
    Ok(views.html.fifthcolor())
  }
  def ajaxCall5 = Action { implicit request =>
    Ok(views.html.sixthcolor())
  }

}


