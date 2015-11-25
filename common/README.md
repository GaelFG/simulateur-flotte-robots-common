# simulateur-flotte-robots-common

## Présentation

Ce projet regroupe les classes des messages échangés sur le réseau via la librairie [Kryonet](https://github.com/EsotericSoftware/kryonet).

Il doit être inclue en tant que dépendance dans le projet du client et dans celui du serveur.

Pour utiliser ces classes il faut appeller la méthode statique EnregistreurKryo.enregistrerLesClassesDeCommunication(Kryo kryo) sur l'instance de kryo utilisé pour la communication client/serveur.

## Règles d'ajout/modification de classe

Toutes les classes de messages doivent pouvoir être sérialisée par la librairie [Kryo](https://github.com/EsotericSoftware/kryo).

Pour cela comme indiqué dans leur documentation la classe doit disposer d'un constructeur sans paramètres et ses membres doivent être publiques.

Lors d'un ajout de classe dans le paquetage il faut ajouter une ligne dans le code de la méthode EnregistreurKryo.enregistrerLesClassesDeCommunication(Kryo kryo).