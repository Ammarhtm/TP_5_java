# Travaux Pratiques N°5 : Gestion des Exceptions et Généricité en Java

## Description

Ce dépôt contient les solutions des exercices du TP5, portant sur les concepts des Exceptions et de la Généricité en Java.

Les différentes parties du TP abordent :

* Les exceptions système
* Les exceptions personnalisées
* Les checked et unchecked exceptions
* La généricité (Generics) en Java

---

# Partie 1 : Exceptions système

## Liste des Exercices

### 1. Division sécurisée

![Output 1](./screenshots_tp5/Partie_1/output1_ex1.png)

### 2. NullPointerException

![Output 2](./screenshots_tp5/Partie_1/output2_ex2.png)

### 3. Tableau sécurisé

![Output 3](./screenshots_tp5/Partie_1/output3_ex3.png)

### 4. Conversion d’entier

![Output 4](./screenshots_tp5/Partie_1/output4_ex4.png)

### 5. Racine carrée

![Output 5](./screenshots_tp5/Partie_1/output5_ex5.png)

### 6. IllegalStateException

![Output 6](./screenshots_tp5/Partie_1/output6_ex6.png)

### 7. Propagation des exceptions

![Output 7](./screenshots_tp5/Partie_1/output7_ex7.png)

### 8. Checked Exception

![Output 8](./screenshots_tp5/Partie_1/output8_ex8.png)

### 9. Comparaison : Exception vs RuntimeException

![Output 9](./screenshots_tp5/Partie_1/output10_ex10.png)

---

# Partie 2 : Exceptions personnalisées

## Liste des Exercices

### 1. Compte bancaire

![Output 10](./screenshots_tp5/Partie2/output1,2,3.png)

### 2. Montant invalide

![Output 11](./screenshots_tp5/Partie2/output4.png)

### 3. Double validation

![Output 12](./screenshots_tp5/Partie2/output5.png)

### 4. Inscription utilisateur

![Output 13](./screenshots_tp5/Partie2/output6.png)

### 5. Authentification

![Output 14](./screenshots_tp5/Partie2/output7.png)

### 6. Gestion de stock

![Output 15](./screenshots_tp5/Partie2/output8.png)

### 7. Téléchargement

![Output 16](./screenshots_tp5/Partie2/output9.png)

### 8. Validation de formulaire

![Output 17](./screenshots_tp5/Partie2/output10.png)

### 9. Paiement

![Output 18](./screenshots_tp5/partie2/output.png)

### 10. Conception : Checked vs Unchecked

## Conception : Checked vs Unchecked Exceptions

Les checked exceptions sont utilisées lorsque l’erreur est prévisible et doit être obligatoirement gérée par le programmeur, comme une erreur de lecture de fichier ou une saisie invalide. Java oblige le développeur à utiliser `try/catch` ou `throws`.

Les unchecked exceptions (RuntimeException) sont utilisées pour les erreurs liées à la logique du programme, comme une division par zéro, un accès à un index invalide ou un objet null. Elles ne sont pas obligatoirement gérées par Java.

Les exceptions personnalisées permettent de créer des erreurs adaptées au contexte de l’application afin de rendre le code plus clair, plus organisé et plus facile à maintenir. Par exemple : `SoldeInsuffisantException` ou `AuthentificationException`.

---

# Partie 3 : Généricité

## Liste des Exercices

### 1. Classe Boite<T>

![Output 20](./screenshots_tp5/partie_3/output1.png)

### 2. Classe Paire<T,U>

![Output 21](./screenshots_tp5/partie_3/output2.png)

### 3. Interface Calcul<T>

![Output 22](./screenshots_tp5/partie_3/output3.png)

### 4. Interface Comparateur<T>
### 5. Comparateur String et Integer
![Output 23](./screenshots_tp5/partie_3/output4_5.png)


### 6. Méthodes génériques

![Output 25](./screenshots_tp5/partie_3/output6.png)

### 7. Somme générique avec Number

![Output 26](./screenshots_tp5/partie_3/output7.png)

### 8. Héritage générique Animal<T>

![Output 27](./screenshots_tp5/partie_3/output8.png)

### 9. Véhicule générique

![Output 28](./screenshots_tp5/partie_3/output9.png)

### 10. Repository<T>

![Output 29](./screenshots_tp5/partie_3/output10.png)

### 11. Wildcards avec List<?>

![Output 30](./screenshots_tp5/partie_3/output.png)

### 12. Wildcards avec Number

![Output 31](./screenshots_tp5/partie_3/output12.png)

---

# Structure du Projet

* **/src** : Contient les fichiers sources Java (.java)
* **/screenshots** : Contient les captures d’écran des résultats d’exécution
* **README.md** : Documentation du projet

---

## Auteur

* Ammar
* ENSAH — ID1 S2
