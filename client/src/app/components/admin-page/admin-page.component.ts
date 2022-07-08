import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-admin-page',
  templateUrl: './admin-page.component.html',
  styleUrls: ['./admin-page.component.css']
})
export class AdminPageComponent implements OnInit {

  users: any;

  constructor() { }

  ngOnInit(): void {

    this.users = [{
      "firstName": "Childish",
      "lastName": "Gambino",
      "email": "childg@fdmgroup.com", 
      "username": "childg", 
      "role": "voter"
    },
    {
      "firstName": "Tai",
      "lastName": "Verdes",
      "email": "taiv@fdmgroup.com", 
      "username": "taiv", 
      "role": "guest"
    },
    {
      "firstName": "Jen",
      "lastName": "Evieve",
      "email": "jene.com", 
      "username": "jene", 
      "role": "admin"
    }
  ]
  }

  delete(id: number, firstName: string, lastName: string) {
    if(confirm("Are you sure you want to delete " + firstName + " " + lastName)) {
      console.log(id);
    }
  }



  makeVoter(id: number) {
    console.log(id);
  }

}
