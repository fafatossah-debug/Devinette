# Jeu de Devinettes Java

Ce projet est une application console simple développée en Java permettant de jouer à un jeu de devinettes.

## Description du Projet

L'application génère un nombre entier aléatoire entre 1 et 100.  
L'utilisateur a pour objectif de trouver ce nombre en respectant une limite de 10 tentatives.   
À chaque étape, des indices sont fournis pour guider l'utilisateur.

## Fonctionnalités

Génération d'un nombre aléatoire entre 1 et 100.  
Saisie utilisateur sécurisée via la console.   
Retour immédiat sur la tentative (plus grand ou plus petit).  
Limitation stricte à 10 essais .  
Annonce claire du résultat (victoire avec score ou défaite avec révélation du nombre).

## Pré-requis

Java Development Kit (JDK) 21 .
Un terminal ou un IDE (IntelliJ, Eclipse, VS Code).


## Structure du Code

* java.util.Scanner : Utilisé pour récupérer les entrées de l'utilisateur.  
* java.util.Random : Utilisé pour la génération du nombre secret.  
* scanner.nextInt() : Permet de lire l'entrée de l'utilisateur
* Boucle while : Gère le cycle des 10 tentatives.
* Conditions if/else : Déterminent la précision de la devinette et l'état de fin de partie.
