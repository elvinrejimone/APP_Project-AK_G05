
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

object topic extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[HashMap[String, ArrayList[Models.GithubResult]],List[String],play.mvc.Http.Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(results: HashMap[String, ArrayList[Models.GithubResult]], keys: List[String],request: play.mvc.Http.Request):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<script type='text/javascript' src='https://code.jquery.com/jquery-3.3.1.min.js'></script>
<script type='text/javascript' src='"""),_display_(/*3.38*/routes/*3.44*/.Assets.versioned("javascripts/index.js")),format.raw/*3.85*/("""'></script>  

<section data-ws-url=""""),_display_(/*5.24*/routes/*5.30*/.HomeController.wsTopic.webSocketURL(request)),format.raw/*5.75*/("""" style=" margin: 0;background: linear-gradient(45deg, #7ab1af, #aea7ec);font-family: sans-serif;font-weight: 100; padding-bottom: 40px">
 
  """),_display_(/*7.4*/if(!results.isEmpty())/*7.26*/ {_display_(Seq[Any](format.raw/*7.28*/("""    	
      """),_display_(/*8.8*/for(key <- keys) yield /*8.24*/{_display_(Seq[Any](format.raw/*8.25*/("""
      """),format.raw/*9.7*/("""<div class="container" style="display: flex;justify-content: center; ">
      <div style="padding: 0px 40px 40px 40px;margin: 20px;background-color: rgb(211, 211, 211);border-radius: 5px;">
       <center> <span>Showing results for the topic: <h1 style="display:inline-block;margin-left: 10px;">"""),_display_(/*11.107*/key),format.raw/*11.110*/("""</h1> </span></center>
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
              
              """),_display_(/*26.16*/for(obj <- results.get(key) ) yield /*26.45*/{_display_(Seq[Any](format.raw/*26.46*/("""
                """),format.raw/*27.17*/("""<tr style="height: 50px ">
                <td style="border: 1px solid rgb(104, 207, 164);">"""),_display_(/*28.68*/obj/*28.71*/.ownerName),format.raw/*28.81*/("""</td>
                <td style="border: 1px solid rgb(104, 207, 164);">"""),_display_(/*29.68*/obj/*29.71*/.repoName),format.raw/*29.80*/("""</td>
                <td style="border: 1px solid rgb(104, 207, 164);">
                  """),_display_(/*31.20*/for(topic <- obj.returnTopics()) yield /*31.52*/{_display_(Seq[Any](format.raw/*31.53*/("""
                   """),format.raw/*32.20*/("""<div style="display: inline-block;background-color: #0b7e5b;color: #dee2e1; border-radius:6px; padding: 3px; margin-right: 3px; margin-top: 3px;margin-bottom: 3px;"> """),_display_(/*32.187*/topic),format.raw/*32.192*/(""" """),format.raw/*32.193*/("""</div> 
                  """)))}),format.raw/*33.20*/("""
                """),format.raw/*34.17*/("""</td>
              </tr>
              """)))}),format.raw/*36.16*/("""
               
            
            """),format.raw/*39.13*/("""</tbody> 
          </table>
        </div>
         </div>
        
        """)))}),format.raw/*44.10*/("""

""")))}/*46.3*/else/*46.8*/{_display_(Seq[Any](format.raw/*46.9*/("""
  """),format.raw/*47.3*/("""<h1>Not Displaying</h1>
""")))}),format.raw/*48.2*/("""
 
"""),format.raw/*50.1*/("""</section>
"""))
      }
    }
  }

  def render(results:HashMap[String, ArrayList[Models.GithubResult]],keys:List[String],request:play.mvc.Http.Request): play.twirl.api.HtmlFormat.Appendable = apply(results,keys,request)

  def f:((HashMap[String, ArrayList[Models.GithubResult]],List[String],play.mvc.Http.Request) => play.twirl.api.HtmlFormat.Appendable) = (results,keys,request) => apply(results,keys,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/topic.scala.html
                  HASH: b18f9c80732bd332cf47a7e82cc8ecb2ac17f1b1
                  MATRIX: 983->1|1186->111|1340->239|1354->245|1415->286|1479->324|1493->330|1558->375|1726->518|1756->540|1795->542|1833->555|1864->571|1902->572|1935->579|2259->875|2284->878|2979->1546|3024->1575|3063->1576|3108->1593|3229->1687|3241->1690|3272->1700|3372->1773|3384->1776|3414->1785|3533->1877|3581->1909|3620->1910|3668->1930|3863->2097|3890->2102|3920->2103|3978->2130|4023->2147|4095->2188|4165->2230|4274->2308|4295->2312|4307->2317|4345->2318|4375->2321|4430->2346|4460->2349
                  LINES: 27->1|32->2|33->3|33->3|33->3|35->5|35->5|35->5|37->7|37->7|37->7|38->8|38->8|38->8|39->9|41->11|41->11|56->26|56->26|56->26|57->27|58->28|58->28|58->28|59->29|59->29|59->29|61->31|61->31|61->31|62->32|62->32|62->32|62->32|63->33|64->34|66->36|69->39|74->44|76->46|76->46|76->46|77->47|78->48|80->50
                  -- GENERATED --
              */
          