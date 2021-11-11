
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


Seq[Any](format.raw/*2.1*/("""<html>
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
                  HASH: 88a8adee1021597dfd0913ad041ea12e87221644
                  MATRIX: 915->1|1036->29|1126->93|1150->97|1178->99|1204->105
                  LINES: 27->1|32->2|37->7|37->7|37->7|37->7
                  -- GENERATED --
              */
          