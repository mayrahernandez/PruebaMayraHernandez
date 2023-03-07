import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Person } from '../models/person';


@Injectable({
  providedIn: 'root'
})
export class PersonService {

  constructor( private http:HttpClient) { }

  Url='http://localhost:8080/person';

  getAll(){ 
    return this.http.get<Person[]>(this.Url);
  }

  savePerson(person:Person){ 
    return this.http.post<Person>(this.Url,person);
  }

}
