import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-sell-car-component',
  templateUrl: './sell-car-component.component.html',
  styleUrls: ['./sell-car-component.component.css']
})
export class SellCarComponentComponent implements OnInit {

  constructor() { }
  yearList;
  ngOnInit() {
    this.getListOfYears();
  }

  getListOfYears() {
    var d = new Date();
    var n = d.getFullYear();
    var years = [];
    for(var i=0; i<10; i++){
      years.push(n-i);    
    }
    this.yearList = years;
  }
}
