import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Rol } from '../models/rol';

@Injectable({
  providedIn: 'root'
})
export class RolService {

  constructor( private http:HttpClient) { }

  Url='http://localhost:8080/role';

  getAll(){ 
    return this.http.get<Rol[]>(this.Url);
  }

   
}
