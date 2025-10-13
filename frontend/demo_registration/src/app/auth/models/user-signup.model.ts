export interface UserSignUpDTO {
  fullName: string;
  dateOfBirth: Date;
  gender: string;
  nationality: string;
  contactNumber: string;
  emailId: string;
  address: string;
  previousEducation: string;
  percentage: number;
  twelfthMarkSheet: File | null;
  courseApplying: string;
  permissionGiven: string;
}