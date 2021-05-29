import { Component, OnInit } from '@angular/core';
import {SocialAuthService} from "angularx-social-login";
import {SocialUser} from "angularx-social-login";
import{GoogleLoginProvider} from "angularx-social-login";
import { FormControl, FormGroup } from '@angular/forms'

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user: SocialUser = new SocialUser;
  loggedIn: boolean = false;
  USU = new FormGroup({
    Usuario: new FormControl(''),
    Contrasenia:new FormControl(''),
  })
  Contrasenia: string
  Usuario: string

  

  constructor(private authService: SocialAuthService) { }
  Mandar() {
    console.log(this.USU.value.Contrasenia)
    console.log(this.USU.value.Usuario)
    console.log(this.user)
    // this.CargarSaldo.emit(this.Tarjeta);
  }
  refreshToken(): void {
    this.authService.refreshAuthToken(GoogleLoginProvider.PROVIDER_ID);
  }
  
  signInWithGoogle(): void {
    this.authService.signIn(GoogleLoginProvider.PROVIDER_ID);
  }

  signOut(): void {
    this.authService.signOut();
  }
  

  ngOnInit() {
    this.authService.authState.subscribe((user) => {
      this.user = user;
      this.loggedIn= (user != null);
    }); 
  }
}
