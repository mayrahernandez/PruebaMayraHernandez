import { TestBed } from '@angular/core/testing';
import { PersonService } from './person.service';

describe('PersonService', () => {
  let service: PersonService;
  let httpClientSpy: { post: jasmine.Spy}

  beforeEach(() => {
    httpClientSpy = jasmine.createSpyObj('HttpClient', ['post']);
    service = new PersonService(httpClientSpy as any);
    /*TestBed.configureTestingModule({});
    service = TestBed.inject(PersonService);*/
  });

  it('Se agrega correctamente', () => {
    expect(service).toBeTruthy();
  });

});
