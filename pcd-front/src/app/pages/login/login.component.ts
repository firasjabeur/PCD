
import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ClientserviceService } from 'src/app/services/clientservice.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})


export class LoginComponent  {
  model: any = {};
  
  
 

  constructor(
    private router: Router, private clientservice: ClientserviceService
   
  ) {}
 

 



  loginUser() {

    var client = this.model.email;
    var password = this.model.password;
    
  
     
    this.clientservice.login(client, password)
      .subscribe((res : any) => {
        
        console.log('res',res)
        localStorage.setItem('token',res.token)
        
        this.router.navigate(['/home'])
      },
      (error: HttpErrorResponse) => {
        alert("invalid user");
        console.log(error);
      }
      )
      }

}




