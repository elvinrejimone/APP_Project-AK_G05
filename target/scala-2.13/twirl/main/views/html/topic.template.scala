
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

object topic extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[HashMap[String, ArrayList[Models.GithubResult]],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(results: HashMap[String, ArrayList[Models.GithubResult]], keys: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.80*/("""

"""),format.raw/*3.1*/("""<section style=" margin: 0;background: linear-gradient(45deg, #7ab1af, #aea7ec);font-family: sans-serif;font-weight: 100; padding-bottom: 40px">
 
  """),_display_(/*5.4*/if(!results.isEmpty())/*5.26*/ {_display_(Seq[Any](format.raw/*5.28*/("""    	
      """),_display_(/*6.8*/for(key <- keys) yield /*6.24*/{_display_(Seq[Any](format.raw/*6.25*/("""
      """),format.raw/*7.7*/("""<div class="container" style="display: flex;justify-content: center; ">
      <div style="padding: 0px 40px 40px 40px;margin: 20px;background-color: rgb(211, 211, 211);border-radius: 5px;">
       <center> <span>Showing results for the topic: <h1 style="display:inline-block;margin-left: 10px;">"""),_display_(/*9.107*/key),format.raw/*9.110*/("""</h1> </span></center>
        <table style="width:800px;
          border-collapse: collapse;
          border: 1px solid #ddd;
          box-shadow: 0 0 20px rgba(0,0,0,0.1);">
            <thead style="background-color: #42a386; padding: 10px; height:50px ;">
              <tr>
                <th style="border: 1px solid rgb(211, 211, 211);">Owner</th>
                <th  style="border: 1px solid rgb(211, 211, 211);">Repository</th>
                <th  style="border: 1px solid rgb(211, 211, 211);">Topics</th>

              </tr>
            </thead>
            <tbody style="background-color: #dee2e1; text-align: center;">
              
              """),_display_(/*24.16*/for(obj <- results.get(key) ) yield /*24.45*/{_display_(Seq[Any](format.raw/*24.46*/("""
                """),format.raw/*25.17*/("""<tr style="height: 50px ">
                <td style="border: 1px solid rgb(104, 207, 164);">"""),_display_(/*26.68*/obj/*26.71*/.ownerName),format.raw/*26.81*/("""</td>
                <td style="border: 1px solid rgb(104, 207, 164);">"""),_display_(/*27.68*/obj/*27.71*/.repoName),format.raw/*27.80*/("""</td>
                <td style="border: 1px solid rgb(104, 207, 164);">
                  """),_display_(/*29.20*/for(topic <- obj.returnTopics()) yield /*29.52*/{_display_(Seq[Any](format.raw/*29.53*/("""
                   """),format.raw/*30.20*/("""<div style="display: inline-block;background-color: #0b7e5b;color: #dee2e1; border-radius:6px; padding: 3px; margin-right: 3px; margin-top: 3px;margin-bottom: 3px;"> """),_display_(/*30.187*/topic),format.raw/*30.192*/(""" """),format.raw/*30.193*/("""</div> 
                  """)))}),format.raw/*31.20*/("""
                """),format.raw/*32.17*/("""</td>
              </tr>
              """)))}),format.raw/*34.16*/("""
               
            
            """),format.raw/*37.13*/("""</tbody> 
          </table>
        </div>
         </div>
        
        """)))}),format.raw/*42.10*/("""

""")))}/*44.3*/else/*44.8*/{_display_(Seq[Any](format.raw/*44.9*/("""
  """),format.raw/*45.3*/("""<h1>Not Displaying</h1>
""")))}),format.raw/*46.2*/("""
  
"""),format.raw/*48.1*/("""</section>
"""))
      }
    }
  }

  def render(results:HashMap[String, ArrayList[Models.GithubResult]],keys:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(results,keys)

  def f:((HashMap[String, ArrayList[Models.GithubResult]],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (results,keys) => apply(results,keys)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/topic.scala.html
                  HASH: e04253169338738212284c10ef84c82b120d5b73
                  MATRIX: 961->1|1134->79|1164->83|1341->235|1371->257|1410->259|1449->273|1480->289|1518->290|1552->298|1877->596|1901->599|2611->1282|2656->1311|2695->1312|2741->1330|2863->1425|2875->1428|2906->1438|3007->1512|3019->1515|3049->1524|3170->1618|3218->1650|3257->1651|3306->1672|3501->1839|3528->1844|3558->1845|3617->1873|3663->1891|3737->1934|3810->1979|3924->2062|3947->2068|3959->2073|3997->2074|4028->2078|4084->2104|4117->2110
                  LINES: 27->1|32->1|34->3|36->5|36->5|36->5|37->6|37->6|37->6|38->7|40->9|40->9|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|58->27|58->27|60->29|60->29|60->29|61->30|61->30|61->30|61->30|62->31|63->32|65->34|68->37|73->42|75->44|75->44|75->44|76->45|77->46|79->48
                  -- GENERATED --
              */
          