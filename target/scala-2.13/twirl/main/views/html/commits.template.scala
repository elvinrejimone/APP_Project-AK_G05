
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

object commits extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Models.CommitsResult,List[String],Map[String, Integer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(results: Models.CommitsResult, keys: List[String], commitData: Map[String, Integer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<section style=" margin: 0;background: linear-gradient(45deg, #7ab1af, #aea7ec);font-family: sans-serif;font-weight: 100; padding-bottom: 40px">
  <div class="header" style="padding: 30px;
	  text-align: center;
	  background: #1abc9c;
	  color: white;
	  font-size: 30px;">
    
  		<h2> Repository Commit Statistics</h2>
	</div>
		  <div class="container" style="display: flex;justify-content: center; ">
			<div style="padding: 5px;margin: 20px;background-color:color:rgb(18, 105, 69);border-radius: 5px;">
			  <table style="
				border-collapse: collapse;
				box-shadow: 0 0 20px rgba(0,0,0,0.1);">
				  
				  <tbody style="background-color: #dee2e1; text-align: center;">
					<tr style="height: 50px ;border: 1px solid rgb(20, 107, 71);">
						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Maximum no.of additions </td>
						<td style="background-color: #dee2e1;width: 200px;">"""),_display_(/*21.60*/results/*21.67*/.maxAdd),format.raw/*21.74*/("""</td>
  					</tr> 
  					<tr   style="height: 50px ;border: 1px solid rgb(20, 107, 71);">
						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Minimum no.of additions</td>
						<td style="background-color: #dee2e1; width: 200px;">"""),_display_(/*25.61*/results/*25.68*/.minAdd),format.raw/*25.75*/("""</td>
					</tr>
					<tr  style="height: 50px ;border: 1px solid rgb(20, 107, 71);">
						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Average no.of additions </td>
						<td style="background-color: #dee2e1;width: 200px;">"""),_display_(/*29.60*/results/*29.67*/.avgAdd),format.raw/*29.74*/("""</td>
					 </tr> 

					  <tr  style="height: 50px ;border: 1px solid rgb(20, 107, 71);">
						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Maximum no.of deletions</td>
						<td style="background-color: #dee2e1;width: 200px;">"""),_display_(/*34.60*/results/*34.67*/.maxDel),format.raw/*34.74*/("""</td>
  					  </tr>
  					   <tr  style="height: 50px ;border: 1px solid rgb(20, 107, 71);">
						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Minumum no.of deletions</td>
						<td style="background-color: #dee2e1; width: 200px;">"""),_display_(/*38.61*/results/*38.68*/.minDel),format.raw/*38.75*/("""</td>
						</tr>
						<tr  style="height: 50px ;border: 1px solid rgb(20, 107, 71);">
						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Average no.of deletions</td>
						<td style="background-color: #dee2e1;width: 200px;">"""),_display_(/*42.60*/results/*42.67*/.avgDel),format.raw/*42.74*/("""</td>
					  </tr> 

 
				  </tbody> 
				</table>
			</div>

	
	
	 
    
      <div style="padding: 0px 40px 40px 40px;margin: 20px;background-color: rgb(211, 211, 211);border-radius: 5px;">
    <center>   <h3 style="margin-left: 25px; color:rgb(18, 105, 69);">Showing Top """),_display_(/*55.84*/keys/*55.88*/.size()),format.raw/*55.95*/(""" """),format.raw/*55.96*/("""users with highest no.of commits</h3> </center>
        <table style="width:800px;
          border-collapse: collapse;
          border: 1px solid #ddd;
          box-shadow: 0 0 20px rgba(0,0,0,0.1);">
            <thead style="background-color: #42a386; padding: 10px; height:50px ;">
              <tr>
                <th style="border: 1px solid rgb(211, 211, 211);">User name</th>
                <th  style="border: 1px solid rgb(211, 211, 211);">Commits count</th>
				<th  style="border: 1px solid rgb(211, 211, 211);">User profile link</th>
              </tr>
            </thead>
            <tbody style="background-color: #dee2e1; text-align: center;">
              
             """),_display_(/*69.15*/for(key<-keys) yield /*69.29*/{_display_(Seq[Any](format.raw/*69.30*/("""
					"""),format.raw/*70.6*/("""<tr style="height: 50px ">									
						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 30px;">"""),_display_(/*71.99*/key),format.raw/*71.102*/("""</td>
						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 30px;">"""),_display_(/*72.99*/commitData/*72.109*/.get(key)),format.raw/*72.118*/("""</td>	
						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 30px;"><a href='/user/"""),_display_(/*73.114*/key),format.raw/*73.117*/("""'>"""),_display_(/*73.120*/key),format.raw/*73.123*/("""</td>					
					</tr>				
				""")))}),format.raw/*75.6*/("""
               
            
            """),format.raw/*78.13*/("""</tbody> 
          </table>
        </div>
         </div>
	
		
</section>

	<button style="display: block;
	position: fixed;
	top: 20px;
	left: 30px;
	z-index: 99;
	font-size: 15px;
	border: none;
	outline: none;
	background-color: rgb(218, 218, 218);
	color: rgb(7, 75, 18) ;
	cursor: pointer;
	padding: 5px;" onclick="history.back()" title="Go Back"> ⬅ Back </button>
"""))
      }
    }
  }

  def render(results:Models.CommitsResult,keys:List[String],commitData:Map[String, Integer]): play.twirl.api.HtmlFormat.Appendable = apply(results,keys,commitData)

  def f:((Models.CommitsResult,List[String],Map[String, Integer]) => play.twirl.api.HtmlFormat.Appendable) = (results,keys,commitData) => apply(results,keys,commitData)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/commits.scala.html
                  HASH: 6c14719662eb2dc48e8e3cfda34d56450602db37
                  MATRIX: 957->1|1136->87|1163->88|2110->1008|2126->1015|2154->1022|2444->1285|2460->1292|2488->1299|2772->1556|2788->1563|2816->1570|3104->1831|3120->1838|3148->1845|3441->2111|3457->2118|3485->2125|3770->2383|3786->2390|3814->2397|4117->2673|4130->2677|4158->2684|4187->2685|4911->3382|4941->3396|4980->3397|5013->3403|5174->3537|5199->3540|5330->3644|5350->3654|5381->3663|5529->3783|5554->3786|5585->3789|5610->3792|5671->3823|5741->3865
                  LINES: 27->1|32->2|33->3|51->21|51->21|51->21|55->25|55->25|55->25|59->29|59->29|59->29|64->34|64->34|64->34|68->38|68->38|68->38|72->42|72->42|72->42|85->55|85->55|85->55|85->55|99->69|99->69|99->69|100->70|101->71|101->71|102->72|102->72|102->72|103->73|103->73|103->73|103->73|105->75|108->78
                  -- GENERATED --
              */
          