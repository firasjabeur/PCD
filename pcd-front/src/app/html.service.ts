import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HtmlService {

  constructor() { }
  
  public htmlCode: any;
}
