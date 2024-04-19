Spring Data JPA Hibernate
--------------------------------------------------------------------------------------------------------------------------------


Dans ce tp on a créé un projet maven à partir du site start.spring.io , et dans ce projet on a créé un package entities qui contient les classes suivantes :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/57d74827-5460-4f02-bf7a-ff28a37ef4ba)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/d8df45c4-bb4e-468d-a918-3cbe0e369cb1)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/4d6f6591-14d1-4728-bcf6-e5aa6267c554)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/8b0d9dca-fe1a-4abe-96fb-86fec7110e3f)


Et une énumération :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/05515153-f485-4509-9172-0399a629c4d8)


Donc maintenant on peut generer notre base de donnees :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/3f5858bf-9aca-4951-92f0-8f67ac587e4d)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/a9301e2d-69bb-4212-ab69-0b051e54f4d3)


Ensuite on va créer les interfaces jpa repository :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/9afab10b-cd1d-4322-b161-b9a737b8bccc)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/18adf712-ff03-4fc1-a093-736c7b56152e)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/65f7ddcc-7e95-48eb-ae0c-e1633b76f17d)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/ae5f341c-ce88-4982-8f93-ec22a79d23da)


On peut ajouter des patient au tableau patient comme suit :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/81110a80-1295-42ae-96ab-22f0e6471fcf)


On peut les voir dans la base de donnees :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/31192328-9f9d-4a47-a317-5ac7eca77a24)


On peut faire la meme chose avec le tableau medecin :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/10e6b214-69a8-4f28-8a6c-09a0acde060a)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/1d5a617e-7535-4072-9336-f1aea011edb2)


On peut créer un rendez-vous à partir d’un patient et un medecin déjà existe dans la base de données :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/2a4b40e9-6882-4ae7-a25f-db6ee243c05d)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/496deb4d-c1d7-4010-aa62-6043bbb123e4)


On remarque que le status a la valeur 0, alors si on veut que le status soit string on va ajouter dans la classe rendezvous 
@Enumerated(EnumType.STRING) :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/7b322f8a-6917-4de5-8e39-f3d0d81776f2)


Voici dans l’affichage on voit bien que la valeur de status devient string :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/f47ddecb-e9d4-4240-aa46-f59450dc83d9)


Et maintenant on va faire une consultation :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/7f994b6d-e840-4b8d-8899-ca0458e74e9e)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/ad553a92-444d-4bb0-9765-cb9c57e95df1)


Puis on a ajouter une couche service a notre application :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/d5fdffc6-788d-4090-8b52-5effab4f70b0)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/03ddff63-41b3-4a04-af11-74f86b76a94d)


Donc maintenant on a pas besoin d’injecter tous les interfaces repository , mais on vautiliser directement la couche service :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/fb3a1eaa-8ba8-4e37-bf98-40e2f0040ea9)


D’une autre part on peut changer le type d’id du rendezVous de long a String comme suit :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/0a7da1dd-493b-423e-a8e1-0254310ba696)


Voici l’affichage :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/0f911c72-44c7-40e8-bf78-02109a4637a6)



![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/6d47d54c-38e2-4407-84de-955489f35695)









