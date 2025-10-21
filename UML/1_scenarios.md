### Exercice 

Tu fais partie de l’équipe de conception d’une application web appelée BookMe, qui permet aux utilisateurs de réserver des salles de réunion dans une entreprise.
L’application doit permettre :

- à un employé de rechercher une salle disponible
- de réserver la salle pour un créneau horaire donné
- de recevoir une confirmation par e-mail

Choisis un cas d'utilisation parmis les 3 proposés et rédige un scénario avec au moins un scénario alternatif : 

- Rechercher une salle disponible
- Réserver une salle
- Annuler une réservation


### Rechercher une salle disponible
1. L'employé se connecte à BookMe
2. L'employé accède à la section reservation de salle
3. L'employé entre ses criyères de recherche
4. Le système affiche la liste des salles disponibles
#### Extension : 
- Aucune salle disponible
    - Le système renvoie un message d'erreur

### Réserver une salle
1. L'employé choisi la salle à reserver
2. L'employé selectionne la date et l'heure
3. Le système vérifie la disponibilité de la salle
4. L'employé valide sa réservation
5. Le système enregistre la réservation et genères un num. de réservation
6. Le système affiche un message de confirmation avec les détails
7. Le système envoi un mail de confirmation avec les détails
#### Extension :
- La salle n'est pas disponible :
    - Le système renvoie un message d'erreur
    - Le système propose des créneaux alternatifs ou d'autres salles disponibles
- Echec de l'envoi du mail de confirmation : 
    - Le système affiche un message de confirmation mais que le mail n'a pas pu être envoyé

### Annuler une réservation
1. L'employé se connecte à BookMe
2. Il accède à la section "Mes réservations"
3. Il annule la réservation souhaitée
4. Il confirme l'annulation
5. Le système renvoie un mail de confirmation d'annulation