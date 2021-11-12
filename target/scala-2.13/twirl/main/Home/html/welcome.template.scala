
package Home.html

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

object welcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name:String,course:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*2.1*/("""<html>
<head>
<title>Welcome</title>
</head>
<body>
<p>Welcome """),_display_(/*7.13*/name),format.raw/*7.17*/(""" """),_display_(/*7.19*/course),format.raw/*7.25*/("""</p>
</body>
</html>"""))
      }
    }
  }

  def render(name:String,course:String): play.twirl.api.HtmlFormat.Appendable = apply(name,course)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (name,course) => apply(name,course)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/Home/welcome.scala.html
                  HASH: fc86e8bbad6d59007bfad0b4bc82caf3e5e428fc
                  MATRIX: 915->1|1037->28|1065->30|1160->99|1184->103|1212->105|1238->111
                  LINES: 27->1|32->1|33->2|38->7|38->7|38->7|38->7
                  -- GENERATED --
              */
          