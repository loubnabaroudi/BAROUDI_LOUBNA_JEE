projet: Injection des dépendances
---------------------------------------------------------------------------------------------------------------------------------
Objectif : Dans cette partie on va faire l’injection des dépendances avec par instanciation statique et instanciation dynamique.


D’abords on a créé un package dao et dans ce dernier on a une interface IDao qui contient une fonction getData () qu’elle doit être implémente par toutes les classes qui implémentent cette interface.
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/f1caef33-c0bf-4913-a62e-f2b5132f26e7)

Puis on a créé la classe DaoImpl qui implémente l’interface IDao dont on a se connecter à la base de données pour récupérer la température.
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/75174997-8cfc-4f57-a03f-987027d0baa1)

Ensuite on a créé un autre package metier et une interface IMetier qui contient la fonction calcul ().
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/c08f8cef-726a-42f9-be17-38ba0a9bb5f4)

Et dans ce package on a une classe MetierImpl qui représente une partie de la logique métier de l'application qui dépend d'un objet qui implémente l'interface IDao. Cette dépendance est injectée dans la classe à l'aide d'une méthode setter, permettant ainsi de remplacer facilement l'implémentation de IDao sans modifier le code de MetierImpl.
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/4e662db2-0662-4105-8a77-4976f4c5d243)

Et pour présenter les résultats, dans le package pres on a créé une classe présentation 
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/f0275acd-c2cd-40d2-bc5c-e7401dafa72c)

Et pour la version capteurs on a créé dans un autre package une classe DaoImpl2 
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/04181c7d-37d2-450e-98c3-6bfb7be1360c)

Maintenant on veut que notre application utilise cette version au lieu de l’autre. Donc on ne va rien changer dans la couche Dao et la couche metier, mais on va modifier dans la couche presentation.
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/3c73a039-3731-4cf9-8661-17c16c57ad94)

Alors si on exécute le code on aura bien la version capteurs.
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/92dd3a83-80de-40ee-8cc8-8a611dc4966e)

Maintenant on veut que notre application soit fermée à la modification sans utiliser les Framework, mais on va utiliser l’instanciation dynamique au lieu de l’instanciation statique.
D’abords on va créer un fichier config.txt dont on va écrire les classes qu’on a.
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/383044fb-1d51-4c6a-82d6-272b49bd7f71)

Puis dans le package pres on va créer une 2eme classe presentation. Et dans cette classe on veut faire l’instanciation des classes qu’on ne connait pas son nom.
Donc on doit lire le nom de la classe a partir du fichier config puis charger la classe au mémoire et en fin instancier la classe.
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/676de8a4-22b5-44e7-bd81-ae2a1b28e97a)

	Donc l’avantage de cette méthode est lorsque on veut utiliser la version base de données ou la version capteurs, on ne va pas changer dans le code mais juste dans le fichier config.

On va faire la même chose avec la 2eme classe et on aura le code suivant avec la méthode dynamique.
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/5881edd5-8f02-4f90-9bee-577cab99588c)









