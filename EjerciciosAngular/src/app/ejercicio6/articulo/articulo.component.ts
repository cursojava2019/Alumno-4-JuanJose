import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Articulo } from 'src/app/model/articulo';

@Component({
  selector: 'app-articulo',
  templateUrl: './articulo.component.html',
  styleUrls: ['./articulo.component.css']
})
export class ArticuloComponent implements OnInit {

	@Input()
	articulo: Articulo;

	@Output()
	eventoModEliminar: EventEmitter<number>;

  constructor() { 
  	this.eventoModEliminar = new EventEmitter<number>();
  }

  ngOnInit() {
  }

  

}
