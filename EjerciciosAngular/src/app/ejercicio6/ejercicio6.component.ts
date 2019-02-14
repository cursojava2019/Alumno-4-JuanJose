import { Component, OnInit } from '@angular/core';
import { Articulo } from '../model/articulo';
import { ArticuloService } from '../services/articulo.service';


@Component({
  selector: 'app-ejercicio6',
  templateUrl: './ejercicio6.component.html',
  styleUrls: ['./ejercicio6.component.css'],
  providers: [ArticuloService]
})
export class Ejercicio6Component implements OnInit {

  constructor(private articuloService: ArticuloService) { }

  ngOnInit() {
  }

  crearArticulo(){
  	console.log('entrada crear artículo');

  }

  listarArticulos(){
  	return this.articuloService.findAll();
  }

}
