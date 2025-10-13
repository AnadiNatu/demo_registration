import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserDetailDTO } from '../../models/user-detail.model';
import { UserSignUpDTO } from '../../models/user-signup.model';
import { AuthService } from '../../services/auth.service';

@Component({
  selector: 'app-template-signup',
  standalone: true,
  imports: [],
  templateUrl: './template-signup.component.html',
  styleUrl: './template-signup.component.css'
})
export class TemplateSignupComponent {
 selectedFile!: File;
 submittedData?: UserDetailDTO;

  constructor(private authService: AuthService) {}

  onFileSelected(event: any) {
    this.selectedFile = event.target.files[0];
  }

  onSubmit(form: NgForm) {
    if (form.invalid) return;

    const formValue = form.value as UserDetailDTO;
    const formData = new FormData();
    Object.keys(formValue).forEach((key) => {
      formData.append(key, (formValue as any)[key]);
    });

    if (this.selectedFile) {
      formData.append('twelfthMarkSheet', this.selectedFile);
    }

    this.authService.signUpStudent(formData).subscribe({
      next: (response) => {
        alert('Student Registered:');
        this.submittedData = response;
        alert('Registration successful!');
        form.resetForm();
      },
      error: (err) => {
        alert('Something went wrong! Please try again.');
      }
    });
  }
}
