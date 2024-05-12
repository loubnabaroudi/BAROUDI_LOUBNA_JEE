Dans cette partie on va continuer notre application de la première partie :
Voici l’application de tous les patients , on peut checher ou supprimer un patient. 
On peut acceder a cette page via : localhost :8802/index


![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/9a2c1b14-f4a2-4f6e-a94c-ac84c484c604)


On peut supprimer un patient a l’aide du bouton rouge à droite :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/687dd9f0-e9cc-4d3c-b797-a2cc5f6fbace)

Donc en clique sur ok le patient va être supprimer.

Donc on a ajouté un fichier template1.html :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/78ff4e4f-6350-4b55-a0a2-abd3188b401d)


Voici les modifications dans la page des patients (nav bar est ajoute) :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/1287bef5-5f1e-4d9e-a9cd-678b90b01bea)


Lorsque on clique sur patient et après nouveau on aura une erreur.


Donc on va changer dans PatientController :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/683531a7-b2f9-49b7-ace6-73ce493b2149)



Puis on a créé formPatients.html :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/26f4b0ff-a125-47ab-aeec-cbdc11e07b27)



Maintenant en cliquant sur nouveau on peut ajouter un nouveau patient :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/5b88256d-9dc6-431f-afcf-df15401d0638)


Et voici le formulaire à remplir pour ajouter un nouveau patient :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/c1e6e65b-d893-4a8f-9846-e5843de8c969)


En cliquant sur le bouton save, voilà un nouveau patient est ajoute :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/6573038a-98f2-4b4a-83bb-c69eba15448b)


Ensuite on peut modifier un patient en clique sur Edit :
On a ajouté dans PatientController 

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/bd9fdb24-ced0-4607-98de-fc130f341d8f)


Et créé une nouvelle page html editPatient.html

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/8d9ac173-e5fa-406e-beed-67ab85384e0c)


Maintenant on peut modifier les informations des patients :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/a1b59dbc-0894-4904-9d30-0290c99e90a4)


Maintenant cliquant sur le bouton Edit on peut modifier les informations du patient sélectionné :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/c8a59566-6590-4ee1-a4f1-3741f5394378)


Voici les informations du patient après l’enregistrement des modifications :


![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/9551fb0f-f3bb-4a16-a649-390f3df8c9f9)

