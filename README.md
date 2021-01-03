# TP - Java

Outils utilisés :
 * <img src='https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/IntelliJ_IDEA_Logo.svg/768px-IntelliJ_IDEA_Logo.svg.png' width= 22px> Intellij IDEA
 * <img src='https://miro.medium.com/max/856/1*O68LbDvD5Dcsnez73M7v4Q.png' width= 20px> Spring Boot
 * <img src='https://media.discordapp.net/attachments/522143202426224654/795383330706161735/58480887cef1014c0b5e48ec.png' width= 20px> Hibernate
 * <img src='https://upload.wikimedia.org/wikipedia/commons/a/ab/Swagger-logo.png' width= 20px> Swagger
 * <img src='https://progsoft.net/images/laragon-icon-6ba1779098fd909dbfd41617e35b0e4188981367.png' width= 20px> Laragon


## Projet personnel
Ce projet personnel sera évalué.

Pour cela il faudra créer un projet et placer les sources dans GIT.
Il s'agit d'un projet **individuel**.

### Le sujet :

Il s'agit de développer un logiciel à destination de sociétés de location d'appartements de vacances :
 * Un Village vacances (ou résidence) va se situer dans un pays (France, Espagne) dans une région, aura une adresse et une position GPS. Il aura des informations sur le type de lieu : mer, océan, montagne. Il possèdera des services: piscine, spa, garderie, wifi.
 * Les appartements sont regroupés dans une résidence ou bien un village vacances.
 * Les appartements possèdent un certain nombres de caractéristiques : nombre de couchage, surface, équipement pour bébé, la climatisation.
 * Un appartement va posséder aussi un tarif de location à la journée et des dates de réservation/disponibilité.

> Une réservation d'appartement pour un client de la société de location pourra être créée pour un appartement sur une période donnée.

### Le Barème :

Réaliser une conception / un découpage en classe métier afin d'enregistrer toutes les informations en base de données. (5 points)
Réaliser en Java un serveur qui expose une API Rest qui va permettre de créer, lire, mettre à jour et supprimer toutes les entités enregistrées en base. 
[Voir CRUD](https://fr.wikipedia.org/wiki/CRUD) <br>
Il faudra implémenter les couches service, d'accès aux données et le Mapping Objet-Relationnel. (5 points)

> Activer Swagger afin de tester l'API Rest.

Compléter l'API Rest afin de retourner les requêtes suivantes :
- tous les Village Vacances/Résidence pour un pays donnée (**1 points**)
- tous les appartements pour une région donnée (**1 points**)
- tous les appartements dont la résidence possède une piscine (**1 points**)
- tous les appartements qui sont à la montagne (**1 points**)
- tous les appartements qui sont libres entre 2 dates données (**1 points**)
- tous les appartements qui sont libres sur une durée entre 2 dates fournies (**1 points**)
- une liste de Dto (qui contiendra l'id de l'appartement et le prix) pour tous les appartements qui sont libres entre 2 dates données qui se trouvent à la mer, triés par ordre de prix croissant de prix (**1 points**)
- une liste de Dto (qui contiendra l'id de l'appartement, le nom du Village Vacance et le prix) pour tous les appartements qui sont libres entre 2 dates données qui se trouvent à la mer, dans une région données, avec la piscine, avec au moins 4 couchage, triés par ordre de prix croissant de prix (**1 points**) <br>
La qualité du code et l'organisation du projet seront évalués (**2 points**)

