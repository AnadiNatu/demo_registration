import { Routes } from '@angular/router';

export const routes: Routes = [
    { path: '', loadComponent : () => import('./auth/components/home/home.component').then(m => m.HomeComponent)},
    { path: 'reactive-signup', loadComponent : ()  => import('./auth/components/reactive-signup/reactive-signup.component').then(m => m.ReactiveSignupComponent)},
    { path: 'template-signup', loadComponent : ()  => import('./auth/components/template-signup/template-signup.component').then(m => m.TemplateSignupComponent)},
    {path : '/' , loadComponent : () => import('./auth/components/home/home.component').then(m => m.HomeComponent)},
    {path : '**' , redirectTo: ''}
];
