import { Injectable } from '@angular/core';
import { Alumno } from '../entities/alumno';

@Injectable({
  providedIn: 'root'
})
export class AlumnoService {
  listado: Array<Alumno>;
  constructor() {
    this.listado = new Array<Alumno>();
    this.listado.push(

      new Alumno(0, 'Juan', 'Cobo', 'Jimenez', 'juan@correo.es', new Date(), null, '12121212H', 'Bien', false, '989898985')


    );
    this.listado.push(

      new Alumno(1, 'Jose', 'Cobo', 'Jimenez', 'juan@correo.es', new Date(), null, '12121212H', 'Bien', true, '989898985')


    );
  }

  findAll() {
    return this.listado;
  }

  findById(index: number) {
    return this.listado[index];
  }

  create(a: Alumno) {
    this.listado.push(a);
  }

  delete(index: number) {
    return this.listado.splice(index, 1);
  }
}
