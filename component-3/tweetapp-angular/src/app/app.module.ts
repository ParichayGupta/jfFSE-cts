import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';

import { NavBarComponent } from './user-activity-container/nav-bar/nav-bar.component';
import { ScrollTopComponent } from './user-activity-container/user-scroll-top/scroll-top.component';
import { UserProfileComponent } from './user-activity-container/user-profile/user-profile.component';
import { PostTweetsPageComponent } from './user-activity-container/post-tweets-page/post-tweets-page.component';
import { ViewUsersPageComponent } from './user-activity-container/view-users-page/view-users-page.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { FooterComponent } from './user-activity-container/footer/footer.component';
import { HomeComponent } from './user-activity-container/home/home.component';
import { ErrorPageComponent } from './error-page/error-page.component';
import { LoginPageComponent } from './AuthContainer/login-page/login-page.component';
import { RegistrationPageComponent } from './AuthContainer/registration-page/registration-page.component';
import { ForgotPasswordComponent } from './AuthContainer/forgot-password/forgot-password.component';
import { ViewUsersTweetsComponent } from './user-activity-container/view-users-tweets/view-users-tweets.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginPageComponent,
    RegistrationPageComponent,
    UserProfileComponent,
    PostTweetsPageComponent,
    NavBarComponent,
    ScrollTopComponent,
    ViewUsersPageComponent,
    ViewUsersTweetsComponent,
    ForgotPasswordComponent,
    ErrorPageComponent,
    FooterComponent,
    HomeComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
