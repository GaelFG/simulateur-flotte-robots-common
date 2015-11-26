# simulateur-flotte-robots-common

## Présentation

Ce projet regroupe les classes des messages échangés sur le réseau via la librairie [Kryonet](https://github.com/EsotericSoftware/kryonet).

Il doit être inclue en tant que dépendance dans le projet du client et dans celui du serveur.

Pour utiliser ces classes il faut appeller la méthode statique EnregistreurKryo.enregistrerLesClassesDeCommunication(Kryo kryo) sur l'instance de kryo utilisé pour la communication client/serveur.

## Règles d'ajout/modification de classe

Toutes les classes de messages doivent pouvoir être sérialisée par la librairie [Kryo](https://github.com/EsotericSoftware/kryo).

Pour cela comme indiqué dans leur documentation la classe doit disposer d'un constructeur sans paramètres et ses membres doivent être publiques.

Lors d'un ajout de classe dans le paquetage il faut ajouter une ligne dans le code de la méthode EnregistreurKryo.enregistrerLesClassesDeCommunication(Kryo kryo).

## Travailler sur le dépot

Utiliser Eclipse Mars

Utiliser le jdk 1.8 SE Oracle

### Récupération du dépôt

Ouvrir Eclipse.

Menu haut : File -> Import

Catégorie Git -> 'Projects from Git'

Double-clic sur Clone URI

Dans Location mettre dans le champs URI: https://github.com/GaelFG/simulateur-flotte-robots-common.git

Rentrer ses identifiants de connexion

cloner les deux branches master et dev

Choisir la destination

Si vous devez développer, choissisez en Initial branch 'dev' (on ne push jamais directement sur la branche master)

Wizard for project import -> Import existing Eclipse projects

Choisir le seul répertoire proposé

clic sur Next

Dans Projects selectionner le seul disponnible (common)

Clic sur finish

### Paramétrage du projet local

A gauche dans le Package Explorer faire un clic droit sur la racine du projet 'common [simulateur-flotte-robots-common dev]'

Run As -> Maven install

(Maven télécharge toutes les librairies nécéssaires au projet et lance les tests puis un build du projet)

Il est désormais possible de tester et builder le projet avec Maven.

Pour pouvoir tester le projet directement sous eclipse il faut mettre à jour le projet eclipse local.

A gauche dans le Package Explorer faire un clic droit sur la racine du projet 'common [simulateur-flotte-robots-common dev]'

Maven -> Update project

cocher le projet common et les options (sauf Offline et Force Update)

cliquer sur ok

**Problème Temporaire :**
On n'a pas encore trouvé comment préciser une version de java dans le descriptif maven, du coup celui-ci repart par défaut sur la version 1.5.

Pour repasser en 1.8 il faut faire un clic droit sur JRE System Library dans le package explorer

Properties

et choisir le bon jre (Java SE 1.8 Oracle).
