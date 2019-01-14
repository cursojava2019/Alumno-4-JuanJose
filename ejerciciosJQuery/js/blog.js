//Ejercicio 4
$(document).ready(function(){
	//4.1
	$("#blog h3 a").removeAttr("href");
	$("#blog li").click(function(){
	    var $this = $(this).children("p");
	    $("#blog li p").not($this).hide("fast");
	    $this.toggle("fast");
	});
});