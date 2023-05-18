import { Component } from '@angular/core';
import { Medico } from '../_modelo/Medico';
import { MedicoService } from '../medico.service';

@Component({
  selector: 'app-mostrar-medicos',
  templateUrl: './mostrar-medicos.component.html',
  styleUrls: ['./mostrar-medicos.component.css']
})
export class MostrarMedicosComponent {
medicos:Medico[]=[];

constructor(private sMedico:MedicoService){

}

ngOnInit():void{
  this.sMedico.listar().subscribe(datos => this.medicos=datos);
}

}
