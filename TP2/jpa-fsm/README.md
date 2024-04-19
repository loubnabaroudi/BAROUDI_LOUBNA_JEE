Spring Data JPA Hibernate
---------------------------------------------------------------------------------------------------------------------------------


Tout d’abord on a commencé par créer un projet nommé jpa-fsm et on a choisi les différentes dépendances dont on aura besoin pour travailler, par la suite on a créé un package nommé entities ce dernier contient une classe Role  contenant les attributs  et une association ManyToMany ci-dessous:

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/ef98fb6e-1509-416e-8599-046030d093c6)


Ainsi qu’à l’intérieur de ce package on la classe User qui comporte les différents attributs qui apparaissent dans la capture d’écran :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/30b9095f-b70e-4e2c-b58b-a012ab8be17a)


En faisant un enchainement dans notre travail on a créé un autre package dont son nom repositories comportant deux interfaces la première est : RoleRepositories qui contienne une méthode  qui cherche le rôle de l’utilisateur par son roleName.

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/2ead47cd-6371-4fa0-9962-d1ce38d546dd)


Et la deuxieme interface est :UserRepository,cette dernière contient la méthode qui retourne un user par son username.

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/8bb06ad7-1af8-4a1c-98aa-c5153d94d1ed)


Ensuite on a réalisé une création d’un autre package nommé :service contenant une interface  dont son nom UserService qui contient une méthode qui ajoute  un utilisateur et un rôle et une méthode qui cherche l’utilisateur par son userName et le rôle de l’utilisateur par son roleName par la suite  on a une méthode qui permet d’ajouter un utilisateur a un rôle.

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/0754a1fe-2fd3-45f5-a99f-13391d43f00b)


Ainsi que ce package contient aussi  une classe: UserServiceImpl qui contiennent l’implémentation des différents méthodes dont on a besoin de faire les différents injections  et dépendances comme il est présenté ci-dessous dans les captures d’écrans.

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/56a922af-75a3-4e5e-81ea-62f73b459dd2)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/b10d988b-728d-4109-b22d-b17b05f81211)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/c623a43e-c5db-4fc8-a80d-c53740f3efa8)



Et puis pour savoir ci tout ça marche bien on aura besoin de spécifier la base de donnée et par la suite on est censé d’utiliser le jdbc  et le numéro de port. Tout ça s’effectue dans le fichier application.properties.

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/89b0ed23-62ef-41e5-9f0e-4a72ed6cfde4)


Par la suite on exécute l’application pour voir si tous marche bien : l’application est démarrée et  on va regarder :localhost:8083/h2-console

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/db568eb3-cab1-4d0c-bc5b-78f7e1d4b844)



En cliquant sur le bouton connect  on peut voir les différentes tables :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/286b2ead-fa80-48fb-9617-10b006c6246a)


Et on aura comme résultat :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/2b8d82ff-e8cd-45f6-99c4-c640febbe376)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/8073bebf-0ecb-4c0b-952d-c0a73fcb4acd)


Le résultat est le suivant :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/44e66941-8ccf-4141-a6aa-fe9592a856ff)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/ddd2c8e1-d4cb-411c-b21e-f4db1e4908aa)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/8c6fa80e-bf38-4978-aeb4-647eb194f39d)


Apres on a ajouté dans l’interface UserService une méthode  nommée authenticate qui va retourner le user :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/a0ccfd4e-c4cd-43d6-83b6-cd0f28c930b7)


Ensuite on va redéfinir  la méthode quand vient de citer dans la classe UserServiceImpl :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/46ece610-ea1a-4a18-b8cd-1a4d38a27e6d)


Pour tester cette méthode on a utilisé try et catch comme il est présenté ci-dessous :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/41881e65-9996-4489-a9a7-1743b2502d87)


Pour savoir que ceci marche bien voici le résultat :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/f1d8f46e-be03-4981-9f40-635ab8aafec0)


Par la suite on va basculer vers la base de donnée mysql, il faut juste  effectuer des changements dans le fichier pom.xml : c’est à dire mettre en commentaire  la base h2 et ajouter la dépendance mysql-connector-java, comme il est présenté ci-dessous :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/4fda48c8-3704-495a-bb2a-badc8993134e)


Et aussi faut changer dans le fichier application.properties :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/258eb812-771f-4a14-babf-89769cfb797e)



Par la suite on démarre xampp et on démarre l’application  et on remarque que sur mysql  existe quelques exceptions  car   quand il essaye de créer la base de donnée create table bein  il a trouvé un champ appelé desc qui représente un mot clé qui n’admet pas dans la structure de la base de donnée. Pour résoudre ce problème on doit  modifier  dans la classe Role en ajoutant une instruction :

@Column(name= ‘DESCRIPTION ‘) comme il est présenté dans la capture d’écran ci-dessous. 

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/e85b0ec3-17b7-4837-a39f-f0a1bc6ea1aa)



















