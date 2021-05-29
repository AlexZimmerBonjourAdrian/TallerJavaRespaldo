import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BilleteraComponent } from '../app/billetera/billetera.component'
import { TiendaComponent } from '../app/tienda/tienda.component'
import { LoginComponent } from '../app/login/login.component'
import { RegistroComponent } from '../app/registro/registro.component'
import { PerfilComponent } from '../app/perfil/perfil.component'

const routes: Routes = [
  { path: 'billetera', component: BilleteraComponent },
  { path: 'Tienda', component: TiendaComponent },
  { path: 'Login', component: LoginComponent },
  { path: 'registro', component: RegistroComponent },
  { path: 'PerfilComponent', component: PerfilComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
