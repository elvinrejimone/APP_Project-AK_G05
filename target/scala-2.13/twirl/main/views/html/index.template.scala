
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


Seq[Any](format.raw/*2.1*/("""
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
                  HASH: 3f3c931a8a21c850065b2797318ba5627e9f0888
                  MATRIX: 967->1|1145->86|1172->87|2120->1009|2151->1031|2191->1033|2221->1036|2288->1076|2301->1080|2329->1087|2358->1088|2410->1114|2442->1130|2481->1131|2515->1138|2826->1422|2850->1425|3545->2093|3590->2122|3629->2123|3674->2140|3807->2246|3819->2249|3850->2259|3969->2351|3981->2354|4014->2366|4044->2368|4057->2371|4086->2378|4117->2381|4130->2384|4161->2393|4284->2489|4332->2521|4371->2522|4419->2542|4653->2748|4680->2753|4712->2757|4739->2762|4802->2794|4847->2811|4919->2852|4989->2894|5098->2972|5131->2975|5162->2979
                  LINES: 27->1|32->2|33->3|57->27|57->27|57->27|58->28|58->28|58->28|58->28|58->28|62->32|62->32|62->32|63->33|65->35|65->35|80->50|80->50|80->50|81->51|82->52|82->52|82->52|83->53|83->53|83->53|83->53|83->53|83->53|83->53|83->53|83->53|85->55|85->55|85->55|86->56|86->56|86->56|86->56|86->56|87->57|88->58|90->60|93->63|98->68|100->70|102->72
                  -- GENERATED --
              */
          