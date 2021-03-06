import './rxjs-extensions';
import {NgModule}      from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {AppComponent}   from './app.component';
import {FormsModule} from "@angular/forms";
import {HttpModule} from "@angular/http";
import {CalendarComponent} from "./calendar.component";

@NgModule({
    imports: [
        BrowserModule,
        FormsModule,
        HttpModule
    ],
    declarations: [
        AppComponent,
        CalendarComponent
    ],
    providers: [
    ],
    bootstrap: [
        AppComponent
    ]
})

export class AppModule {
}
