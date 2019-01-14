	//EJERCICIO 1

	$(document).ready(function(){

		//1.1
		//Crear boton
		var botonModule = "<button id='fondoVerde'>Cambiar fondo verde Module</button>";
		//Añadir boton antes del primer elemento con clase 'module'
		$(".module:first").before(botonModule);
		// Guardar div clase module y ponerle fondo verde
		var divModule = $('.module');

		$("#fondoVerde").click(function(){
			divModule.css("background-color","green");
		});

		//1.2
		var botonLabel = "<button id='fondoAzul'>Cambiar fondo azul</button>";
		$("label").before(botonLabel);
		//1.2 Obtener label del input y ponerle fondo azul
		var labelInput = $('label');

		$("#fondoAzul").click(function(){
			labelInput.css("background-color","blue");
		});


		//1.3

	});

	
	
