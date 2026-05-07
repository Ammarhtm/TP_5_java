# Travaux Pratiques N°5 : La Généricité & La Gestion des Exceptions

## Description
[cite_start]Ce dépôt contient les solutions des exercices du TP5, portant sur la maîtrise de la généricité et les mécanismes de gestion des exceptions (système et personnalisées) en Java[cite: 9, 10]. [cite_start]Ce travail a été réalisé dans le cadre du module Java SE (JSE)[cite: 3].

## Liste des Exercices
Voici les captures d'écran des résultats (Outputs) pour chaque partie du TP :

### 1. Exceptions Système (Surveillées & Non Surveillées)
* [cite_start]**Exercice 1 à 4 :** Division sécurisée, gestion de `NullPointerException`, manipulation de tableaux et conversion d'entiers[cite: 16, 25, 31, 44].
* [cite_start]**Exercice 5 à 7 :** Calcul de racine carrée avec levée d'exception, gestion d'état d'une machine et mécanisme de propagation[cite: 50, 57, 62].
* [cite_start]**Exercice 8 à 10 :** Utilisation des *Checked Exceptions* (`throws Exception`) et comparaison avec les *RuntimeExceptions*[cite: 68, 80].

### 2. Exceptions Personnalisées
* [cite_start]**Exercice 1 à 3 :** Gestion d'un compte bancaire avec `SoldeInsuffisantException` et `MontantInvalideException`[cite: 86, 93, 95].
* [cite_start]**Exercice 4 & 5 :** Validation d'inscription (Email/Âge) et système d'authentification[cite: 99, 114].
* [cite_start]**Exercice 6 à 9 :** Cas pratiques : Gestion de stock, quotas de téléchargement et validation de formulaires de paiement[cite: 119, 123, 127, 131].

### 3. Généricité
* [cite_start]**Exercice 1 & 2 :** Mise en œuvre des classes génériques `Boite<T>` et `Paire<T, U>`[cite: 149, 156].
* [cite_start]**Exercice 3 à 5 :** Interfaces génériques pour les calculs et les comparaisons (`Calcul<T>`, `Comparateur<T>`)[cite: 161, 175, 183].
* [cite_start]**Exercice 6 & 7 :** Méthodes génériques et utilisation des bornes (`<T extends Number>`)[cite: 191, 194].
* [cite_start]**Exercice 8 à 12 :** Héritage générique et utilisation des Wildcards (`?` et `? extends Number`)[cite: 197, 205, 215, 220, 222].

---

## Structure du Projet
- **/src** : Contient les fichiers sources Java (.java) organisés par exercices.
- **/screenshots** : Contient les captures d'écran de l'exécution du code pour chaque partie du TP.
- [cite_start]**Compte-rendu** : Document expliquant les choix de conception (notamment pour l'exercice 10 de la Partie 2 et l'exercice 5 de la Partie 1)[cite: 55, 143].

## Informations de Remise
* [cite_start]**Date limite :** Lundi jj/mm/2026[cite: 12].
* **Enseignant :** Pr. [cite_start]Mohamed CHERRADI[cite: 7].
* [cite_start]**Format :** Archive `Nom-Prénom.zip` envoyée par mail avec l'objet "TP5-JSE"[cite: 13, 14].
