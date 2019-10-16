import { Injectable } from '@angular/core';
import {HttpEvent, HttpHandler, HttpInterceptor, HttpRequest} from "@angular/common/http";
import {Observable} from "rxjs";
import { CookieService } from 'ngx-cookie-service';
@Injectable({
  providedIn: 'root'
})
export class SpringbootInterceptor implements HttpInterceptor {
  private clonedRequest: HttpRequest<any>;

  constructor(public auth: CookieService) {}
  intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    this.clonedRequest = request;

     this.clonedRequest = request.clone({ headers: request.headers.set('X-XSRF-TOKEN', '' + this.auth.get("XSRF-TOKEN")) });

    // Pass control to the next request
    return next.handle(this.clonedRequest);
  }
}
