//Ejercicio 6
$(document).ready(function(){
	
	var botonSlideshow = "<button id='botonSlideshow'>Subir elemento 'slideshow'</button>";
	$("label").before(botonSlideshow);
	$("#botonSlideshow").click(function(){
		var divSlide = "<div id='slide'></div>";
		$("#search").after(divSlide);
		var imagen1 = "<img class='imgSlide' src='images/fruit.jpg'>";
		var imagen2 = "<img class='imgSlide' src='images/vegetable.jpg'>";
		var imagen3 = "<img class='imgSlide' src='images/bread.jpg'>";
		var botonSlideLeft = " <button id='botonSlideLeft'>&#10094;</button>";
		var botonSlideRight = " <button id='botonSlideRight'>&#10095;</button>";
		 $("#slide").append(imagen1,imagen2,imagen3);
		 $('#slide').before(botonSlideLeft,botonSlideRight);
		 $('#slide').css('width','450px');
		 $('#slide').css('height','350px');
		 $('.imgSlide').css('width','450px');
		 $('.imgSlide').css('height','350px');
		 $('.imgSlide').css('position','absolute').css('float','right');
		 $('.imgSlide').css('display','none');
		 $('#botonSlideRight').css('float','right');
		 var intervalAparece=setInterval(imagenAparece, 1000);
		 var intervalDesaparece=setInterval(imagenDesaparece, 7000);
		 
		 function imagenAparece(){
				$('#slide .imgSlide:last').fadeIn("slow");
			}
		 function imagenDesaparece(){
			$('#slide .imgSlide:last').fadeOut("slow");
			var primerImg=$('#slide .imgSlide:last');
			$('#slide .imgSlide:last').remove();
			$('#slide').prepend(primerImg);
		}
		 $('#botonSlideLeft').click(lessImg);
		 $('#botonSlideRight').click(plusImg);
		 function lessImg() {
			 var ultimaImg=$('#slide .imgSlide:last');
			 $('#slide .imgSlide:last').remove();
			 $('#slide').prepend(ultimaImg);
		 }
		 function plusImg() {
			 var primeraImg=$('#slide .imgSlide:first');
			 $('#slide .imgSlide:first').remove();
			 $('#slide').append(primeraImg);
		}	 
	});
	
});