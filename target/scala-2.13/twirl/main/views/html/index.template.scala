
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<section style="backgroundColor:green">
  <div class="header">
    
      <div style="border:dotted 0.1px;text-align:center">
      <h2>github analysis app!</h2>
      		
      		<h1>Hello Griffity!</h1>
      		<form name="search" id="form" action="/" method="GET">
	      	<input id="user" name="search" type="text" placeholder="enter name">
	      	<button type="submit">Go!</button>
	      	</form>
	      	
	      	
	      	<button>Clear!</button>
      </div>
      
  </div>
</section>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 72aba04bedaf387fbc0e8cd01b19df39c06839f0
                  MATRIX: 989->0
                  LINES: 32->1
                  -- GENERATED --
              */
          