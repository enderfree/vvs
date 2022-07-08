import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-owner-page',
  templateUrl: './owner-page.component.html',
  styleUrls: ['./owner-page.component.css']
})
export class OwnerPageComponent implements OnInit {

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

  makeAdmin(id: number) {
    console.log(id);
  }

}
