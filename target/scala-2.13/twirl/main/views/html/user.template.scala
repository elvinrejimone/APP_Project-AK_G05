
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
              <tr>
                <th style="border: 1px solid rgb(211, 211, 211);">user</th>
                <th style="border: 1px solid rgb(211, 211, 211);">Repositories</th>
                <th style="border: 1px solid rgb(211, 211, 211);">Description</th>
                
              </tr>
            </thead>
            <tbody style="background-color: #dee2e1; text-align: center;">
              
              """),_display_(/*24.16*/for(obj <- results.get(key) ) yield /*24.45*/{_display_(Seq[Any](format.raw/*24.46*/("""
                """),format.raw/*25.17*/("""<tr style="height: 50px ">
                <td style="border: 1px solid rgb(104, 207, 164);"><img src="""),_display_(/*26.77*/obj/*26.80*/.ownerName),format.raw/*26.90*/(""" """),format.raw/*26.91*/("""alt="Avatar" width="100" height="100"></td>
                <td style="border: 1px solid rgb(104, 207, 164);">"""),_display_(/*27.68*/obj/*27.71*/.repoName),format.raw/*27.80*/("""</td>
                <td style="border: 1px solid rgb(104, 207, 164);">"""),_display_(/*28.68*/obj/*28.71*/.repoID),format.raw/*28.78*/("""</td>
              </tr>
              """)))}),format.raw/*30.16*/("""
               
            
            """),format.raw/*33.13*/("""</tbody> 
          </table>
        </div>
         </div>
        
        """)))}),format.raw/*38.10*/("""

""")))}/*40.3*/else/*40.8*/{_display_(Seq[Any](format.raw/*40.9*/("""
  """),format.raw/*41.3*/("""<h1>Not Displaying</h1>
""")))}),format.raw/*42.2*/("""
  
"""),format.raw/*44.1*/("""</section>
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
                  HASH: bfb6044750e80978a3072a82673c9f9acdd27711
                  MATRIX: 960->1|1132->80|1159->81|1419->316|1449->338|1488->340|1526->353|1557->369|1595->370|1628->377|1951->673|1975->676|2690->1364|2735->1393|2774->1394|2819->1411|2949->1514|2961->1517|2992->1527|3021->1528|3159->1639|3171->1642|3201->1651|3301->1724|3313->1727|3341->1734|3413->1775|3483->1817|3592->1895|3613->1899|3625->1904|3663->1905|3693->1908|3748->1933|3779->1937
                  LINES: 27->1|32->2|33->3|35->5|35->5|35->5|36->6|36->6|36->6|37->7|39->9|39->9|54->24|54->24|54->24|55->25|56->26|56->26|56->26|56->26|57->27|57->27|57->27|58->28|58->28|58->28|60->30|63->33|68->38|70->40|70->40|70->40|71->41|72->42|74->44
                  -- GENERATED --
              */
          