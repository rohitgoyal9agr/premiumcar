import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponentComponent} from './components/home-component/home-component.component';
import {SellCarComponentComponent} from './components/sell-car-component/sell-car-component.component';
import { SearchCarResultComponentComponent } from './components/search-car-result-component/search-car-result-component.component';


const routes: Routes = [
  {
    path: 'home',
    component: HomeComponentComponent
  },
  {
    path: 'sellCar',
    component: SellCarComponentComponent
  },
  {
    path: 'searchCarResult',
    component : SearchCarResultComponentComponent
  },
  {
    path: '', redirectTo: 'home', pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
