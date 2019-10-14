import { Component, OnInit } from '@angular/core';
import {AppService} from "../app.service";
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Router} from "@angular/router";
import {Observable} from "rxjs";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {


  credentials = {username: '', password: ''};

  constructor(private app: AppService, private http: HttpClient, private router: Router) {
  }

  login() {
    let headers = new HttpHeaders(
      {'Content-Type':'application/json',
        'X-Requested-With':'XMLHttpRequest',
        'Access-Control-Allow-Origin':'*'}
    );
    let options = { headers: headers };
    this.http.post("http://localhost:8080/login", {username:this.credentials.username,password:this.credentials.password},options).subscribe( res =>{
        console.log(res);
      },
      err => {
        console.log(err.message);
      })
  }

  ngOnInit() {
  }

}
