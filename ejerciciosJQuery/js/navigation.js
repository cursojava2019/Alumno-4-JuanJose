//Ejercicio 5
$(document).ready(function(){
	$("#nav li").removeClass('selected');
	$("#nav li").hover(function(){
			$(this).addClass('selected');
		    $(this).addClass('hover');
		    $(this).children('ul').css('display','inline');
	},function(){
			$(this).removeClass('selected');
			$(this).removeClass('hover');
			$(this).children('ul').css('display','none');
			
		}); 
});