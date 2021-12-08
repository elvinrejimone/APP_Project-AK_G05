
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


Seq[Any](format.raw/*2.1*/("""	"""),format.raw/*2.2*/("""<script type='text/javascript' src='https://code.jquery.com/jquery-3.3.1.min.js'></script>
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

  	
      """),_display_(/*34.8*/for(key <- keys) yield /*34.24*/{_display_(Seq[Any](format.raw/*34.25*/("""
      """),format.raw/*35.7*/("""<div class="container" style="display: flex;justify-content: center; ">
      <div style="padding: 0px 40px 40px 40px;margin: 20px;background-color: rgb(211, 211, 211);border-radius: 5px;">
       <center> <span>Showing Results of <h1 style="display:inline-block;margin-left: 10px;">"""),_display_(/*37.95*/key),format.raw/*37.98*/("""</h1> </span></center>
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
              
              """),_display_(/*52.16*/for(obj <- results.get(key) ) yield /*52.45*/{_display_(Seq[Any](format.raw/*52.46*/("""
                """),format.raw/*53.17*/("""<tr style="height: 50px ">
                <td id="Owner"""),_display_(/*54.31*/obj/*54.34*/.repoID),format.raw/*54.41*/("""" style="border: 1px solid rgb(104, 207, 164);"><a href="/user/"""),_display_(/*54.105*/obj/*54.108*/.ownerName),format.raw/*54.118*/("""">"""),_display_(/*54.121*/obj/*54.124*/.ownerName),format.raw/*54.134*/("""</a></td>
                <td  id="Name"""),_display_(/*55.31*/obj/*55.34*/.repoID),format.raw/*55.41*/("""" style="border: 1px solid rgb(104, 207, 164);"><a href="/repo/"""),_display_(/*55.105*/obj/*55.108*/.queryString),format.raw/*55.120*/("""/"""),_display_(/*55.122*/obj/*55.125*/.repoID),format.raw/*55.132*/("""">"""),_display_(/*55.135*/obj/*55.138*/.repoName),format.raw/*55.147*/("""</a></td>
                <td id="Topics"""),_display_(/*56.32*/obj/*56.35*/.repoID),format.raw/*56.42*/("""" style="border: 1px solid rgb(104, 207, 164);">
                  """),_display_(/*57.20*/for(topic <- obj.returnTopics()) yield /*57.52*/{_display_(Seq[Any](format.raw/*57.53*/("""
                   """),format.raw/*58.20*/("""<div style="display: inline-block;background-color: #0b7e5b;color: #dee2e1; border-radius:6px; padding: 4px; margin-right: 3px; margin-top: 3px;margin-bottom: 3px;"><a style="color :#dee2e1;" href="/topic/"""),_display_(/*58.226*/topic),format.raw/*58.231*/(""""> """),_display_(/*58.235*/topic),format.raw/*58.240*/("""</a> </div> 
                  """)))}),format.raw/*59.20*/("""
                """),format.raw/*60.17*/("""</td>
              </tr>
              """)))}),format.raw/*62.16*/("""
               
            
            """),format.raw/*65.13*/("""</tbody> 
          </table>
        </div>
         </div>
        
        """)))}),format.raw/*70.10*/("""

""")))}),format.raw/*72.2*/("""

"""),format.raw/*74.1*/("""</section>
<script>
  
  

  (function() """),format.raw/*79.15*/("""{"""),format.raw/*79.16*/("""
  """),format.raw/*80.3*/("""$(function() """),format.raw/*80.16*/("""{"""),format.raw/*80.17*/("""
    """),format.raw/*81.5*/("""var ws;
    console.log("Inside Custom Script");
    ws = new WebSocket($("section").data("ws-url"));
    return ws.onmessage = function(event) """),format.raw/*84.43*/("""{"""),format.raw/*84.44*/("""
      """),format.raw/*85.7*/("""var message;
      message = JSON.parse(event.data);
      if(message.status == "No-Change")"""),format.raw/*87.40*/("""{"""),format.raw/*87.41*/("""
        """),format.raw/*88.9*/("""console.log("No Change from last Update!");
        $('#time').append(message.status + "<br/>");
      """),format.raw/*90.7*/("""}"""),format.raw/*90.8*/("""else"""),format.raw/*90.12*/("""{"""),format.raw/*90.13*/("""
        """),format.raw/*91.9*/("""console.log(message.value);   
        var allChanges = JSON.parse(message.value);
        console.log("Updating "+ message.status + "Repositories" );
        for(var i =0; i< parseInt(message.status); i++)"""),format.raw/*94.56*/("""{"""),format.raw/*94.57*/("""                    
             """),format.raw/*95.14*/("""var githubResult = allChanges[i];
             console.log(githubResult);
             $("#Owner"+ githubResult.repoToChange).html("<a href='/user/"+ githubResult.ownerName + "'>"+ githubResult.ownerName+"</a>");
             $("#Name"+ githubResult.repoToChange).html("<a href='/repo/"+ githubResult.queryString+"/"+ githubResult.repoID +"'>" + githubResult.repoName+ "</a>");
             var data= '';
             var topics= githubResult.topics.substring(1, githubResult.topics.length-1).split(",");
             console.log("Topics :: "+topics+ " : " +topics.length);
             if(topics.length>1)"""),format.raw/*102.33*/("""{"""),format.raw/*102.34*/("""
              """),format.raw/*103.15*/("""console.log("Topics :: " +topics[4]);
               for(var j=0; j<topics.length; j++)"""),format.raw/*104.50*/("""{"""),format.raw/*104.51*/("""
                  """),format.raw/*105.19*/("""data += "<div style='display: inline-block;background-color: #0b7e5b;color: #dee2e1; border-radius:6px; padding: 4px; margin-right: 3px; margin-top: 3px;margin-bottom: 3px;'><a style='color :#dee2e1;' href='/topic/" + topics[j] + "'> " + topics[j] + "</a> </div> ";
               """),format.raw/*106.16*/("""}"""),format.raw/*106.17*/("""
               """),format.raw/*107.16*/("""$("#Topics"+ githubResult.repoToChange).html(data);
             """),format.raw/*108.14*/("""}"""),format.raw/*108.15*/("""
        """),format.raw/*109.9*/("""}"""),format.raw/*109.10*/("""
      """),format.raw/*110.7*/("""}"""),format.raw/*110.8*/("""
    """),format.raw/*111.5*/("""}"""),format.raw/*111.6*/(""";
  """),format.raw/*112.3*/("""}"""),format.raw/*112.4*/(""");

"""),format.raw/*114.1*/("""}"""),format.raw/*114.2*/(""").call(this);


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
                  HASH: 7c8446e67d5b1418f2154905d0dbc4c920fa95aa
                  MATRIX: 989->1|1199->118|1226->119|1381->248|1395->254|1456->295|1521->334|1535->340|1595->380|2581->1340|2612->1362|2652->1364|2682->1367|2749->1407|2762->1411|2790->1418|2819->1419|2870->1444|2902->1460|2941->1461|2975->1468|3286->1752|3310->1755|4005->2423|4050->2452|4089->2453|4134->2470|4218->2527|4230->2530|4258->2537|4350->2601|4363->2604|4395->2614|4426->2617|4439->2620|4471->2630|4538->2670|4550->2673|4578->2680|4670->2744|4683->2747|4717->2759|4747->2761|4760->2764|4789->2771|4820->2774|4833->2777|4864->2786|4932->2827|4944->2830|4972->2837|5067->2905|5115->2937|5154->2938|5202->2958|5436->3164|5463->3169|5495->3173|5522->3178|5585->3210|5630->3227|5702->3268|5772->3310|5881->3388|5914->3391|5943->3393|6012->3434|6041->3435|6071->3438|6112->3451|6141->3452|6173->3457|6345->3601|6374->3602|6408->3609|6528->3701|6557->3702|6593->3711|6723->3814|6751->3815|6783->3819|6812->3820|6848->3829|7082->4035|7111->4036|7173->4070|7808->4676|7838->4677|7882->4692|7998->4779|8028->4780|8076->4799|8386->5080|8416->5081|8461->5097|8555->5162|8585->5163|8622->5172|8652->5173|8687->5180|8716->5181|8749->5186|8778->5187|8810->5191|8839->5192|8871->5196|8900->5197
                  LINES: 27->1|32->2|32->2|33->3|33->3|33->3|36->6|36->6|36->6|60->30|60->30|60->30|61->31|61->31|61->31|61->31|61->31|64->34|64->34|64->34|65->35|67->37|67->37|82->52|82->52|82->52|83->53|84->54|84->54|84->54|84->54|84->54|84->54|84->54|84->54|84->54|85->55|85->55|85->55|85->55|85->55|85->55|85->55|85->55|85->55|85->55|85->55|85->55|86->56|86->56|86->56|87->57|87->57|87->57|88->58|88->58|88->58|88->58|88->58|89->59|90->60|92->62|95->65|100->70|102->72|104->74|109->79|109->79|110->80|110->80|110->80|111->81|114->84|114->84|115->85|117->87|117->87|118->88|120->90|120->90|120->90|120->90|121->91|124->94|124->94|125->95|132->102|132->102|133->103|134->104|134->104|135->105|136->106|136->106|137->107|138->108|138->108|139->109|139->109|140->110|140->110|141->111|141->111|142->112|142->112|144->114|144->114
                  -- GENERATED --
              */
          