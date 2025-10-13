import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-signup',
  standalone: true,
  imports: [],
  templateUrl: './reactive-signup.component.html',
  styleUrl: './reactive-signup.component.css'
})
export class ReactiveSignupComponent {

  registrationForm!: FormGroup;
  selectedFile!: File;

  constructor(private fb: FormBuilder) {}

  ngOnInit(): void {
    this.registrationForm = this.fb.group({
      fullName: ['', Validators.required],
      dateOfBirth: ['', Validators.required],
      gender: [''],
      nationality: ['India'],
      contactNumber: [''],
      emailId: ['', [Validators.required, Validators.email]],
      address: [''],
      previousEducation: [''],
      percentage: [''],
      twelfthMarkSheet: [null],
      courseApplying: [''],
      permissionGiven: [false, Validators.requiredTrue]
    });
  }

  onFileSelected(event: any) {
    this.selectedFile = event.target.files[0];
    this.registrationForm.patchValue({ twelfthMarkSheet: this.selectedFile });
  }

  onSubmit() {
    if (this.registrationForm.valid) {
      console.log('Form Data:', this.registrationForm.value);
    }
  }

  onClear() {
    this.registrationForm.reset();
  }

}
