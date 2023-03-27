import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Categorie } from 'src/app/categorie';
import { CategorieService } from 'src/app/services/categorie.service';

@Component({
  selector: 'app-ajout-categorie',
  templateUrl: './ajout-categorie.component.html',
  styleUrls: ['./ajout-categorie.component.scss']
})
export class AjoutCategorieComponent {

  nomNewCat!:string;
  newCategory!: Categorie;
  private catadded =false;

  constructor(private sc:CategorieService, private router: Router) {}


  
  createNewCategory() {
    if (this.nomNewCat=='') {
        alert("Name cannot be empty.");
  
        return;
    }
    this.newCategory = new Categorie();
    this.newCategory.nom = this.nomNewCat;
   
   console.log(this.newCategory);
  
    this.sc.addCategorie(this.newCategory).subscribe(() => {
         this.catadded=true;
            this.nomNewCat = "";},);7
    this.router.navigate(['/home/categorie'])
  }
}
