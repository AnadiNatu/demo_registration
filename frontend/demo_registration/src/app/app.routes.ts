import { Routes } from '@angular/router';

export const routes: Routes = [
    { path: '', loadComponent : () => import('').then(m => m.)},
    { path: 'signup', loadComponent : ()  => import('').then(m => m.)},

    {path : '/' , loadComponent : () => import('').then(m => m.)},
    {path : '**' , redirectTo: ''}
];
