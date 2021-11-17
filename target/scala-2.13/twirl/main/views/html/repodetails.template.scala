
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

object repodetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Models.RepositoryProfile,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(Details: Models.RepositoryProfile):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""


"""),format.raw/*4.1*/("""<section style=" margin: 0;background: linear-gradient(45deg, #7ab1af, #aea7ec);font-family: sans-serif;font-weight: 100; padding-bottom: 40px">
  <div class="header" style="padding: 30px;
	  text-align: center;
	  background: #1abc9c;
	  color: white;
	  font-size: 30px;">
    
  		<h2> Repository Details : <b>"""),_display_(/*11.35*/Details/*11.42*/.repoName),format.raw/*11.51*/("""</b></h2>

		  <div class="container" style="display: flex;justify-content: center; ">
			<div style="padding: 5px;margin: 20px;background-color: #dee2e1;;border-radius: 5px;">
			  <table style="
				border-collapse: collapse;
				box-shadow: 0 0 20px rgba(0,0,0,0.1);">
				 <!-- <thead style="background-color: #42a386; padding: 10px; height:50px ;">
					<tr>
					  <th style="border: 1px solid rgb(211, 211, 211);">Owner</th>
					  <th  style="border: 1px solid rgb(211, 211, 211);">Repository</th>
					  <th  style="border: 1px solid rgb(211, 211, 211);">Topics</th>
	  
					</tr>
				  </thead>  -->
				  <tbody style="background-color: #dee2e1; text-align: center;">
					
				
					<tr style="height: 50px ">
					  <td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Repository Name 📂 </td>
					  <td style="background-color: #dee2e1;width: 200px;"><b >"""),_display_(/*31.65*/Details/*31.72*/.repoName),format.raw/*31.81*/(""" """),format.raw/*31.82*/("""</b></td>

					  <td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Repository Owner 👨‍💻 </td>
					  <td style="background-color: #dee2e1;width: 200px;"><a href="/">"""),_display_(/*34.73*/Details/*34.80*/.ownerName),format.raw/*34.90*/("""</a></td>

					  <td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Language 📑 </td>
					  <td style="background-color: #dee2e1;width: 200px;"><b style="">"""),_display_(/*37.73*/Details/*37.80*/.language),format.raw/*37.89*/("""</b></td>
					
					</tr>

					<tr style="height: 50px ">
						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Open issues 📝 </td>
						<td style="background-color: #dee2e1;width: 200px;">"""),_display_(/*43.60*/Details/*43.67*/.issuesCount),format.raw/*43.79*/("""</td>
  
						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Creation Date 📅 </td>
						<td style="background-color: #dee2e1; width: 200px;">"""),_display_(/*46.61*/Details/*46.68*/.created),format.raw/*46.76*/("""</td>

						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Size 📦  </td>
						<td style="background-color: #dee2e1; width: 200px;">"""),_display_(/*49.61*/Details/*49.68*/.size),format.raw/*49.73*/(""" """),format.raw/*49.74*/("""<span>MB</span></td>
					  </tr> 

					  <tr style="height: 50px ">
						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Star Count ⭐ </td>
						<td style="background-color: #dee2e1; width: 200px;">"""),_display_(/*54.61*/Details/*54.68*/.stars),format.raw/*54.74*/("""</td>

						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Watch Count 👁‍🗨 </td>
						<td style="background-color: #dee2e1; width: 200px;">"""),_display_(/*57.61*/Details/*57.68*/.watch),format.raw/*57.74*/("""</td>

						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Forks 📩 </td>
						<td style="background-color: #dee2e1; width: 200px;">"""),_display_(/*60.61*/Details/*60.68*/.watch),format.raw/*60.74*/("""</td>
					  </tr> 

 
				  </tbody> 
				</table>

				<table style="
				border-collapse: collapse;
				border: 1px solid #ddd;
				box-shadow: 0 0 20px rgba(0,0,0,0.1);">

				  	<tbody style="background-color: #dee2e1; text-align: center;">

						<tr style="height: 50px ">
							<td style="border: 1px solid rgb(20, 107, 71);background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Description 💭 </td>
							<td style="background-color: #dee2e1;width :80%;">"""),_display_(/*76.59*/Details/*76.66*/.description),format.raw/*76.78*/("""</td>
						</tr> 

					</tbody>
				</table>

				<table style="
				border-collapse: collapse;
				border: 1px solid #ddd;
				box-shadow: 0 0 20px rgba(0,0,0,0.1);">

				  	<tbody style="background-color: #dee2e1; text-align: center;">

						<tr style="height: 50px ">

							<td style="border: 1px solid rgb(20, 107, 71);background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Topics 🪧</td>
							<td style="background-color: #dee2e1;width :80%;">
								"""),_display_(/*93.10*/for(topic <- Details.getTopicsList()) yield /*93.47*/{_display_(Seq[Any](format.raw/*93.48*/("""
									"""),format.raw/*94.10*/("""<div style="display: inline-block;background-color: #0b7e5b;color: #dee2e1; border-radius:6px; padding: 4px; margin-right: 3px; margin-top: 3px;margin-bottom: 3px;"> """),_display_(/*94.177*/topic),format.raw/*94.182*/(""" """),format.raw/*94.183*/("""</div> 
								""")))}),format.raw/*95.10*/("""
							"""),format.raw/*96.8*/("""</td>
						</tr> 

					</tbody>
				</table>

			

			</div>

		</div>
      

		<center>
			<button
			onclick="window.location.href='#Issues';"
			style="background-color: #641515;
			border: none;
			color: white;
			padding: 17px 25px;
			text-align: center;
			text-decoration: none;
			display: inline-block;
			font-size: 16px;
			margin: 4px 2px;
			cursor: pointer;" > Issues 📜 </button>
	
			<button
			onclick="window.location.href='#Collaborator';"
			style="background-color: #223779;
			border: none;
			color: white;
			padding: 17px 25px;
			text-align: center;
			text-decoration: none;
			display: inline-block;
			font-size: 16px;
			margin: 4px 2px;
			cursor: pointer;" > Collaborators 👨‍💻 </button>
			
			<button
			onclick="window.location.href='/';"
			style="background-color: #075c4e;
			border: none;
			color: white;
			padding: 17px 25px;
			text-align: center;
			text-decoration: none;
			display: inline-block;
			font-size: 16px;
			margin: 4px 2px;
			cursor: pointer;" > Commits 📥 </button>
	
			<button
			onclick="window.location.href='"""),_display_(/*150.36*/Details/*150.43*/.repoLink),format.raw/*150.52*/("""';"
			 style="background-color: #b9411c;
			border: none;
			color: white;
			padding: 17px 25px;
			text-align: center;
			text-decoration: none;
			display: inline-block;
			font-size: 16px;
			margin: 4px 2px;
			cursor: pointer;" > Code 📄 </button>

			<button
			onclick="window.location.href='/';"
			style="background-color: #344147;
			border: none;
			color: white;
			padding: 17px 25px;
			text-align: center;
			text-decoration: none;
			display: inline-block;
			font-size: 16px;
			margin: 4px 2px;
			cursor: pointer;" > Issue Statistics 📊 </button>
	
		  </center>
		

 	 </div>


  
	  <div  id="Issues" class="container" style="display: flex;justify-content: center; ">
		<div style="padding: 10px;margin: 20px;background-color: rgb(211, 211, 211);border-radius: 5px;">

			<center> <h3>Showing  <span style=" font-size: 30px; color:rgb(18, 105, 69)">"""),_display_(/*185.82*/Details/*185.89*/.issueList.size()),format.raw/*185.106*/(""" """),format.raw/*185.107*/("""</span>  Latest issues </h3></center>
			
		  <table style="
			border-collapse: collapse;
			border: 1px solid #ddd;
			box-shadow: 0 0 20px rgba(0,0,0,0.1);">

			<thead style="background-color: #42a386; padding: 10px; height:50px ;">

				<tr>
				<th style="border: 1px solid rgb(211, 211, 211);">Issue Number</th>
				<th style="border: 1px solid rgb(211, 211, 211);">Issue Title</th>
				<th  style="border: 1px solid rgb(211, 211, 211);">Raised Time</th>	 
				<th  style="border: 1px solid rgb(211, 211, 211);">State</th>
					
				</tr>

			</thead>	
			    
			  <tbody style="background-color: #dee2e1; text-align: center;">
				
			
			

			
					"""),_display_(/*210.7*/for(issue <- Details.issueList) yield /*210.38*/{_display_(Seq[Any](format.raw/*210.39*/("""
					"""),format.raw/*211.6*/("""<tr style="height: 50px ">
						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 30px;">"""),_display_(/*212.99*/issue/*212.104*/.issueNumber),format.raw/*212.116*/("""</td>

						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 30px;">"""),_display_(/*214.99*/issue/*214.104*/.issueTitle),format.raw/*214.115*/("""</td>

						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 30px;">"""),_display_(/*216.99*/issue/*216.104*/.issueCreatedDate),format.raw/*216.121*/(""" """),format.raw/*216.122*/("""</td>

						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 10px; "><span style="color: """),_display_(/*218.120*/issue/*218.125*/.stateColor),format.raw/*218.136*/(""" """),format.raw/*218.137*/("""; font-size: 25px;">"""),_display_(/*218.158*/issue/*218.163*/.issueState),format.raw/*218.174*/("""</span></td>
					</tr> 
					""")))}),format.raw/*220.7*/("""
			
			  
			  """),format.raw/*223.6*/("""</tbody> 
			</table>
		 </div>
		</div>
		<div id="Collaborator" class="container" style="display: flex;justify-content: center; ">
		 <div style="padding: 10px;margin: 20px;background-color: rgb(211, 211, 211);border-radius: 5px;">

			<center> <h3>Collaborators</h3></center>
		  <table style="
			border-collapse: collapse;
			border: 1px solid #ddd;
			box-shadow: 0 0 20px rgba(0,0,0,0.1);">

			<thead style="background-color: #42a386; padding: 10px; height:50px ;">

				<tr>
				<th style="border: 1px solid rgb(211, 211, 211); padding: 20px;"></th>
				<th style="border: 1px solid rgb(211, 211, 211); padding: 20px;">Name</th>
				<th  style="border: 1px solid rgb(211, 211, 211); padding: 20px;">ID</th>	 
				<th  style="border: 1px solid rgb(211, 211, 211); padding: 20px;">Contribution Count</th>
				<th style="border: 1px solid rgb(211, 211, 211); padding: 20px;"> </th>
					
				</tr>

			</thead>	
			    
			  <tbody style="background-color: #dee2e1; text-align: center;">
				
			
			

			
					"""),_display_(/*255.7*/for(Collaborator <- Details.collabList) yield /*255.46*/{_display_(Seq[Any](format.raw/*255.47*/("""
					"""),format.raw/*256.6*/("""<tr style="height: 50px ">
						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1;padding: 20px; "> <img src="""),_display_(/*257.109*/Collaborator/*257.121*/.ContributorAvatarURL),format.raw/*257.142*/(""" """),format.raw/*257.143*/("""alt="Avatar" width="100" height="100"></td>

						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 20px;">"""),_display_(/*259.99*/Collaborator/*259.111*/.ContributorName),format.raw/*259.127*/("""</td>

						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 20px;">"""),_display_(/*261.99*/Collaborator/*261.111*/.ContributorID),format.raw/*261.125*/(""" """),format.raw/*261.126*/("""</td>

						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 20px;">"""),_display_(/*263.99*/Collaborator/*263.111*/.ContributorContributions),format.raw/*263.136*/("""</td>

						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 20px;">
						
							<button
							onclick="window.location.href='/';"
							style="background-color: #ca1d65;
							border: none;
							color: white;
							padding: 17px 25px;
							text-align: center;
							text-decoration: none;
							display: inline-block;
							font-size: 16px;
							margin: 4px 2px;
							cursor: pointer;" > Go to Profile 👨‍💻 </button>
						
						</td>
					</tr> 
					""")))}),format.raw/*282.7*/("""
			
			  
			  """),format.raw/*285.6*/("""</tbody> 
			</table>
		 </div>

	  </div>
  
	  <button style="display: none;
	  position: fixed;
	  bottom: 20px;
	  right: 30px;
	  z-index: 99;
	  font-size: 15px;
	  border: none;
	  outline: none;
	  background-color: rgb(15, 43, 80);
	  color: rgb(247, 247, 247);
	  cursor: pointer;
	  padding: 10px;" onclick="topFunction()" id="myBtn" title="Go to top"> ⬆ Back to Details</button>

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
	padding: 5px;" onclick="window.location.href='/'" title="Go Back"> ⬅ Back </button>

  
</section>
<script>
	//Get the button
	var mybutton = document.getElementById("myBtn");
	
	// When the user scrolls down 20px from the top of the document, show the button
	window.onscroll = function() """),format.raw/*324.31*/("""{"""),format.raw/*324.32*/("""scrollFunction()"""),format.raw/*324.48*/("""}"""),format.raw/*324.49*/(""";
	
	function scrollFunction() """),format.raw/*326.28*/("""{"""),format.raw/*326.29*/("""
	  """),format.raw/*327.4*/("""if (document.body.scrollTop > 150 || document.documentElement.scrollTop > 150) """),format.raw/*327.83*/("""{"""),format.raw/*327.84*/("""
		"""),format.raw/*328.3*/("""mybutton.style.display = "block";
	  """),format.raw/*329.4*/("""}"""),format.raw/*329.5*/(""" """),format.raw/*329.6*/("""else """),format.raw/*329.11*/("""{"""),format.raw/*329.12*/("""
		"""),format.raw/*330.3*/("""mybutton.style.display = "none";
	  """),format.raw/*331.4*/("""}"""),format.raw/*331.5*/("""
	"""),format.raw/*332.2*/("""}"""),format.raw/*332.3*/("""
	
	"""),format.raw/*334.2*/("""// When the user clicks on the button, scroll to the top of the document
	function topFunction() """),format.raw/*335.25*/("""{"""),format.raw/*335.26*/("""
	  """),format.raw/*336.4*/("""document.body.scrollTop = 0;
	  document.documentElement.scrollTop = 0;
	"""),format.raw/*338.2*/("""}"""),format.raw/*338.3*/("""
	"""),format.raw/*339.2*/("""</script>"""))
      }
    }
  }

  def render(Details:Models.RepositoryProfile): play.twirl.api.HtmlFormat.Appendable = apply(Details)

  def f:((Models.RepositoryProfile) => play.twirl.api.HtmlFormat.Appendable) = (Details) => apply(Details)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/repodetails.scala.html
                  HASH: 0a044dde422b15168841f39851f239f6610c0c0a
                  MATRIX: 931->1|1061->36|1093->42|1441->363|1457->370|1487->379|2429->1294|2445->1301|2475->1310|2504->1311|2729->1509|2745->1516|2776->1526|2990->1713|3006->1720|3036->1729|3291->1957|3307->1964|3340->1976|3544->2153|3560->2160|3589->2168|3783->2335|3799->2342|3825->2347|3854->2348|4117->2584|4133->2591|4160->2597|4363->2773|4379->2780|4406->2786|4600->2953|4616->2960|4643->2966|5163->3459|5179->3466|5212->3478|5732->3971|5785->4008|5824->4009|5863->4020|6058->4187|6085->4192|6115->4193|6164->4211|6200->4220|7363->5355|7380->5362|7411->5371|8347->6279|8364->6286|8404->6303|8435->6304|9147->6989|9195->7020|9235->7021|9270->7028|9424->7154|9440->7159|9475->7171|9610->7278|9626->7283|9660->7294|9795->7401|9811->7406|9851->7423|9882->7424|10039->7552|10055->7557|10089->7568|10120->7569|10170->7590|10186->7595|10220->7606|10284->7639|10331->7658|11408->8708|11464->8747|11504->8748|11539->8755|11704->8891|11727->8903|11771->8924|11802->8925|11975->9070|11998->9082|12037->9098|12172->9205|12195->9217|12232->9231|12263->9232|12398->9339|12421->9351|12469->9376|13028->9904|13075->9923|14046->10865|14076->10866|14121->10882|14151->10883|14213->10916|14243->10917|14276->10922|14384->11001|14414->11002|14446->11006|14512->11044|14541->11045|14570->11046|14604->11051|14634->11052|14666->11056|14731->11093|14760->11094|14791->11097|14820->11098|14854->11104|14981->11202|15011->11203|15044->11208|15147->11283|15176->11284|15207->11287
                  LINES: 27->1|32->1|35->4|42->11|42->11|42->11|62->31|62->31|62->31|62->31|65->34|65->34|65->34|68->37|68->37|68->37|74->43|74->43|74->43|77->46|77->46|77->46|80->49|80->49|80->49|80->49|85->54|85->54|85->54|88->57|88->57|88->57|91->60|91->60|91->60|107->76|107->76|107->76|124->93|124->93|124->93|125->94|125->94|125->94|125->94|126->95|127->96|181->150|181->150|181->150|216->185|216->185|216->185|216->185|241->210|241->210|241->210|242->211|243->212|243->212|243->212|245->214|245->214|245->214|247->216|247->216|247->216|247->216|249->218|249->218|249->218|249->218|249->218|249->218|249->218|251->220|254->223|286->255|286->255|286->255|287->256|288->257|288->257|288->257|288->257|290->259|290->259|290->259|292->261|292->261|292->261|292->261|294->263|294->263|294->263|313->282|316->285|355->324|355->324|355->324|355->324|357->326|357->326|358->327|358->327|358->327|359->328|360->329|360->329|360->329|360->329|360->329|361->330|362->331|362->331|363->332|363->332|365->334|366->335|366->335|367->336|369->338|369->338|370->339
                  -- GENERATED --
              */
          