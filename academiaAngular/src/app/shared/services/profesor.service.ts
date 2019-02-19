import { Injectable } from '@angular/core';
import { MapType } from '@angular/compiler';
import { Profesor } from '../entities/profesor';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProfesorService {

  url = 'http://192.168.1.14:8080/academiajpa3/services/profesores/';

  constructor(private http: HttpClient) {

  }

  findAll(): Observable<Profesor[]> {
    return this.http.get<Profesor[]>(this.url);
  }

  findById(id: number): Observable<Profesor> {
    console.log('id FindById ' + id);
    return this.http.get<Profesor>(this.url + id);
  }

  create(p: Profesor): Observable<Profesor> {
    return this.http.post<Profesor>(this.url, p);
  }

  delete(id: number): Observable<any> {
    return this.http.delete(this.url + 1);
  }

  modificar(p: Profesor): Observable<any> {
    console.log(p);
    return this.http.put(this.url + p.id, p);
  }
}
