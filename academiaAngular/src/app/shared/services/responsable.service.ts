import { Injectable } from '@angular/core';
import { MapType } from '@angular/compiler';
import { Responsable } from '../entities/responsable';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ResponsableService {

  url = 'http://192.168.1.14:8080/academiajpa3/services/responsables/';

  constructor(private http: HttpClient) {

  }

  findAll(): Observable<Responsable[]> {
    return this.http.get<Responsable[]>(this.url);
  }

  findById(id: number): Observable<Responsable> {
    console.log('id FindById ' + id);
    return this.http.get<Responsable>(this.url + id);
  }

  create(p: Responsable): Observable<Responsable> {
    return this.http.post<Responsable>(this.url, p);
  }

  delete(id: number): Observable<any> {
    return this.http.delete(this.url + 1);
  }

  modificar(p: Responsable): Observable<any> {
    console.log(p);
    return this.http.put(this.url + p.id, p);
  }
}
