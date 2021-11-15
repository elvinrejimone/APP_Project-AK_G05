
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
 
  
  
  """),_display_(/*7.4*/if(!results.isEmpty())/*7.26*/ {_display_(Seq[Any](format.raw/*7.28*/("""
    	
      """),_display_(/*9.8*/for(key <- keys) yield /*9.24*/{_display_(Seq[Any](format.raw/*9.25*/("""
      """),format.raw/*10.7*/("""<div class="container" style="display: flex;justify-content: center; ">
      <div style="padding: 0px 40px 40px 40px;margin: 20px;background-color: rgb(211, 211, 211);border-radius: 5px;">
       <center> <span>Showing results for the topic: <h1 style="display:inline-block;margin-left: 10px;">"""),_display_(/*12.107*/key),format.raw/*12.110*/("""</h1> </span></center>
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
              
              """),_display_(/*27.16*/for(obj <- results.get(key) ) yield /*27.45*/{_display_(Seq[Any](format.raw/*27.46*/("""
                """),format.raw/*28.17*/("""<tr style="height: 50px ">
                <td style="border: 1px solid rgb(104, 207, 164);">"""),_display_(/*29.68*/obj/*29.71*/.ownerName),format.raw/*29.81*/("""</td>
                <td style="border: 1px solid rgb(104, 207, 164);">"""),_display_(/*30.68*/obj/*30.71*/.repoName),format.raw/*30.80*/("""</td>
                <td style="border: 1px solid rgb(104, 207, 164);">
                  """),_display_(/*32.20*/for(topic <- obj.returnTopics()) yield /*32.52*/{_display_(Seq[Any](format.raw/*32.53*/("""
                   """),format.raw/*33.20*/("""<div style="display: inline-block;background-color: #0b7e5b;color: #dee2e1; border-radius:6px; padding: 3px; margin-right: 3px; margin-top: 3px;margin-bottom: 3px;"> """),_display_(/*33.187*/topic),format.raw/*33.192*/(""" """),format.raw/*33.193*/("""</div> 
                  """)))}),format.raw/*34.20*/("""
                """),format.raw/*35.17*/("""</td>
              </tr>
              """)))}),format.raw/*37.16*/("""
               
            
            """),format.raw/*40.13*/("""</tbody> 
          </table>
        </div>
         </div>
        
        """)))}),format.raw/*45.10*/("""

""")))}/*47.3*/else/*47.8*/{_display_(Seq[Any](format.raw/*47.9*/("""
  """),format.raw/*48.3*/("""<h1>Not Displaying</h1>
""")))}),format.raw/*49.2*/("""
  
"""),format.raw/*51.1*/("""</section>
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
                  HASH: 16f56719584cc8cdcc39607c6eddc9611c83e75e
                  MATRIX: 961->1|1134->79|1164->83|1349->243|1379->265|1418->267|1459->283|1490->299|1528->300|1563->308|1889->606|1914->609|2624->1292|2669->1321|2708->1322|2754->1340|2876->1435|2888->1438|2919->1448|3020->1522|3032->1525|3062->1534|3183->1628|3231->1660|3270->1661|3319->1682|3514->1849|3541->1854|3571->1855|3630->1883|3676->1901|3750->1944|3823->1989|3937->2072|3960->2078|3972->2083|4010->2084|4041->2088|4097->2114|4130->2120
                  LINES: 27->1|32->1|34->3|38->7|38->7|38->7|40->9|40->9|40->9|41->10|43->12|43->12|58->27|58->27|58->27|59->28|60->29|60->29|60->29|61->30|61->30|61->30|63->32|63->32|63->32|64->33|64->33|64->33|64->33|65->34|66->35|68->37|71->40|76->45|78->47|78->47|78->47|79->48|80->49|82->51
                  -- GENERATED --
              */
          