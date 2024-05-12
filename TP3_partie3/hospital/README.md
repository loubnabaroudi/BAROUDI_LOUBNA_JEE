Dans ce qui précède on a travaillé avec l’architecture Spring MVC suivante :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/359bea19-f300-46ac-a897-32e4b0a2dd83)


Dans cette partie on va utiliser Spring Security (c’est un intercepteur ou un filtre c’est-à-dire lorsque le client envoi une requête vers l’application, alors Spring Security qui va intercepter ces requêtes) :


![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/0dd49906-c0c1-463f-9de0-a10eca639cfd)



D’abords il faut ajouter une page de login ( on utilise comme nom : user , et le mot de passe : 5b1a8982-90aa-4091-923d-1d3a93aa56a3 générer automatiquement.


![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/8456ae94-4c55-4f9b-88d6-72506af57f46)


Puis on va créer un fichier SecurityConfig :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/537425f6-6581-41a7-bd3e-1f05b83a5888)


On n'a pas l'accès car on n'a pas encore ajouté les users et les admins (+ on n'a pas donné l'accès à eux) :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/0f4f87a7-6a71-4aea-a825-4d94225aafc6)


Donc lorsque l’utilisateur va essayer de modifier un patient :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/a1b05059-6799-4b3c-989b-8f2df6ef995a)


Apres on va passer a la partie de JDBC Authentication , et on va copier les commandes de création de nouvelles tables à partir de ce fichier dans les dépendances :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/337f5a05-3381-4bb4-a094-106739fccbe7)


Voici le resultat:

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/256d119f-262a-406f-8a47-208670e8561a)


Utiliser JDBC userdetails manager pour gérer les users et admin :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/6e228769-152b-4dbd-9dad-564ffd653b0c)


Voici la table des utilisateurs :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/9b2d5f14-cd87-4e66-ad7f-6062fdf026b4)

Et maintenant on va utiliser UserDetails Service ,donc on a créé une nouvelle classe AppUser :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/6d4c8882-ded9-4a3b-93d3-2b792596e0a6)


Et une autre classe AppRole :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/a8ea4d47-6e1a-4497-92b3-a2a8d9e47028)


Apres les modifications nécessaires, voici notre base de données :


![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/4b4ff4de-ce30-404a-82d9-addacc8fdef5)
