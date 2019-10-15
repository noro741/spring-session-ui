import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
@Injectable({
  providedIn: 'root'
})
export class LoginService {



  constructor(private http: HttpClient) {
  }


  login(username, password){

    let headers = new HttpHeaders({
      'Content-Type': 'application/x-www-form-urlencoded'
    });

    let options = { headers: headers };
    let data = 'username='+ username +'&'+'password=' + password;

    return this.http.post("http://localhost:8080/login", data, options);
  }
}
