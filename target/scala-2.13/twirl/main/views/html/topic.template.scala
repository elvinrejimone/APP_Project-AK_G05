
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


Seq[Any](format.raw/*2.1*/("""
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
                  HASH: dd25ef7a57c62f7ae2897b0580c862de60a6694f
                  MATRIX: 961->1|1133->80|1160->81|1335->231|1365->253|1404->255|1442->268|1473->284|1511->285|1544->292|1867->588|1891->591|2586->1259|2631->1288|2670->1289|2715->1306|2836->1400|2848->1403|2879->1413|2979->1486|2991->1489|3021->1498|3140->1590|3188->1622|3227->1623|3275->1643|3470->1810|3497->1815|3527->1816|3585->1843|3630->1860|3702->1901|3772->1943|3881->2021|3902->2025|3914->2030|3952->2031|3982->2034|4037->2059|4068->2063
                  LINES: 27->1|32->2|33->3|35->5|35->5|35->5|36->6|36->6|36->6|37->7|39->9|39->9|54->24|54->24|54->24|55->25|56->26|56->26|56->26|57->27|57->27|57->27|59->29|59->29|59->29|60->30|60->30|60->30|60->30|61->31|62->32|64->34|67->37|72->42|74->44|74->44|74->44|75->45|76->46|78->48
                  -- GENERATED --
              */
          