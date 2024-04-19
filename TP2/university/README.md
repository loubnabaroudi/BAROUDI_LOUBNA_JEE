Spring Data JPA Hibernate
---------------------------------------------------------------------------------------------------------------------------------



On a créé un projet nomme university et dans ce dernier on a créé un package entities avec une classe product :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/ae8379cb-6d87-439b-aade-80ac1286fa1b)


On a utilisé @Data pour générer les getters et setters :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/d2822e48-b249-4dd7-b53a-b2b6bacca1fc)


Puis on a effectué une configuration dans application. properties :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/20782f4e-7961-4109-9f4d-18344bbd298b)


Si on veut se connecter à la base de données on va consulter Localhost:8085/h2-console :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/198b19e5-a5ef-4ca6-b57c-af97641abd72)


Puis on va utiliser l’url qu’on a créé ici :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/c5dff06f-824f-4b02-94cb-594738a46c62)


Et on aura la page suivante ou on peut voir le tableau product avec les attributs :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/9b5cc115-6b81-406d-a1aa-4cbbac8f5b30)


Donc si on veut ajouter des produits a notre base de données, on a créé une interface appelée ProductRepository et on a ajoute dans la classe UniversityApplication les produits qu’on veut ajouter.

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/67a59174-3b00-481b-a94d-b000b7871680)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/c1f70d5b-7e03-4c98-81f2-e8fe1f106b0c)


Et voici les produits sont ajoute dans la base de donnees :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/3ae41fd1-c50f-44ec-a6e1-ec1cadabb7e4)


Ensuite si on peut afficher les produits :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/7f6ef42f-211a-4e73-8515-8efafc505ce6)


Et voici l’affichage de ces produits :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/3143d21a-739e-4b66-be09-2b74c4418a35)


Dans ce qui precede on a travailler avec une base de donnees h2 , maintenant on va travailler avec une base de donnnees  mysql. Donc on va d’abord installer xampp :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/be50c662-64d1-4da9-a1ce-660eaad13c5b)


Donc pour travailler avec mysql on diot changer dans les dependances dans le code :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/0384fbc5-825c-403d-b22b-a1325bd4e0a5)


Donc maintenanat si on execute notre application on va utiliser la base de donnees sql :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/c6e486a7-05b2-4dce-bd60-527b98ad7b70)


Maintenant si on veut ajouter d’autre fonction par exemple une fonction qui va chercher tous les produits dont son nom contient C : 

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/5b9cddf5-f945-4948-ad19-0aa4a9989271)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/28ad088d-1e3b-4e64-ba10-1b3943101aa1)


Et donc l’affichage sera comme suit, il va nous afficher les les produits qui contient C :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/47071919-40fe-44fc-a7cc-05511949c347)


Une autre methode a faire on va utiliser search :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/f3e4ce33-b25c-4ecf-8c4f-4fa3eb80e15b)


Et bien sur il va nous donner les meme resultats :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/75753764-a54e-4663-b3c3-ec1ca6d182fe)


Un autre exemple, si on veut chercher les prix superieur a 3000 donc on va faire les etapes suivantes :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/810fe3e3-3f64-4820-b8ad-318a63530b64)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/a2a7f468-c967-49c2-b177-869171160c7f)


Et voici l’affichage :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/cc3e16f7-4c46-4fae-97b5-ce1f4fa05a55)


On peut cree un web service , alors on a cree un package nomme web puis dans ce dernier on a cree une classe :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/f357edee-0baa-471e-b290-db16fe2fe73d)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/de7892b4-97a9-450c-a818-4e48c4d43065)


On peut avoir chaque produits on utlisons son id comme suit :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/c54bde91-c4cc-4c8f-96c6-0dadc05afe3b)


Par exemple le produit d’id 1 :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/ff469456-2ca0-450f-b587-02b2ec769b3c)















