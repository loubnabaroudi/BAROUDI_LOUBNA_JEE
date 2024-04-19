Injection des dependances
---------------------------------------------------------------------------------------------------------------------------------

Objectif : Dans cette partie on va faire l’injection des dépendances en utilisant les spring.


On a créé un nouveau projet maven et dans le dossier java on va copier tous les packagent crées dans le projet précédent.

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/04fedc25-fc43-4923-a478-249ff9353dc1)


Puis on a ajouté toutes les dépendances nécessaires dans le fichier pom.xml à partir du site.

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/c7e2bfcb-6c32-48d6-aee8-5873f5e3a39d)


Ensuite on a créé un fichier xml ou on a créé les beans.

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/fdbf6094-4f87-4260-a4f4-fe7d8a1aa298)


Et on a créé un nouveau fichier pour une nouvelle présentation qu’on a appelé PresSpringXML qui utilise le fichier xml précédent.

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/4cb8b241-ee34-4c31-947b-a4e705f0cf46)


Voici l’affichage :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/e205d2ee-dd32-424d-be10-4851ec4ef454)


Et une autre présentation :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/6bb463fc-ab8f-471e-9c4e-5596fa18678c)


On a fait l’injection avec l’annotation Autowired :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/44e0c3ba-1cbf-4e1d-aab0-f87cc800ec37)


Mais également on peut faire l’injection via le constructeur, alors on a créé un constructeur dans la classe metier qui recoit un objet de type IDao.

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/b5bfeb49-a4f7-47a9-a1b9-2270c3a99afa)

-	La partie xml ne va plus fonctionner car on a plus le constructeur sans paramètres, mais par contre pour la version annotations ça va marcher.


Donc pour travailler avec la version xml il faut modifier dans le fichier : 

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/7118c27d-532b-402f-99cf-949b80e9735f)


Lorsqu’on a plusieurs beans, il faut donner à chaque bean un nom.

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/76034076-879a-410f-9220-966a071fda3a)

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/d84bd4c0-154c-4045-a6a3-0bc838010b3e)


Puis on va utiliser la méthode Autowired et Qualifier(ici on va spécifier quel bean à utiliser).

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/081cffa8-9ead-4a3f-b651-0de33d1fac29)

Mais si on travaille avec le constructeur on n’aura pas ce genre de problème.


Et finalement on a créé un test :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/a891a3a1-d13e-41ff-bff7-1133fa86d11f)













