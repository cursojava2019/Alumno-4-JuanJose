/*
	Ejercicios 1,2 y 3	
*/

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
		//Obtener elementos ocultos
		var elemOcultos =  $("*:hidden").length;
		//Crear boton 
		var botonOcultos = "<button id='botonOcultos'>Mostrar nº de elementos ocultos</button>";
		//Obtener imagenes con alt y crear boton
		var imagenesAlt = $("img[alt]").length;
		var botonImgAlt = "<button id='botonImgAlt'>Mostrar nº de imagenes con Alt</button>";
		//insertar botones en el index.html
		$("label").before(botonOcultos, botonImgAlt);

		$("#botonOcultos").click(function(){
			alert(elemOcultos);
		});
		$("#botonImgAlt").click(function(){
			alert(imagenesAlt);
		});

		//1.4
		//Seleccionar filas impares de la table y ponerle fondo amarillo
		$("tbody tr:even").css("background-color","yellow");

	});

	//EJERCICIO 2
	$(document).ready(function(){

		//2.1 
		//Seleccionar img, mostrar su alt por consola y crear boton
		var img = $("img");
		var botonMostrarAlt = "<button id='botonMostrarAlt'>Mostrar alt img por consola</button>";
		$("label").before(botonMostrarAlt);
		$("#botonMostrarAlt").click(function(){
			$(img).each(function(){
				console.log($(this).attr('alt'));	
			});
		});

		//2.2 Seleccionar input, poner fondo gris y crear boton
		var botonInputGris = "<button id='botonInputGris'>Poner fondo gris</button>";
		$("form:last").before(botonInputGris);
		$("#botonInputGris").click(function(){
			$('form:last').addClass("fondoGris");
			$('.fondoGris').css("background-color","gray");
		});

		//2.3
		//Seleccionar elemento con la clase 'current' dentro de #myList y eliminarla. Primero crear boton
		var botonCurrent = "<button id='botonCurrent'>Cambiar clase 'current'</button>";
		$("#myList").before(botonCurrent);
		$("#botonCurrent").click(function(){
			$("#myList .current").next().addClass("current");
			$("#myList .bar").removeClass("current");
		});
		
		//2.4
		var botonSpecials= "<button id='botonSpecials'>Valor submit por consola</button>";
		$("#specials").before(botonSpecials); 
		$("#botonSpecials").click(function(){
			console.log($('input[type="submit"]').attr('value'));
		});

		//2.5
		var botonSlideShow = "<button id='botonSlideShow'>Boton SlideShow</button>";
		$("#slideshow").before(botonSlideShow);
		$("#botonSlideShow").click(function(){
			$("#slideshow li:first").addClass("current");
			$("#slideshow li:first").siblings('li').addClass("disabled");
		});

	});

	//EJERCICIO 3
	$(document).ready(function(){
		//3.1
		var botonAddItems = "<button id='botonAddItems'>Añadir items</button>";
		$("#myList").before(botonAddItems);
		$("#botonAddItems").click(function(){
			for(var i=0; i<5; i++){
				var l = "<li>List item "+(i+8)+"</li>";
				$("#myList li:last").after(l);
			}
		});

		//3.2
		var botonRemoveImpares = "<button id='botonRemoveImpares'>Borrar elementos impares</button>";
		$("#myList").before(botonRemoveImpares);
		$("#botonRemoveImpares").click(function(){
			$("#myList li:even").remove();
		});

		//3.3
		var botonElementosModule = "<button id='botonElementosModule'>Añadir elementos module</button>";
		$(".module:last").before(botonElementosModule);
		$("#botonElementosModule").click(function(){
			var h2Module = "<h2>h2 añadido</h2>";
			var pModule = "<p>párrafo añadido</p>";
			$(".module:last").after(h2Module,pModule);
		});

		//3.4
		var botonOpcionSelect = "<button id='botonOpcionSelect'>Añadir opción select</button>";
		$("#specials").before(botonOpcionSelect);
		$("#botonOpcionSelect").click(function(){
			var opcion = "<option value='wednesday'>Wednesday</option>";
			$("option[value='tuesday']").after(opcion);
		});

		//3.5
		var botonNuevoModule = "<button id='botonNuevoModule'>Añadir nuevo div Module</button>";
		$('.module:first').before(botonNuevoModule);
		$('#botonNuevoModule').click(function(){
			var nuevoDiv = "<div class='module'><p>Nuevo div module y nueva imagen</p><img src='images/bread.jpg'></div>";
			$(".module:last").after(nuevoDiv);
		});
	
	});
	
