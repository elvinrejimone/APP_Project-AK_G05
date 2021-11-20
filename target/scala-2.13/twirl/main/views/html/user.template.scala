
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


Seq[Any](format.raw/*1.80*/("""

"""),format.raw/*3.1*/("""<section style=" margin: 0;background: linear-gradient(45deg, #7ab1af, #aea7ec);font-family: sans-serif;font-weight: 100; padding-bottom: 40px">
  <h1 style="text-align: center; font-size: 50px;">Details of owner Repositories</h1> 
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
      
              <div style="border: 1px solid rgb(104, 207, 164); text-align: center;"><img src=""""),_display_(/*16.97*/results/*16.104*/.get(key)/*16.113*/(0)/*16.116*/.ownerName),format.raw/*16.126*/("""" alt="Avatar" width="100" height="100"></div>
      
              <tr>
                
                <th style="border: 1px solid rgb(211, 211, 211);">Repositories</th>
                <th style="border: 1px solid rgb(211, 211, 211);">Description</th>
                
              </tr>
            </thead>
            <tbody style="background-color: #dee2e1; text-align: center;">
              
              """),_display_(/*27.16*/for(obj <- results.get(key) ) yield /*27.45*/{_display_(Seq[Any](format.raw/*27.46*/("""
              """),format.raw/*28.15*/("""<tr style="height: 50px ">
                <td style="border: 1px solid rgb(104, 207, 164);">"""),_display_(/*29.68*/obj/*29.71*/.repoName),format.raw/*29.80*/("""</td>
                <td style="border: 1px solid rgb(104, 207, 164);">"""),_display_(/*30.68*/obj/*30.71*/.repoID),format.raw/*30.78*/("""</td>
              </tr>
              """)))}),format.raw/*32.16*/("""
               
            
            """),format.raw/*35.13*/("""</tbody> 
          </table>
        </div>
         </div>
        
        """)))}),format.raw/*40.10*/("""

""")))}/*42.3*/else/*42.8*/{_display_(Seq[Any](format.raw/*42.9*/("""
  """),format.raw/*43.3*/("""<h1>Not Displaying</h1>
""")))}),format.raw/*44.2*/("""
  
"""),format.raw/*46.1*/("""</section>
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
                  HASH: 542f93bfb6423400d76e0cd2d30b372eddda1047
                  MATRIX: 960->1|1133->79|1163->83|1425->320|1455->342|1494->344|1533->358|1564->374|1602->375|1636->383|1961->681|1985->684|2385->1057|2402->1064|2421->1073|2434->1076|2466->1086|2924->1517|2969->1546|3008->1547|3052->1563|3174->1658|3186->1661|3216->1670|3317->1744|3329->1747|3357->1754|3431->1797|3504->1842|3618->1925|3641->1931|3653->1936|3691->1937|3722->1941|3778->1967|3811->1973
                  LINES: 27->1|32->1|34->3|36->5|36->5|36->5|37->6|37->6|37->6|38->7|40->9|40->9|47->16|47->16|47->16|47->16|47->16|58->27|58->27|58->27|59->28|60->29|60->29|60->29|61->30|61->30|61->30|63->32|66->35|71->40|73->42|73->42|73->42|74->43|75->44|77->46
                  -- GENERATED --
              */
          