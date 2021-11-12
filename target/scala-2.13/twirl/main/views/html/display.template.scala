
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

object display extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[ArrayList[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(store : ArrayList[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*2.1*/("""<section style="backgroundColor:green">
  <div class="header">
    
      <div style="border:dotted 0.1px;text-align:center">
      <h2>Users</h2>
      		"""),_display_(/*7.10*/for(i <- store) yield /*7.25*/{_display_(Seq[Any](format.raw/*7.26*/("""
      		"""),_display_(/*8.10*/i),format.raw/*8.11*/(""" """),format.raw/*8.12*/("""<br>
      		""")))}),format.raw/*9.10*/("""
      		
	      	
	      	
	      	"""),format.raw/*13.9*/("""<button>Clear!</button>
      </div>
      
  </div>
</section>"""))
      }
    }
  }

  def render(store:ArrayList[String]): play.twirl.api.HtmlFormat.Appendable = apply(store)

  def f:((ArrayList[String]) => play.twirl.api.HtmlFormat.Appendable) = (store) => apply(store)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/display.scala.html
                  HASH: 6d99f213cd936837f2eae1e9154cc8cbf73210ce
                  MATRIX: 920->1|1042->28|1070->30|1257->191|1287->206|1325->207|1362->218|1383->219|1411->220|1456->235|1523->275
                  LINES: 27->1|32->1|33->2|38->7|38->7|38->7|39->8|39->8|39->8|40->9|44->13
                  -- GENERATED --
              */
          