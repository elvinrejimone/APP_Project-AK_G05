
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
                  HASH: bed292df9aaf638f701d8996a78f83f8032ac05d
                  MATRIX: 960->1|1132->80|1159->81|1419->316|1449->338|1488->340|1526->353|1557->369|1595->370|1628->377|1951->673|1975->676|2368->1042|2385->1049|2404->1058|2417->1061|2449->1071|2896->1491|2941->1520|2980->1521|3023->1536|3144->1630|3156->1633|3186->1642|3286->1715|3298->1718|3326->1725|3398->1766|3468->1808|3577->1886|3598->1890|3610->1895|3648->1896|3678->1899|3733->1924|3764->1928
                  LINES: 27->1|32->2|33->3|35->5|35->5|35->5|36->6|36->6|36->6|37->7|39->9|39->9|46->16|46->16|46->16|46->16|46->16|57->27|57->27|57->27|58->28|59->29|59->29|59->29|60->30|60->30|60->30|62->32|65->35|70->40|72->42|72->42|72->42|73->43|74->44|76->46
                  -- GENERATED --
              */
          