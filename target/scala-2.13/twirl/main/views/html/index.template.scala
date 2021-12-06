
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[LinkedHashMap[String, ArrayList[Models.GithubResult]],List[String],play.mvc.Http.Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(results: LinkedHashMap[String, ArrayList[Models.GithubResult]], keys: List[String], request: play.mvc.Http.Request):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.118*/("""
	"""),format.raw/*2.2*/("""<script type='text/javascript' src='https://code.jquery.com/jquery-3.3.1.min.js'></script>
	<script type='text/javascript' src='"""),_display_(/*3.39*/routes/*3.45*/.Assets.versioned("javascripts/index.js")),format.raw/*3.86*/("""'></script>  


<section data-ws-url=""""),_display_(/*6.24*/routes/*6.30*/.HomeController.ws.webSocketURL(request)),format.raw/*6.70*/("""" style=" margin: 0;background: linear-gradient(45deg, #7ab1af, #aea7ec);font-family: sans-serif;font-weight: 100; padding-bottom: 40px">
  <div class="header">
    
      <div style="border:dotted 0.1px white;text-align:center">
      		
      		<h1 style="font-size: 50px;" ><span style=" font-size: 50px; font-family: Georgia;">Gitterific</span> </h1>
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
  
  
  """),_display_(/*30.4*/if(!results.isEmpty())/*30.26*/ {_display_(Seq[Any](format.raw/*30.28*/("""
  """),format.raw/*31.3*/("""<h5 style="margin-left: 25px;">Showing """),_display_(/*31.43*/keys/*31.47*/.size()),format.raw/*31.54*/(""" """),format.raw/*31.55*/("""Results</h5>


  	
      """),_display_(/*35.8*/for(key <- keys) yield /*35.24*/{_display_(Seq[Any](format.raw/*35.25*/("""
      """),format.raw/*36.7*/("""<div class="container" style="display: flex;justify-content: center; ">
      <div style="padding: 0px 40px 40px 40px;margin: 20px;background-color: rgb(211, 211, 211);border-radius: 5px;">
       <center> <span>Showing Results of <h1 style="display:inline-block;margin-left: 10px;">"""),_display_(/*38.95*/key),format.raw/*38.98*/("""</h1> </span></center>
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
              
              """),_display_(/*53.16*/for(obj <- results.get(key) ) yield /*53.45*/{_display_(Seq[Any](format.raw/*53.46*/("""
                """),format.raw/*54.17*/("""<tr style="height: 50px ">
                <td style="border: 1px solid rgb(104, 207, 164);"><a href="/user/"""),_display_(/*55.83*/obj/*55.86*/.ownerName),format.raw/*55.96*/("""">"""),_display_(/*55.99*/obj/*55.102*/.ownerName),format.raw/*55.112*/("""</a></td>
                <td style="border: 1px solid rgb(104, 207, 164);"><a href="/repo/"""),_display_(/*56.83*/obj/*56.86*/.queryString),format.raw/*56.98*/("""/"""),_display_(/*56.100*/obj/*56.103*/.repoID),format.raw/*56.110*/("""">"""),_display_(/*56.113*/obj/*56.116*/.repoName),format.raw/*56.125*/("""</a></td>
                <td style="border: 1px solid rgb(104, 207, 164);">
                  """),_display_(/*58.20*/for(topic <- obj.returnTopics()) yield /*58.52*/{_display_(Seq[Any](format.raw/*58.53*/("""
                   """),format.raw/*59.20*/("""<div style="display: inline-block;background-color: #0b7e5b;color: #dee2e1; border-radius:6px; padding: 4px; margin-right: 3px; margin-top: 3px;margin-bottom: 3px;"><a style="color :#dee2e1;" href="/topic/"""),_display_(/*59.226*/topic),format.raw/*59.231*/(""""> """),_display_(/*59.235*/topic),format.raw/*59.240*/("""</a> </div> 
                  """)))}),format.raw/*60.20*/("""
                """),format.raw/*61.17*/("""</td>
              </tr>
              """)))}),format.raw/*63.16*/("""
               
            
            """),format.raw/*66.13*/("""</tbody> 
          </table>
        </div>
         </div>
        
        """)))}),format.raw/*71.10*/("""

""")))}),format.raw/*73.2*/("""
"""),format.raw/*74.1*/("""<div id="time" ></div>
</section>
<script>
  
  
  // window.onload = function() """),format.raw/*79.33*/("""{"""),format.raw/*79.34*/("""
	 
	"""),format.raw/*81.2*/("""// 	var ws;
	//     console.log("Inside Coffee Script");
	//     ws = new WebSocket($("section").data("ws-url"));
	//     return ws.onmessage = function(event) """),format.raw/*84.47*/("""{"""),format.raw/*84.48*/("""
	"""),format.raw/*85.2*/("""//       var message;
	//       message = JSON.parse(event.data);
	//       return $('#time').append(message.time + "<br/>");
	//     """),format.raw/*88.9*/("""}"""),format.raw/*88.10*/(""";
	//   """),format.raw/*89.7*/("""}"""),format.raw/*89.8*/(""";

  (function() """),format.raw/*91.15*/("""{"""),format.raw/*91.16*/("""
  """),format.raw/*92.3*/("""$(function() """),format.raw/*92.16*/("""{"""),format.raw/*92.17*/("""
    """),format.raw/*93.5*/("""var ws;
    console.log("Inside Custom Script");
    ws = new WebSocket($("section").data("ws-url"));
    return ws.onmessage = function(event) """),format.raw/*96.43*/("""{"""),format.raw/*96.44*/("""
      """),format.raw/*97.7*/("""var message;
      message = JSON.parse(event.data);
      return $('#time').append(message.status + "<br/>");
    """),format.raw/*100.5*/("""}"""),format.raw/*100.6*/(""";
  """),format.raw/*101.3*/("""}"""),format.raw/*101.4*/(""");

"""),format.raw/*103.1*/("""}"""),format.raw/*103.2*/(""").call(this);


</script>

"""))
      }
    }
  }

  def render(results:LinkedHashMap[String, ArrayList[Models.GithubResult]],keys:List[String],request:play.mvc.Http.Request): play.twirl.api.HtmlFormat.Appendable = apply(results,keys,request)

  def f:((LinkedHashMap[String, ArrayList[Models.GithubResult]],List[String],play.mvc.Http.Request) => play.twirl.api.HtmlFormat.Appendable) = (results,keys,request) => apply(results,keys,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: b519460a6d2b2b1373402be94fc405b423ee690d
                  MATRIX: 989->1|1201->117|1230->120|1386->250|1400->256|1461->297|1529->339|1543->345|1603->385|2613->1369|2644->1391|2684->1393|2715->1397|2782->1437|2795->1441|2823->1448|2852->1449|2908->1479|2940->1495|2979->1496|3014->1504|3327->1790|3351->1793|4061->2476|4106->2505|4145->2506|4191->2524|4328->2634|4340->2637|4371->2647|4401->2650|4414->2653|4446->2663|4566->2756|4578->2759|4611->2771|4641->2773|4654->2776|4683->2783|4714->2786|4727->2789|4758->2798|4883->2896|4931->2928|4970->2929|5019->2950|5253->3156|5280->3161|5312->3165|5339->3170|5403->3203|5449->3221|5523->3264|5596->3309|5710->3392|5745->3397|5774->3399|5888->3485|5917->3486|5951->3493|6142->3656|6171->3657|6201->3660|6365->3797|6394->3798|6430->3807|6458->3808|6505->3827|6534->3828|6565->3832|6606->3845|6635->3846|6668->3852|6843->3999|6872->4000|6907->4008|7053->4126|7082->4127|7115->4132|7144->4133|7178->4139|7207->4140
                  LINES: 27->1|32->1|33->2|34->3|34->3|34->3|37->6|37->6|37->6|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|66->35|66->35|66->35|67->36|69->38|69->38|84->53|84->53|84->53|85->54|86->55|86->55|86->55|86->55|86->55|86->55|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|89->58|89->58|89->58|90->59|90->59|90->59|90->59|90->59|91->60|92->61|94->63|97->66|102->71|104->73|105->74|110->79|110->79|112->81|115->84|115->84|116->85|119->88|119->88|120->89|120->89|122->91|122->91|123->92|123->92|123->92|124->93|127->96|127->96|128->97|131->100|131->100|132->101|132->101|134->103|134->103
                  -- GENERATED --
              */
          