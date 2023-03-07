import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { PersonService } from './services/person.service';
import { RolService } from './services/rol.service';
import { Person } from './models/person';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Rol } from './models/rol';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'prueba';
  people!: Person[];
  roles!: Rol[];
  formPerson: FormGroup;

  constructor(
    private servicePerson: PersonService,
    private serviceRol: RolService,
    private router: Router,
    private fb: FormBuilder) {
    this.formPerson = fb.group({
      id: [''],
      documento: ['', [Validators.required]],
      name1: ['', [Validators.required,Validators.pattern(/[a-zA-Z].*/)]],
      name2: ['', [Validators.pattern(/[a-zA-Z].*/)]],
      lastName1: ['', [Validators.required,Validators.pattern(/[a-zA-Z].*/)]],
      lastName2: ['', [,Validators.pattern(/[a-zA-Z].*/)]],
      role: ['', [Validators.required]]

    });
  }

  ngOnInit() {
    this.servicePerson.getAll()
      .subscribe(data => {
        this.people = data;
      })

      this.serviceRol.getAll()
      .subscribe(data => {
        this.roles = data;
      })
  }


  save() {
    let person = new Person;
    person.documento = this.formPerson.get('documento')?.value;
    person.name1 = this.formPerson.get('name1')?.value;
    person.name2 = this.formPerson.get('name2')?.value;
    person.lastname1 = this.formPerson.get('lastName1')?.value;
    person.lastname2 = this.formPerson.get('lastName2')?.value;
    person.roleid = this.formPerson.get('role')?.value;
    this.servicePerson.savePerson(person)
      .subscribe(data => {
        alert("Persona agregada con Exito");
        location.reload();
      })
  }

}
