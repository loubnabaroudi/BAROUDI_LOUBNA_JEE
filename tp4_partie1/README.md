-	Premièrement on a installé node js

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/594da28d-3cd4-42c7-9e54-5ec2e250e0b2)

Puis on a vérifié à l’aide de ligne de commande s’il est bien installé et sa version
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/d24c1516-bafc-406a-8ffc-a9cdb70ffed5)

Ensuite on a installé angular/cli
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/334faeb9-5087-4bbd-a893-185d010ed178)

Donc on a vérifié la version du angular :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/d4a06505-4509-4ce3-baf6-383440e56b8c)

Et maintenant on peut créer un projet en utilisant la commande suivante : 
ng new firstApp –no-standalone
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/b54fbfb6-88ef-426c-a997-c0bbec59d76e)

En utilisant la commande ng serve , il va générer toute l’application et nous donner l’url.
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/7b3c04c2-def6-4546-89d7-a987e86d6ea3)

Et voila l’interface de notre application :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/0ffde9a8-22eb-4513-9986-776e0df8ee2d)

Lorsque le projet est créé on a un fichier index.html :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/6ce6ac5d-6cb6-4d8e-aa95-b11eb6a17910)

Et ce fichier fait appel au fichier main.ts :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/013f7b22-9c33-4a7f-829f-f7137a8c7eba)

 Ce dernier démarre un module s’appelle AppModule dans lequel on a les déclarations des composantes, on importe les modules, il y a les services et Bootstrap :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/5200441c-5275-4811-92a3-4884cbf5e19d)

Dans le fichier app.compent.html on va faire le premier test de notre application :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/3afe4245-08c3-4cb3-8e2f-6ed598bbd59c)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/34bdbc2d-447d-4d80-b654-282af00f5fd4)

Maintenant on va créer une application en utilisant Bootstrap :
D’abords il faut installer bootstrap et bootstrap-icons
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/572b41b0-011d-4315-805f-771c11a58ad3)


Puis on va l’ajouter dans le fichier angular.json
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/70c54eb9-fb4a-425d-b1d9-6dd6fd19b1b1)

Voici les premiers pas de notre application :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/98c6421d-3b86-4437-80d6-6a7dfb151d54)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/2ab59f9f-c3a5-41a8-8882-7047622a18e8)

Maintenant on va créer les composantes c-t-d lorsqu’on clique sur le bouton Home, la page d’accueil va être afficher.
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/71a428eb-98b5-48cd-93e3-0f9ec26e62af)

Dans le fichier app-routing.module.ts on va créer les chemins vers les deux page home et products :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/500ac576-9872-4b00-a564-e0a3f5aeb226)

Mais lorsqu’on clique sur l’un des bouton rien est afficher :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/28d6df2e-bd6b-43c4-8f9f-2e9e43e8cec9)

Donc il faut ajouter à app.component.html
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/c15e976f-2b84-4b9b-acc8-c00b9201ebbe)

Et voilà :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/2edd1de0-3993-45b3-8f76-14c705a2cc73)

Et maintenant on va personnaliser nos pages :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/65b0f7fa-28ed-459e-9022-7a4d9aa3b24a)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/f56736dc-81c6-4b8e-9ea1-4ebb0dc79d1c)

Par exemple on peut ajouter une liste de produits et l’afficher a la page products :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/a4c46e43-b4ee-4f7e-b8bb-e246dd8f545a)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/1be832ce-84e0-475a-8741-e6341ed02fdf)

Et voici l’affichage :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/921f8087-437a-40cd-a001-9c05ea6872ec)

On peut ajouter un bouton delete pour supprimer les produits :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/cb282565-0bc9-4626-9300-080ca32dab88)
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/e7a70592-69ee-407e-828b-71d28f686637)
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/9719e2e6-cbe0-44c8-b30c-0f2210c9f258)

Cliquant sur le bouton Delete le produit va être supprimer :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/9845b2d1-0005-46e3-856a-0ed6cd666a7f)
Et voila le produit est supprimer.


On peut aussi ajouter un formulaire a notre page comme suit :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/987bd527-c093-463f-b8d1-244984332363)

Et voici le formulaire :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/b2eed3fb-f4e3-408b-bc26-e7dde5c5c130)

Et pour que le champ de recherche va fonctionner, voici les modifications nécessaires :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/7be65525-8f36-4d6b-8bd2-68a338821d5a)
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/12777658-958e-4731-83a5-cdee9026dbdf)

Par exemple on va rechercher les mots qui contient s :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/1aabd259-5da4-4aa5-9ef9-eafdd8fd3d13)

On peut faire la même chose en utilisant un filtre : 
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/484f7eb6-6ff1-467d-8184-6c1f8bfd7ba8)
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/da31c09a-76b3-4f22-ac2d-f77c13b5a050)

Une astuce a ajouté c’est de marquer le bouton qui a sélectionné, au lieu d’utiliser auterlink on va utiliser click :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/004d18cf-5d72-452e-8f17-df1b08470b62)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/05670709-a60d-438a-b541-dc3a37436fa1)
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/9a813a75-cd8b-4c44-8407-bd2f7739f0cb)

Et voilà le bouton qui a sélectionné est en rouge :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/9b7a1851-bd46-4f77-8877-6276c96a8cc0)








