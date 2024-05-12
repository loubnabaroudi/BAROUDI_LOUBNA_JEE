Spring MVC Spring Data JPA Thymeleaf
-------------------------------------------------------------------------------------------------------------

Objectif principal:  Créer une application Web JEE basée sur Spring MVC, Thylemeaf et Spring Data JPA qui permet de gérer les patients. L'application doit permettre les fonctionnalités suivantes :

•	Afficher les patients
•	Faire la pagination
•	Chercher les patients
•	Supprimer un patient
•	Faire des améliorations supplémentaires


Dans cette partie on va effectuer la création du projet nommée hopitall et en faisant par la suite le choix des différentes dépendances dont on aura besoin pour travailler
Premièrement on a créé un package nomme entities et à l’intérieur de ce dernier on a créé une classe appelée Patient qui comporte les attributs ci-dessous :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/7464e2e9-ca48-4bfe-852a-45817ba4943d)


Par la suite on a créé un package nomme  repository et à l’intérieur de ce dernier on a créé une interface PatientRepository :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/d2f43ac8-b501-4e46-ba9c-ff5d9e2d9541)


Par la suite on passe pour tester dans  le fichier application .properties comme il est affiché ci-dessous :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/4c0397f1-ef01-42b7-9d45-1ed6b5c2d7ef)


Et on exécute notre application ou on a fait des modications:

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/9fecca0d-352b-4506-ad79-1fafbe0e9e7e)


Et d’après l’affichage ci-dessous on remarque que l’application est bien démarrée.

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/4be9834a-f1ff-4b37-9933-0f96e32f5357)


Par la suite on lance le browser :localhost:8084/h2-console
Et aura un affichage qui est le suivant :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/77956b15-3ea9-46d9-a754-1bc4a4c64154)


En cliquant sur le bouton connect on est redirigé vers une autre page et en cliquant sur la table patient  on a une génération automatique de la requête.

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/326dce7a-331f-4a9e-86f2-24b3419dbc43)


Et en cliquant sur le bouton run on a le résultat ci-dessous :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/53b12f16-ab05-439a-b710-6b7487b2fa98)


Et donc cette fois ci pour travailler la partie web au niveau du package web qui est déjà créer on doit créer un controleur c’est à dire une classe PatientController :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/b33be4e1-4704-4c4d-8bc8-2a8ebeccfdde)


Quand on tape « /index » on va avoir un retour d’une vue nommée patients.html et du coup ce patient.html on doit le créer dans un dossier qui s’appelle templates comme apparait ci-dessous :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/80085a0c-d573-4153-a60f-8c8f3acd6305)


Et on redémarre une autre fois :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/04fcb060-0ac4-4f6f-8a8f-08c95c7e92a4)


Par la suite on lance le browser :localhost:8084/index
Et on aura le résultat souhaite :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/90d3b69f-71cd-4e22-807a-771f2aca7ce5)


Cette fois ci on veut afficher la liste des patients :
On revient au controleur :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/b028380a-0b0d-491b-a2bc-7e0b7cfbcb4c)


Revenant donc à la vue pour afficher la liste des patients on aura besoin d’utiliser themleaf comme il est présenté :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/824674e3-b9c4-4923-91cf-3c7259446166)
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/c69c5a89-372b-4c42-bf58-65d4f3f5e0cb)


En redémarrant on remarque que tout se passe bien :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/ee929dd1-72bf-4d47-bf65-b176c918b1c2)


En visitant : localhost:8084/index on obtient le résultat ci-dessous :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/58431da3-539a-477e-bfa8-9e891a3ece62)


Mais l’affichage n’est pas joli on veut utiliser bootsrap .Pour travailler avec ce dernier on aura besoin d’ajouter une dépendance qui s’appelle webjars bootstrap 5 maven dependency et on utilise la version 5 on ajoute la dépendance au fichier pom.xml :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/74725821-b66e-4699-9527-13db6e3b096a)


Et par la suite  pour savoir comment utiliser bootstrap on doit effectuer des modifications dans patients.html :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/e83aca02-1e4e-4392-afc9-3bc805593756)
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/4752a3e1-1d76-41c4-8e5e-a3016137e345)


Et on redémarre une autre fois, et cette fois ci on aura un affichage beaucoup mieux :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/6a8f7e9b-c213-43ba-ba55-f0a45ccd8ba3)


En faisant des modications vous allez noter la différence :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/4d536e89-3511-4130-8907-65f7356be254)


Et maintenant on doit basculer de la base donnée h2 vers la base donnée mysql, et donc il faut ajouter une dépendance dans le fichier pom.xml :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/a8b2924c-77ab-49ed-acdd-fea7fb04fd65)


Et par la suite on doit ajouter quelques dépendances dans le fichier application.properties :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/2d447c56-4a0f-40e4-8631-7c88a445e894)


Ensuite on démarre l’application :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/c67ee15b-bb47-4178-bd61-e4c4139c5dee)


Si on regarde maintenant la base de donnée et on voit la table patient on aura l’affichage ci dessous :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/7d693ed5-ed30-4e95-b0d7-dc6965094ecf)


On constate qu’à chaque fois on démarre on a une duplication car on écrase pas la base de donnée :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/6de925e0-f837-4f49-bd93-1b4d5548f69c)


Quand visite : localhost:8084/index on obtient le résultat ci-dessous :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/1fa87021-8026-4a59-920b-e83a9d2cb553)


Comme il  n’est pas pratique d’afficher tous les patients, on va passer pour faire la pagination, et donc on va apporter des modications à la classe PatientController :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/ffc6b06b-c603-4afe-b693-2afb00eeeeca)


En visitant : localhost:8084/index on obtient le résultat ci-dessous :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/49ba01be-8547-401d-8c50-8d6163603b71)


Si on tape : localhost:8084/index?size=2 on obtient le résultat ci-dessous :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/b4890c98-a07f-46c4-932a-0de8b095b732)


Et revenant cette fois ci a la vue pour lui apporter des modifications :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/1baa9ce6-7fab-46f4-a105-8687b1aa366f)


Et par la suite en faisant refresh à la page on obtient le résultat ci-dessous :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/f821a636-1711-4746-b558-23ba9ddeee1b)


Donc notre souhait c’est d’afficher  l indexe : numéro des éléments en les affichant d’une manière horizontal et afficher chaque élément sous forme d’un bouton ainsi que quand on clique sur une page on la demande,  ceci requiert à faire des modifications  à patient.html .Et il ne faut pas oublier de colorer la page courante avec une couleur différente  en  se redirigant vers la classe PatientController qui est la suivante :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/3ccb5355-53e1-4455-902e-b8ff3db65021)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/22d4e151-0078-48bb-b1f6-ffd1a7c6ec82)


En faisant une actualisation à la page on obtient ce résultat :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/a6fc44fe-dcde-47e7-9b30-27b3dd2ceae3)


Par la suite on va ajouter une partie pour faire la recherche  des patients on va créer un formulaire dans patients.html :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/fece6fad-8eea-417b-aede-07b4793c64c9)


Et en faisant une actualisation à la page :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/fef81799-6d56-4f3a-94d4-e262fd8c7580)


En cliquant sur le bouton chercher on aura donc le résultat ci-dessous :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/8ed6c791-08a6-4ec5-956e-67e33ffdd600)


Maintenant, il va falloir récupérer le keyword et il faut faire la recherche, on aura besoin d’ajouter une méthode dans  l’interface PatientRepository :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/2b0eb96b-86cd-4acb-b2dd-af27ae3e3055)


Ainsi qu’au niveau du controleur on lui apporte des modifications :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/ba5ca70e-f245-4658-80b0-9454dbdb843d)


Par la suite pour afficher la valeur dans la zone texte on a ajouté une toute petite modification dans patient.html :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/3068612d-a93b-43ae-ade0-e346f0800ae4)


Ce qui nous donne après l’actualisation  mais en tapant dans la zone de recherche Mohammed :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/6473bef1-c7a8-4074-b1e3-bf7a5d3d2b6f)


Maintenant on souhaite supprimer un patient  donc on doit effectuer des modifications au niveau de patient.html :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/587e268c-bce3-4547-9b88-2f812f0c3142)


On obtient comme résultat :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/b308ae74-5963-4488-8139-b6ec9e71f6bd)


Pour que ce bouton fonctionne  voici ce qui faut faire:

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/e4682479-002c-4d7b-ac99-c103adaea483)


Par la suite en faisant une actualisation a la page et en cliquant sur le bouton delete des patients Mohammed et Imane on remarque qu’ils sont supprimés.

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/c083e380-6e73-40fd-86e0-47ff0f16ef05)


Et comme la suppression est une notion dangereuse vaut mieux afficher un message pour s’assurer  avant de faire de l’action. On est censé cette fois ci d’apporter des modifications dans patient.html :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/c8752caf-e10d-48c0-b0f4-24bb2f466117)


Et donc quand on clique sur le bouton delete on aura le message ci dessous :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/62f14126-c349-4d58-9272-256eacdd0d16)


Si vous voulez garder le mot clé on doit changer dans patient.html :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/9b13649c-d09a-41c8-8908-6c9d0ceaa3b2)


Et aussi dans PatientController :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/f9543473-4f91-4126-b93f-1ec6ba5b1cf5)


En actualisant la page et en cherchant dans la zone de saisie le nom : Imane

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/e164ac83-edb9-4bd4-ae91-808ae8e62949)


Et on souhaite supprimer id =42 :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/848f7772-b488-46ed-960d-d78adff9f439)


On constate que la suppression est effectuée avec succès mais restant dans la même page .Par la suite on va changer delete par icone de poubelle. Donc on doit ajouter cette dépendance dans le fichier pom.xml


![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/cec589dc-8001-41f4-a061-af1a2ebd0696)


Et aussi dans patient.html on va ajouter ceci :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/18f080c9-de94-47cf-8cc4-efdbc91d07ae)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/a68b2ed5-ee48-4451-add5-4e33f5b2455f)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/b5f8b754-a45c-4866-8fd9-20155775ae94)


En actualisant la page on obtient le résultat suivant :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/40f102bf-e8fc-4afd-97d6-d5c5a3d0a29c)








