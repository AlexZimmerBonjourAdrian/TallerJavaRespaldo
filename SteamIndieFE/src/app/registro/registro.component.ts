import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms'

@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styleUrls: ['./registro.component.css']
})
export class RegistroComponent implements OnInit {
  USU = new FormGroup({
    Usuario: new FormControl(''),
    Contrasenia:new FormControl(''),
    Contrasenia2:new FormControl(''),
    Nick: new FormControl(''),
    Correo:new FormControl(''),
    FechaNac: new FormControl(''),
    CodigoPostal:new FormControl(''),
  })
  constructor() { }

  ngOnInit(): void {
  }
  Mandar() {
    console.log(this.USU)
    // this.CargarSaldo.emit(this.Tarjeta);
  }
}
