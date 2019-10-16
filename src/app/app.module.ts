import { BrowserModule } from '@angular/platform-browser';
import {Injectable, NgModule} from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { FormsModule } from '@angular/forms';
import { HomeComponent } from './home/home.component';
import {HTTP_INTERCEPTORS, HttpClientModule} from "@angular/common/http";
import {LoginService} from "./login.service";
import {SpringbootInterceptor} from "./springboot-interceptor.service";
import {CookieService} from "ngx-cookie-service";


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [LoginService,
    CookieService,
    {
    provide: HTTP_INTERCEPTORS,
    useClass: SpringbootInterceptor,
    multi: true
  }


  ],
  bootstrap: [AppComponent]
})

export class AppModule {


}



