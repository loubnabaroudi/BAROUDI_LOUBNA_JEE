But : construire un micro service qui a deux connecteurs -> REST et graphql


Dans ce tp on a créé une application à l’aide de start.spring.io, et on a créé dans cette application des packages et des classes.

Voici notre base :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/fdb9675a-2a45-4f42-93b9-d8871da20e5e)

Dans ce tp on va essayer de créer les quatre connecteurs : soap, rest, graphQL, grpc
On va commencer avec Rest :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/73179f29-80eb-45ec-805f-8add57d68277)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/92485100-70b4-43bf-b67b-7c9bb0c37850)


Par id :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/b55195ee-401b-438b-bddf-fc5889610b8c)


Pour ajouter, mettre à jour et supprimer un compte :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/fcb669d1-773e-4314-aed1-e9b99a13f2ab)


Utilisation de Postman :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/448a3604-6471-4c69-91cd-6ad1aa309eec)


Et pour ajouter on a une erreur : 

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/b7b4fc5c-9a9c-413c-8038-b70cef5e7341)


Donc on va changer dans la méthode save() :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/70983bd2-8cb8-4856-84eb-4aa4ef2bab41)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/2b2d9485-b522-4d9d-a4ec-a3b42b3e23a7)


Maintenant on va  mettre à jour ce compte :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/178d0329-f0cd-4fce-909a-1b911239647e)

Et voilà on a changé currency EUR par USD.


Consulter le dataset qu’on a créé via api :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/3c779301-e934-4eae-a749-97bf3f70c2a8)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/b7213d1c-41b7-46f3-81eb-41283863cb55)


Par la suite on a ajouté les DTO response et request :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/5debb283-3a21-4aed-95dd-dfd8c41d5d2b)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/33506146-cd77-4a38-8dcb-7cf87edcdee0)


Puis les services :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/a4bba1f2-4b4b-45c2-8e7a-f907bebbf28f)


Et les mappers :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/aac09555-3f43-44be-8fab-0197a0c5802e)

-----------------------------------------------------------------------------

Dans la deuxième partie de ce tp on va essayer de se familiariser avec graphQl


D’abords on a créé un dossier graphql avec le fichier suivant :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/41ccdac1-13d3-4e4c-b317-6c17bc5e92c1)


Et voici un espace ou on peut envoyer une requête graphql :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/8738f0fa-fe24-425a-9b3b-35833308c7d0)


On peut afficher tous les comptes avec leur id :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/52d87ff6-264b-452e-8ff0-858268b17457)


Ou bien par id et balance :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/e092710e-6525-4f28-be52-c9fd7b7ae9ab)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/fe2f0fb8-775e-468f-8469-601cd071d2ee)


On peut chercher les comptes avec leur id:

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/62462145-02e5-4575-be14-108d700b47d0)


Si on demande un compte qui n’existe pas on aura l’erreur suivant :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/d3ff8c09-46bb-497b-abd9-1d6aba984e5b)


Donc pour récupérer le message d’exception on a créé un package exception qui contient la classe suivante:

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/75838851-b337-46d5-a234-89ed26c6ee0d)


Et voilà le message :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/1ed88907-3706-4fe5-aa18-7c0176ae8332)


Pour ajouter un compte, on a ajouté la fonction addAccount :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/95c4cb0f-65d6-4d68-960e-fc5d85ab31d2)


Et on a cree le type mutation :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/d60441a4-c818-4ce6-8d5a-36c643f1141f)


Et voila le compte est ajoute :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/6b79426c-58d4-44b8-9602-67ea73858a5f)


Pour paramétrer la requête, on fait comme suit :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/55379f42-0c76-4f4d-a1d0-3adeb7f9e43d)



Pour mettre a jour un compte :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/ff37b58f-b752-4295-89a9-4bf262c74ca0)


![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/db725140-7cae-414c-a713-51ca05095895)


Par la suite on a associe des comptes  à chaque clients :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/a7e4f47c-41ce-4050-893f-6488eca9ebab)


Voici la base de données :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/5340c72c-2558-4d7d-a97b-d770174f5122)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/80aa6317-2360-40c4-b238-2dea2c33556c)


Voilà ce que ça donne dans graphiql :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/3abfe24b-a380-450f-92d4-db4940629db2)


![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/63796e6b-fbef-476f-8fa5-da3462bf6eaa)


Afficher les customers :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/3c4670dc-3626-4ca6-a7b3-e239f832f1d9)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/e9b1dfc5-04ef-4b6f-b8da-9add597a01b1)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/32636b78-9883-4b72-bb3f-0595def2100c)


Pour REST on a tombé sur un problème de boucle infinie :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/6c49ec91-83f4-45c7-b060-7c9272e34523)

	
Pour résoudre le problème :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/c8eeffcc-3fa2-42b8-a056-3b31901266fb)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/d6c1011a-f040-443a-bd7b-a112478d2da0)


Et voilà un micro service avec deux connecteurs.








