import { Component } from '@angular/core';
import { products } from '../products';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent {
  saldo = 0;
  // Tarjeta:Tarjeta;
  Cargar() {
    // this.saldo = this.Tarjeta.Monto + this.saldo;
  }
}