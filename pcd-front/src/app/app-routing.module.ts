import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AjoutProduitComponent } from './component/ajout-produit/ajout-produit.component';
import { ProduitComponent } from './component/produit/produit.component';
import { HomeComponent } from './pages/home/home.component';
import { InscriptionComponent } from './pages/inscription/inscription.component';
import { LoginComponent } from './pages/login/login.component';

const routes: Routes = [
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'inscrire',
    component: InscriptionComponent
  },
  {
    path: 'home',
    component: HomeComponent,
    children: [
      {
        path: 'produit',
        component: ProduitComponent
      },
      {
        path: 'ajoutproduit',
        component: AjoutProduitComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
