import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
//import { CardComponent } from './card/card.component';
//import { ReactiveFormComponent } from './reactive-form/reactive-form.component';

const routes: Routes = [
  //{path: '', component: CardComponent},
  //{path: 'formulario', component: ReactiveFormComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
  declarations: []
})
export class AppRoutingModule { }
