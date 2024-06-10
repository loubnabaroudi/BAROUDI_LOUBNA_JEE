import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Product} from "../model/product.model";

@Injectable({
  providedIn: 'root'
})
export class ProductService {
   private host:string ="http://localhost:8088"
  constructor(private http:HttpClient) { }

  public searchProducts(keyword:string,page:number=1,size:number=3){
   return   this.http.get(`${this.host}/products?name_like=${keyword}&_page=${page}&_limit=${size}`,{observe:'response'});
  }
  public checkProducts(product:Product):Observable<Product>{
    return   this.http.patch<Product>(`${this.host}/products/${product.id}`,
      { checked: !product.checked });
  }
    public deleteProduct(product:Product){
        return   this.http.delete<any>(`${this.host}/products/${product.id}`);
    }

  saveProduct(product: Product):Observable<Product> {
    return   this.http.post<Product>(`${this.host}/products`,
      product);
  }
  /*public searchProducts(keyword:string, page:number , size:number):Observable<Array<Product>>{
    return  this.http.get<Array<Product>>(`http://localhost:8088/products?name_like=${keyword}&_page=${page}&_limit=${size}`)
    //this doesn't work until json-server version @0.17.4
    // return  this.http.get<Array<Product>>(`http://localhost:8088/products?name_like=${keyword}`)

  }*/
  getProductById(productId: number):Observable<Product> {
    return this.http.get<Product>(`${this.host}/products/${productId}`);
  }

  updateProduct(product: Product):Observable<Product> {
    return this.http.put<Product>(`${this.host}/products/${product.id}`,product);
  }
}
