# Compte en banque

## Objectifs du TP

L'objectif de cette séance de travaux pratique est de mettre en oeuvre le design pattern "Command" vu précédemment.

Pour ce faire, vous devrez récupérer le code contenu dans ce répertoire Github (soit en le clonant, soit en le téléchargeant en tant qu'archive .zip), puis le modifier afin d'implémenter les fonctionnalités demandées.

## Cahier des charges

Vous avez été chargés de réaliser une application de gestion de l'historique d'un compte en banque. La banque possède déjà un système de gestion de la balance d'un compte, et de la liste des comptes en banque disponibles. Les opérations que vous devrez gérer sont le retrait et le crédit de sommes sur un compte. Les problématiques de balance négative ne sont pas dans le cadre de cette séance.

Cette application étant à destination des administrateurs de la banque, ils peuvent modifier 

## Implémentation

### 1. Implémentation du design pattern command

Ajoutez un système de commandes correspondant au design pattern vu en cours pour pouvoir gérer des retraits et des crédits depuis différents contrôles. Ces commandes doivent utiliser les méthodes `deposit` (créditer) et `withdraw` (retirer) pour modifier la balance d'un compte en banque.

Les commandes devront être envoyées directement à l'objet `Bank` qui s'assurera que le compte demandé existe. Les commandes devront gérer les erreurs renvoyées par les comptes bancaires non trouvés.

### 2. Implémentation de l'historique

Un compte en banque devra désormais disposer d'un historique des commandes effectuées afin de pouvoir reconstituer la liste des dépôts et retraits.

:warning: __Attention__ :warning: Les opérations doivent être restituées dans l'ordre chronologique de leur exécution, et les timestamps doivent être indiqués

_Astuce_ : Vous pouvez utiliser la méthode statique `Thread.sleep` pour délayer l'exécution de la prochaine instruction et avoir un plus grand intervalle entre deux commandes.

Le résultat devra être de la forme :

```
+------------------+--------------+-----------------+---------+
| Numéro de compte | Propriétaire | Type dopération | Montant |
+------------------+--------------+-----------------+---------+
| 1                | M. Durant    | Retrait         | 100     |
| 1                | M. Durant    | Crédit          | 200     |
+------------------+--------------+-----------------+---------+
```

(La mise en forme sous forme de tableau n'est pas obligatoire, mais les données doivent être présentes dans l'affichage)

### 3. Historique de la banque entière

Implémentez une méthode dans la classe `Bank`, Qui prendra une liste de noms en paramètres et renverra l'ensemble de leurs opérations, triées par timestamp, et indiquant sur quel compte a été faite chaque opération.