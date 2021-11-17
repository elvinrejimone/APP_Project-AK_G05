
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

object user extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[HashMap[String, ArrayList[Models.GithubResult]],List[String],play.twirl.api.HtmlFormat.Appendable] {

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
                

              </tr>
            </thead>
            <tbody style="background-color: #dee2e1; text-align: center;">
              
              """),_display_(/*23.16*/for(obj <- results.get(key) ) yield /*23.45*/{_display_(Seq[Any](format.raw/*23.46*/("""
                """),format.raw/*24.17*/("""<tr style="height: 50px ">
                <td style="border: 1px solid rgb(104, 207, 164);">"""),_display_(/*25.68*/obj/*25.71*/.repoName),format.raw/*25.80*/("""</td>
              </tr>
              """)))}),format.raw/*27.16*/("""
               
            
            """),format.raw/*30.13*/("""</tbody> 
          </table>
        </div>
         </div>
        
        """)))}),format.raw/*35.10*/("""

""")))}/*37.3*/else/*37.8*/{_display_(Seq[Any](format.raw/*37.9*/("""
  """),format.raw/*38.3*/("""<h1>Not Displaying</h1>
""")))}),format.raw/*39.2*/("""
  
"""),format.raw/*41.1*/("""</section>
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
                  SOURCE: app/views/user.scala.html
                  HASH: 9428697fbe6866f0b0736e21ca47dd0c8bb4bd4e
                  MATRIX: 960->1|1132->80|1159->81|1334->231|1364->253|1403->255|1441->268|1472->284|1510->285|1543->292|1866->588|1890->591|2440->1114|2485->1143|2524->1144|2569->1161|2690->1255|2702->1258|2732->1267|2804->1308|2874->1350|2983->1428|3004->1432|3016->1437|3054->1438|3084->1441|3139->1466|3170->1470
                  LINES: 27->1|32->2|33->3|35->5|35->5|35->5|36->6|36->6|36->6|37->7|39->9|39->9|53->23|53->23|53->23|54->24|55->25|55->25|55->25|57->27|60->30|65->35|67->37|67->37|67->37|68->38|69->39|71->41
                  -- GENERATED --
              */
          