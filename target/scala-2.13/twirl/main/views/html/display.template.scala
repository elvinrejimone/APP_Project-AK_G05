
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
  def apply/*1.2*/(users : ArrayList[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*2.1*/("""<head>
<script>
function f(s)"""),format.raw/*4.14*/("""{"""),format.raw/*4.15*/("""
"""),format.raw/*5.1*/("""var str = "https://github.com/"+s;
window.location.href = str;"""),format.raw/*6.28*/("""}"""),format.raw/*6.29*/("""
"""),format.raw/*7.1*/("""</script>
</head>
<body>
<section style="backgroundColor:green">
  <div class="header">
    
      <div style="border:dotted 0.1px;text-align:center">
      <h2>Users</h2>
      		"""),_display_(/*15.10*/for(i <- users) yield /*15.25*/{_display_(Seq[Any](format.raw/*15.26*/("""
      		"""),_display_(/*16.10*/i),format.raw/*16.11*/("""<a id ="2" onclick="javascript:f("""),_display_(/*16.45*/i),format.raw/*16.46*/(""")" ><br>
      		""")))}),format.raw/*17.10*/("""
      		
      """),format.raw/*19.7*/("""</div>
      
  </div>
</section>
</body>
"""))
      }
    }
  }

  def render(users:ArrayList[String]): play.twirl.api.HtmlFormat.Appendable = apply(users)

  def f:((ArrayList[String]) => play.twirl.api.HtmlFormat.Appendable) = (users) => apply(users)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/display.scala.html
                  HASH: 29a80b6468ee6754a002cf98d1e16b56ec4c2651
                  MATRIX: 920->1|1042->28|1070->30|1128->61|1156->62|1184->64|1274->127|1302->128|1330->130|1546->319|1577->334|1616->335|1654->346|1676->347|1737->381|1759->382|1809->401|1854->419
                  LINES: 27->1|32->1|33->2|35->4|35->4|36->5|37->6|37->6|38->7|46->15|46->15|46->15|47->16|47->16|47->16|47->16|48->17|50->19
                  -- GENERATED --
              */
          