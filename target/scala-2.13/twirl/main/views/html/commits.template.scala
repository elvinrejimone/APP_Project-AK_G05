
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


Seq[Any](format.raw/*1.87*/("""

"""),format.raw/*3.1*/("""<section style=" margin: 0;background: linear-gradient(45deg, #7ab1af, #aea7ec);font-family: sans-serif;font-weight: 100; padding-bottom: 40px">
  <div class="header" style="padding: 30px;
	  text-align: center;
	  background: #1abc9c;
	  color: white;
	  font-size: 30px;">
    
  		<h2> Repository Commit Statistics</h2>

		  <div class="container" style="display: flex;justify-content: center; ">
			<div style="padding: 5px;margin: 20px;background-color: #dee2e1;;border-radius: 5px;">
			  <table style="
				border-collapse: collapse;
				box-shadow: 0 0 20px rgba(0,0,0,0.1);">
				 <!-- <thead style="background-color: #42a386; padding: 10px; height:50px ;">
					<tr>
					  <th style="border: 1px solid rgb(211, 211, 211);">Repository</th>
					  <th  style="border: 1px solid rgb(211, 211, 211);">Owner</th>
	  
					</tr>
				  </thead> -->
				  <tbody style="background-color: #dee2e1; text-align: center;">
					<tr style="height: 50px ">
						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Maximum no.of additions </td>
						<td style="background-color: #dee2e1;width: 200px;">"""),_display_(/*27.60*/results/*27.67*/.maxAdd),format.raw/*27.74*/("""</td>
  
						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Minimum no.of additions</td>
						<td style="background-color: #dee2e1; width: 200px;">"""),_display_(/*30.61*/results/*30.68*/.minAdd),format.raw/*30.75*/("""</td>

						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Average no.of additions </td>
						<td style="background-color: #dee2e1;width: 200px;">"""),_display_(/*33.60*/results/*33.67*/.avgAdd),format.raw/*33.74*/("""</td>
					  </tr> 

					  <tr style="height: 50px ">
						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Maximum no.of deletions</td>
						<td style="background-color: #dee2e1;width: 200px;">"""),_display_(/*38.60*/results/*38.67*/.maxDel),format.raw/*38.74*/("""</td>
  
						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Minumum no.of deletions</td>
						<td style="background-color: #dee2e1; width: 200px;">"""),_display_(/*41.61*/results/*41.68*/.minDel),format.raw/*41.75*/("""</td>

						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Average no.of deletions</td>
						<td style="background-color: #dee2e1;width: 200px;">"""),_display_(/*44.60*/results/*44.67*/.avgDel),format.raw/*44.74*/("""</td>
					  </tr> 

 
				  </tbody> 
				</table>
			</div>

		</div>
	 <h5 style="margin-left: 25px;">Showing Top """),_display_(/*53.47*/keys/*53.51*/.size()),format.raw/*53.58*/(""" """),format.raw/*53.59*/("""users with highest no.of commits</h5>
	 
      <div class="container" style="display: flex;justify-content: center; ">
      <div style="padding: 0px 40px 40px 40px;margin: 20px;background-color: rgb(211, 211, 211);border-radius: 5px;">
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
              
             """),_display_(/*70.15*/for(key<-keys) yield /*70.29*/{_display_(Seq[Any](format.raw/*70.30*/("""
					"""),format.raw/*71.6*/("""<tr style="height: 50px ">									
						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 30px;">"""),_display_(/*72.99*/key),format.raw/*72.102*/("""</td>
						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 30px;">"""),_display_(/*73.99*/commitData/*73.109*/.get(key)),format.raw/*73.118*/("""</td>	
						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 30px;"><a href = "/">"""),_display_(/*74.113*/key),format.raw/*74.116*/("""</td>					
					</tr>				
				""")))}),format.raw/*76.6*/("""
               
            
            """),format.raw/*79.13*/("""</tbody> 
          </table>
        </div>
         </div>
	
		
</section>
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
                  HASH: 63828f6e1cece405758d5871d532e487f4a3aaf1
                  MATRIX: 957->1|1137->86|1167->90|2343->1239|2359->1246|2387->1253|2597->1436|2613->1443|2641->1450|2849->1631|2865->1638|2893->1645|3150->1875|3166->1882|3194->1889|3404->2072|3420->2079|3448->2086|3655->2266|3671->2273|3699->2280|3853->2407|3866->2411|3894->2418|3923->2419|4853->3322|4883->3336|4922->3337|4956->3344|5118->3479|5143->3482|5275->3587|5295->3597|5326->3606|5474->3726|5499->3729|5562->3762|5635->3807
                  LINES: 27->1|32->1|34->3|58->27|58->27|58->27|61->30|61->30|61->30|64->33|64->33|64->33|69->38|69->38|69->38|72->41|72->41|72->41|75->44|75->44|75->44|84->53|84->53|84->53|84->53|101->70|101->70|101->70|102->71|103->72|103->72|104->73|104->73|104->73|105->74|105->74|107->76|110->79
                  -- GENERATED --
              */
          