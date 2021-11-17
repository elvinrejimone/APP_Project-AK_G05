
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
      </div>
      
  </div>
  
  
  """),_display_(/*27.4*/if(!results.isEmpty())/*27.26*/ {_display_(Seq[Any](format.raw/*27.28*/("""
  """),format.raw/*28.3*/("""<h5 style="margin-left: 25px;">Showing """),_display_(/*28.43*/keys/*28.47*/.size()),format.raw/*28.54*/(""" """),format.raw/*28.55*/("""Results</h5>


  	
      """),_display_(/*32.8*/for(key <- keys) yield /*32.24*/{_display_(Seq[Any](format.raw/*32.25*/("""
      """),format.raw/*33.7*/("""<div class="container" style="display: flex;justify-content: center; ">
      <div style="padding: 0px 40px 40px 40px;margin: 20px;background-color: rgb(211, 211, 211);border-radius: 5px;">
       <center> <span>Showing Results of <h1 style="display:inline-block;margin-left: 10px;">"""),_display_(/*35.95*/key),format.raw/*35.98*/("""</h1> </span></center>
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
              
              """),_display_(/*50.16*/for(obj <- results.get(key) ) yield /*50.45*/{_display_(Seq[Any](format.raw/*50.46*/("""
                """),format.raw/*51.17*/("""<tr style="height: 50px ">
                <td style="border: 1px solid rgb(104, 207, 164);"><a href="/">"""),_display_(/*52.80*/obj/*52.83*/.ownerName),format.raw/*52.93*/("""</a></td>
                <td style="border: 1px solid rgb(104, 207, 164);"><a href="/repo/"""),_display_(/*53.83*/obj/*53.86*/.queryString),format.raw/*53.98*/("""/"""),_display_(/*53.100*/obj/*53.103*/.repoID),format.raw/*53.110*/("""">"""),_display_(/*53.113*/obj/*53.116*/.repoName),format.raw/*53.125*/("""</a></td>
                <td style="border: 1px solid rgb(104, 207, 164);">
                  """),_display_(/*55.20*/for(topic <- obj.returnTopics()) yield /*55.52*/{_display_(Seq[Any](format.raw/*55.53*/("""
                   """),format.raw/*56.20*/("""<div style="display: inline-block;background-color: #0b7e5b;color: #dee2e1; border-radius:6px; padding: 4px; margin-right: 3px; margin-top: 3px;margin-bottom: 3px;"><a style="color :#dee2e1;" href="/topic/"""),_display_(/*56.226*/topic),format.raw/*56.231*/(""""> """),_display_(/*56.235*/topic),format.raw/*56.240*/("""</a> </div> 
                  """)))}),format.raw/*57.20*/("""
                """),format.raw/*58.17*/("""</td>
              </tr>
              """)))}),format.raw/*60.16*/("""
               
            
            """),format.raw/*63.13*/("""</tbody> 
          </table>
        </div>
         </div>
        
        """)))}),format.raw/*68.10*/("""

""")))}),format.raw/*70.2*/("""
  
"""),format.raw/*72.1*/("""</section>
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
                  HASH: dc1f6ecbfa5e9fdca90a430bfae4694de60ec963
                  MATRIX: 967->1|1146->85|1176->89|2148->1035|2179->1057|2219->1059|2250->1063|2317->1103|2330->1107|2358->1114|2387->1115|2443->1145|2475->1161|2514->1162|2549->1170|2862->1456|2886->1459|3596->2142|3641->2171|3680->2172|3726->2190|3860->2297|3872->2300|3903->2310|4023->2403|4035->2406|4068->2418|4098->2420|4111->2423|4140->2430|4171->2433|4184->2436|4215->2445|4340->2543|4388->2575|4427->2576|4476->2597|4710->2803|4737->2808|4769->2812|4796->2817|4860->2850|4906->2868|4980->2911|5053->2956|5167->3039|5202->3044|5235->3050
                  LINES: 27->1|32->1|34->3|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|63->32|63->32|63->32|64->33|66->35|66->35|81->50|81->50|81->50|82->51|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|86->55|86->55|86->55|87->56|87->56|87->56|87->56|87->56|88->57|89->58|91->60|94->63|99->68|101->70|103->72
                  -- GENERATED --
              */
          