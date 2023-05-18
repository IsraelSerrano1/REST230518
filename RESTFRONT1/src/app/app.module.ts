import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MostrarMedicosComponent } from './mostrar-medicos/mostrar-medicos.component';
import {HttpClient,HttpClientModule} from '@angular/common/http'

@NgModule({
  declarations: [
    AppComponent,
    MostrarMedicosComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
