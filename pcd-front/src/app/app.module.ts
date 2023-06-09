import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './pages/login/login.component';
import { InscriptionComponent } from './pages/inscription/inscription.component';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { HomeComponent } from './pages/home/home.component';
import { MenuComponent } from './component/menu/menu.component';
import { ProduitComponent } from './component/produit/produit.component';
import { AjoutProduitComponent } from './component/ajout-produit/ajout-produit.component';
import { CategorieComponent } from './component/categorie/categorie.component';
import { AjoutCategorieComponent } from './component/ajout-categorie/ajout-categorie.component';
import { PanierComponent } from './component/panier/panier.component'

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    InscriptionComponent,
    HomeComponent,
    MenuComponent,
    ProduitComponent,
    AjoutProduitComponent,
    CategorieComponent,
    AjoutCategorieComponent,
    PanierComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
