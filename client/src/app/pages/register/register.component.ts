import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  firstName: String = "";
  lastName: String = "";
  email: String = "";
  username: String = "";
  password: String = "";

  constructor(private httpClient: HttpClient) { }

  ngOnInit(): void {
  }

  register() {
    this.httpClient.post("http://", 
    {
      "firstName": this.firstName,
      "lastName": this.lastName,
      "email": this.email, 
      "username": this.username, 
      "password": this.password
    })
    .subscribe(data=> {console.log(data)});
  }

}
