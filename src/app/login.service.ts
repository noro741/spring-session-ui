import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {SpringbootInterceptor} from "./springboot-interceptor.service";
@Injectable({
  providedIn: 'root'
})
export class LoginService {



  constructor(private http: HttpClient) {
  }


  login(username, password){

    let headers = new HttpHeaders({
      'Content-Type': 'application/x-www-form-urlencoded',
      'X-Requested-With': 'XMLHttpRequest',
      /*'Access-Control-Allow-Credentials':'true' ,
      'Access-Control-Allow-Origin':'http://localhost:8080'*/
    });

    let options = { headers: headers, withCredentials: true};
    let data = 'username='+ username +'&'+'password=' + password;

    return this.http.post("http://localhost:8080/login", data, options);
  }
}
