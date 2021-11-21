
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


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<head>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<section style=" margin: 0;background: linear-gradient(45deg, #7ab1af, #aea7ec);font-family: sans-serif;font-weight: 100; padding-bottom: 40px">
  <div class="header" style="padding: 30px;
	  text-align: center;
	  background: #1abc9c;
	  color: white;
	  font-size: 30px;">
    
  		<h2> Repository Details : <b>"""),_display_(/*14.35*/Details/*14.42*/.repoName),format.raw/*14.51*/("""</b></h2>

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
					  <td style="background-color: #dee2e1;width: 200px;"><b >"""),_display_(/*34.65*/Details/*34.72*/.repoName),format.raw/*34.81*/(""" """),format.raw/*34.82*/("""</b></td>

					  <td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Repository Owner 👨‍💻 </td>
					  <td style="background-color: #dee2e1;width: 200px;"><a href="/">"""),_display_(/*37.73*/Details/*37.80*/.ownerName),format.raw/*37.90*/("""</a></td>

					  <td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Language 📑 </td>
					  <td style="background-color: #dee2e1;width: 200px;"><b style="">"""),_display_(/*40.73*/Details/*40.80*/.language),format.raw/*40.89*/("""</b></td>
					
					</tr>

					<tr style="height: 50px ">
						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Open issues 📝 </td>
						<td style="background-color: #dee2e1;width: 200px;">"""),_display_(/*46.60*/Details/*46.67*/.issuesCount),format.raw/*46.79*/("""</td>
  
						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Creation Date 📅 </td>
						<td style="background-color: #dee2e1; width: 200px;">"""),_display_(/*49.61*/Details/*49.68*/.created),format.raw/*49.76*/("""</td>

						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Size 📦  </td>
						<td style="background-color: #dee2e1; width: 200px;">"""),_display_(/*52.61*/Details/*52.68*/.size),format.raw/*52.73*/(""" """),format.raw/*52.74*/("""<span>MB</span></td>
					  </tr> 

					  <tr style="height: 50px ">
						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Star Count ⭐ </td>
						<td style="background-color: #dee2e1; width: 200px;">"""),_display_(/*57.61*/Details/*57.68*/.stars),format.raw/*57.74*/("""</td>

						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Watch Count 👁‍🗨 </td>
						<td style="background-color: #dee2e1; width: 200px;">"""),_display_(/*60.61*/Details/*60.68*/.watch),format.raw/*60.74*/("""</td>

						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Forks 📩 </td>
						<td style="background-color: #dee2e1; width: 200px;">"""),_display_(/*63.61*/Details/*63.68*/.watch),format.raw/*63.74*/("""</td>
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
							<td style="background-color: #dee2e1;width :80%;">"""),_display_(/*79.59*/Details/*79.66*/.description),format.raw/*79.78*/("""</td>
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
								"""),_display_(/*96.10*/for(topic <- Details.getTopicsList()) yield /*96.47*/{_display_(Seq[Any](format.raw/*96.48*/("""
									"""),format.raw/*97.10*/("""<div style="display: inline-block;background-color: #0b7e5b;color: #dee2e1; border-radius:6px; padding: 4px; margin-right: 3px; margin-top: 3px;margin-bottom: 3px;"> """),_display_(/*97.177*/topic),format.raw/*97.182*/(""" """),format.raw/*97.183*/("""</div> 
								""")))}),format.raw/*98.10*/("""
							"""),format.raw/*99.8*/("""</td>
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
			onclick="onCommitsClicked()"
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
			onclick="window.location.href='"""),_display_(/*153.36*/Details/*153.43*/.repoLink),format.raw/*153.52*/("""';"
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
			onclick="window.location.href='/statistics/';"
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
 	 <section id="CommitsLoading" style="display:none; margin: 0;font-family: sans-serif;font-weight: 100;">
 		<center> <h3> <i class="fa fa-spinner fa-spin"></i> Loading  </h3> </center>
 	 </section>


  
	  <div  id="Issues" class="container" style="display: flex;justify-content: center; ">
		<div style="padding: 10px;margin: 20px;background-color: rgb(211, 211, 211);border-radius: 5px;">

			<center> <h3>Showing  <span style=" font-size: 30px; color:rgb(18, 105, 69)">"""),_display_(/*191.82*/Details/*191.89*/.issueList.size()),format.raw/*191.106*/(""" """),format.raw/*191.107*/("""</span>  Latest issues </h3></center>
			
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
				
			
			

			
					"""),_display_(/*216.7*/for(issue <- Details.issueList) yield /*216.38*/{_display_(Seq[Any](format.raw/*216.39*/("""
					"""),format.raw/*217.6*/("""<tr style="height: 50px ">
						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 30px;">"""),_display_(/*218.99*/issue/*218.104*/.issueNumber),format.raw/*218.116*/("""</td>

						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 30px;">"""),_display_(/*220.99*/issue/*220.104*/.issueTitle),format.raw/*220.115*/("""</td>

						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 30px;">"""),_display_(/*222.99*/issue/*222.104*/.issueCreatedDate),format.raw/*222.121*/(""" """),format.raw/*222.122*/("""</td>

						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 10px; "><span style="color: """),_display_(/*224.120*/issue/*224.125*/.stateColor),format.raw/*224.136*/(""" """),format.raw/*224.137*/("""; font-size: 25px;">"""),_display_(/*224.158*/issue/*224.163*/.issueState),format.raw/*224.174*/("""</span></td>
					</tr> 
					""")))}),format.raw/*226.7*/("""
			
			  
			  """),format.raw/*229.6*/("""</tbody> 
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
				
			
			

			
					"""),_display_(/*261.7*/for(Collaborator <- Details.collabList) yield /*261.46*/{_display_(Seq[Any](format.raw/*261.47*/("""
					"""),format.raw/*262.6*/("""<tr style="height: 50px ">
						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1;padding: 20px; "> <img src="""),_display_(/*263.109*/Collaborator/*263.121*/.ContributorAvatarURL),format.raw/*263.142*/(""" """),format.raw/*263.143*/("""alt="Avatar" width="100" height="100"></td>

						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 20px;">"""),_display_(/*265.99*/Collaborator/*265.111*/.ContributorName),format.raw/*265.127*/("""</td>

						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 20px;">"""),_display_(/*267.99*/Collaborator/*267.111*/.ContributorID),format.raw/*267.125*/(""" """),format.raw/*267.126*/("""</td>

						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 20px;">"""),_display_(/*269.99*/Collaborator/*269.111*/.ContributorContributions),format.raw/*269.136*/("""</td>

						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 20px;">
						
							<button
							onclick="window.location.href='/user/"""),_display_(/*274.46*/Collaborator/*274.58*/.ContributorName),format.raw/*274.74*/("""'"
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
					""")))}),format.raw/*288.7*/("""
			
			  
			  """),format.raw/*291.6*/("""</tbody> 
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
	window.onscroll = function() """),format.raw/*330.31*/("""{"""),format.raw/*330.32*/("""scrollFunction()"""),format.raw/*330.48*/("""}"""),format.raw/*330.49*/(""";
	
	function scrollFunction() """),format.raw/*332.28*/("""{"""),format.raw/*332.29*/("""
	  """),format.raw/*333.4*/("""if (document.body.scrollTop > 150 || document.documentElement.scrollTop > 150) """),format.raw/*333.83*/("""{"""),format.raw/*333.84*/("""
		"""),format.raw/*334.3*/("""mybutton.style.display = "block";
	  """),format.raw/*335.4*/("""}"""),format.raw/*335.5*/(""" """),format.raw/*335.6*/("""else """),format.raw/*335.11*/("""{"""),format.raw/*335.12*/("""
		"""),format.raw/*336.3*/("""mybutton.style.display = "none";
	  """),format.raw/*337.4*/("""}"""),format.raw/*337.5*/("""
	"""),format.raw/*338.2*/("""}"""),format.raw/*338.3*/("""
	
	"""),format.raw/*340.2*/("""// When the user clicks on the button, scroll to the top of the document
	function topFunction() """),format.raw/*341.25*/("""{"""),format.raw/*341.26*/("""
	  """),format.raw/*342.4*/("""document.body.scrollTop = 0;
	  document.documentElement.scrollTop = 0;
	"""),format.raw/*344.2*/("""}"""),format.raw/*344.3*/("""
	
	"""),format.raw/*346.2*/("""//When Commits is Clicked 
	function onCommitsClicked() """),format.raw/*347.30*/("""{"""),format.raw/*347.31*/("""
	 """),format.raw/*348.3*/("""//Display Loader
		var commitLoader = document.getElementById("CommitsLoading");	
		commitLoader.style.display = "block";	
		window.location.href='/repos/"""),_display_(/*351.33*/Details/*351.40*/.ownerName),format.raw/*351.50*/("""/"""),_display_(/*351.52*/Details/*351.59*/.repoName),format.raw/*351.68*/("""/commits';
	"""),format.raw/*352.2*/("""}"""),format.raw/*352.3*/("""
	
	"""),format.raw/*354.2*/("""</script>"""))
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
                  HASH: 75e55ee1d77cd623ff8dbe86a2746851b884c02c
                  MATRIX: 931->1|1060->37|1087->38|1558->482|1574->489|1604->498|2526->1393|2542->1400|2572->1409|2601->1410|2823->1605|2839->1612|2870->1622|3081->1806|3097->1813|3127->1822|3376->2044|3392->2051|3425->2063|3626->2237|3642->2244|3671->2252|3862->2416|3878->2423|3904->2428|3933->2429|4191->2660|4207->2667|4234->2673|4434->2846|4450->2853|4477->2859|4668->3023|4684->3030|4711->3036|5215->3513|5231->3520|5264->3532|5767->4008|5820->4045|5859->4046|5897->4056|6092->4223|6119->4228|6149->4229|6197->4246|6232->4254|7334->5328|7351->5335|7382->5344|8495->6429|8512->6436|8552->6453|8583->6454|9270->7114|9318->7145|9358->7146|9392->7152|9545->7277|9561->7282|9596->7294|9729->7399|9745->7404|9779->7415|9912->7520|9928->7525|9968->7542|9999->7543|10154->7669|10170->7674|10204->7685|10235->7686|10285->7707|10301->7712|10335->7723|10397->7754|10441->7770|11486->8788|11542->8827|11582->8828|11616->8834|11780->8969|11803->8981|11847->9002|11878->9003|12049->9146|12072->9158|12111->9174|12244->9279|12267->9291|12304->9305|12335->9306|12468->9411|12491->9423|12539->9448|12739->9620|12761->9632|12799->9648|13172->9990|13216->10006|14148->10909|14178->10910|14223->10926|14253->10927|14313->10958|14343->10959|14375->10963|14483->11042|14513->11043|14544->11046|14609->11083|14638->11084|14667->11085|14701->11090|14731->11091|14762->11094|14826->11130|14855->11131|14885->11133|14914->11134|14946->11138|15072->11235|15102->11236|15134->11240|15235->11313|15264->11314|15296->11318|15381->11374|15411->11375|15442->11378|15625->11533|15642->11540|15674->11550|15704->11552|15721->11559|15752->11568|15792->11580|15821->11581|15853->11585
                  LINES: 27->1|32->2|33->3|44->14|44->14|44->14|64->34|64->34|64->34|64->34|67->37|67->37|67->37|70->40|70->40|70->40|76->46|76->46|76->46|79->49|79->49|79->49|82->52|82->52|82->52|82->52|87->57|87->57|87->57|90->60|90->60|90->60|93->63|93->63|93->63|109->79|109->79|109->79|126->96|126->96|126->96|127->97|127->97|127->97|127->97|128->98|129->99|183->153|183->153|183->153|221->191|221->191|221->191|221->191|246->216|246->216|246->216|247->217|248->218|248->218|248->218|250->220|250->220|250->220|252->222|252->222|252->222|252->222|254->224|254->224|254->224|254->224|254->224|254->224|254->224|256->226|259->229|291->261|291->261|291->261|292->262|293->263|293->263|293->263|293->263|295->265|295->265|295->265|297->267|297->267|297->267|297->267|299->269|299->269|299->269|304->274|304->274|304->274|318->288|321->291|360->330|360->330|360->330|360->330|362->332|362->332|363->333|363->333|363->333|364->334|365->335|365->335|365->335|365->335|365->335|366->336|367->337|367->337|368->338|368->338|370->340|371->341|371->341|372->342|374->344|374->344|376->346|377->347|377->347|378->348|381->351|381->351|381->351|381->351|381->351|381->351|382->352|382->352|384->354
                  -- GENERATED --
              */
          