import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { UserDetailDTO } from '../models/user-detail.model';
import { UserSignUpDTO } from '../models/user-signup.model';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private BASE_URL = 'http://localhost:8080/api/auth/';

  constructor(private  http : HttpClient){}

  signUpStudent(dto : UserSignUpDTO) : Observable<UserDetailDTO> {
    return this.http.post<UserDetailDTO>(`${this.BASE_URL}signup/student` , dto);
  }

}
