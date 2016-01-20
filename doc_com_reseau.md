# Fonctionnement Client serveur

Le simulateur se découpe en deux programmes distincts :
Un serveur en java qui s'occupe des calculs et une interface en javafx qui permet de lancer, paramétrer et afficher les simulations sur 
le serveur.

Lorsqu'un serveur est instancié (par exemple avec java -jar nom_executable.jar) il écoute sur un port défini dans le code.
Lorsqu'un client est lancé, il se connecte au serveur dont on a indiqués l'adresse réseau et le port.

Dorénavant, les deux programmes peuvent s'envoyer via un canal TCP des objets java sérialisés.
Les classes de ses objetcs sont situé dans le projet common, puisqu'elle doivent être connues des deux programmes pour pouvoir être 
sérialisés et désérialisés correctement.

Chaque programme définie une classe d'écouteur réseau, qui contient la methode receive(Object). Cette méthode est appellée 
lorsqu'un object java est recu par le réseau. Il est ensuite possible d'identifier la classe de l'objet recu et d'effectuer le traitement
adapté. (Par exemple lorsque le client recoit un EtatSimulation, il en affiche le contenu à l'écran).
