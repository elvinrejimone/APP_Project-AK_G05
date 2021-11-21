
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
      
              <div style="border: 1px solid rgb(104, 207, 164); text-align: center;"><span style=" font-size: 40px; margin-right: 100px;">User - """),_display_(/*16.147*/key),format.raw/*16.150*/("""</span><img src=""""),_display_(/*16.168*/results/*16.175*/.get(key)/*16.184*/(0)/*16.187*/.ownerName),format.raw/*16.197*/("""" alt="Avatar" width="100" height="100"></div>
      
              <tr>
                
                <th style="border: 1px solid rgb(211, 211, 211);">Repositories</th>
                <th style="border: 1px solid rgb(211, 211, 211);">Description</th>
                <th style="border: 1px solid rgb(211, 211, 211);">Repo Topics</th>
                
              </tr>
            </thead>
            <tbody style="background-color: #dee2e1; text-align: center;">
              
              """),_display_(/*28.16*/for(obj <- results.get(key) ) yield /*28.45*/{_display_(Seq[Any](format.raw/*28.46*/("""
              """),format.raw/*29.15*/("""<tr style="height: 50px ">
                <td style="border: 1px solid rgb(104, 207, 164);"><a href="/">"""),_display_(/*30.80*/obj/*30.83*/.repoName),format.raw/*30.92*/("""</a></td>
                <td style="border: 1px solid rgb(104, 207, 164);">"""),_display_(/*31.68*/obj/*31.71*/.repoID),format.raw/*31.78*/("""</td>
                <td style="border: 1px solid rgb(104, 207, 164);">
                  """),_display_(/*33.20*/for(topic <- obj.returnTopics()) yield /*33.52*/{_display_(Seq[Any](format.raw/*33.53*/("""
                   """),format.raw/*34.20*/("""<div style="display: inline-block;background-color: #0b7e5b;color: #dee2e1; border-radius:6px; padding: 3px; margin-right: 3px; margin-top: 3px;margin-bottom: 3px;"> """),_display_(/*34.187*/topic),format.raw/*34.192*/(""" """),format.raw/*34.193*/("""</div> 
                  """)))}),format.raw/*35.20*/("""
                """),format.raw/*36.17*/("""</td>
              </tr>
              """)))}),format.raw/*38.16*/("""
               
            
            """),format.raw/*41.13*/("""</tbody> 
          </table>
        </div>
         </div>
        
        """)))}),format.raw/*46.10*/("""

""")))}/*48.3*/else/*48.8*/{_display_(Seq[Any](format.raw/*48.9*/("""
  """),format.raw/*49.3*/("""<h1>Not Displaying</h1>
""")))}),format.raw/*50.2*/("""
  
"""),format.raw/*52.1*/("""</section>
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
                  HASH: bfe68928667cc2e0709e9094796ccd4c4ce9e4ed
                  MATRIX: 960->1|1132->80|1159->81|1419->316|1449->338|1488->340|1526->353|1557->369|1595->370|1628->377|1951->673|1975->676|2419->1092|2444->1095|2490->1113|2507->1120|2526->1129|2539->1132|2571->1142|3101->1645|3146->1674|3185->1675|3228->1690|3361->1796|3373->1799|3403->1808|3507->1885|3519->1888|3547->1895|3666->1987|3714->2019|3753->2020|3801->2040|3996->2207|4023->2212|4053->2213|4111->2240|4156->2257|4228->2298|4298->2340|4407->2418|4428->2422|4440->2427|4478->2428|4508->2431|4563->2456|4594->2460
                  LINES: 27->1|32->2|33->3|35->5|35->5|35->5|36->6|36->6|36->6|37->7|39->9|39->9|46->16|46->16|46->16|46->16|46->16|46->16|46->16|58->28|58->28|58->28|59->29|60->30|60->30|60->30|61->31|61->31|61->31|63->33|63->33|63->33|64->34|64->34|64->34|64->34|65->35|66->36|68->38|71->41|76->46|78->48|78->48|78->48|79->49|80->50|82->52
                  -- GENERATED --
              */
          