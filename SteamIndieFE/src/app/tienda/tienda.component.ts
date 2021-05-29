import { Component, OnInit } from '@angular/core';
import { products } from '../products'
import { GetJuegos,ComprarJuego } from '../../Servicos/Juegos'

@Component({
  selector: 'app-tienda',
  templateUrl: './tienda.component.html',
  styleUrls: ['./tienda.component.css']
})
export class TiendaComponent implements OnInit {
  Juegos= []
  constructor() {
    this.asignar()
  }
  asignar = async () => {
    var J = []
    await GetJuegos().then((response) => {
      console.log(response,"response")
      J = response
      this.Juegos = J
    })
  }
  comprar(Juego: object) {
    var res = ComprarJuego(Juego)
  }
  ngOnInit(): void {
  }

}
