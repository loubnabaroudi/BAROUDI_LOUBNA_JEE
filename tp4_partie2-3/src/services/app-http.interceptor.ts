import {Injectable} from  "@angular/core";
import { HttpInterceptor,
         HttpHandler,
         HttpEvent,
         HttpRequest} from '@angular/common/http';
import {finalize, Observable} from "rxjs";
import {AppStateService} from "./app-state.service";
import {LoadingService} from "./loading.service";

@Injectable()
export class AppHttpInterceptor implements HttpInterceptor{

  constructor( private appState:AppStateService , private loadingService:LoadingService) {}
 // @ts-ignore
  intercept(request:HttpRequest<unknown>,next:HttpHandler):Observable<HttpInterceptor>{
    /*this.appState.setProductState({
      status:"LOADING"
    })*/
    this.loadingService.showLoadingSpinner();
    let req=request.clone({
      headers : request.headers.set("Authorization","Bearer JWT")
    });
    // @ts-ignore
    //il laisse la requete partir , et il l'entend :pipe à la meme functionnement que subscribe
    return next.handle(req).pipe(
      finalize(()=>{
        /*this.appState.setProductState({
          status:"LOADED"
        });*/
        this.loadingService.hideLoadingSpinner();
      })
    );
}
}
