import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './pages/login/login.component';
import { RegisterComponent } from './pages/register/register.component';
import { HomeComponent } from './pages/home/home.component';

import { FdmEmailDirective } from './fdm-email.directive';
import { PasswordDirective } from './password.directive';

import { VoterCardComponent } from './components/voter-card/voter-card.component';
import { AdminPageComponent } from './components/admin-page/admin-page.component';
import { VoterPageComponent } from './components/voter-page/voter-page.component';
import { OwnerPageComponent } from './components/owner-page/owner-page.component';
import { GuestPageComponent } from './components/guest-page/guest-page.component';
import { NavComponent } from './components/nav/nav.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,

    FdmEmailDirective,
    PasswordDirective,

    VoterCardComponent,
     AdminPageComponent,
     VoterPageComponent,
     OwnerPageComponent,
     GuestPageComponent,
     NavComponent


  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
