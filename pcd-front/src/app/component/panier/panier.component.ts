import { Component } from '@angular/core';
import { HtmlService } from 'src/app/html.service';

@Component({
  selector: 'app-panier',
  templateUrl: './panier.component.html',
  styleUrls: ['./panier.component.scss']
})
export class PanierComponent {
  constructor(private htmlCodeService: HtmlService) { }
   
  
}
