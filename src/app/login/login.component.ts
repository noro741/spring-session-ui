import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Router} from "@angular/router";
import {Observable} from "rxjs";
import {LoginService} from "../login.service";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit {


  credentials = {username: '', password: ''};

  constructor(private loginService: LoginService,private router:Router, private http: HttpClient) {
  }

  login() {
    this.loginService.login(this.credentials.username, this.credentials.password).subscribe( res =>{
        console.log(res);
       // this.router.navigateByUrl('/home');
      },
      err => {
        console.log(err.message);
      });
  }

  ngOnInit() {
  }

}
