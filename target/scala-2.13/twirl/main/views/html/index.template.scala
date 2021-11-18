
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[LinkedHashMap[String, ArrayList[Models.GithubResult]],List[String],Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(results: LinkedHashMap[String, ArrayList[Models.GithubResult]], keys: List[String], str: Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<section style=" margin: 0;background: linear-gradient(45deg, #7ab1af, #aea7ec);font-family: sans-serif;font-weight: 100; padding-bottom: 40px">
  <h1 style="text-align: center; font-size: 50px;">Details of owner Repositories</h1> 
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
  
  
  """),_display_(/*28.4*/if(!results.isEmpty() && str)/*28.33*/ {_display_(Seq[Any](format.raw/*28.35*/("""
  """),format.raw/*29.3*/("""<h5 style="margin-left: 25px;">Showing """),_display_(/*29.43*/keys/*29.47*/.size()),format.raw/*29.54*/(""" """),format.raw/*29.55*/("""Results</h5>


  	
      """),_display_(/*33.8*/for(key <- keys) yield /*33.24*/{_display_(Seq[Any](format.raw/*33.25*/("""
      """),format.raw/*34.7*/("""<div class="container" style="display: flex;justify-content: center; ">
      <div style="padding: 0px 40px 40px 40px;margin: 20px;background-color: rgb(211, 211, 211);border-radius: 5px;">
       <center> <span>Showing Results of <h1 style="display:inline-block;margin-left: 10px;">"""),_display_(/*36.95*/key),format.raw/*36.98*/("""</h1> </span></center>
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
              
              """),_display_(/*51.16*/for(obj <- results.get(key) ) yield /*51.45*/{_display_(Seq[Any](format.raw/*51.46*/("""
                """),format.raw/*52.17*/("""<tr style="height: 50px ">
                <td style="border: 1px solid rgb(104, 207, 164);"><a href="/user/"""),_display_(/*53.83*/obj/*53.86*/.ownerName),format.raw/*53.96*/("""">"""),_display_(/*53.99*/obj/*53.102*/.ownerName),format.raw/*53.112*/("""</a></td>
                <td style="border: 1px solid rgb(104, 207, 164);"><a href="/repo/"""),_display_(/*54.83*/obj/*54.86*/.queryString),format.raw/*54.98*/("""/"""),_display_(/*54.100*/obj/*54.103*/.repoID),format.raw/*54.110*/("""">"""),_display_(/*54.113*/obj/*54.116*/.repoName),format.raw/*54.125*/("""</a></td>
                <td style="border: 1px solid rgb(104, 207, 164);">
                  """),_display_(/*56.20*/for(topic <- obj.returnTopics()) yield /*56.52*/{_display_(Seq[Any](format.raw/*56.53*/("""
                   """),format.raw/*57.20*/("""<div style="display: inline-block;background-color: #0b7e5b;color: #dee2e1; border-radius:6px; padding: 4px; margin-right: 3px; margin-top: 3px;margin-bottom: 3px;"><a style="color :#dee2e1;" href="/topic/"""),_display_(/*57.226*/topic),format.raw/*57.231*/(""""> """),_display_(/*57.235*/topic),format.raw/*57.240*/("""</a> </div> 
                  """)))}),format.raw/*58.20*/("""
                """),format.raw/*59.17*/("""</td>
              </tr>
              """)))}),format.raw/*61.16*/("""
               
            
            """),format.raw/*64.13*/("""</tbody> 
          </table>
        </div>
         </div>
        
        """)))}),format.raw/*69.10*/("""

""")))}),format.raw/*71.2*/("""
  
"""),format.raw/*73.1*/("""</section>
"""))
      }
    }
  }

  def render(results:LinkedHashMap[String, ArrayList[Models.GithubResult]],keys:List[String],str:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(results,keys,str)

  def f:((LinkedHashMap[String, ArrayList[Models.GithubResult]],List[String],Boolean) => play.twirl.api.HtmlFormat.Appendable) = (results,keys,str) => apply(results,keys,str)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 308720ca5f9fa662879093772e3c0d625cf80401
                  MATRIX: 975->1|1167->100|1194->101|2229->1110|2267->1139|2307->1141|2337->1144|2404->1184|2417->1188|2445->1195|2474->1196|2526->1222|2558->1238|2597->1239|2631->1246|2942->1530|2966->1533|3661->2201|3706->2230|3745->2231|3790->2248|3926->2357|3938->2360|3969->2370|3999->2373|4012->2376|4044->2386|4163->2478|4175->2481|4208->2493|4238->2495|4251->2498|4280->2505|4311->2508|4324->2511|4355->2520|4478->2616|4526->2648|4565->2649|4613->2669|4847->2875|4874->2880|4906->2884|4933->2889|4996->2921|5041->2938|5113->2979|5183->3021|5292->3099|5325->3102|5356->3106
                  LINES: 27->1|32->2|33->3|58->28|58->28|58->28|59->29|59->29|59->29|59->29|59->29|63->33|63->33|63->33|64->34|66->36|66->36|81->51|81->51|81->51|82->52|83->53|83->53|83->53|83->53|83->53|83->53|84->54|84->54|84->54|84->54|84->54|84->54|84->54|84->54|84->54|86->56|86->56|86->56|87->57|87->57|87->57|87->57|87->57|88->58|89->59|91->61|94->64|99->69|101->71|103->73
                  -- GENERATED --
              */
          