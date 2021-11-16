
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[LinkedHashMap[String, ArrayList[Models.GithubResult]],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(results: LinkedHashMap[String, ArrayList[Models.GithubResult]], keys: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.86*/("""

"""),format.raw/*3.1*/("""<section style=" margin: 0;background: linear-gradient(45deg, #7ab1af, #aea7ec);font-family: sans-serif;font-weight: 100; padding-bottom: 40px">
  <div class="header">
    
      <div style="border:dotted 0.1px white;text-align:center">
      		
      		<h1>Search <span style=" font-size: 30px;">Github</span> </h1>
      		<form name="search" id="form" action="/" method="GET">
	      	<input style="text-align: left;margin: 0 px 10px;padding: 15px; font-size: 20px;" id="user" name="search" type="text" placeholder="enter name">
	      	<button style="background-color: #42a386;
          border: none;
          color: white;
          padding: 17px 25px;
          text-align: center;
          text-decoration: none;
          display: inline-block;
          font-size: 16px;
          margin: 4px 2px;
          cursor: pointer;" type="submit">Search</button>
	      	</form>
	      	<button style="background-color: #cc5a69;
          border: none;
          color: white;
          padding: 13px 20px;
          text-align: center;
          font-size: 16px;
          margin:2px;
          cursor: pointer;" >Clear</button>
      </div>
      
  </div>
  
  
  """),_display_(/*35.4*/if(!results.isEmpty())/*35.26*/ {_display_(Seq[Any](format.raw/*35.28*/("""
  """),format.raw/*36.3*/("""<h5 style="margin-left: 25px;">Showing """),_display_(/*36.43*/keys/*36.47*/.size()),format.raw/*36.54*/(""" """),format.raw/*36.55*/("""Results</h5>


  	
      """),_display_(/*40.8*/for(key <- keys) yield /*40.24*/{_display_(Seq[Any](format.raw/*40.25*/("""
      """),format.raw/*41.7*/("""<div class="container" style="display: flex;justify-content: center; ">
      <div style="padding: 0px 40px 40px 40px;margin: 20px;background-color: rgb(211, 211, 211);border-radius: 5px;">
       <center> <span>Showing Results of <h1 style="display:inline-block;margin-left: 10px;">"""),_display_(/*43.95*/key),format.raw/*43.98*/("""</h1> </span></center>
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
              
              """),_display_(/*58.16*/for(obj <- results.get(key) ) yield /*58.45*/{_display_(Seq[Any](format.raw/*58.46*/("""
                """),format.raw/*59.17*/("""<tr style="height: 50px ">
                <td style="border: 1px solid rgb(104, 207, 164);"><a href="/">"""),_display_(/*60.80*/obj/*60.83*/.ownerName),format.raw/*60.93*/("""</a></td>
                <td style="border: 1px solid rgb(104, 207, 164);"><a href="/">"""),_display_(/*61.80*/obj/*61.83*/.repoName),format.raw/*61.92*/("""</a></td>
                <td style="border: 1px solid rgb(104, 207, 164);">
                  """),_display_(/*63.20*/for(topic <- obj.returnTopics()) yield /*63.52*/{_display_(Seq[Any](format.raw/*63.53*/("""
                   """),format.raw/*64.20*/("""<div style="display: inline-block;background-color: #0b7e5b;color: #dee2e1; border-radius:6px; padding: 4px; margin-right: 3px; margin-top: 3px;margin-bottom: 3px;"><a style="color :#dee2e1;" href="/topic/"""),_display_(/*64.226*/topic),format.raw/*64.231*/(""""> """),_display_(/*64.235*/topic),format.raw/*64.240*/("""</a> </div> 
                  """)))}),format.raw/*65.20*/("""
                """),format.raw/*66.17*/("""</td>
              </tr>
              """)))}),format.raw/*68.16*/("""
               
            
            """),format.raw/*71.13*/("""</tbody> 
          </table>
        </div>
         </div>
        
        """)))}),format.raw/*76.10*/("""

""")))}/*78.3*/else/*78.8*/{_display_(Seq[Any](format.raw/*78.9*/("""
  """),format.raw/*79.3*/("""<h1>Not Displaying</h1>
""")))}),format.raw/*80.2*/("""
  
"""),format.raw/*82.1*/("""</section>
"""))
      }
    }
  }

  def render(results:LinkedHashMap[String, ArrayList[Models.GithubResult]],keys:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(results,keys)

  def f:((LinkedHashMap[String, ArrayList[Models.GithubResult]],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (results,keys) => apply(results,keys)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 766bc67134f0862a6bd583bf0ca4b3c2bc4821fa
                  MATRIX: 967->1|1146->85|1176->89|2407->1294|2438->1316|2478->1318|2509->1322|2576->1362|2589->1366|2617->1373|2646->1374|2702->1404|2734->1420|2773->1421|2808->1429|3121->1715|3145->1718|3855->2401|3900->2430|3939->2431|3985->2449|4119->2556|4131->2559|4162->2569|4279->2659|4291->2662|4321->2671|4446->2769|4494->2801|4533->2802|4582->2823|4816->3029|4843->3034|4875->3038|4902->3043|4966->3076|5012->3094|5086->3137|5159->3182|5273->3265|5296->3271|5308->3276|5346->3277|5377->3281|5433->3307|5466->3313
                  LINES: 27->1|32->1|34->3|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|71->40|71->40|71->40|72->41|74->43|74->43|89->58|89->58|89->58|90->59|91->60|91->60|91->60|92->61|92->61|92->61|94->63|94->63|94->63|95->64|95->64|95->64|95->64|95->64|96->65|97->66|99->68|102->71|107->76|109->78|109->78|109->78|110->79|111->80|113->82
                  -- GENERATED --
              */
          