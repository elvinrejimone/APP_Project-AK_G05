
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
                  HASH: daa494323f8df693569dee7144372e96106bcd87
                  MATRIX: 957->1|1136->87|1163->88|2315->1213|2331->1220|2359->1227|2566->1407|2582->1414|2610->1421|2815->1599|2831->1606|2859->1613|3111->1838|3127->1845|3155->1852|3362->2032|3378->2039|3406->2046|3610->2223|3626->2230|3654->2237|3799->2355|3812->2359|3840->2366|3869->2367|4782->3253|4812->3267|4851->3268|4884->3274|5045->3408|5070->3411|5201->3515|5221->3525|5252->3534|5399->3653|5424->3656|5485->3687|5555->3729
                  LINES: 27->1|32->2|33->3|57->27|57->27|57->27|60->30|60->30|60->30|63->33|63->33|63->33|68->38|68->38|68->38|71->41|71->41|71->41|74->44|74->44|74->44|83->53|83->53|83->53|83->53|100->70|100->70|100->70|101->71|102->72|102->72|103->73|103->73|103->73|104->74|104->74|106->76|109->79
                  -- GENERATED --
              */
          