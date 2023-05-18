import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Medico } from './_modelo/Medico';

@Injectable({
  providedIn: 'root'
})
export class MedicoService {

  private url:string='http://localhost:8080/medicos'

    constructor(private http:HttpClient) { }

    listar():Observable<Medico[]>{
      console.log(this.http.get<Medico[]>(this.url))
      return this.http.get<Medico[]>(this.url)
    }
}
