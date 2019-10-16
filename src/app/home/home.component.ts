import { Component, OnInit } from '@angular/core';

import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  greeting = {};
  resp:any;
  constructor( private http: HttpClient, private router: Router) {

    http.get('http://localhost:8080/').subscribe(
      res =>{
        this.resp = res;
      },
      err => {
       // this.router.navigateByUrl('/login');
        console.log(err.message);
      },
      () =>{
        console.log(this.resp);
      }
      );
  }


  ngOnInit() {
  }

}
