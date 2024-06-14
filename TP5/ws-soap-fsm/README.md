Premièrement on va créer un projet maven normale

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/d5600250-5728-4a4d-b4be-0d435ccfdb62)

Puis on a créé dans le package ws les deux classes :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/495f1802-8de0-48e4-b5d7-8721a0ac310f)

Pour utiliser le web on a besoin d’une dépendance :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/54cc8909-4326-44eb-8a1e-f8ecd9c1630c)

La dépendance est :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/d72cab0f-dbbc-46e1-ab12-ee55afa32227)

Pour accéder à ce web service d’une machine à distance :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/577db6df-02ce-491b-9bf2-e22bfcb6cf92)

Apres l’exécution de l’application :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/f0acfdfc-be06-4c51-a20f-3fc3874194a7)

Pour voir le wsdl :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/8fce82ff-be0f-4bce-9cc7-3d368fdf6436)

Cela est un fichier xml qui permet de donner une description de l’interface du web service.


On va utiliser SoapUI avec le wsdl qu’on a :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/d0e1ab46-c674-4856-8e17-ee3ec2f6b6b1)

On va le tester :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/a9515899-0ea8-464c-8fe8-962a39e60729)
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/547a2068-835b-42c5-a2b0-7452dfc59e55)

Alors dateCreation est ignorer car on a utilisé le format LocalDate :

![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/c6e2430e-187c-45cc-928f-fff2c6ead6cf)

	On va changer localDate par Date.
Et le problème est résolu :
![image](https://github.com/loubnabaroudi/BAROUDI_LOUBNA_JEE/assets/154988277/833bf24d-b339-491a-abce-bf62b06fad15)

















