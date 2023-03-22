import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Client } from '../client';

import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ClientserviceService {



  constructor(private http:HttpClient) { }


  adduser(user: Client){
    return this.http.post<Client>('http://localhost:8080/api/v1/auth/register', user)
  }
  

  login(email: string, password: string) : Observable<any> {
    return this.http.post('http://localhost:8080/api/v1/auth/authenticate', { email, password });
      
  }

}