import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { User } from 'src/app/model/User';

@Component({
  selector: 'app-admin-page',
  templateUrl: './admin-page.component.html',
  styleUrls: ['./admin-page.component.css']
})
export class AdminPageComponent implements OnInit {

  users: any;

  constructor(private httpClient: HttpClient) { }

  ngOnInit(): void {

    this.httpClient.get('http://localhost:8080/user/').subscribe(data=>{
      this.users = data;
    })
  }

  delete(id: number, firstName: string, lastName: string) {
    if(confirm("Are you sure you want to delete " + firstName + " " + lastName)) {
      console.log(id);
    }
  }



  async makeVoter(user: User) {
    await this.httpClient.put("http://localhost:8080/user/update", 
    {
      "userId": user.userId,
      "firstName": user.firstName,
      "lastName": user.lastName,
      "email": user.email, 
      "username": user.username, 
      "password": user.password,
      "role": "voter"
    })
    .subscribe(data=> {console.log(data)}
    );

  }

}


