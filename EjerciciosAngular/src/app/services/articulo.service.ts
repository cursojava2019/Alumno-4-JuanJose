import { Injectable } from '@angular/core';
import { Articulo } from '../model/articulo';

@Injectable({
  providedIn: 'root'
})
export class ArticuloService {

 private listado = Array<Articulo>();
  constructor() {

    this.listado.push(new Articulo(1, 'pan', 12));
    this.listado.push(new Articulo(2, 'leche', 10));
    this.listado.push(new Articulo(3, 'huevos', 6));
    
   }

  add(articulo: Articulo) {
    this.listado.push(articulo);
  }
  addSimple(codigo: number, descripcion: string, precio: number) {
    let articulo = new Articulo( codigo, descripcion, precio);
    this.listado.push(articulo);
  }
  findAll() {
    return this.listado;
  }
  deleteArticulo(indice: number) {
    this.listado.splice(indice, 1);
  }
}